package models.person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.CustomerObserver;
import models.EmployeeObserver;
import models.ProductObserver;
import models.Subject;

public class Order {
	private List<ProductObserver> products = new ArrayList<>();
	private double total = 0;
	private Date created;
	private Address address;
	private CustomerObserver cus;
	private EmployeeObserver emp;
	private int discount = 0;
	private String note;
	private boolean status;

	public Order(List<ProductObserver> pros, Address adress, CustomerObserver cus, Subject sub) {
		this.cus = cus;
		this.products = pros;
		this.created = new Date();
		for (ProductObserver p : this.products) {
			total += p.cost();
		}
		this.address = adress;
		sub.addOrder(this);
		this.status = true;
	}
	
	public Order(List<ProductObserver> pros, Address adress, CustomerObserver cus, Subject sub, int score) {
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
		this.status = true;
	}
	
	public Order(List<ProductObserver> pros, Address adress, CustomerObserver cus, Subject sub, EmployeeObserver emp) {
		this.cus = cus;
		this.products = pros;
		this.created = new Date();
		for (ProductObserver p : this.products) {
			total += p.cost();
		}
		this.address = adress;
		sub.addOrder(this);
		this.status = true;
		this.emp = emp;
	}

	public Order(List<ProductObserver> pros, Address adress, CustomerObserver cus, Subject sub, EmployeeObserver emp, int score) {
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
		this.status = true;
		this.emp = emp;
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
		return this.cus.calScore(this);
	}

	public int getDiscount() {
		return discount;
	}

	public boolean isStatus() {
		return status;
	}

	private void setStatus(boolean status) {
		this.status = status;
	}

	private void setNote(String note) {
		this.note = note;
	}

	public void cancel(String note) {
		setStatus(false);
		setNote(note);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
