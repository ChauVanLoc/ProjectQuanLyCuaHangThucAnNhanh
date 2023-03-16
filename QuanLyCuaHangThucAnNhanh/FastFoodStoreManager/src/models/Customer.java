package models;

import java.util.List;

public abstract class Customer implements Observer {
	protected Person person;
	protected List<Address> deliveryAddress;

	public Account register(String email, String password, String phone, Subject subject) {
		return new Account(email, password, phone, subject);
	}
}
