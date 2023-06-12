package models.person.customer;

import constant.Score;
import models.CustomerObserver;
import models.person.Order;

public class DiamondCustomer extends CustomerObserver {
	public DiamondCustomer(CustomerObserver cus) {
		super.person = cus.getPerson();
		super.deliveryAddress = cus.getDeliveryAddress();
		super.orders = cus.getOrders();
		super.score = cus.getScore();
	}

	@Override
	public void update() {

	}

	@Override
	public void upgradeCustomer(int score, CustomerObserver cus) {
	}

	@Override
	public int calScore(Order order) {
		return (int) (order.getTotal() * Score.STRATEGY_DIAMOND);
	}
}
