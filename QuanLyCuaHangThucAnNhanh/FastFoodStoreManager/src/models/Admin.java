package models;

public class Admin extends PersonObserver {
	public Admin(Subject subject) {
		super.subject = subject;
	}
	
	public void addProduct() {
	}
	
	public void updateProduct() {
	}
	
	public boolean deleteProduct() {
		return false;
	}
}
