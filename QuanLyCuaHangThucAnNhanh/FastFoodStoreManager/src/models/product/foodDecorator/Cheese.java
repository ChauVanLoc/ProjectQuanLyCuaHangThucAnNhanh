package models.product.foodDecorator;

import models.product.food.Food;

public class Cheese extends DecorateFood{

	public Cheese(Food food) {
		super(food);
	}

	@Override
	public double charge() {
		return 0.3 + food.charge();
	}

	@Override
	public String getDescription() {
		return food.getDescription() + ", Cheese";
	}

}
