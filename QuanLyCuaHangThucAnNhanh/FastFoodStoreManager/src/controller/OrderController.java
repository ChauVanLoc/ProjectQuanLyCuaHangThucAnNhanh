package controller;

import java.util.List;

import models.Item;
import models.ProductObserver;
import models.Subject;
import models.manage.ProductManage;
import models.product.food.Food;
import views.Menu;

public class OrderController {
	private Menu menu;
	private ProductManage productManage;

	public OrderController(Menu menu, ProductManage productManage) {
		this.menu = menu;
		this.productManage = productManage;
	}

	public List<Item> getItems() {
		return this.menu.getItems();
	}

	public void addItem(Item item) {
		this.menu.addItem(item);
	}
}
