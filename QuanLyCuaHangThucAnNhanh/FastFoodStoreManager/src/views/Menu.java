package views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import models.Item;
import models.PersonObserver;
import models.ProductObserver;
import models.Subject;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class Menu extends JPanel {

	private Food panelFood;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JLabel lblNewLabel_3;
	private List<Item> items = new ArrayList<>();
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_container;
	private JScrollPane scrollPane;
	private JPanel panel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lb_employee;
	private JTextField jt_employee;
	private JTextField jt_phone;
	private JTextField jt_customer;
	private JLabel lb_customer;
	private JLabel lb_phone;

	public Menu(PersonObserver personObserver, Subject subject) {
		setBackground(SystemColor.desktop);
		setBounds(0, 0, 1230, 619);
		setLayout(null);

		Food food = new Food(items, subject.getProductManage().getFoods(), subject.getProductManage().getBeverages());
		food.setBounds(0, 32, 709, 585);
		add(food);

		panel = new JPanel();
		panel.setBackground(SystemColor.controlLtHighlight);
		panel.setBounds(711, 0, 519, 619);
		add(panel);
		panel.setLayout(null);

		lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(266, 494, 66, 27);
		panel.add(lblNewLabel_2);

		btnNewButton = new JButton("Pay");
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(338, 532, 137, 42);
		panel.add(btnNewButton);

		lblNewLabel_3 = new JLabel("10$");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(345, 494, 174, 27);
		panel.add(lblNewLabel_3);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(229, 229, 229));
		panel_1.setBounds(0, 0, 519, 52);
		panel.add(panel_1);
		panel_1.setLayout(null);

		lblNewLabel_1 = new JLabel("Order Information");
		lblNewLabel_1.setBounds(0, 0, 519, 52);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(SystemColor.scrollbar);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(229, 229, 229));
		panel_2.setBounds(0, 0, 348, 32);
		add(panel_2);
		panel_2.setLayout(null);

		JLabel lblFood = new JLabel("Food");
		lblFood.setBounds(0, 0, 347, 30);
		panel_2.add(lblFood);
		lblFood.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFood.setHorizontalAlignment(SwingConstants.CENTER);
		lblFood.setForeground(SystemColor.textText);
		lblFood.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFood.setBackground(Color.BLACK);

		panel_3 = new JPanel();
		panel_3.setBackground(new Color(229, 229, 229));
		panel_3.setBounds(356, 0, 347, 32);
		add(panel_3);
		panel_3.setLayout(null);

		lblNewLabel = new JLabel("Decorate");
		lblNewLabel.setBounds(0, 0, 347, 30);
		panel_3.add(lblNewLabel);
		lblNewLabel.setForeground(SystemColor.textText);
		lblNewLabel.setBackground(SystemColor.textText);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		panel_4 = new JPanel();
		panel_4.setBounds(0, 232, 519, 251);
		panel.add(panel_4);
		panel_4.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(206, 206, 206)));
		scrollPane.setBounds(0, 43, 519, 208);
		panel_4.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		panel_container = new JPanel();
		panel_container.setBackground(SystemColor.window);
		panel_container.setBorder(new LineBorder(new Color(206, 206, 206)));
		scrollPane.setViewportView(panel_container);
		panel_container.setLayout(new GridLayout(10, 1, 0, 0));

		Helper.speedScroll(scrollPane);

		lblNewLabel_5 = new JLabel("Product");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(20, 11, 97, 21);
		panel_4.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Quantity");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setBounds(279, 11, 97, 21);
		panel_4.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("Price");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_7.setBounds(399, 11, 97, 21);
		panel_4.add(lblNewLabel_7);

		lb_employee = new JLabel("Employee");
		lb_employee.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lb_employee.setBounds(37, 74, 103, 30);
		panel.add(lb_employee);

		jt_employee = new JTextField();
		jt_employee.setBounds(154, 74, 321, 30);
		panel.add(jt_employee);
		jt_employee.setColumns(10);

		lb_phone = new JLabel("Phone");
		lb_phone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lb_phone.setBounds(37, 175, 103, 30);
		panel.add(lb_phone);

		jt_phone = new JTextField();
		jt_phone.setColumns(10);
		jt_phone.setBounds(154, 175, 321, 30);
		panel.add(jt_phone);

		lb_customer = new JLabel("Customer");
		lb_customer.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lb_customer.setBounds(36, 125, 103, 30);
		panel.add(lb_customer);

		jt_customer = new JTextField();
		jt_customer.setColumns(10);
		jt_customer.setBounds(153, 125, 321, 30);
		panel.add(jt_customer);

		for (int i = 0; i < 10; i++) {
			JPanel p = new ProductInOrder(null);
			p.setPreferredSize(new Dimension(519, 42));
			panel_container.add(p);
		}
	}

	public void initProductInList(ProductObserver productObserver) {
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.window);
		panel_5.setBounds(0, 95, 519, 42);
		panel.add(panel_5);
		panel_5.setLayout(null);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Burger Beef");
		chckbxNewCheckBox.setBackground(SystemColor.window);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxNewCheckBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		chckbxNewCheckBox.setBounds(16, 7, 249, 27);
		panel_5.add(chckbxNewCheckBox);

		JLabel lblNewLabel_4 = new JLabel("100");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(295, 7, 64, 27);
		panel_5.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("100");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4_1.setBounds(402, 7, 107, 27);
		panel_5.add(lblNewLabel_4_1);

		panel_container.add(panel_5);

	}
}