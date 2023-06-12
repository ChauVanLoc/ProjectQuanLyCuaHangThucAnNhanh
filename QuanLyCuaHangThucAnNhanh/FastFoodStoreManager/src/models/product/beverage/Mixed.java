package models.product.beverage;

import models.Subject;
import models.product.Product;

public class Mixed extends Beverage {
	public Mixed(String id, String name, int quantity, double price, String addImg, String des, Subject sub) {
		super.product = new Product(id, name, quantity, price, addImg, des);
		super.subject = sub;
		super.subject.addProduct(this);
	}

	@Override
	public double cost() {
		return super.product.getPrice();
	}

}
