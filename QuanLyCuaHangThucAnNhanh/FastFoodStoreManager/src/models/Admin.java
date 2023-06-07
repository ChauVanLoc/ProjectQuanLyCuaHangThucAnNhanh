package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import constant.Rule;
import models.employee.Cashier;
import models.employee.Chef;
import models.employee.CleaningStaff;
import models.employee.Guard;
import models.employee.Shipper;

public class Admin implements Subject {
	private Person person;
	private List<Observer> observers;
	private List<Order> orders;
	private List<Account> accounts;

	public Admin() {
		this.person = new Person();
		this.observers = new ArrayList<>();
		this.orders = new ArrayList<>();
		this.accounts = new ArrayList<>();
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

	public List<Account> getAccount() {
		return accounts;
	}

	public void setAccount(List<Account> accounts) {
		this.accounts = accounts;
	}

	// Thao tac voi Observer
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {

	}

	public List<Observer> getAllEmployee() {
		List<Observer> result = new ArrayList<>();

		return result;
	}

	public List<Observer> getAllCustomer() {
		List<Observer> result = new ArrayList<>();

		return result;
	}

	public void createEmployee(String cccd, String name, int rule, Date dateOfBirth, Date expiredDate, String sex,
			Address address, String email, String phone, String academicLevel, Subject subject) {
		switch (rule) {
		case Rule.CASHIER: {
			new Cashier(cccd, name, dateOfBirth, expiredDate, sex, address, email, phone, academicLevel, subject);
			break;
		}
		case Rule.SHIPPER: {
			new Shipper(cccd, name, dateOfBirth, expiredDate, sex, address, email, phone, academicLevel, subject);
			break;
		}
		case Rule.CLEANING: {
			new CleaningStaff(cccd, name, dateOfBirth, expiredDate, sex, address, email, phone, academicLevel, subject);
			break;
		}
		case Rule.SECURITY: {
			new Guard(cccd, name, dateOfBirth, expiredDate, sex, address, email, phone, academicLevel, subject);
			break;
		}
		case Rule.KITCHEN: {
			new Chef(cccd, name, dateOfBirth, expiredDate, sex, address, email, phone, academicLevel, subject);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + rule);
		}
	}

	// Thao tac voi Order
	@Override
	public void addOrder(Order o) {
		orders.add(o);
	}

	@Override
	public void removeOrder(Order o) {
		orders.remove(o);
	}

	@Override
	public void notifyOrder() {

	}

	public List<Observer> getAllOrderOfEmployee() {
		List<Observer> result = new ArrayList<>();

		return result;
	}

	public List<Observer> getAllOrderOfCustomer() {
		List<Observer> result = new ArrayList<>();

		return result;
	}

	// thoa tac voi Account
	@Override
	public void addAccount(Account o) {
		accounts.add(o);
	}

	@Override
	public void removeAccount(Account o) {
		accounts.remove(o);
	}

	@Override
	public void notifyAccount() {

	}

	public List<Observer> getAllAccountOfEmployee() {
		List<Observer> result = new ArrayList<>();

		return result;
	}

	public List<Observer> getAllAccountOfCustomer() {
		List<Observer> result = new ArrayList<>();

		return result;
	}
	public static void main(String[] args) {
		System.out.println("sssssssss");
	}
}
