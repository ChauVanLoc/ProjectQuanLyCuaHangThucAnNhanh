package models.product.beverage;

import models.product.Product;

public abstract class Beverage {
	private Product product;
	private String size;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public abstract double charge();
}
