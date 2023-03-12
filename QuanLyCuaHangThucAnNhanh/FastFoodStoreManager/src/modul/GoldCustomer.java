package modul;

import java.util.ArrayList;

public class GoldCustomer extends Customer {
	public GoldCustomer(String name, String email, String phone, Subject subject) {
		super.person = new Person(name, phone, subject);
		super.deliveryAddress = new ArrayList<>();
		subject.addObserver(this);
	}
}
