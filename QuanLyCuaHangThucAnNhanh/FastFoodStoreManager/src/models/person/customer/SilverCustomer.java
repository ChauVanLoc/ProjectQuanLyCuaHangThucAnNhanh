package models.person.customer;

import constant.Score;
import models.CustomerObserver;
import models.person.Order;

public class SilverCustomer extends CustomerObserver {
	public SilverCustomer(CustomerObserver cus) {
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
		if (score >= Score.TARGET_GOLD) {
			cus = new SilverCustomer(cus);
			cus.decreaseScore(Score.TARGET_GOLD);
		}
	}

	@Override
	public int calScore(Order order) {
		return (int) (order.getTotal() * Score.STRATEGY_SILVER);
	}
}
