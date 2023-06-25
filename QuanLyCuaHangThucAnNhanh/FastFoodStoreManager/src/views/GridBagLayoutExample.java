package views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridBagLayoutExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("GridBagLayout Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Tạo một JPanel và sử dụng GridBagLayout
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());

		// Tạo các thành phần
		JLabel nameLabel = new JLabel("Name:");
		JTextField nameTextField = new JTextField(20);
		JButton submitButton = new JButton("Submit");

		// Tạo đối tượng GridBagConstraints để thiết lập ràng buộc
		GridBagConstraints constraints = new GridBagConstraints();

		// Thiết lập các ràng buộc cho nameLabel
		constraints.gridx = 0; // Vị trí cột
		constraints.gridy = 0; // Vị trí hàng
		constraints.anchor = GridBagConstraints.LINE_START; // Căn chỉnh trái
		constraints.insets = new Insets(5, 5, 5, 5); // Khoảng cách lề
		panel.add(nameLabel, constraints);

		// Thiết lập các ràng buộc cho nameTextField
		constraints.gridx = 1; // Vị trí cột
		constraints.gridy = 0; // Vị trí hàng
		constraints.fill = GridBagConstraints.HORIZONTAL; // Tự động mở rộng chiều ngang
		constraints.weightx = 1.0; // Trọng số ngang
		panel.add(nameTextField, constraints);

		// Thiết lập các ràng buộc cho submitButton
		constraints.gridx = 0; // Vị trí cột
		constraints.gridy = 1; // Vị trí hàng
		constraints.gridwidth = 2; // Số cột được chiếm
		constraints.anchor = GridBagConstraints.CENTER; // Căn giữa
		panel.add(submitButton, constraints);

		// Thêm panel vào frame
		frame.add(panel);

		// Thiết lập kích thước của frame và hiển thị
		frame.pack();
		frame.setVisible(true);
	}
}
