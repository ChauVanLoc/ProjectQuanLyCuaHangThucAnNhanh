package modul;

import java.util.ArrayList;
import java.util.List;

public class Admin implements Subject {
	private Person person;
	private List<Observer> observers;
	private List<Order> orders;
	private List<Account> account;

	public Admin() {
		this.person = new Person();
		this.observers = new ArrayList<>();
	}

	public List<Observer> getAllEmployee() {
		List<Observer> result = new ArrayList<>();

		return result;
	}

	public List<Observer> getAllCustomer() {
		List<Observer> result = new ArrayList<>();

		return result;
	}

	public List<Observer> getAllOrderOfEmployee() {
		List<Observer> result = new ArrayList<>();

		return result;
	}

	public List<Observer> getAllOrderOfCustomer() {
		List<Observer> result = new ArrayList<>();

		return result;
	}

	public List<Observer> getAllAccountOfEmployee() {
		List<Observer> result = new ArrayList<>();

		return result;
	}

	public List<Observer> getAllAccountOfCustomer() {
		List<Observer> result = new ArrayList<>();

		return result;
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addOrder(Order o) {
		orders.add(o);
	}

	@Override
	public void removeOrder(Order o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyOrder() {
		// TODO Auto-generated method stub

	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public void addAccount(Account o) {
		account.add(o);
	}

	@Override
	public void removeAccount(Account o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyAccount() {
		// TODO Auto-generated method stub

	}

}
