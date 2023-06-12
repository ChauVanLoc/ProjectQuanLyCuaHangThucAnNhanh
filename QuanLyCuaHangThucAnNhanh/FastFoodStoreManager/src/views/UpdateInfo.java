package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;
import java.awt.*;

public class UpdateInfo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateInfo window = new UpdateInfo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(255, 10, 118, 60);
		ImageIcon icon = new ImageIcon("img\\home.png");
		lblNewLabel.setIcon(icon);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		ImageIcon icon1 = new ImageIcon("img\\home.png");
		btnNewButton.setIcon(icon);
		btnNewButton.setBounds(35, 87, 240, 127);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
	}
}
