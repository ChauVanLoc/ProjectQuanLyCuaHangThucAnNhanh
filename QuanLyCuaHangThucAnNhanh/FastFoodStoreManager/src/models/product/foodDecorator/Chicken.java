package models.product.foodDecorator;

import models.Subject;
import models.product.Product;

public class Chicken extends DecorateFood {

	public Chicken(String name, int quantity, double price, String addImg, Subject sub) {
		super.product = new Product(name, quantity, price, addImg);
		super.subject = sub;
		super.subject.addDecorator(this);
	}
	
	@Override
	public double cost() {
		return super.product.getPrice() + this.productObserver.cost();
	}
}
