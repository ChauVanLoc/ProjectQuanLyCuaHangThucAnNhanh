package views;

import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import models.ProductObserver;

public class Helper {
	public static ImageIcon getImageIconScale(String path, int width, int height) {
		return new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
	}

	public static JPanel drawProduct(JPanel panel, List<ProductObserver> list, int column) {
		int x = 0, y = 0;
		for (int i = 0; i < list.size(); i++) {
			if (x == column) {
				x = 0;
				y += 1;
			}
			Product product = new Product("../FastFoodStoreManager/img/burgurBeef.png", null);
			product.setBounds(x * 170, y * 267, 169, 266);
			panel.add(product);
			x += 1;
		}
		return panel;
	}

	public static void speedScroll(JScrollPane scrollPane) {
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.getVerticalScrollBar().setUnitIncrement(10); // Tăng tốc độ cuộn dọc
		scrollPane.getVerticalScrollBar().setBlockIncrement(50);
	}
}
