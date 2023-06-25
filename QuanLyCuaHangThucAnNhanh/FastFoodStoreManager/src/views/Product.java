package views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import models.ProductObserver;

public class Product extends JPanel {

	public Product(String path, ProductObserver productObserver) {
		setBorder(new LineBorder(SystemColor.controlShadow, 1, true));
		setBounds(0, 0, 169, 266);
		setLayout(null);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(Helper.getImageIconScale(path, 170, 170));
		lblNewLabel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) SystemColor.controlShadow));
		lblNewLabel.setBounds(0, 0, 168, 168);
		add(lblNewLabel);

		JLabel lb_title = new JLabel("Burger Beef");
		lb_title.setHorizontalTextPosition(SwingConstants.CENTER);
		lb_title.setHorizontalAlignment(SwingConstants.CENTER);
		lb_title.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lb_title.setBounds(0, 167, 168, 28);
		add(lb_title);

		JLabel lblNewLabel_2 = new JLabel("5$");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(22, 199, 60, 28);
		add(lblNewLabel_2);

		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner.setBounds(80, 200, 55, 28);
		add(spinner);

		JButton btnNewButton = new JButton("Add Card");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(SystemColor.scrollbar);
		btnNewButton.setBounds(0, 233, 168, 32);
		add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
	}
}
