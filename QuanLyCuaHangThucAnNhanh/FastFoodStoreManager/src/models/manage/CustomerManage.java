package models.manage;

import java.util.ArrayList;
import java.util.List;

import constant.Rule;
import constant.Score;
import models.PersonObserver;
import models.Subject;
import models.person.customer.Customer;
import models.person.customer.NewCustomer;

public class CustomerManage {
	private List<PersonObserver> customers;
	private Subject subject;

	public CustomerManage(Subject subject) {
		this.customers = new ArrayList<>();
		this.subject = subject;
	}

	public List<PersonObserver> getCustomers() {
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

	public PersonObserver register(String name, String email, String password, String phone) {
		for (PersonObserver p : customers) {
			if (p.getPerson().getAccount().getEmail().equals(email)) {
				return null;
			}
		}
		return new NewCustomer(name, phone, email, password, this.subject);
	}

	public PersonObserver forgotPassword(String email) {
		return null;
	}

}
