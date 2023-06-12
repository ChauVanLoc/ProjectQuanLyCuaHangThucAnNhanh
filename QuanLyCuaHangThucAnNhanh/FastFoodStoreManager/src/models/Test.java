package models;

import models.product.beverage.Juice;
import models.product.beverageDecorator.Cheese;
import models.product.beverageDecorator.Pudding;

public class Test {
	public static void main(String[] args) {
		Subject admin = new Admin();

		ProductObserver orange = new Juice("1", "orange", 3, 16, "", "Mo ta", admin);

		ProductObserver cheese = new Cheese("cheese", "cheese", 3, 5, "", "mota", admin);
		
		cheese.setProductObserver(orange);
		
		ProductObserver pudding = new Pudding("cheese", "cheese", 3, 5, "", "mota", admin);
		
		ProductObserver orange2 = new Juice("1", "orange", 3, 10, "", "Mo ta", admin);
		
		pudding.setProductObserver(cheese);
		
		System.out.println(pudding.cost());
	}
}
