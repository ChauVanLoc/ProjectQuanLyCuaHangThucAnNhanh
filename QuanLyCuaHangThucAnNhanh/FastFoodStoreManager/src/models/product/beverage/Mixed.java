package models.product.beverage;

import models.product.Product;

public class Mixed extends Beverage {
	public Mixed(Product product) {
		super(product);
		description = "Mixed";
	}

	@Override
	public double charge() {
		return 0.95;
	}

}
