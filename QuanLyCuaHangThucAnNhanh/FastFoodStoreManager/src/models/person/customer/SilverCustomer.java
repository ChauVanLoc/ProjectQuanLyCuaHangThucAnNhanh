package models.person.customer;

import java.util.ArrayList;

import models.person.Person;

public class SilverCustomer extends Customer {
	public SilverCustomer(Person person) {
		super.person = person;
//		super.person.setSubject(person.getSubject());
//		super.person.getSubject().addObserver(this);
		super.deliveryAddress = new ArrayList<>();
	}
	public SilverCustomer() {}
}
