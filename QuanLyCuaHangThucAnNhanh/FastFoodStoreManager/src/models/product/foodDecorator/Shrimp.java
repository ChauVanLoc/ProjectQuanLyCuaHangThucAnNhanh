package models.product.foodDecorator;

import models.Subject;
import models.product.Product;

public class Shrimp extends DecorateFood {

	public Shrimp(String id, String name, int quantity, double price, String addImg, String des, Subject sub) {
		super.product = new Product(id, name, quantity, price, addImg, des);
		super.subject = sub;
		super.subject.addDecorator(this);
	}

	@Override
	public double cost() {
		return 15 + super.productObserver.cost();
	}

}
