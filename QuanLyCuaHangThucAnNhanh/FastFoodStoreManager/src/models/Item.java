package models;

public class Item {
	private ProductObserver productObserver;
	private int quantity;

	public Item(ProductObserver productObserver, int quantity) {
		this.productObserver = productObserver;
		this.quantity = quantity;
		this.productObserver.buyAmount(quantity);
	}

	public ProductObserver getProductObserver() {
		return productObserver;
	}

	public void setProductObserver(ProductObserver productObserver) {
		this.productObserver = productObserver;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double cost() {
		return this.productObserver.cost() * quantity;
	}

}
