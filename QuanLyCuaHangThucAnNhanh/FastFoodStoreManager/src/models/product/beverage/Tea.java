package models.product.beverage;

import models.product.Product;

public class Tea extends Beverage {
	public Tea(Product product) {
		super(product);
		description = "Tea";
	}

	@Override
	public double charge() {
		return 0.75;
	}

}
