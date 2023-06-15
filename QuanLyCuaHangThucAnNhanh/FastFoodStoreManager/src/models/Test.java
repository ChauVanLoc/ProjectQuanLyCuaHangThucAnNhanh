package models;

import models.person.customer.Customer;
import models.person.customer.NewCustomer;
import models.person.customer.SilverCustomer;
import models.product.beverage.Juice;
import models.product.beverageDecorator.Cheese;
import models.product.beverageDecorator.Pudding;

public class Test {
	public static void main(String[] args) {
		Subject admin = new Center();

//		ProductObserver orange = new Juice("1", "orange", 3, 16, "", "Mo ta", admin);
//
//		ProductObserver cheese = new Cheese("cheese", "cheese", 3, 5, "", "mota", admin);
//		
//		cheese.setProductObserver(orange);
//		
//		ProductObserver pudding = new Pudding("cheese", "cheese", 3, 5, "", "mota", admin);
//		
//		ProductObserver orange2 = new Juice("1", "orange", 3, 10, "", "Mo ta", admin);
//		
//		pudding.setProductObserver(cheese);
//		
//		System.out.println(pudding.cost());
		
		Customer c1 = new NewCustomer("a", "09838338", "locchau.220401", "abcd", admin);
		System.out.println(c1.person.toString());
		
		c1 = new SilverCustomer(c1);
		System.out.println(c1.person.toString());
	}
}
