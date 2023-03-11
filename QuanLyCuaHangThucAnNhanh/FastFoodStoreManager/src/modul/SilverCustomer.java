package modul;

import java.util.ArrayList;

public class SilverCustomer extends Customer {
	public SilverCustomer(String name, String email, String phone) {
		super.person = new Person(name, phone);
		super.deliveryAddress = new ArrayList<>();
	}
}
