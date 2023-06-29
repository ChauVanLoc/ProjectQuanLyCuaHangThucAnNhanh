package models;

import models.product.Product;

public abstract class ProductObserver {
	protected Product product;
	protected Subject subject;

	public double cost() {
		return this.product.getPrice();
	};

	public String getName() {
		return this.product.getName();
	}

	public void update(String name, double price, String addressImage) {
		this.product.update(name, price, addressImage);
	}

	public void increaseAmount(int amount) {
		this.product.increaseQuantity(amount);
	}

	public void descreaseAmount(int amount) {
		this.product.decreaseQuantity(amount);
	}
	
	public void buyAmount(int amount) {
		this.product.buyAmount(amount);
	}

	public void cancelAmount(int amount) {
		this.product.cancelAmount(amount);
	}
	
	public void createRating(double rating, String content, PersonObserver personObserver) {
		this.product.createRating(rating, content, personObserver);
	}

	public Product getProduct() {
		return product;
	}

}
