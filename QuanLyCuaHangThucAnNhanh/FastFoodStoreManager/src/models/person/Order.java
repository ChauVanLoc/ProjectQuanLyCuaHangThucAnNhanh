package models.person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.CustomerObserver;
import models.ProductObserver;
import models.Subject;

public class Order {
	private List<ProductObserver> products = new ArrayList<>();
	private double total = 0;
	private Date created;
	private Address address;
	private CustomerObserver cus;

	public Order(List<ProductObserver> pros, Address adress, CustomerObserver cus, Subject sub) {
		this.cus = cus;
		this.products = pros;
		this.created = new Date();
		for (ProductObserver p : this.products) {
			total += p.cost();
		}
		this.address = adress;
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

	public CustomerObserver getCus() {
		return cus;
	}

	public int score() {
		return (int) this.total / 20;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
