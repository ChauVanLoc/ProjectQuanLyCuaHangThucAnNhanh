package controller;

import models.Admin;
import models.Center;
import models.PersonObserver;
import models.Subject;
import views.MainView;

public class Main {
	private Subject center;
	public void init() {
		center = new Center();
		PersonObserver ad1 = new Admin("ChauVanLoc", "0346128692", "locchau.220401@gmail.com", "chauvanloc", center);
		MainView mainView = new MainView(center);
		mainView.display();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}
}
