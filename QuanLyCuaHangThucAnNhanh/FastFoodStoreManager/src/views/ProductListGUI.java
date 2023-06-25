package views;

import javax.swing.*;
import java.awt.*;

public class ProductListGUI extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductListGUI frame = new ProductListGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ProductListGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null); // Hiển thị cửa sổ ở giữa màn hình

		// Tạo danh sách sản phẩm
		JPanel productListPanel = new JPanel();
		productListPanel.setLayout(new GridLayout(0, 3, 10, 10)); // 4 cột, các phần tử cách nhau 10 pixel
		for (int i = 1; i <= 100; i++) { // Giả sử có 100 sản phẩm
			JButton productButton = new JButton("Product " + i);
			productListPanel.add(productButton);
		}

		// Đặt danh sách sản phẩm vào JScrollPane
		JScrollPane scrollPane = new JScrollPane(productListPanel);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		setContentPane(scrollPane);
	}
}
