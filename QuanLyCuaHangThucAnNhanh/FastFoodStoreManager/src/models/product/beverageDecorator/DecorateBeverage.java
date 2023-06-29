package models.product.beverageDecorator;

import models.ProductObserver;
import models.product.beverage.Beverage;

public abstract class DecorateBeverage extends Beverage {
	protected ProductObserver productObserver;

	@Override
	public double cost() {
		return super.product.getPrice() + this.productObserver.cost();
	}

	@Override
	public String getName() {
		return this.productObserver.getName() + " + " + super.product.getName();
	}

	public ProductObserver getProductObserver() {
		return productObserver;
	}

	public void setProductObserver(ProductObserver productObserver) {
		this.productObserver = productObserver;
	}
}
