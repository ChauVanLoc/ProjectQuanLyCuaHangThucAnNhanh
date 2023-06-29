package models.person;

import java.util.Date;
import java.util.List;

import constant.GenerateId;
import constant.OrderStatus;
import models.Item;
import models.PersonObserver;
import models.Subject;
import models.person.customer.Customer;

public class Order {
	private String id;
	private List<Item> items;
	private Date created;
	private Address address;
	private int discount = 0;
	private double total = 0;
	private String note;
	private String status;

	public Order(List<Item> items, Address adress, PersonObserver customer, Subject sub, int score) {
		this.id = GenerateId.generateId();
		this.created = new Date();
		this.address = adress;
		this.items = items;
		for (Item i : this.items) {
			total += i.cost();
		}
		if (score > 0) {
			total -= score;
			this.discount = score;
		}
		customer.getOrders().add(this);
		sub.addOrder(this);
	}

	public Order(List<Item> items, PersonObserver customer, PersonObserver employee, Subject sub, int score) {
		this.id = GenerateId.generateId();
		this.created = new Date();
		this.items = items;
		for (Item i : this.items) {
			total += i.cost();
		}
		if (customer != null) {
			if (score > 0) {
				total -= score;
				this.discount = score;
			}
			customer.getOrders().add(this);
		}
		employee.getOrders().add(this);
		sub.addOrder(this);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean cancel(String note) {
		if (this.status.equals(OrderStatus.waiting_transaction)) {
			setStatus(OrderStatus.cancel);
			setNote(note);
			return true;
		}
		return false;
	}

	public boolean same(Order order) {
		return this.id.equals(order.id);
	}
}
