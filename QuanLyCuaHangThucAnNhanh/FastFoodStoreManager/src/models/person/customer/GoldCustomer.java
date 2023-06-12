package models.person.customer;

import java.util.ArrayList;

import models.CustomerObserver;
import models.person.Person;

public class GoldCustomer extends CustomerObserver {
	public GoldCustomer(Person person) {
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
