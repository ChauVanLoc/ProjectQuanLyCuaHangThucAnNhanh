package models.product.food;

import models.Subject;
import models.product.Product;

public class FriedChicken extends Food {
	public FriedChicken(String id, String name, int quantity, double price, String addImg, String des, Subject sub) {
		super.product = new Product(id, name, quantity, price, addImg, des);
		super.subject = sub;
		super.subject.addProduct(this);
	}

	@Override
	public double cost() {
		return 35;
	}

}
