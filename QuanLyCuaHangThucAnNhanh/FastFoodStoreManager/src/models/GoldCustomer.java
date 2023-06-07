package models;

import java.util.ArrayList;

public class GoldCustomer extends Customer {
	public GoldCustomer(Person person) {
		super.person = person;
//		super.person.setSubject(person.getSubject());
//		super.person.getSubject().addObserver(this);
		super.deliveryAddress = new ArrayList<>();
	}
}
