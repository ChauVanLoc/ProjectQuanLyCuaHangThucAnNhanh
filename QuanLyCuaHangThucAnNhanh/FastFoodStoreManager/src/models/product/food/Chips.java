package models.product.food;

import models.product.Product;

public class Chips extends Food {

	public Chips(Product product) {
		super(product);
		description = "Chips";
	}

	@Override
	public double charge() {
		return 1.0;
	}

}
