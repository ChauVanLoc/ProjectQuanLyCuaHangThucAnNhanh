package models.product.foodDecorator;

import models.ProductObserver;
import models.product.food.Food;

public abstract class DecorateFood extends Food {
	protected ProductObserver productObserver;

	@Override
	public abstract double cost();

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
