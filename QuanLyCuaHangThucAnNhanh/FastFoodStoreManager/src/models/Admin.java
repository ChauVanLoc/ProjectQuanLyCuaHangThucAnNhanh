package models;

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

}
