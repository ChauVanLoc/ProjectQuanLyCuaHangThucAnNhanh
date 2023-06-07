package models;

public abstract class Food{
	private Product product;

	public Food(Product product) {
		super();
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Food() {
		super();
	}
	public abstract double charge();
}
