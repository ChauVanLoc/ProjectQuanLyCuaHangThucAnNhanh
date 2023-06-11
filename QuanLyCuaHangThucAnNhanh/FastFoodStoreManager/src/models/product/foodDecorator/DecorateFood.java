package models.product.foodDecorator;

import models.product.food.Food;

public abstract class DecorateFood {
	protected Food food;
	
	public DecorateFood(Food food) {
		this.food = food;
	}
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public abstract double charge();
	
	public abstract String getDescription();
}
