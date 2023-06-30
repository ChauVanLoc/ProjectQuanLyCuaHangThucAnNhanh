package controller;

import java.awt.CardLayout;

import javax.swing.JPanel;

import constant.Frame;
import models.PersonObserver;
import models.Subject;
import views.Home;

public class LoginController {
	public LoginController(String email, String password, JPanel panel, CardLayout cardLayout, Subject subject) {
		PersonObserver person = login(email, password, subject);
		if (person != null) {
			Home home = new Home(panel, cardLayout, person);
			panel.add(home, Frame.home);
			cardLayout.show(panel, Frame.home);
		}
	}

	public PersonObserver login(String email, String password, Subject subject) {
		return subject.login(email, password);
	}
}
