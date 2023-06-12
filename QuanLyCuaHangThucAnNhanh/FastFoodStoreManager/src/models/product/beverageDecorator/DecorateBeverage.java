package models.product.beverageDecorator;

import models.product.beverage.Beverage;

public abstract class DecorateBeverage extends Beverage {
	@Override
	public abstract double cost();
}
