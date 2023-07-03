package models.product.food;

import models.Subject;
import models.product.Product;

public class BurgerChicken extends Food {
	public BurgerChicken(String name, int quantity, double price, String addImg, Subject sub) {
		super.product = new Product(name, quantity, price, addImg);
		super.subject = sub;
		super.subject.addFood(this);
	}
}
