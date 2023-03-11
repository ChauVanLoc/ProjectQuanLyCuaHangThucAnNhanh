package modul;

import java.util.ArrayList;

public class DiamondCustomer extends Customer {

	public DiamondCustomer(String name, String email, String phone) {
		super.person = new Person(name, phone);
		super.deliveryAddress = new ArrayList<>();
	}

}
