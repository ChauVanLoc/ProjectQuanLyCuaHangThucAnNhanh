package models.manage;

import java.util.ArrayList;
import java.util.List;

import constant.OrderStatus;
import models.person.Order;

public class OrderManage {
	private List<Order> orders;

	public OrderManage() {
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
//
//	public Order payment(Order order) {
//		for (Order o : orders) {
//			if (o.equal(order)) {
//				o.setStatus(OrderStatus.success);
//				return o;
//			}
//		}
//		return null;
//	}

}
