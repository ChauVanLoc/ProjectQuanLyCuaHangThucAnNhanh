package models;

import constant.Password;
import models.manage.ManageCustomer;
import models.manage.ManageEmployee;
import models.manage.ManageOrder;
import models.manage.ManageProduct;
import models.person.Order;

public class Admin implements Subject {
	private ManageOrder manageOrder;
	private ManageCustomer manageCustomer;
	private ManageEmployee manageEmployee;
	private ManageProduct manageProduct;

	public Admin() {
		this.manageCustomer = new ManageCustomer();
		this.manageEmployee = new ManageEmployee();
		this.manageOrder = new ManageOrder();
		this.manageProduct = new ManageProduct();
	}

//	public int login(String email, String password) {
//		
//	}

//	------------------------------------------------------------------
//	------------------ Product ---------------------------------------
//	------------------------------------------------------------------

	@Override
	public void addProduct(ProductObserver p) {
		this.manageProduct.addProduct(p);
	}

	@Override
	public void deleteProduct(ProductObserver p) {
		this.manageProduct.deleteProduct(p);
	}

//	------------------------------------------------------------------
//	------------------ Decorator ---------------------------------------
//	------------------------------------------------------------------

	@Override
	public void addDecorator(ProductObserver p) {
		this.manageProduct.addProduct(p);
	}

	@Override
	public void deleteDecorator(ProductObserver p) {
		this.manageProduct.deleteProduct(p);
	}

//	------------------------------------------------------------------
//	------------------ Customer --------------------------------------
//	------------------------------------------------------------------

	@Override
	public void addCustomer(CustomerObserver p) {
		this.manageCustomer.addCustomer(p);
	}

	@Override
	public void deleteCustomer(CustomerObserver p) {
		this.manageCustomer.deleteCustomer(p);
	}
	
//	------------------------------------------------------------------
//	------------------ Employee --------------------------------------
//	------------------------------------------------------------------

	@Override
	public void addEmployee(EmployeeObserver p) {
		this.manageEmployee.addEmployee(p);
	}

	@Override
	public void deleteEmployee(EmployeeObserver p) {
		this.manageEmployee.deleteEmployee(p);
	}

	@Override
	public void updateEmployee() {
		this.manageEmployee.updateEmployee();
	}

	public String changeDefaultPassword(String newDefaultPassword) {
		return Password.changeDefaultPassword(newDefaultPassword);
	}

//	------------------------------------------------------------------
//	------------------ Order -----------------------------------------
//	------------------------------------------------------------------

	@Override
	public void addOrder(Order o) {
		this.manageOrder.addOrder(o);
	}

	@Override
	public void deleteOrder(Order o) {
		this.manageOrder.deleteOrder(o);
	}

	@Override
	public Order payment(Order order) {
		return this.manageOrder.payment(order);
	}

}
