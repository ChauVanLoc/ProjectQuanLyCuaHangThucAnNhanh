package models.product.foodDecorator;

import models.product.food.Food;

public class Onion extends DecorateFood{

	public Onion(Food food) {
		super(food);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double charge() {
		// TODO Auto-generated method stub
		return 0.1 + food.charge();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return food.getDescription() + ", Onion";
	}

}
