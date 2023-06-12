package models.person.customer;

import java.util.ArrayList;

import constant.Score;
import models.CustomerObserver;
import models.Subject;
import models.person.Order;
import models.person.Person;

public class NewCustomer extends CustomerObserver {
	public NewCustomer(String name, String phone, String email, String password, Subject subject) {
		super.person = new Person(name, phone, email, password, subject, this);
		super.deliveryAddress = new ArrayList<>();
		super.orders = new ArrayList<>();
		super.subject = subject;
		this.subject.addCustomer(this);
	}

	@Override
	public void upgradeCustomer(int score, CustomerObserver cus) {
		if (score >= Score.TARGET_SILVER) {
			cus = new SilverCustomer(cus);
			cus.decreaseScore(Score.TARGET_SILVER);
		}
	}

	@Override
	public int calScore(Order order) {
		return (int) (order.getTotal() * Score.STRATEGY_NEW);
	}

}
