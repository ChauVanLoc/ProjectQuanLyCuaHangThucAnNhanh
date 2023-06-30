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
		this.manageCustomer = new ManageCustomer(this);
		this.manageEmployee = new ManageEmployee();
		this.manageOrder = new ManageOrder();
		this.manageProduct = new ManageProduct();
	}

	@Override
	public PersonObserver login(String email, String password) {
		List<PersonObserver> list = new ArrayList<>();
		list.addAll(this.manageCustomer.getCustomer());
		list.addAll(this.manageEmployee.getEmployee());
		list.addAll(this.manageEmployee.getAdmin());
		for (PersonObserver o : list) {
			if (o.getPerson().getAccount().validateAccount(email, password)) {
				return o;
			}
		}
		return null;
	}

	@Override
	public PersonObserver register(String name, String phone, String email, String password) {
		return this.manageCustomer.register(name, email, password, phone);
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
	public void addCustomer(PersonObserver p) {
		this.manageCustomer.addCustomer(p);
	}

	@Override
	public void deleteCustomer(PersonObserver p) {
		this.manageCustomer.deleteCustomer(p);
	}

//	------------------------------------------------------------------
//	------------------ Employee --------------------------------------
//	------------------------------------------------------------------

	@Override
	public void addEmployee(PersonObserver p) {
		this.manageEmployee.addEmployee(p);
	}

	@Override
	public void deleteEmployee(PersonObserver p) {
		this.manageEmployee.deleteEmployee(p);
	}
	
	@Override
	public void addAdmin(PersonObserver p) {
		this.manageEmployee.addAdmin(p);
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

}
