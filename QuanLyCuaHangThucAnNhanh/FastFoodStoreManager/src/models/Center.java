package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import constant.Password;
import models.manage.ManageCustomer;
import models.manage.ManageEmployee;
import models.manage.ManageOrder;
import models.manage.ManageProduct;
import models.person.Order;
import models.person.customer.Customer;
import models.person.employee.Employee;

public class Center implements Subject {
	private ManageOrder manageOrder;
	private ManageCustomer manageCustomer;
	private ManageEmployee manageEmployee;
	private ManageProduct manageProduct;

	public Center() {
		this.manageCustomer = new ManageCustomer();
		this.manageEmployee = new ManageEmployee();
		this.manageOrder = new ManageOrder();
		this.manageProduct = new ManageProduct();
	}

	@Override
	public PersonObserver login(String email, String password) {
		List<PersonObserver> list = new ArrayList<>();
		list.addAll(this.manageCustomer.getCustomer());
		list.addAll(this.manageEmployee.getEmployee());
		for (PersonObserver o : list) {
			if (o.getPerson().getAccount().validateAccount(email, password)) {
				return o;
			}
		}
		return null;
	}

	@Override
	public PersonObserver register(String email, String password) {
		return null;
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

	@Override
	public ProductObserver createNewProduct() {
		return null;
	}

	@Override
	public ProductObserver updateProduct() {
		return null;
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

	@Override
	public ProductObserver updateDecorator() {
		return null;
	}

//	------------------------------------------------------------------
//	------------------ Customer --------------------------------------
//	------------------------------------------------------------------

//	@Override
//	public void addCustomer(Customer p) {
//		this.manageCustomer.addCustomer(p);
//	}
//
//	@Override
//	public void deleteCustomer(Customer p) {
//		this.manageCustomer.deleteCustomer(p);
//	}

//	------------------------------------------------------------------
//	------------------ Employee --------------------------------------
//	------------------------------------------------------------------

//	@Override
//	public void addEmployee(Employee p) {
//		this.manageEmployee.addEmployee(p);
//	}
//
//	@Override
//	public void deleteEmployee(Employee p) {
//		this.manageEmployee.deleteEmployee(p);
//	}
//
//	@Override
//	public void updateEmployee() {
//		this.manageEmployee.updateEmployee();
//	}

//	public String changeDefaultPassword(String newDefaultPassword) {
//		return Password.changeDefaultPassword(newDefaultPassword);
//	}

//	------------------------------------------------------------------
//	------------------ Order -----------------------------------------
//	------------------------------------------------------------------

//	@Override
//	public void addOrder(Order o) {
//		this.manageOrder.addOrder(o);
//	}

	@Override
	public void deleteOrder(Order o) {
		this.manageOrder.deleteOrder(o);
	}

	@Override
	public Order payment(Order order) {
		return this.manageOrder.payment(order);
	}

//	------------------------------------------------------------------
//	------------------ Vourcher --------------------------------------
//	------------------------------------------------------------------

	@Override
	public Vourcher createVourcher(String title, String content, String code, double cost, Date startDate,
			Date expiredDate) {
		return new Vourcher(code, cost, startDate, expiredDate);
	}

	@Override
	public Notification createNotification() {
		return null;
	}

	@Override
	public void sendToAll() {

	}

	@Override
	public void sendToAllEmployee() {

	}

	@Override
	public void sendToAllCustomer() {

	}

	@Override
	public void addCustomer(PersonObserver p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(PersonObserver p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonObserver updateCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmployee(PersonObserver p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(PersonObserver p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonObserver updateEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addOrder(Order o) {
		// TODO Auto-generated method stub
		
	}

}
