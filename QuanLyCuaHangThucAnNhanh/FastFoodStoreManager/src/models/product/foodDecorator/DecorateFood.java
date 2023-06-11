package models.product.foodDecorator;

import models.product.food.Food;

public abstract class DecorateFood {
	private Food food;

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public abstract double charge();
}
