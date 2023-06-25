package models;

import models.product.Product;

public abstract class ProductObserver {
	protected Product product;
	protected Subject subject;
	protected ProductObserver productObserver;

	public abstract double cost();

	public void update(String id, String name, int quantity, int quantitySold, double price, String addressImage,
			String description) {
		this.product.update(id, name, quantity, quantitySold, price, addressImage, description);
	}

	public void increaseAmount(int amount) {
		this.product.increaseAmount(amount);
	}

	public void descreaseAmount(int amount) {
		this.product.decreaseAmount(amount);
	}

	public void setProductObserver(ProductObserver productObserver) {
		this.productObserver = productObserver;
	}

	public Product getProduct() {
		return product;
	}

}
