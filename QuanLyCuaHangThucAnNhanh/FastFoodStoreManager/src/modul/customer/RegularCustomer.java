package modul.customer;

import java.util.ArrayList;

import modul.Subject;
import modul.account.Account;
import modul.employee.Person;

public class RegularCustomer extends Customer {
	public RegularCustomer(String name, String phone, Subject subject, Account account) {
		super.person = new Person(name, phone);
		super.person.setSubject(subject);
		super.person.getSubject().addObserver(this);
		super.person.setAccount(account);
		super.deliveryAddress = new ArrayList<>();
	}
}
