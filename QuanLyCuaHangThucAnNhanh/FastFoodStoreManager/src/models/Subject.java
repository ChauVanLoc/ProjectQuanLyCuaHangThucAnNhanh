package models;

import models.person.Account;
import models.person.Order;

public interface Subject {
	public void addObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();

	public void addOrder(Order o);

	public void removeOrder(Order o);

	public void notifyOrder();

	public void addAccount(Account o);

	public void removeAccount(Account o);

	public void notifyAccount();
}
