package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class Test extends JFrame {
	private JPanel panel;
	private JPanel jp_food;
	private JPanel jp_beverageFood;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1497, 700);
		getContentPane().setLayout(null);
		
		JScrollPane sp_food = new JScrollPane();
		sp_food.setBounds(0, 0, 527, 586);
		speedScroll(sp_food);
		getContentPane().add(sp_food);
		
		jp_food = new JPanel(new GridLayout(0, 3, 10, 10));
		sp_food.setViewportView(jp_food);
		
		for(int i = 1; i < 10; i++) {
			Product product = new Product("../FastFoodStoreManager/img/burgurBeef.png", null);
			product.setPreferredSize(new Dimension(169, 266));
			jp_food.add(product);
		}
		
		JScrollPane sp_beverageFood = new JScrollPane();
		sp_beverageFood.setBounds(533, 0, 348, 586);
		speedScroll(sp_beverageFood);
		getContentPane().add(sp_beverageFood);
		
		jp_beverageFood = new JPanel(new GridLayout(0, 2, 10, 10));
		sp_beverageFood.setViewportView(jp_beverageFood);
		setVisible(true);
		
		for(int i = 1; i < 10; i++) {
			Product product = new Product("../FastFoodStoreManager/img/burgurBeef.png", null);
			product.setPreferredSize(new Dimension(169, 266));
			jp_beverageFood.add(product);
		}
	}
	public void speedScroll(JScrollPane scrollPane) {
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.getVerticalScrollBar().setUnitIncrement(10); // Tăng tốc độ cuộn dọc
		scrollPane.getVerticalScrollBar().setBlockIncrement(50);
	}
}
