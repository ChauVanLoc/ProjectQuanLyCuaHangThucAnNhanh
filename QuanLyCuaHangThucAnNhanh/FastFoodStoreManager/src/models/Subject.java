package models;

import java.util.Date;

import models.person.Order;

public interface Subject {

//-------------------Product---------------------------------

	void addProduct(ProductObserver p);

	void deleteProduct(ProductObserver p);

	ProductObserver createNewProduct();

	ProductObserver updateProduct();

// -------------------Customer---------------------------------

	void addCustomer(PersonObserver p);

	void deleteCustomer(PersonObserver p);

	PersonObserver updateCustomer();

//-------------------Employee---------------------------------

	void addEmployee(PersonObserver p);

	void deleteEmployee(PersonObserver p);

	PersonObserver updateEmployee();

//-------------------Order---------------------------------

	void addOrder(Order o);

	void deleteOrder(Order o);

	Order payment(Order order);

//-------------------Decorator---------------------------------

	void addDecorator(ProductObserver p);

	void deleteDecorator(ProductObserver p);

	ProductObserver updateDecorator();

//-------------------Notification---------------------------------

	Notification createNotification();

	Vourcher createVourcher(String title, String content, String code, double cost, Date startDate, Date expiredDate);

	void sendToAll();

	void sendToAllEmployee();

	void sendToAllCustomer();
}
