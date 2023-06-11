package models.product.food;

import models.product.Product;

public class Spagetti extends Food {

	public Spagetti(Product product) {
		super(product);
		description = "Spagetti";
	}

	@Override
	public double charge() {
		// TODO Auto-generated method stub
		return 1.86;
	}

}
