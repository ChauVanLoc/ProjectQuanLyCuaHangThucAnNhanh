package views;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.Icon;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Dimension;

public class Product extends JPanel {

	public Product() {
		setLayout(null);
		
		JLabel imgBeef = new JLabel((Icon) null);
		imgBeef.setBounds(149, 128, 0, 0);
		add(imgBeef);
		
		JPanel panelBeef = new JPanel();
		panelBeef.setBounds(0, 0, 152, 246);
		panelBeef.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBeef.setAutoscrolls(true);
		add(panelBeef);
		GridBagLayout gbl_panelBeef = new GridBagLayout();
		gbl_panelBeef.columnWidths = new int[]{150, 0};
		gbl_panelBeef.rowHeights = new int[]{150, 30, 30, 30, 0};
		gbl_panelBeef.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelBeef.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panelBeef.setLayout(gbl_panelBeef);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		GridBagConstraints gbc_panel_16 = new GridBagConstraints();
		gbc_panel_16.fill = GridBagConstraints.BOTH;
		gbc_panel_16.insets = new Insets(0, 0, 5, 0);
		gbc_panel_16.gridx = 0;
		gbc_panel_16.gridy = 1;
		panelBeef.add(panel_16, gbc_panel_16);
		
		JLabel lblNewLabel_16 = new JLabel("Beef");
		lblNewLabel_16.setBounds(30, 5, 34, 19);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_16.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("0.6$");
		lblNewLabel_17.setBounds(78, 5, 34, 19);
		lblNewLabel_17.setForeground(Color.RED);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_16.add(lblNewLabel_17);
		
		JPanel panel_7_4_3_1 = new JPanel();
		panel_7_4_3_1.setLayout(null);
		GridBagConstraints gbc_panel_7_4_3_1 = new GridBagConstraints();
		gbc_panel_7_4_3_1.fill = GridBagConstraints.BOTH;
		gbc_panel_7_4_3_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_4_3_1.gridx = 0;
		gbc_panel_7_4_3_1.gridy = 2;
		panelBeef.add(panel_7_4_3_1, gbc_panel_7_4_3_1);
		
		JLabel lblNewLabel_3_4_3_1 = new JLabel("Quantity");
		lblNewLabel_3_4_3_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_4_3_1.setBounds(10, 5, 74, 19);
		panel_7_4_3_1.add(lblNewLabel_3_4_3_1);
		
		JSpinner spinner_4_3_1 = new JSpinner();
		spinner_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_4_3_1.setBounds(79, 2, 61, 26);
		panel_7_4_3_1.add(spinner_4_3_1);
		
		JButton btnNewButton_1_1 = new JButton("Add Cart");
		btnNewButton_1_1.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1.gridx = 0;
		gbc_btnNewButton_1_1.gridy = 3;
		panelBeef.add(btnNewButton_1_1, gbc_btnNewButton_1_1);

	}

}
