package models.product.foodDecorator;

import models.product.food.Food;

public class Fish extends DecorateFood{

	public Fish(Food food) {
		super(food);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double charge() {
		// TODO Auto-generated method stub
		return 0.3 + food.charge();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return food.getDescription() + ", Fish";
	}
}
