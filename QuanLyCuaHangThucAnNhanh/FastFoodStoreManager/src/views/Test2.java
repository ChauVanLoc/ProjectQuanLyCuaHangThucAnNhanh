package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Test2 {

	private JFrame frame;
	private JButton changeButton;
	private JLabel avatarLabel;

	public static void main(String[] args) {
		Test2 example = new Test2();
		example.run();
	}

	public void run() {
		frame = new JFrame("Avatar Change Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPanel = new JPanel(new BorderLayout());

		// Tạo nút thay đổi ảnh đại diện
		changeButton = new JButton("Change Avatar");
		changeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showFileChooser();
			}
		});

		// Tạo nhãn để hiển thị ảnh đại diện
		avatarLabel = new JLabel();
		avatarLabel.setHorizontalAlignment(JLabel.CENTER);
		avatarLabel.setPreferredSize(new Dimension(200, 200)); // Đặt kích thước nhãn

		contentPanel.add(changeButton, BorderLayout.NORTH);
		contentPanel.add(avatarLabel, BorderLayout.CENTER);

		frame.add(contentPanel);
		frame.pack();
		frame.setVisible(true);
	}

	private void showFileChooser() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "gif"));

		int result = fileChooser.showOpenDialog(frame);
		if (result == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();
			displayAvatar(selectedFile);
		}
	}

	private void displayAvatar(File file) {
		if (file != null) {
			try {
				// Đọc file ảnh và lấy kích thước
				Image image = ImageIO.read(file);
				int width = image.getWidth(null);
				int height = image.getHeight(null);

				// Tạo ảnh mới chỉ lấy nửa trái
				Image leftHalfImage = image.getScaledInstance(width / 2, height, Image.SCALE_SMOOTH);

				ImageIcon icon = new ImageIcon(leftHalfImage);
				avatarLabel.setIcon(icon);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
