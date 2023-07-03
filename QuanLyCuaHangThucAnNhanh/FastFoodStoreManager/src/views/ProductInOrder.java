package views;

import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import models.Item;

public class ProductInOrder extends JPanel {
	private JCheckBox chckbxNewCheckBox;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_4;

	public ProductInOrder(Item item) {
		setBackground(SystemColor.window);
		setLayout(null);

		chckbxNewCheckBox = new JCheckBox("Burger Beef");
		chckbxNewCheckBox.setBackground(SystemColor.window);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxNewCheckBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		chckbxNewCheckBox.setBounds(16, 7, 249, 27);
		add(chckbxNewCheckBox);

		lblNewLabel = new JLabel("100");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(295, 7, 64, 27);
		add(lblNewLabel);

		lblNewLabel_4 = new JLabel("100");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(402, 7, 107, 27);
		add(lblNewLabel_4);
	}

}
