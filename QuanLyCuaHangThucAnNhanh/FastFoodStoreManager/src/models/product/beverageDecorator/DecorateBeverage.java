package models.product.beverageDecorator;

import models.product.beverage.Beverage;

public abstract class DecorateBeverage {
	private Beverage beverage;

	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}

	public abstract double charge();
}
