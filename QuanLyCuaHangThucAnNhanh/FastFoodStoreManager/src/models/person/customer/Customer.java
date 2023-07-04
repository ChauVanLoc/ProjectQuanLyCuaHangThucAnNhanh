package models.person.customer;

import java.util.List;

import constant.OrderStatus;
import models.Item;
import models.PersonObserver;
import models.person.Order;

public abstract class Customer extends PersonObserver {
	protected int score;
	protected GatewayPayment gateway = new ShopXu();

	public GatewayPayment getGateway() {
		return gateway;
	}

	public void setGateway(GatewayPayment gateway) {
		this.gateway = gateway;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void incrementScore(int score) {
		setScore(this.score + score);
	}

	public void decreaseScore(int score) {
		setScore(this.score - score);
	}

	public Order createOrder(List<Item> items, String address, String phone, int score) {
		double cost = 0;
		for (Item i : items) {
			cost += i.cost();
		}
		if (score <= cost * 0.3) {
			return new Order(items, address, phone, this, super.subject, score);
		}
		return null;
	}

	public boolean pay(Order order, GatewayPayment gateway) {
		if (order != null && gateway.pay(order.getTotal())) {
			order.setStatus(OrderStatus.success);
			decreaseScore(order.getDiscount());
			incrementScore(this.calScore(order));
			upgradeCustomer(this.score, this);
			return true;
		}
		return false;
	}

	public boolean payAgain(Order order) {
		for (Order o : this.orders) {
			if (o.equalOrder(order) && this.gateway.pay(order.getTotal())) {
				order.setStatus(OrderStatus.success);
				decreaseScore(score);
				incrementScore(this.calScore(order));
				upgradeCustomer(this.score, this);
				super.subject.getOrderManage().payAgain(order);
				return true;
			}
		}
		return false;
	}

	public boolean cancelOrder(String note, Order order) {
		for (Order o : this.orders) {
			if (o.equalOrder(order) && o.getStatus().equals(OrderStatus.waiting_transaction)) {
				order.setStatus(OrderStatus.cancel);
				order.cancel(note);
				return true;
			}
		}
		return false;
	}

	public void updateAvatar(String image) {
		this.person.setImage(image);
	}

	public boolean changePassword(String currentPassword, String newPassword) {
		return this.person.changePassword(currentPassword, newPassword);
	}

	public boolean recharge(int amount) {
		return ((GatewayPayment) this.gateway).recharge(amount);
	}

	public abstract void upgradeCustomer(int score, Customer cus);

	public abstract int calScore(Order order);

}
