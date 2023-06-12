package models.person.customer;

import java.util.ArrayList;

import models.CustomerObserver;
import models.Subject;
import models.person.Person;

public class NewCustomer extends CustomerObserver {
	public NewCustomer(String name, String phone, String email, String password, Subject subject) {
		super.person = new Person(name, phone, email, password);
		super.person.setSubject(subject);
		super.person.getSubject().addCustomer(this);
		super.deliveryAddress = new ArrayList<>();
	}

	@Override
	public int calScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}
}
