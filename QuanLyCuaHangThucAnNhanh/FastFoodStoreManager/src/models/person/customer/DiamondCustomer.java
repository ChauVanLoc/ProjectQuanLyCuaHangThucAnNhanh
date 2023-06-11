package models.person.customer;

import java.util.ArrayList;

import models.person.Person;

public class DiamondCustomer extends Customer {

	public DiamondCustomer(Person person) {
		super.person = person;
//		super.person.setSubject(person.getSubject());
//		super.person.getSubject().addObserver(this);
		super.deliveryAddress = new ArrayList<>();
	}
}
