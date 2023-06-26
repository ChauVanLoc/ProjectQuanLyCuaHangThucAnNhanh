package views;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Cursor;

public class Navigate extends JPanel {
	private JButton btnMenu;
	private JButton btnHistory;
	private JButton btnProfile;
	private JButton btnLogOut;

	public Navigate(JPanel panel, CardLayout cardLayout) {
		setBackground(Color.WHITE);
		setBounds(0, 0, 78, 616);
		setLayout(null);

		btnMenu = new JButton();
		btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu.setBackground(SystemColor.scrollbar);
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(panel, "Menu");
				btnMenu.setBackground(SystemColor.scrollbar);
				btnHistory.setBackground(Color.WHITE);
				btnProfile.setBackground(Color.WHITE);
			}
		});
		btnMenu.setBorder(null);
		btnMenu.setFocusPainted(false);
		btnMenu.setVerticalAlignment(SwingConstants.BOTTOM);
		ImageIcon iconMenu = new ImageIcon("../FastFoodStoreManager/img/icon/menu.png");
		btnMenu.setIcon(iconMenu);
		btnMenu.setBounds(0, 0, 78, 70);
		add(btnMenu);
		cardLayout.show(panel, "Menu");

		btnHistory = new JButton();
		btnHistory.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHistory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(panel, "History");
				btnMenu.setBackground(Color.WHITE);
				btnHistory.setBackground(SystemColor.scrollbar);
				btnProfile.setBackground(Color.WHITE);
			}
		});
		btnHistory.setBorder(null);
		btnHistory.setFocusPainted(false);
		btnHistory.setBackground(Color.WHITE);
		ImageIcon iconHistory = new ImageIcon("../FastFoodStoreManager/img/icon/history.png");
		btnHistory.setIcon(iconHistory);
		btnHistory.setBounds(0, 95, 78, 70);
		add(btnHistory);

		btnProfile = new JButton();
		btnProfile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(panel, "Profile");
				btnMenu.setBackground(Color.WHITE);
				btnHistory.setBackground(Color.WHITE);
				btnProfile.setBackground(SystemColor.scrollbar);
			}
		});
		btnProfile.setBorder(null);
		btnProfile.setFocusPainted(false);
		btnProfile.setBackground(Color.WHITE);
		ImageIcon iconFrofile = new ImageIcon("../FastFoodStoreManager/img/icon/profile.png");
		btnProfile.setIcon(iconFrofile);
		btnProfile.setBounds(0, 195, 78, 70);
		add(btnProfile);

		btnLogOut = new JButton();
		btnLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
