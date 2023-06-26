package views;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import models.PersonObserver;

public class Home extends JFrame {

	private CardLayout cardLayout;
	private JPanel jp_content;
	private JPanel jp_nav;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Home(PersonObserver person) {
		setTitle("Fast Food Store");
		setResizable(false);
		cardLayout = new CardLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1350, 756);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JPanel primary_panel = new JPanel();
		primary_panel.setBackground(SystemColor.desktop);
		primary_panel.setBounds(0, 85, 1336, 634);
		getContentPane().add(primary_panel);
		primary_panel.setLayout(null);

		jp_content = new JPanel();
		jp_content.setBounds(98, 0, 1228, 619);
		primary_panel.add(jp_content);
		jp_content.setLayout(cardLayout);
		
		JPanel nav_panel = new Navigate(jp_content, cardLayout, person);
		nav_panel.setBounds(10, 0, 78, 619);
		primary_panel.add(nav_panel);

		JPanel content_panel = new Content();
		jp_content.add(content_panel, "Menu");
		
		JPanel history_panel = new History();
		jp_content.add(history_panel, "History");
		
		JPanel profile_panel = new Profile();
		jp_content.add(profile_panel, "Profile");
		
		JPanel work_panel = new Work();
		jp_content.add(work_panel, "Work");
		
		JPanel work_person = new PersonManage();
		jp_content.add(work_person, "Person");
		
		cardLayout.show(jp_content, "Menu");
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.desktop);
		panel.setBounds(0, 0, 1336, 86);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("FAST FOOD STORE");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(0, 10, 1336, 69);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
		
		JLabel lb_logo = new JLabel();
		lb_logo.setBounds(10, 10, 78, 69);
		panel.add(lb_logo);
		lb_logo.setIcon(Helper.getImageIconScale("../FastFoodStoreManager/img/logo.png", 80, 80));

	}
}