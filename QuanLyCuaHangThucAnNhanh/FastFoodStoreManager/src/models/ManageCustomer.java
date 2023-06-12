package models;

import java.util.ArrayList;
import java.util.List;

import constant.Rule;
import constant.Score;
import models.person.customer.NewCustomer;

public class ManageCustomer {
	private List<CustomerObserver> cuss;

	public ManageCustomer() {
		this.cuss = new ArrayList<>();
	}

	public List<CustomerObserver> getCustomer() {
		return cuss;
	}

	public void changeScore(String type, int targetScore) {
		Score.changeScore(type, targetScore);
	}

	public void addCustomer(CustomerObserver o) {
		this.cuss.add(o);
	}

	public void deleteCustomer(CustomerObserver o) {
		this.cuss.remove(o);
	}

	public int login(String email, String password) {
		for (CustomerObserver c : cuss) {
			return c.login(email, password);
		}
		return Rule.UNAUTHORIZED;
	}

	public CustomerObserver register(String name, String email, String password, String phone, Subject sub) {
		return new NewCustomer(name, phone, email, password, sub);
	}

	public CustomerObserver forgotPassword(String email) {
		return null;
	}

}
