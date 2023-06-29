package models;

import models.person.Person;

public class Admin extends PersonObserver {
	public Admin(String name, String phone, String email, String password, Subject subject) {
		super.person = new Person(name, phone, email, password);
		super.subject = subject;
		super.subject.addAdmin(this);
	}
	
	public void addProduct() {
	}
	
	public void updateProduct() {
	}
	
	public boolean deleteProduct() {
		return false;
	}
}
