package models;

import java.util.Date;
import java.util.List;

import constant.OrderStatus;
import models.person.Address;
import models.person.Order;
import models.person.Person;
import models.person.customer.GatewayPayment;
import models.person.customer.ShopXu;

public abstract class CustomerObserver {
	protected Person person;
	protected int score;
	protected List<Address> deliveryAddress;
	protected List<Order> orders;
	protected Subject subject;
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

	public Order order(List<ProductObserver> products, Address adress, boolean isPay) {
		Order order = new Order(products, adress, this, this.subject);
		if (isPay && this.gateway.sucessPayment(order.getTotal())) {
			order.setStatus(OrderStatus.success);
			incrementScore(order.score());
			upgradeCustomer(getScore(), this);
		} else {
			order.setStatus(OrderStatus.waiting_transaction);
		}
		this.orders.add(order);
		return order;
	}

	public Order orderWithDiscount(List<ProductObserver> products, Address adress, boolean isPay) {
		Order order = new Order(products, adress, this, this.subject, this.score);
		if (isPay && this.gateway.sucessPayment(order.getTotal())) {
			order.setStatus(OrderStatus.success);
			incrementScore(order.score());
			upgradeCustomer(getScore(), this);
		} else {
			order.setStatus(OrderStatus.waiting_transaction);
		}
		this.orders.add(order);
		return order;
	}

	public Order payment(Order order) {
		return this.subject.payment(order);
	}

	public Order cancelOrder(String note, Order order) {
		order.cancel(note);
		return order;
	}

	public CustomerObserver updateInfor(String cccd, String name, Date dob, String sex, String phone, String email) {
		this.setPerson(this.person.updateInfor(cccd, name, dob, sex, phone, email));
		return this;
	}

	public int login(String email, String password) {
		return this.person.login(email, password);
	}

	public CustomerObserver changePassword(String currentPassword, String newPassword) {
		this.setPerson(this.person.changePassword(currentPassword, newPassword));
		return this;
	}

	public abstract void upgradeCustomer(int score, CustomerObserver cus);

	public abstract int calScore(Order order);

}
