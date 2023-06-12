package models;

import java.util.Date;
import java.util.List;

import models.person.Address;
import models.person.Order;
import models.person.Person;

public abstract class CustomerObserver {
	protected Person person;
	protected int score;
	protected List<Address> deliveryAddress;
	protected List<Order> orders;
	protected Subject subject;

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

	public Order order(List<ProductObserver> products, Address adress) {
		Order order = new Order(products, adress, this, this.subject);
		this.orders.add(order);
		incrementScore(order.score());
		upgradeCustomer(getScore(), this);
		return order;
	}

	public Order orderWithDiscount(List<ProductObserver> products, Address adress) {
		Order order = new Order(products, adress, this, this.subject, this.score);
		this.orders.add(order);
		incrementScore(order.score());
		upgradeCustomer(getScore(), this);
		return order;
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
