package modul.customer;

import java.util.List;

import modul.Address;
import modul.Observer;
import modul.Subject;
import modul.account.Account;
import modul.employee.Person;

public abstract class Customer implements Observer {
	protected Person person;
	protected List<Address> deliveryAddress;

	public Account register(String email, String password, String phone, Subject subject) {
		return new Account(email, password, phone, subject);
	}
}
