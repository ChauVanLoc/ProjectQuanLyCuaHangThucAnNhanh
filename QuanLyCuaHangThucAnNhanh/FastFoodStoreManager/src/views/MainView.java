package views;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import constant.Frame;
import models.Subject;

public class MainView extends JFrame {

	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private JPanel contentPane;
	private CardLayout cardLayout;
	private Login login;
	private Register register;

	public void display() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MainView(Subject subject) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1350, 756);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		cardLayout = new CardLayout();
		contentPane.setLayout(cardLayout);
		
		login = new Login();
		JPanel loginPanel = login.createLogin(contentPane, cardLayout);
		contentPane.add(loginPanel, Frame.login);
		
		register = new Register();
		JPanel registerPanel = register.createRegister(contentPane, cardLayout);
		contentPane.add(registerPanel, Frame.register);
		
		cardLayout.show(contentPane, Frame.register);
		setContentPane(contentPane);
	}

}
