package models.person.customer;

import java.util.ArrayList;

import models.CustomerObserver;
import models.person.Person;

public class SilverCustomer extends CustomerObserver {
	public SilverCustomer(Person person) {
		super.person = person;
//		super.person.setSubject(person.getSubject());
//		super.person.getSubject().addObserver(this);
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
