package models.person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import constant.GenerateId;
import constant.OrderStatus;
import models.ProductObserver;
import models.Subject;
import models.person.customer.Customer;
import models.person.employee.Employee;

public class Order {
	private String id;
	private List<ProductObserver> products = new ArrayList<>();
	private double total = 0;
	private Date created;
	private Address address;
	private Customer cus;
	private Employee emp;
	private int discount = 0;
	private String note;
	private String status;

	public Order(List<ProductObserver> pros, Address adress, Customer cus, Subject sub) {
		this.cus = cus;
		this.products = pros;
		this.created = new Date();
		for (ProductObserver p : this.products) {
			total += p.cost();
		}
		this.address = adress;
		sub.addOrder(this);
		this.id = GenerateId.generateId();
	}

	public Order(List<ProductObserver> pros, Address adress, Customer cus, Subject sub, int score) {
		this.cus = cus;
		this.products = pros;
		this.created = new Date();
		for (ProductObserver p : this.products) {
			total += p.cost();
		}
		total = total - score;
		this.discount = score;
		cus.decreaseScore(score);
		this.address = adress;
		sub.addOrder(this);
		this.id = GenerateId.generateId();
	}

	public Order(List<ProductObserver> pros, Address adress, Customer cus, Subject sub, Employee emp) {
		this.cus = cus;
		this.products = pros;
		this.created = new Date();
		for (ProductObserver p : this.products) {
			total += p.cost();
		}
		this.address = adress;
		sub.addOrder(this);
		this.emp = emp;
		this.id = GenerateId.generateId();
	}

	public Order(List<ProductObserver> pros, Address adress, Customer cus, Subject sub, Employee emp,
			int score) {
		this.cus = cus;
		this.products = pros;
		this.created = new Date();
		for (ProductObserver p : this.products) {
			total += p.cost();
		}
		total = total - score;
		this.discount = score;
		cus.decreaseScore(score);
		this.address = adress;
		sub.addOrder(this);
		this.emp = emp;
		this.id = GenerateId.generateId();
	}

	public List<ProductObserver> getProducts() {
		return products;
	}

	public double getTotal() {
		return total;
	}

	public Date getCreated() {
		return created;
	}

	public Address getAddress() {
		return address;
	}

	public Customer getCus() {
		return cus;
	}

	public int score() {
		return this.cus.calScore(this);
	}

	public int getDiscount() {
		return discount;
	}

	public String isStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private void setNote(String note) {
		this.note = note;
	}

	public void cancel(String note) {
		setStatus(OrderStatus.cancel);
		setNote(note);
	}

	public boolean equal(Order order) {
		if (this.id.equals(order.id)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
