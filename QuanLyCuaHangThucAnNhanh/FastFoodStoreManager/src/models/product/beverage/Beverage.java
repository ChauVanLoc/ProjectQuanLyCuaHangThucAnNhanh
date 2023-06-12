package models.product.beverage;

import models.ProductObserver;
import models.product.Product;

public abstract class Beverage extends ProductObserver {

	@Override
	public abstract double cost();

}
