package models.product.foodDecorator;

import models.product.food.Food;

public class Chicken extends DecorateFood {

	public Chicken(Food food) {
		super(food);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double charge() {
		return 0.5 + food.charge();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return food.getDescription();
	}

}
