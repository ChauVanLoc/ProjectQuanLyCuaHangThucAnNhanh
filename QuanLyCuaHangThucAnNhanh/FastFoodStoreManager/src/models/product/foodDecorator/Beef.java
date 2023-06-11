package models.product.foodDecorator;

import models.product.food.Food;

public class Beef extends DecorateFood {

	public Beef(Food food) {
		super(food);
	}

	@Override
	public double charge() {
		return 0.5 + food.charge();
	}

	@Override
	public String getDescription() {
		return food.getDescription() + ",Beef";
	}

}
