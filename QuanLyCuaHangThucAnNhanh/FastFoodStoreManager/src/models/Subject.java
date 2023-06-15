package models;

import models.person.Order;
import models.person.customer.Customer;
import models.person.employee.Employee;

public interface Subject {
	void addProduct(ProductObserver p);

	void deleteProduct(ProductObserver p);

	void addCustomer(Customer p);

	void deleteCustomer(Customer p);

	void addEmployee(Employee p);

	void deleteEmployee(Employee p);

	void updateEmployee();

	void addOrder(Order o);

	void deleteOrder(Order o);

	Order payment(Order order);

	void addDecorator(ProductObserver p);

	void deleteDecorator(ProductObserver p);

}
