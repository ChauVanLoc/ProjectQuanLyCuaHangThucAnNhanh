package models;

import models.person.Order;

public interface Subject {
	void addProduct(ProductObserver p);

	void deleteProduct(ProductObserver p);

	void addCustomer(CustomerObserver p);

	void deleteCustomer(CustomerObserver p);

	void addEmployee(EmployeeObserver p);

	void deleteEmployee(EmployeeObserver p);

	void updateEmployee();

	void addOrder(Order o);

	void deleteOrder(Order o);

	Order payment(Order order);

	void addDecorator(ProductObserver p);

	void deleteDecorator(ProductObserver p);

}
