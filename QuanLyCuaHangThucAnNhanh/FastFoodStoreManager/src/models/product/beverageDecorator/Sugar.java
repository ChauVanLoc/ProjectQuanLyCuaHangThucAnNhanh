package models.product.beverageDecorator;

import models.product.beverage.Beverage;

public class Sugar extends DecorateBeverage {

	public Sugar(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double charge() {
		return 0.1 + beverage.charge();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Sugar";
	}

}
