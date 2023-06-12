package models;

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

	public abstract void update();

	public int login(String email, String password) {
		return this.person.login(email, password);
	}

	public abstract void upgradeCustomer(int score, CustomerObserver cus);

	public abstract int calScore(Order order);
}
