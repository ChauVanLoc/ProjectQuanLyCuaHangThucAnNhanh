package models.person.customer;

import java.util.ArrayList;

import constant.Score;
import models.CustomerObserver;
import models.Subject;
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
	public void update() {

	}

	@Override
	public void upgradeCustomer(int score, CustomerObserver cus) {
		if (score > Score.UP_TO_SILVER) {
			cus = new SilverCustomer(cus);
			cus.decreaseScore(Score.UP_TO_SILVER);
		}
	}

}
