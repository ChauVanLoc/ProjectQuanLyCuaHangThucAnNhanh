package models.manage;

import java.util.ArrayList;
import java.util.List;

import models.person.Order;

public class ManageOrder {
	private List<Order> orders;

	public ManageOrder() {
		this.orders = new ArrayList<>();
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order o) {
		this.orders.add(o);
	}

	public void deleteOrder(Order o) {
		this.orders.remove(o);
	}

}
