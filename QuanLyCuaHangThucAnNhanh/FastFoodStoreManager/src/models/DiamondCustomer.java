package models;

import java.util.ArrayList;

public class DiamondCustomer extends Customer {

	public DiamondCustomer(Person person) {
		super.person = person;
//		super.person.setSubject(person.getSubject());
//		super.person.getSubject().addObserver(this);
		super.deliveryAddress = new ArrayList<>();
	}
}
