package modul;

import java.util.ArrayList;

public class SilverCustomer extends Customer {
	public SilverCustomer(String name, String email, String phone, Subject subject) {
		super.person = new Person(name, phone, subject);
		super.deliveryAddress = new ArrayList<>();
		subject.addObserver(this);
	}
}
