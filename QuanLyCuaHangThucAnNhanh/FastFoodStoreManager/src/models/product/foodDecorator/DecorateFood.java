package models.product.foodDecorator;

import models.product.food.Food;

public abstract class DecorateFood extends Food {
	@Override
	public abstract double cost();
}
