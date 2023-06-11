package models.person.customer;

import java.util.ArrayList;

import models.person.Person;

public class GoldCustomer extends Customer {
	public GoldCustomer(Person person) {
		super.person = person;
//		super.person.setSubject(person.getSubject());
//		super.person.getSubject().addObserver(this);
		super.deliveryAddress = new ArrayList<>();
	}
}
