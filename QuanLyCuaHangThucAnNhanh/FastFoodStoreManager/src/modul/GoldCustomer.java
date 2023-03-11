package modul;

import java.util.ArrayList;

public class GoldCustomer extends Customer {
	public GoldCustomer(String name, String email, String phone) {
		super.person = new Person(name, phone);
		super.deliveryAddress = new ArrayList<>();
	}
}
