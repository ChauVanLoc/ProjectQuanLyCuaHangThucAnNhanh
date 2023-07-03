package models.manage;

import java.util.ArrayList;
import java.util.List;

import models.ProductObserver;

public class ProductManage {
	private List<ProductObserver> foods;
	private List<ProductObserver> beverages;

	public ProductManage() {
		this.foods = new ArrayList<>();
		this.beverages = new ArrayList<>();
	}

//	------------------ Product ---------------------------------------

	public List<ProductObserver> getFoods() {
		return foods;
	}

	public void addFood(ProductObserver o) {
		this.foods.add(o);
	}

	public void deleteFood(ProductObserver o) {
		this.foods.remove(o);
	}

	public void updateFood() {

	}
//	------------------ Beverage ---------------------------------------

	public List<ProductObserver> getBeverages() {
		return beverages;
	}

	public void addBeverage(ProductObserver o) {
		this.beverages.add(o);
	}

	public void deleteBeverage(ProductObserver o) {
		this.beverages.remove(o);
	}

	public void updateDecorator() {

	}
}
