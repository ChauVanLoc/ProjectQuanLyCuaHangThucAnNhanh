package views;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Food extends JPanel {
	private JPanel jp_food;
	private JPanel jp_beverageFood;

	public Food() {
		setBackground(SystemColor.desktop);
		setLayout(null);
		setBounds(0, 0, 885, 585);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 527, 585);
		Helper.speedScroll(scrollPane);
		add(scrollPane);

		jp_food = new JPanel(new GridLayout(0, 3, 10, 10));
		jp_food.setBackground(SystemColor.desktop);
		scrollPane.setViewportView(jp_food);
		
		for(int i = 1; i < 10; i++) {
			Product product = new Product("../FastFoodStoreManager/img/burgurBeef.png", null);
			product.setPreferredSize(new Dimension(169, 266));
			jp_food.add(product);
		}

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(537, 0, 348, 585);
		Helper.speedScroll(scrollPane_1);
		add(scrollPane_1);

		jp_beverageFood = new JPanel(new GridLayout(0, 2, 10, 10));
		jp_beverageFood.setBackground(SystemColor.desktop);
		scrollPane_1.setViewportView(jp_beverageFood);
		
		for(int i = 1; i < 10; i++) {
			Product product = new Product("../FastFoodStoreManager/img/burgurBeef.png", null);
			product.setPreferredSize(new Dimension(169, 266));
			jp_beverageFood.add(product);
		}
	}
}