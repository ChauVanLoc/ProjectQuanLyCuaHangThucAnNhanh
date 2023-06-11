package models.product.food;

import models.product.Product;

public class Burger extends Food {
	public Burger(Product product) {
		super(product);
		description = "Burger";
	}

	@Override
	public double charge() {
		return 2.0;
	}

}
