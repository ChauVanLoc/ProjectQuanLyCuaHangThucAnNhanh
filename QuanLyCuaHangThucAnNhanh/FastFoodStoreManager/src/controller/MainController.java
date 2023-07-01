package controller;

import models.Admin;
import models.Center;
import models.PersonObserver;
import models.Subject;
import views.MainView;

public class MainController {
	private Subject center;

	public void initEmployee() {
		PersonObserver Cashier = new Cashier("113568716519", "Nguyen Thi Minh Khai", new Date(2004, 04, 24),
				new Date(2018, 04, 25), "Famale", new Address("17", "Thu Duc", "Tp.HCM"), "minhkhai@gmail.com",
				"0139476161", "Freshman", 12, admin, new SalaryStrategy1());
		PersonObserver KitchenStaff = new KitchenStaff("1513519460161", "Nguyen Thanh Nam", new Date(2003, 05, 29),
				new Date(2017, 04, 03), "Male", new Address("06", "Quan 9", "Tp.HCM"), "namnguyen@gmail.com",
				"0134627585", "Junior", 12, admin, new SalaryStrategy1());
		PersonObserver Shipper = new Shipper("015638718629", "Tran Hao Nam", new Date(2000, 10, 01),
				new Date(2013, 04, 25), "Male", new Address("17", "Thu Duc", "Tp.HCM"), "yanghuak@gmail.com",
				"0139476161", "Staff", 12, admin, new SalaryStrategy1());
	}

	public void initCustomer() {
		center.register(null, null, null, null);
	}

	public void init() {
		center = new Center();
		initCustomer();
		initEmployee();
		PersonObserver ad1 = new Admin("ChauVanLoc", "0346128692", "locchau.220401@gmail.com", "chauvanloc", center);
		MainView mainView = new MainView(center);
		mainView.display();
	}

	public static void main(String[] args) {
		MainController main = new MainController();
		main.init();
	}
}
