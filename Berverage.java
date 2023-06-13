package managementStore;

public class Berverage implements ProductObserver {
	private Product product;
	private String size;

	public Berverage(Product product, String size) {
		super();
		this.product = product;
		this.size = size;
	}

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

}
