package models.person.customer;

import java.util.Date;
import java.util.List;

import constant.OrderStatus;
import models.Item;
import models.PersonObserver;
import models.person.Address;
import models.person.Order;

public abstract class Customer extends PersonObserver {
	protected int score;
	protected List<Address> deliveryAddress;
	protected GatewayPayment gateway;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Address> getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(List<Address> deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public GatewayPayment getGateway() {
		return gateway;
	}

	public void setGateway(GatewayPayment gateway) {
		this.gateway = gateway;
	}

	public void incrementScore(int score) {
		setScore(this.score + score);
	}

	public void decreaseScore(int score) {
		setScore(this.score - score);
	}

	public boolean pay(List<Item> items, Address adress, int score) {
		Order order = new Order(items, adress, this, subject, score);
		this.orders.add(order);
		if (this.gateway.pay(order.getTotal())) {
			order.setStatus(OrderStatus.success);
			decreaseScore(score);
			incrementScore(this.calScore(order));
			upgradeCustomer(this.score, this);
			return true;
		}
		order.setStatus(OrderStatus.waiting_transaction);
		return false;
	}

	public boolean payAgain(Order order) {
		if (this.gateway.pay(order.getTotal())) {
			order.setStatus(OrderStatus.success);
		}
		return false;
	}

	public boolean cancelOrder(String note, Order order) {
		return order.cancel(note);
	}

	public void updateInformation(String cccd, String name, Date dob, String sex, String phone, String email) {
		this.person.updateInformation(cccd, name, dob, sex, phone, email);
	}

	public void updateAvatar(String image) {
		this.person.setImage(image);
	}

	public boolean changePassword(String currentPassword, String newPassword) {
		return this.person.changePassword(currentPassword, newPassword);
	}

	public void recharge(double amount) {
		((Customer) this.gateway).recharge(amount);
	}

	public abstract void upgradeCustomer(int score, Customer cus);

	public abstract int calScore(Order order);

}
