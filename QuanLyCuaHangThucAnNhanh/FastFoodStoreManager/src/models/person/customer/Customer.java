package models.person.customer;

import java.util.List;

import models.Observer;
import models.person.Address;
import models.person.Order;
import models.person.Person;

public abstract class Customer implements Observer {
	protected Person person;
	protected int score;
	protected List<Address> deliveryAddress;
	protected List<Order> orders;

//	public Account register(String email, String password, String phone, Subject subject) {
//		return new Account(email, password, phone, subject);
//	}
}
