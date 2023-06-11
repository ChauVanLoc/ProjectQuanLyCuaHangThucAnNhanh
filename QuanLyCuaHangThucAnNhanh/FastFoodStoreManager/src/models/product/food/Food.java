package models.product.food;

import models.product.Product;

public abstract class Food {
	private Product product;
	String description = "Unknow food";

	public Food(Product product) {
		super();
		this.product = product;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public abstract double charge();
}
