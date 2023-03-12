package modul;

import java.util.ArrayList;

public class RegularCustomer extends Customer {
	public RegularCustomer(String name, String phone, Subject subject) {
		super.person = new Person(name, phone, subject);
		super.deliveryAddress = new ArrayList<>();
		subject.addObserver(this);
	}
}
