package models.manage;

import java.util.ArrayList;
import java.util.List;

import constant.Rule;
import constant.Score;
import models.Subject;
import models.person.customer.Customer;
import models.person.customer.NewCustomer;

public class ManageCustomer {
	private List<Customer> cuss;

	public ManageCustomer() {
		this.cuss = new ArrayList<>();
	}

	public List<Customer> getCustomer() {
		return cuss;
	}

	public void changeScore(String type, int targetScore) {
		Score.changeScore(type, targetScore);
	}

	public void addCustomer(Customer o) {
		this.cuss.add(o);
	}

	public void deleteCustomer(Customer o) {
		this.cuss.remove(o);
	}

	public int login(String email, String password) {
		for (Customer c : cuss) {
			return c.login(email, password);
		}
		return Rule.UNAUTHORIZED;
	}

	public Customer register(String name, String email, String password, String phone, Subject sub) {
		return new NewCustomer(name, phone, email, password, sub);
	}

	public Customer forgotPassword(String email) {
		return null;
	}

}
