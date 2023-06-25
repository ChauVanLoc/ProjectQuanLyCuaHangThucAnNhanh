package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Navigate extends JPanel {
	private JButton btnMenu;
	private JButton btnHistory;
	private JButton btnProfile;
	private JButton btnLogOut;

	public Navigate() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 78, 616);
		setLayout(null);

		btnMenu = new JButton();
		btnMenu.setBorder(null);
		btnMenu.setFocusPainted(false);
		btnMenu.setVerticalAlignment(SwingConstants.BOTTOM);
		btnMenu.setBackground(Color.WHITE);
		ImageIcon iconMenu = new ImageIcon("../FastFoodStoreManager/img/icon/menu.png");
		btnMenu.setIcon(iconMenu);
		btnMenu.setBounds(0, 0, 78, 70);
		add(btnMenu);

		btnHistory = new JButton();
		btnHistory.setBorder(null);
		btnHistory.setFocusPainted(false);
		btnHistory.setBackground(Color.WHITE);
		ImageIcon iconHistory = new ImageIcon("../FastFoodStoreManager/img/icon/history.png");
		btnHistory.setIcon(iconHistory);
		btnHistory.setBounds(0, 95, 78, 70);
		add(btnHistory);

		btnProfile = new JButton();
		btnProfile.setBorder(null);
		btnProfile.setFocusPainted(false);
		btnProfile.setBackground(Color.WHITE);
		ImageIcon iconFrofile = new ImageIcon("../FastFoodStoreManager/img/icon/profile.png");
		btnProfile.setIcon(iconFrofile);
		btnProfile.setBounds(0, 195, 78, 70);
		add(btnProfile);

		btnLogOut = new JButton();
		btnLogOut.setBorder(null);
		btnLogOut.setFocusPainted(false);
		btnLogOut.setBackground(Color.WHITE);
		ImageIcon iconLogOut = new ImageIcon("../FastFoodStoreManager/img/icon/logout.png");
		btnLogOut.setIcon(iconLogOut);
		btnLogOut.setBounds(0, 546, 78, 70);
		add(btnLogOut);

		JLabel lblNewLabel_4 = new JLabel("Menu");
		lblNewLabel_4.setEnabled(false);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(0, 70, 78, 14);
		add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("History");
		lblNewLabel_4_1.setEnabled(false);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(0, 164, 78, 20);
		add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_2 = new JLabel("Frofile");
		lblNewLabel_4_2.setEnabled(false);
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(0, 266, 78, 14);
		add(lblNewLabel_4_2);
	}

}
