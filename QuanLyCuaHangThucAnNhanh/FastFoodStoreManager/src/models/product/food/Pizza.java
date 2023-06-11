package models.product.food;

import models.product.Product;

public class Pizza extends Food{

	public Pizza(Product product) {
		super(product);
		description = "Pizza";
	}

	@Override
	public double charge() {
		// TODO Auto-generated method stub
		return 2.6;
	}

}
