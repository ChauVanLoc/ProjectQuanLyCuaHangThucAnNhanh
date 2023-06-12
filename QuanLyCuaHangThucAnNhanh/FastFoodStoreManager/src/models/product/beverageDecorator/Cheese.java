package models.product.beverageDecorator;

import models.Subject;
import models.product.Product;

public class Cheese extends DecorateBeverage {
	public Cheese(String id, String name, int quantity, double price, String addImg, String des, Subject sub) {
		super.product = new Product(id, name, quantity, price, addImg, des);
		super.subject = sub;
		super.subject.addDecorator(this);
	}

	@Override
	public double cost() {
		return super.product.getPrice() + super.productObserver.cost();
	}
}
