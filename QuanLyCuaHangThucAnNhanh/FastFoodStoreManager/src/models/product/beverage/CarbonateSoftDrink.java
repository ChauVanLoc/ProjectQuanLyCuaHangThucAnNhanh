package models.product.beverage;

import models.product.Product;

public class CarbonateSoftDrink extends Beverage {
	public CarbonateSoftDrink(Product product) {
		super(product);
		description = "CarbonateSoftDrink";
	}

	@Override
	public double charge() {
		return 0.5;
	}

}
