package modul;

import java.util.ArrayList;

public class RegularCustomer extends Customer {
	public RegularCustomer(String name, String phone) {
		super.person = new Person(name, phone);
		super.deliveryAddress = new ArrayList<>();
	}
}
