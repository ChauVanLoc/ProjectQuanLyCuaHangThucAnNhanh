package models.product.beverageDecorator;

import models.product.beverage.Beverage;

public abstract class DecorateBeverage {
	protected Beverage beverage;
	
	public DecorateBeverage(Beverage beverage) {
		this.beverage = beverage;
	}


	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}

	public abstract double charge();

	public abstract String getDescription();
}
