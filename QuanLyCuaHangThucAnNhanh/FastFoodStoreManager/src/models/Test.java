package models;

import models.person.customer.Customer;
import models.person.customer.NewCustomer;
import models.person.customer.SilverCustomer;

public class Test {

	public static void main(String[] args) {
		Customer c = new NewCustomer();
		System.out.println(c instanceof SilverCustomer);
		
		c = new SilverCustomer();
		System.out.println(c instanceof SilverCustomer);
	}

}
