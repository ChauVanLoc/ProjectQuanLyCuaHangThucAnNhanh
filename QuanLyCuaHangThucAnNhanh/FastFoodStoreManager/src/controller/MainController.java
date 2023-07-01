package controller;

import models.Admin;
import models.Center;
import models.PersonObserver;
import models.Subject;
import views.MainView;

public class MainController {
	private Subject center;

	public void initEmployee() {
//		PersonObserver Cashier = new Cashier("113568716519", "Nguyen Thi Minh Khai", new Date(2004, 04, 24),
//				new Date(2018, 04, 25), "Famale", new Address("17", "Thu Duc", "Tp.HCM"), "minhkhai@gmail.com",
//				"0139476161", "Freshman", 12, admin, new SalaryStrategy1());
//		PersonObserver KitchenStaff = new KitchenStaff("1513519460161", "Nguyen Thanh Nam", new Date(2003, 05, 29),
//				new Date(2017, 04, 03), "Male", new Address("06", "Quan 9", "Tp.HCM"), "namnguyen@gmail.com",
//				"0134627585", "Junior", 12, admin, new SalaryStrategy1());
//		PersonObserver Shipper = new Shipper("015638718629", "Tran Hao Nam", new Date(2000, 10, 01),
//				new Date(2013, 04, 25), "Male", new Address("17", "Thu Duc", "Tp.HCM"), "yanghuak@gmail.com",
//				"0139476161", "Staff", 12, admin, new SalaryStrategy1());
	}

	public void initCustomer() {
		center.register("Pham Huy Hoang", "0812838212", "huyhoang@gamil.com", "huyhoang");
		center.register("To Thi Thao", "0942323123", "thaocute@gmail.com", "123thaocute");
		center.register("Nguyen Van Teo", "0123456789", "teoem@hotmail.com", "teodeptrai");
		center.register("Le Dau", "0987654321", "dau@gmail.com", "daubanh01");
		center.register("To Hoai", "0234567819", "hoai@gmail.com", "hoainhatho");
		center.register("To Huu", "0876543219", "huucodao@gmail.com", "huunhavan");
		center.register("Ho Xuan Huong", "0765432198", "nuchuacakhia@gmail.com", "yolo1010");
		center.register("Xuan Dieu", "0543219876", "dieudiudang@gmail.com", "1056821bc");
		center.register("Lam Thi Hoai Thuong", "0432199765", "thuongnhoai@gmail.com", "o92831");
		center.register("Ma Nhat Huu", "0123556689", "123hudaica@gmail.com", "7483jdkk");
		center.register("Banh Thi My Dieu", "088774321", "dieuhienthuc@gmail.com", "diuhienlanh");
		center.register("Tran Thanh Tu", "0987654312", "tranthanhtu@gmail.com", "tu123456");
		center.register("Dac Ki", "0123466779", "hoyeu@gmail.com", "12kkj12");
		center.register("Khuong Tu Nha", "012998874", "nhatiensinh@gmail.com", "phongkas");
		center.register("Tan Hoang Nhi", "0453631345", "nhinhi@gmail.com", "7682d");
		center.register("Uyen Nhi Lam", "0383946175", "uyennhi@gmail.com", "2jjfh");
		center.register("Truong Uyen", "0378263781", "uyenquadeptrai@gmail.com", "timenhemiu");
		center.register("Ti Menh", "0378882936", "menhdaiti@gmail.com", "vanmenhcuatalauyenca");
		center.register("Cuu Van Hoa", "0874646473", "hoa@gmail.com", "73hduoicato");
		center.register("Truong Y", "099983876", "yeuhoa@gmail.com", "yeuhoanhieulam");
		center.register("Huong Ly Nguyet", "0356726374", "nguyetly@gmail.com", "hksa33");

	}

	public void init() {
		center = Center.getInstance();
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
