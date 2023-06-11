package models.product.food;

import models.product.Product;

public class FriedChicken extends Food {

	public FriedChicken(Product product) {
		super(product);
		description = "Fried Chicken";
	}

	@Override
	public double charge() {
		return 2.5;
	}

}
