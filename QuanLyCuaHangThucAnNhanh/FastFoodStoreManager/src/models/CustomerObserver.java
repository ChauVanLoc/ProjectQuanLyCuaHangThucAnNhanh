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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void incrementScore(int score) {
		setScore(getScore() + score);
	}

	public Order order(List<ProductObserver> products) {

		return null;
	}

	public abstract int calScore();

	public abstract void update();
}
