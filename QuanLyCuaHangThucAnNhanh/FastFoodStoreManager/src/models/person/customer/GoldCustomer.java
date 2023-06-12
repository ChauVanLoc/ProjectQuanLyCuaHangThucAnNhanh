package models.person.customer;

import constant.Score;
import models.CustomerObserver;
import models.person.Order;

public class GoldCustomer extends CustomerObserver {
	public GoldCustomer(CustomerObserver cus) {
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
		if (score >= Score.TARGET_DIAMOND) {
			cus = new SilverCustomer(cus);
			cus.decreaseScore(Score.TARGET_DIAMOND);
		}
	}

	@Override
	public int calScore(Order order) {
		return (int) (order.getTotal() * Score.STRATEGY_GOLD);
	}
}
