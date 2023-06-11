package models.product.beverage;

import models.product.Product;

public class Juice extends Beverage {
	public Juice(Product product) {
		super(product);
		description = "Juice";
	}

	@Override
	public double charge() {
		return 1.0;
	}

}
