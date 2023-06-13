package managementStore;

public class Food implements ProductObserver {
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

}
