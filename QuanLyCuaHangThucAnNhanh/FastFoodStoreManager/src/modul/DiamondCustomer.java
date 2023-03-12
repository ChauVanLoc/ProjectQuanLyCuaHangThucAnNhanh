package modul;

import java.util.ArrayList;

public class DiamondCustomer extends Customer {

	public DiamondCustomer(String name, String email, String phone, Subject subject) {
		super.person = new Person(name, phone, subject);
		super.deliveryAddress = new ArrayList<>();
		subject.addObserver(this);
	}

}
