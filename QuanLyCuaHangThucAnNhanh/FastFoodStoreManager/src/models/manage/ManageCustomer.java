package models.manage;

import java.util.ArrayList;
import java.util.List;

import constant.Rule;
import constant.Score;
import models.PersonObserver;
import models.Subject;
import models.person.customer.Customer;
import models.person.customer.NewCustomer;

public class ManageCustomer {
	private List<PersonObserver> customers;

	public ManageCustomer() {
		this.customers = new ArrayList<>();
	}

	public List<PersonObserver> getCustomer() {
		return customers;
	}

	public void changeScore(String type, int targetScore) {
		Score.changeScore(type, targetScore);
	}

	public void addCustomer(PersonObserver o) {
		this.customers.add(o);
	}

	public void deleteCustomer(PersonObserver o) {
		this.customers.remove(o);
	}

	public PersonObserver register(String name, String email, String password, String phone, Subject sub) {
		return new NewCustomer(name, phone, email, password, sub);
	}

	public PersonObserver forgotPassword(String email) {
		return null;
	}

}
