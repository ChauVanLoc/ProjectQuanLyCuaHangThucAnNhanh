package models.person.customer;

import constant.Score;
import models.CustomerObserver;

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
		if (score > Score.UP_TO_DIAMOND) {
			cus = new SilverCustomer(cus);
			cus.decreaseScore(Score.UP_TO_DIAMOND);
		}
	}
}
