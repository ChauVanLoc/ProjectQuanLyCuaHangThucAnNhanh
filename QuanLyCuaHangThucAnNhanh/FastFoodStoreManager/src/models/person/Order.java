package models.person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import constant.GenerateId;
import constant.OrderStatus;
import models.PersonObserver;
import models.ProductObserver;
import models.Subject;
import models.person.customer.Customer;
import models.person.employee.Employee;

public class Order {
	private String id;
	private List<ProductObserver> products = new ArrayList<>();
	private double total = 0;
	private Date created;
	private Address address = null;
	private PersonObserver customer;
	private PersonObserver employee;
	private int discount = 0;
	private String note;
	private String status;

	public Order(List<ProductObserver> products, Address adress, PersonObserver customer, Subject sub, int score) {
		this.id = GenerateId.generateId();
		this.created = new Date();
		this.address = adress;
		this.customer = customer;
		this.products = products;
		for (ProductObserver p : this.products) {
			total += p.cost();
		}
		if (score > 0) {
			total = total - score;
			this.discount = score;
		}
		((Customer) customer).decreaseScore(score);
		sub.addOrder(this);
	}

	public Order(List<ProductObserver> products, PersonObserver customer, PersonObserver employee, Subject sub,
			int score) {
		this.id = GenerateId.generateId();
		this.created = new Date();
		this.customer = customer;
		this.employee = employee;
		this.products = products;
		for (ProductObserver p : this.products) {
			total += p.cost();
		}
		if (this.customer != null && score > 0) {
			total = total - score;
			this.discount = score;
		}
		((Customer) customer).decreaseScore(score);
		sub.addOrder(this);
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

	public PersonObserver getCustomer() {
		return customer;
	}

	public int score() {
		return ((Customer) this.customer).calScore(this);
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
