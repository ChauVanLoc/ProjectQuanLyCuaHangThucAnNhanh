package models.product.beverageDecorator;

import models.product.beverage.Beverage;

public class Pudding extends DecorateBeverage {

	public Pudding(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double charge() {
		return 0.2 + beverage.charge();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Pudding";
	}

}
