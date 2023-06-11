package models.product.beverageDecorator;

import models.product.beverage.Beverage;

public class Cheese extends DecorateBeverage {
	public Cheese(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double charge() {
		return 0.3 + beverage.charge();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Cheese";
	}

}
