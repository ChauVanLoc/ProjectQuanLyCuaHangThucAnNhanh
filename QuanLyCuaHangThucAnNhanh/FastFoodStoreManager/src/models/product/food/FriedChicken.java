package models.product.food;

import models.Subject;
import models.product.Product;

public class FriedChicken extends Food {
	public FriedChicken(String name, int quantity, double price, String addImg, Subject sub) {
		super.product = new Product(name, quantity, price, addImg);
		super.subject = sub;
		super.subject.addProduct(this);
	}
}
