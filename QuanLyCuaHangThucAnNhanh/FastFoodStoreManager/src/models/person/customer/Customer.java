package models.person.customer;

import java.util.Date;
import java.util.List;

import constant.OrderStatus;
import models.PersonObserver;
import models.ProductObserver;
import models.person.Address;
import models.person.Order;
import models.person.Person;

public abstract class Customer extends PersonObserver {
	protected int score;
	protected List<Address> deliveryAddress;
	protected List<Order> orders;
	protected GatewayPayment gateway;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Address> getDeliveryAddress() {
		return deliveryAddress;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void incrementScore(int score) {
		setScore(getScore() + score);
	}

	public void decreaseScore(int score) {
		setScore(getScore() - score);
	}

	public Order order(List<ProductObserver> products, Address adress, int score) {
		Order order = new Order(products, adress, this, subject, score);
		if (score >= 0 && this.gateway.sucessPayment(order.getTotal())) {
			order.setStatus(OrderStatus.success);
			incrementScore(order.score());
			upgradeCustomer(this.score, this);
		} else {
			order.setStatus(OrderStatus.waiting_transaction);
		}
		this.orders.add(order);
		return order;
	}

	public Order payment(Order order) {
		return this.subject.payment(order);
	}

	public boolean cancelOrder(String note, Order order) {
		return order.cancel(note);
	}

	public void updateInformation(String cccd, String name, Date dob, String sex, String phone, String email) {
		this.person.updateInfor(cccd, name, dob, sex, phone, email);
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
