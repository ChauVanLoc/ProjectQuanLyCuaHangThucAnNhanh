package models.product.beverageDecorator;

import models.Subject;
import models.product.Product;

public class Cheese extends DecorateBeverage {
	public Cheese(String name, int quantity, double price, String addImg, Subject sub) {
		super.product = new Product(name, quantity, price, addImg);
		super.subject = sub;
		super.subject.addDecorator(this);
	}

}
