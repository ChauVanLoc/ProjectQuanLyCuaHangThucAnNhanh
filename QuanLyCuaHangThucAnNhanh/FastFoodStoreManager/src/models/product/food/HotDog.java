package models.product.food;

import models.product.Product;

public class HotDog extends Food{

	public HotDog(Product product) {
		super(product);
		description = "Hot Dog";
	}

	@Override
	public double charge() {
		// TODO Auto-generated method stub
		return 1.30;
	}

}
