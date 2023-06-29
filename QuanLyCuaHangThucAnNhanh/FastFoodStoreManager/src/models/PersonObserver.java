package models;

import java.util.ArrayList;
import java.util.List;

import models.person.Order;
import models.person.Person;

public abstract class PersonObserver {
	protected Person person;
	protected Subject subject;
	protected List<Notification> notifications = new ArrayList<>();
	protected List<Order> orders = new ArrayList<>();

	public Subject getSubject() {
		return this.subject;
	}

	public Person getPerson() {
		return person;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

}
