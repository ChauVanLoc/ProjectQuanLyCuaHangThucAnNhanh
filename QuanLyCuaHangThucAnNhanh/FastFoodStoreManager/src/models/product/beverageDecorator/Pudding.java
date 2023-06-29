package models.product.beverageDecorator;

import models.Subject;
import models.product.Product;

public class Pudding extends DecorateBeverage {
	public Pudding(String name, int quantity, double price, String addImg, Subject sub) {
		super.product = new Product(name, quantity, price, addImg);
		super.subject = sub;
		super.subject.addDecorator(this);
	}

}
