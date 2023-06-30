package models.manage;

import java.util.ArrayList;
import java.util.List;

import models.ProductObserver;

public class ProductManage {
	private List<ProductObserver> products;
	private List<ProductObserver> decorators;

	public ProductManage() {
		this.products = new ArrayList<>();
		this.decorators = new ArrayList<>();
	}

//	------------------ Product ---------------------------------------

	public List<ProductObserver> getProducts() {
		return products;
	}

	public void addProduct(ProductObserver o) {
		this.products.add(o);
	}

	public void deleteProduct(ProductObserver o) {
		this.products.remove(o);
	}

	public void updateProduct() {

	}
//	------------------ Decorator ---------------------------------------

	public List<ProductObserver> getDecorators() {
		return decorators;
	}

	public void addDecorator(ProductObserver o) {
		this.products.add(o);
	}

	public void deleteDecorator(ProductObserver o) {
		this.products.remove(o);
	}

	public void updateDecorator() {

	}
}
