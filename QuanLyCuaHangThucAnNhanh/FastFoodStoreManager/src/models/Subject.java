package models;

import java.util.Date;

import models.person.Order;

public interface Subject {

	PersonObserver login(String email, String password);
	PersonObserver register(String email, String password);
	
//-------------------Product---------------------------------

	void addProduct(ProductObserver p);

	void deleteProduct(ProductObserver p);

// -------------------Customer---------------------------------

	void addCustomer(PersonObserver p);

	void deleteCustomer(PersonObserver p);

//-------------------Employee---------------------------------

	void addEmployee(PersonObserver p);

	void deleteEmployee(PersonObserver p);

	void addAdmin(PersonObserver p);
//-------------------Order---------------------------------

	void addOrder(Order o);

	void deleteOrder(Order o);

//-------------------Decorator---------------------------------

	void addDecorator(ProductObserver p);

	void deleteDecorator(ProductObserver p);

//-------------------Notification---------------------------------

	Notification createNotification();

	Vourcher createVourcher(String title, String content, String code, double cost, Date startDate, Date expiredDate);

}
