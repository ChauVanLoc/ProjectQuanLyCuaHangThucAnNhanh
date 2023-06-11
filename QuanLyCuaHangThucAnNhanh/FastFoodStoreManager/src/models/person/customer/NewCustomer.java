package models.person.customer;

import java.util.ArrayList;

import models.Subject;
import models.person.Person;

public class NewCustomer extends Customer {
	public NewCustomer(String name, String phone, String email, String password, Subject subject) {
		super.person = new Person(name, phone, email, password);
		super.person.setSubject(subject);
		super.person.getSubject().addObserver(this);
		super.deliveryAddress = new ArrayList<>();
	}

	public NewCustomer() {
	}
}
