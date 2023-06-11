package models.product.food;

import models.product.Product;

public abstract class Food {
	private Product product;

	public Food(Product product) {
		super();
		this.product = product;
	}

	public Food() {
		super();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public abstract double charge();
}
