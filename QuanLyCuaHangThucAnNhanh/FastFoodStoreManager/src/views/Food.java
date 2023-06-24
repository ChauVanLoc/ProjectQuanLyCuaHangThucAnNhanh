package views;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Cursor;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;

public class Food extends JPanel {

	/**
	 * Create the panel.
	 */
	public Food() {
		setBounds(0, 0, 900, 586);
		setLayout(null);
		setVisible(true);

		JScrollPane scrollPaneFood = new JScrollPane();
		scrollPaneFood.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		scrollPaneFood.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneFood.setEnabled(false);
		scrollPaneFood.setBounds(0, 0, 560, 586);
		add(scrollPaneFood);

		JPanel panel = new JPanel();
		panel.setVerifyInputWhenFocusTarget(false);
		panel.setMaximumSize(new Dimension(560, 32767));
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		scrollPaneFood.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JPanel panelBurgerBeef = new JPanel();
		panelBurgerBeef.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBurgerBeef.setAutoscrolls(true);
		panel_1.add(panelBurgerBeef);
		GridBagLayout gbl_panelBurgerBeef = new GridBagLayout();
		gbl_panelBurgerBeef.columnWidths = new int[] { 170 };
		gbl_panelBurgerBeef.rowHeights = new int[] { 170, 30, 30, 30 };
		gbl_panelBurgerBeef.columnWeights = new double[] { 1.0 };
		gbl_panelBurgerBeef.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };
		panelBurgerBeef.setLayout(gbl_panelBurgerBeef);

		JLabel imgBurgerBeef = new JLabel((Icon) null);
		ImageIcon burgerBeef = new ImageIcon("../FastFoodStoreManager/img/burgurBeef.png");
		Image imageBurgerBeef = burgerBeef.getImage();
		Image resizeImageBurgerBeef = imageBurgerBeef.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
		ImageIcon burgerBeefImg = new ImageIcon(resizeImageBurgerBeef);
		imgBurgerBeef.setIcon(burgerBeefImg);
		GridBagConstraints gbc_imgBurgerBeef = new GridBagConstraints();
		gbc_imgBurgerBeef.fill = GridBagConstraints.BOTH;
		gbc_imgBurgerBeef.insets = new Insets(0, 0, 5, 0);
		gbc_imgBurgerBeef.gridx = 0;
		gbc_imgBurgerBeef.gridy = 0;
		panelBurgerBeef.add(imgBurgerBeef, gbc_imgBurgerBeef);

		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 1;
		panelBurgerBeef.add(panel_5, gbc_panel_5);

		JLabel lblBurgerBeef = new JLabel("Burger Beef");
		lblBurgerBeef.setHorizontalTextPosition(SwingConstants.LEFT);
		lblBurgerBeef.setHorizontalAlignment(SwingConstants.LEFT);
		lblBurgerBeef.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_5.add(lblBurgerBeef);

		JLabel lblNewLabel_1 = new JLabel("5$");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_5.add(lblNewLabel_1);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 2;
		panelBurgerBeef.add(panel_7, gbc_panel_7);

		JLabel lblNewLabel_3 = new JLabel("Quantity");
		lblNewLabel_3.setBounds(10, 5, 74, 19);
		panel_7.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 15));

		JSpinner spinner = new JSpinner();
		spinner.setBounds(99, 2, 61, 26);
		panel_7.add(spinner);
		spinner.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

		JButton btnNewButton_1 = new JButton("Add Cart");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 3;
		panelBurgerBeef.add(btnNewButton_1, gbc_btnNewButton_1);

		JPanel panelBurgerChicken = new JPanel();
		panelBurgerChicken.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBurgerChicken.setAutoscrolls(true);
		panel_1.add(panelBurgerChicken);
		GridBagLayout gbl_panelBurgerChicken = new GridBagLayout();
		gbl_panelBurgerChicken.columnWidths = new int[] { 170 };
		gbl_panelBurgerChicken.rowHeights = new int[] { 170, 30, 30, 30 };
		gbl_panelBurgerChicken.columnWeights = new double[] { 1.0 };
		gbl_panelBurgerChicken.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };
		panelBurgerChicken.setLayout(gbl_panelBurgerChicken);

		JLabel imgBurgerChicken = new JLabel((Icon) null);
		ImageIcon burgerChicken = new ImageIcon("../FastFoodStoreManager/img/burgurChicken.png");
		Image imageBurgerChicken = burgerChicken.getImage();
		Image resizeImageBurgerChicken = imageBurgerChicken.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
		ImageIcon burgerChickenImg = new ImageIcon(resizeImageBurgerChicken);
		imgBurgerChicken.setIcon(burgerChickenImg);
		GridBagConstraints gbc_imgBurgerChicken = new GridBagConstraints();
		gbc_imgBurgerChicken.fill = GridBagConstraints.BOTH;
		gbc_imgBurgerChicken.insets = new Insets(0, 0, 5, 0);
		gbc_imgBurgerChicken.gridx = 0;
		gbc_imgBurgerChicken.gridy = 0;
		panelBurgerChicken.add(imgBurgerChicken, gbc_imgBurgerChicken);

		JPanel panel_6 = new JPanel();
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 5, 0);
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 0;
		gbc_panel_6.gridy = 1;
		panelBurgerChicken.add(panel_6, gbc_panel_6);

		JLabel lblNewLabel = new JLabel("Burger Chicken");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("5$");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(lblNewLabel_2);

		JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		GridBagConstraints gbc_panel_7_1 = new GridBagConstraints();
		gbc_panel_7_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_1.fill = GridBagConstraints.BOTH;
		gbc_panel_7_1.gridx = 0;
		gbc_panel_7_1.gridy = 2;
		panelBurgerChicken.add(panel_7_1, gbc_panel_7_1);

		JLabel lblNewLabel_3_1 = new JLabel("Quantity");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_1.setBounds(10, 5, 74, 19);
		panel_7_1.add(lblNewLabel_3_1);

		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_2.setBounds(109, 0, 61, 26);
		panel_7_1.add(spinner_2);

		JButton btnNewButton = new JButton("Add Cart");
		btnNewButton.setPreferredSize(new Dimension(50, 20));
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_imgBurgerChicken.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 3;
		panelBurgerChicken.add(btnNewButton, gbc_btnNewButton);

		JPanel panelBurgerFish = new JPanel();
		panelBurgerFish.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBurgerFish.setAutoscrolls(true);
		panel_1.add(panelBurgerFish);
		GridBagLayout gbl_panelBurgerFish = new GridBagLayout();
		gbl_panelBurgerFish.columnWidths = new int[] { 170 };
		gbl_panelBurgerFish.rowHeights = new int[] { 170, 30, 30, 30 };
		gbl_panelBurgerFish.columnWeights = new double[] { 1.0 };
		gbl_panelBurgerFish.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };
		panelBurgerFish.setLayout(gbl_panelBurgerFish);

		JLabel imgBurgerFish = new JLabel((Icon) null);
		ImageIcon burgerFish = new ImageIcon("../FastFoodStoreManager/img/burgurFish.png");
		Image imageBurgerFish = burgerFish.getImage();
		Image resizeImageBurgerFish = imageBurgerFish.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
		ImageIcon burgerFishImg = new ImageIcon(resizeImageBurgerFish);
		imgBurgerFish.setIcon(burgerFishImg);
		GridBagConstraints gbc_imgBurgerFish = new GridBagConstraints();
		gbc_imgBurgerFish.fill = GridBagConstraints.BOTH;
		gbc_imgBurgerFish.insets = new Insets(0, 0, 5, 0);
		gbc_imgBurgerFish.gridx = 0;
		gbc_imgBurgerFish.gridy = 0;
		panelBurgerFish.add(imgBurgerFish, gbc_imgBurgerFish);

		JPanel panel_8 = new JPanel();
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 5, 0);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 0;
		gbc_panel_8.gridy = 1;
		panelBurgerFish.add(panel_8, gbc_panel_8);

		JLabel lblNewLabel_4 = new JLabel("Burger Fish");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_8.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("4$");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_8.add(lblNewLabel_5);

		JPanel panel_7_2 = new JPanel();
		panel_7_2.setLayout(null);
		GridBagConstraints gbc_panel_7_2 = new GridBagConstraints();
		gbc_panel_7_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_2.fill = GridBagConstraints.BOTH;
		gbc_panel_7_2.gridx = 0;
		gbc_panel_7_2.gridy = 2;
		panelBurgerFish.add(panel_7_2, gbc_panel_7_2);

		JLabel lblNewLabel_3_2 = new JLabel("Quantity");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_2.setBounds(10, 5, 74, 19);
		panel_7_2.add(lblNewLabel_3_2);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_1.setBounds(109, 0, 61, 26);
		panel_7_2.add(spinner_1);

		JButton btnNewButton_1_2 = new JButton("Add Cart");
		btnNewButton_1_2.setForeground(Color.RED);
		btnNewButton_1_2.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_2 = new GridBagConstraints();
		gbc_btnNewButton_1_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_2.gridx = 0;
		gbc_btnNewButton_1_2.gridy = 3;
		panelBurgerFish.add(btnNewButton_1_2, gbc_btnNewButton_1_2);

		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JPanel panelBurgerShrimp = new JPanel();
		panelBurgerShrimp.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBurgerShrimp.setAutoscrolls(true);
		panel_2.add(panelBurgerShrimp);
		GridBagLayout gbl_panelBurgerShrimp = new GridBagLayout();
		gbl_panelBurgerShrimp.columnWidths = new int[] { 170 };
		gbl_panelBurgerShrimp.rowHeights = new int[] { 170, 30, 30, 30 };
		gbl_panelBurgerShrimp.columnWeights = new double[] { 1.0 };
		gbl_panelBurgerShrimp.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };
		panelBurgerShrimp.setLayout(gbl_panelBurgerShrimp);

		JLabel imgBurgerShrimp = new JLabel((Icon) null);
		ImageIcon burgerShrimp = new ImageIcon("../FastFoodStoreManager/img/burgurShrimp.png");
		Image imageBurgerShrimp = burgerShrimp.getImage();
		Image resizeImageBurgerShrimp = imageBurgerShrimp.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
		ImageIcon burgerShrimpImg = new ImageIcon(resizeImageBurgerShrimp);
		imgBurgerShrimp.setIcon(burgerShrimpImg);
		GridBagConstraints gbc_imgBurgerShrimp = new GridBagConstraints();
		gbc_imgBurgerShrimp.fill = GridBagConstraints.BOTH;
		gbc_imgBurgerShrimp.insets = new Insets(0, 0, 5, 0);
		gbc_imgBurgerShrimp.gridx = 0;
		gbc_imgBurgerShrimp.gridy = 0;
		panelBurgerShrimp.add(imgBurgerShrimp, gbc_imgBurgerShrimp);

		JPanel panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.insets = new Insets(0, 0, 5, 0);
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 0;
		gbc_panel_9.gridy = 1;
		panelBurgerShrimp.add(panel_9, gbc_panel_9);

		JLabel lblBurgerShrimp = new JLabel("Burger Shrimp");
		lblBurgerShrimp.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_9.add(lblBurgerShrimp);

		JLabel lblNewLabel_7 = new JLabel("4$");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_9.add(lblNewLabel_7);

		JPanel panel_7_3 = new JPanel();
		panel_7_3.setLayout(null);
		GridBagConstraints gbc_panel_7_3 = new GridBagConstraints();
		gbc_panel_7_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_3.fill = GridBagConstraints.BOTH;
		gbc_panel_7_3.gridx = 0;
		gbc_panel_7_3.gridy = 2;
		panelBurgerShrimp.add(panel_7_3, gbc_panel_7_3);

		JLabel lblNewLabel_3_3 = new JLabel("Quantity");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_3.setBounds(10, 5, 74, 19);
		panel_7_3.add(lblNewLabel_3_3);

		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_3.setBounds(109, 0, 61, 26);
		panel_7_3.add(spinner_3);

		JButton btnNewButton_1_3 = new JButton("Add Cart");
		btnNewButton_1_3.setForeground(Color.RED);
		btnNewButton_1_3.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_3 = new GridBagConstraints();
		gbc_btnNewButton_1_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_3.gridx = 0;
		gbc_btnNewButton_1_3.gridy = 3;
		panelBurgerShrimp.add(btnNewButton_1_3, gbc_btnNewButton_1_3);

		JPanel panelSpagetti = new JPanel();
		panelSpagetti.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSpagetti.setAutoscrolls(true);
		panel_2.add(panelSpagetti);
		GridBagLayout gbl_panelSpagetti = new GridBagLayout();
		gbl_panelSpagetti.columnWidths = new int[] { 170 };
		gbl_panelSpagetti.rowHeights = new int[] { 170, 30, 30, 30 };
		gbl_panelSpagetti.columnWeights = new double[] { 1.0 };
		gbl_panelSpagetti.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };
		panelSpagetti.setLayout(gbl_panelSpagetti);

		JLabel imgSpagetti = new JLabel((Icon) null);
		ImageIcon spagetti = new ImageIcon("../FastFoodStoreManager/img/spaghetti.png");
		Image imageSpagetti = spagetti.getImage();
		Image resizeImageSpagetti = imageSpagetti.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
		ImageIcon spagettiImg = new ImageIcon(resizeImageSpagetti);
		imgSpagetti.setIcon(spagettiImg);
		GridBagConstraints gbc_imgSpagetti = new GridBagConstraints();
		gbc_imgSpagetti.fill = GridBagConstraints.BOTH;
		gbc_imgSpagetti.insets = new Insets(0, 0, 5, 0);
		gbc_imgSpagetti.gridx = 0;
		gbc_imgSpagetti.gridy = 0;
		panelSpagetti.add(imgSpagetti, gbc_imgSpagetti);

		JPanel panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 1;
		panelSpagetti.add(panel_10, gbc_panel_10);

		JLabel lblNewLabel_6 = new JLabel("Spagetti");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_10.add(lblNewLabel_6);

		JLabel lblNewLabel_8 = new JLabel("5.5$");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_10.add(lblNewLabel_8);

		JPanel panel_7_5 = new JPanel();
		panel_7_5.setLayout(null);
		GridBagConstraints gbc_panel_7_5 = new GridBagConstraints();
		gbc_panel_7_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_5.fill = GridBagConstraints.BOTH;
		gbc_panel_7_5.gridx = 0;
		gbc_panel_7_5.gridy = 2;
		panelSpagetti.add(panel_7_5, gbc_panel_7_5);

		JLabel lblNewLabel_3_5 = new JLabel("Quantity");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_5.setBounds(10, 5, 74, 19);
		panel_7_5.add(lblNewLabel_3_5);

		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_5.setBounds(109, 0, 61, 26);
		panel_7_5.add(spinner_5);

		JButton btnNewButton_1_4 = new JButton("Add Cart");
		btnNewButton_1_4.setForeground(Color.RED);
		btnNewButton_1_4.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_4.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_4 = new GridBagConstraints();
		gbc_btnNewButton_1_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_4.gridx = 0;
		gbc_btnNewButton_1_4.gridy = 3;
		panelSpagetti.add(btnNewButton_1_4, gbc_btnNewButton_1_4);

		JPanel panelBurgerCheese = new JPanel();
		panelBurgerCheese.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBurgerCheese.setAutoscrolls(true);
		panel_2.add(panelBurgerCheese);
		GridBagLayout gbl_panelBurgerCheese = new GridBagLayout();
		gbl_panelBurgerCheese.columnWidths = new int[] { 170 };
		gbl_panelBurgerCheese.rowHeights = new int[] { 170, 30, 30, 30 };
		gbl_panelBurgerCheese.columnWeights = new double[] { 1.0 };
		gbl_panelBurgerCheese.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };
		panelBurgerCheese.setLayout(gbl_panelBurgerCheese);

		JLabel imgBurgerCheese = new JLabel((Icon) null);
		ImageIcon burgerCheese = new ImageIcon("../FastFoodStoreManager/img/burgerCheese.png");
		Image imageBurgerCheese = burgerCheese.getImage();
		Image resizeImageBurgerCheese = imageBurgerCheese.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
		ImageIcon burgerCheeseImg = new ImageIcon(resizeImageBurgerCheese);
		imgBurgerCheese.setIcon(burgerCheeseImg);
		GridBagConstraints gbc_imgBurgerCheese = new GridBagConstraints();
		gbc_imgBurgerCheese.fill = GridBagConstraints.BOTH;
		gbc_imgBurgerCheese.insets = new Insets(0, 0, 5, 0);
		gbc_imgBurgerCheese.gridx = 0;
		gbc_imgBurgerCheese.gridy = 0;
		panelBurgerCheese.add(imgBurgerCheese, gbc_imgBurgerCheese);

		JPanel panel_11 = new JPanel();
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.insets = new Insets(0, 0, 5, 0);
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 0;
		gbc_panel_11.gridy = 1;
		panelBurgerCheese.add(panel_11, gbc_panel_11);

		JLabel lblNewLabel_9 = new JLabel("Burger Cheese");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_11.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("4.5$");
		lblNewLabel_10.setForeground(Color.RED);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_11.add(lblNewLabel_10);

		JPanel panel_7_4_1 = new JPanel();
		panel_7_4_1.setLayout(null);
		GridBagConstraints gbc_panel_7_4_1 = new GridBagConstraints();
		gbc_panel_7_4_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_4_1.fill = GridBagConstraints.BOTH;
		gbc_panel_7_4_1.gridx = 0;
		gbc_panel_7_4_1.gridy = 2;
		panelBurgerCheese.add(panel_7_4_1, gbc_panel_7_4_1);

		JLabel lblNewLabel_3_4_1 = new JLabel("Quantity");
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_4_1.setBounds(10, 5, 74, 19);
		panel_7_4_1.add(lblNewLabel_3_4_1);

		JSpinner spinner_4_1 = new JSpinner();
		spinner_4_1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_4_1.setBounds(109, 0, 61, 26);
		panel_7_4_1.add(spinner_4_1);

		JButton btnNewButton_1_5 = new JButton("Add Cart");
		btnNewButton_1_5.setForeground(Color.RED);
		btnNewButton_1_5.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_5.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_5 = new GridBagConstraints();
		gbc_btnNewButton_1_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_5.gridx = 0;
		gbc_btnNewButton_1_5.gridy = 3;
		panelBurgerCheese.add(btnNewButton_1_5, gbc_btnNewButton_1_5);

		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JPanel panelFrenchFries = new JPanel();
		panelFrenchFries.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFrenchFries.setAutoscrolls(true);
		panel_3.add(panelFrenchFries);
		GridBagLayout gbl_panelFrenchFries = new GridBagLayout();
		gbl_panelFrenchFries.columnWidths = new int[] { 170 };
		gbl_panelFrenchFries.rowHeights = new int[] { 170, 30, 30, 30 };
		gbl_panelFrenchFries.columnWeights = new double[] { 1.0 };
		gbl_panelFrenchFries.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };
		panelFrenchFries.setLayout(gbl_panelFrenchFries);

		JLabel imgFrenchFires = new JLabel((Icon) null);
		ImageIcon frenchFires = new ImageIcon("../FastFoodStoreManager/img/chips.png");
		Image imageFrenchFires = frenchFires.getImage();
		Image resizeImageFrenchFires = imageFrenchFires.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
		ImageIcon FrenchFiresImg = new ImageIcon(resizeImageFrenchFires);
		imgFrenchFires.setIcon(FrenchFiresImg);
		GridBagConstraints gbc_imgFrenchFires = new GridBagConstraints();
		gbc_imgFrenchFires.fill = GridBagConstraints.BOTH;
		gbc_imgFrenchFires.insets = new Insets(0, 0, 5, 0);
		gbc_imgFrenchFires.gridx = 0;
		gbc_imgFrenchFires.gridy = 0;
		panelFrenchFries.add(imgFrenchFires, gbc_imgFrenchFires);

		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 1;
		panelFrenchFries.add(panel_4, gbc_panel_4);

		JLabel lblNewLabel_11 = new JLabel("French Fries");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_4.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("2$");
		lblNewLabel_12.setForeground(Color.RED);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_4.add(lblNewLabel_12);

		JPanel panel_7_4_2 = new JPanel();
		panel_7_4_2.setLayout(null);
		GridBagConstraints gbc_panel_7_4_2 = new GridBagConstraints();
		gbc_panel_7_4_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_4_2.fill = GridBagConstraints.BOTH;
		gbc_panel_7_4_2.gridx = 0;
		gbc_panel_7_4_2.gridy = 2;
		panelFrenchFries.add(panel_7_4_2, gbc_panel_7_4_2);

		JLabel lblNewLabel_3_4_2 = new JLabel("Quantity");
		lblNewLabel_3_4_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_4_2.setBounds(10, 5, 74, 19);
		panel_7_4_2.add(lblNewLabel_3_4_2);

		JSpinner spinner_4_2 = new JSpinner();
		spinner_4_2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_4_2.setBounds(109, 0, 61, 26);
		panel_7_4_2.add(spinner_4_2);

		JButton btnNewButton_1_6 = new JButton("Add Cart");
		btnNewButton_1_6.setForeground(Color.RED);
		btnNewButton_1_6.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_6.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_6 = new GridBagConstraints();
		gbc_btnNewButton_1_6.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_6.gridx = 0;
		gbc_btnNewButton_1_6.gridy = 3;
		panelFrenchFries.add(btnNewButton_1_6, gbc_btnNewButton_1_6);

		JPanel panelFriedChicken = new JPanel();
		panelFriedChicken.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFriedChicken.setAutoscrolls(true);
		panel_3.add(panelFriedChicken);
		GridBagLayout gbl_panelFriedChicken = new GridBagLayout();
		gbl_panelFriedChicken.columnWidths = new int[] { 170 };
		gbl_panelFriedChicken.rowHeights = new int[] { 170, 30, 30, 30 };
		gbl_panelFriedChicken.columnWeights = new double[] { 1.0 };
		gbl_panelFriedChicken.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };
		panelFriedChicken.setLayout(gbl_panelFriedChicken);

		JLabel imgFriedChicken = new JLabel((Icon) null);
		ImageIcon friedChicken = new ImageIcon("../FastFoodStoreManager/img/friedChicken.png");
		Image imageFriedChicken = friedChicken.getImage();
		Image resizeImageFriedChicken = imageFriedChicken.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
		ImageIcon FriedChickenImg = new ImageIcon(resizeImageFriedChicken);
		imgFriedChicken.setIcon(FriedChickenImg);
		GridBagConstraints gbc_imgFriedChicken = new GridBagConstraints();
		gbc_imgFriedChicken.fill = GridBagConstraints.BOTH;
		gbc_imgFriedChicken.insets = new Insets(0, 0, 5, 0);
		gbc_imgFriedChicken.gridx = 0;
		gbc_imgFriedChicken.gridy = 0;
		panelFriedChicken.add(imgFriedChicken, gbc_imgFriedChicken);

		JPanel panel_12 = new JPanel();
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.insets = new Insets(0, 0, 5, 0);
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 0;
		gbc_panel_12.gridy = 1;
		panelFriedChicken.add(panel_12, gbc_panel_12);

		JLabel lblNewLabel_13 = new JLabel("Fried Chicken");
		lblNewLabel_13.setForeground(new Color(0, 0, 0));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_12.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("5$");
		lblNewLabel_14.setForeground(Color.RED);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_12.add(lblNewLabel_14);

		JPanel panel_7_4_3 = new JPanel();
		panel_7_4_3.setLayout(null);
		GridBagConstraints gbc_panel_7_4_3 = new GridBagConstraints();
		gbc_panel_7_4_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_4_3.fill = GridBagConstraints.BOTH;
		gbc_panel_7_4_3.gridx = 0;
		gbc_panel_7_4_3.gridy = 2;
		panelFriedChicken.add(panel_7_4_3, gbc_panel_7_4_3);

		JLabel lblNewLabel_3_4_3 = new JLabel("Quantity");
		lblNewLabel_3_4_3.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_4_3.setBounds(10, 5, 74, 19);
		panel_7_4_3.add(lblNewLabel_3_4_3);

		JSpinner spinner_4_3 = new JSpinner();
		spinner_4_3.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_4_3.setBounds(109, 0, 61, 26);
		panel_7_4_3.add(spinner_4_3);

		JButton btnNewButton_1_7 = new JButton("Add Cart");
		btnNewButton_1_7.setForeground(Color.RED);
		btnNewButton_1_7.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_7.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_7 = new GridBagConstraints();
		gbc_btnNewButton_1_7.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_7.gridx = 0;
		gbc_btnNewButton_1_7.gridy = 3;
		panelFriedChicken.add(btnNewButton_1_7, gbc_btnNewButton_1_7);

		JScrollPane scrollPaneFoodTopping = new JScrollPane();
		scrollPaneFoodTopping.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPaneFoodTopping.setBounds(560, 0, 340, 586);
		add(scrollPaneFoodTopping);

		JLabel lblNewLabel_15 = new JLabel("TOPPING");
		lblNewLabel_15
				.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, Color.ORANGE, Color.RED, Color.ORANGE));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		scrollPaneFoodTopping.setColumnHeaderView(lblNewLabel_15);

		JPanel panel_13 = new JPanel();
		scrollPaneFoodTopping.setViewportView(panel_13);
		panel_13.setLayout(new BoxLayout(panel_13, BoxLayout.Y_AXIS));

		JPanel panel_14 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_14.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_13.add(panel_14);

		JPanel panelBeef = new JPanel();
		panelBeef.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelBeef.setAutoscrolls(true);
		panel_14.add(panelBeef);
		GridBagLayout gbl_panelBeef = new GridBagLayout();
		gbl_panelBeef.columnWidths = new int[] { 150 };
		gbl_panelBeef.rowHeights = new int[] { 150, 30, 30, 30 };
		gbl_panelBeef.columnWeights = new double[] { 1.0 };
		gbl_panelBeef.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };
		panelBeef.setLayout(gbl_panelBeef);

		JLabel imgBeef = new JLabel((Icon) null);
		ImageIcon beef = new ImageIcon("../FastFoodStoreManager/img/beef.png");
		Image imageBeef = beef.getImage();
		Image resizeImageBeef = imageBeef.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon beefImg = new ImageIcon(resizeImageBeef);
		imgBeef.setIcon(beefImg);
		GridBagConstraints gbc_imgBeef = new GridBagConstraints();
		gbc_imgBeef.fill = GridBagConstraints.BOTH;
		gbc_imgBeef.insets = new Insets(0, 0, 5, 0);
		gbc_imgBeef.gridx = 0;
		gbc_imgBeef.gridy = 0;
		panelBeef.add(imgBeef, gbc_imgBeef);

		JPanel panel_16 = new JPanel();
		GridBagConstraints gbc_panel_16 = new GridBagConstraints();
		gbc_panel_16.insets = new Insets(0, 0, 5, 0);
		gbc_panel_16.fill = GridBagConstraints.BOTH;
		gbc_panel_16.gridx = 0;
		gbc_panel_16.gridy = 1;
		panelBeef.add(panel_16, gbc_panel_16);

		JLabel lblNewLabel_16 = new JLabel("Beef");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_16.add(lblNewLabel_16);

		JLabel lblNewLabel_17 = new JLabel("0.6$");
		lblNewLabel_17.setForeground(Color.RED);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_16.add(lblNewLabel_17);

		JPanel panel_7_4_3_1 = new JPanel();
		panel_7_4_3_1.setLayout(null);
		GridBagConstraints gbc_panel_7_4_3_1 = new GridBagConstraints();
		gbc_panel_7_4_3_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_4_3_1.fill = GridBagConstraints.BOTH;
		gbc_panel_7_4_3_1.gridx = 0;
		gbc_panel_7_4_3_1.gridy = 2;
		panelBeef.add(panel_7_4_3_1, gbc_panel_7_4_3_1);

		JLabel lblNewLabel_3_4_3_1 = new JLabel("Quantity");
		lblNewLabel_3_4_3_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_4_3_1.setBounds(10, 5, 74, 19);
		panel_7_4_3_1.add(lblNewLabel_3_4_3_1);

		JSpinner spinner_4_3_1 = new JSpinner();
		spinner_4_3_1
				.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_4_3_1.setBounds(84, 0, 61, 26);
		panel_7_4_3_1.add(spinner_4_3_1);

		JButton btnNewButton_1_1 = new JButton("Add Cart");
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1.gridx = 0;
		gbc_btnNewButton_1_1.gridy = 3;
		panelBeef.add(btnNewButton_1_1, gbc_btnNewButton_1_1);

		JPanel panelChicken = new JPanel();
		panelChicken.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelChicken.setAutoscrolls(true);
		panel_14.add(panelChicken);
		GridBagLayout gbl_panelChicken = new GridBagLayout();
		gbl_panelChicken.columnWidths = new int[] { 150 };
		gbl_panelChicken.rowHeights = new int[] { 150, 30, 30, 30 };
		gbl_panelChicken.columnWeights = new double[] { 1.0 };
		gbl_panelChicken.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };
		panelChicken.setLayout(gbl_panelChicken);

		JLabel imgChicken = new JLabel((Icon) null);
		imgChicken.setForeground(Color.BLACK);
		ImageIcon chicken = new ImageIcon("../FastFoodStoreManager/img/chicken.png");
		Image imageChicken = chicken.getImage();
		Image resizeImageChicken = imageChicken.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon chickenImg = new ImageIcon(resizeImageChicken);
		imgChicken.setIcon(chickenImg);
		GridBagConstraints gbc_imgChicken = new GridBagConstraints();
		gbc_imgChicken.fill = GridBagConstraints.BOTH;
		gbc_imgChicken.insets = new Insets(0, 0, 5, 0);
		gbc_imgChicken.gridx = 0;
		gbc_imgChicken.gridy = 0;
		panelChicken.add(imgChicken, gbc_imgChicken);

		JPanel panel_17 = new JPanel();
		GridBagConstraints gbc_panel_17 = new GridBagConstraints();
		gbc_panel_17.insets = new Insets(0, 0, 5, 0);
		gbc_panel_17.fill = GridBagConstraints.BOTH;
		gbc_panel_17.gridx = 0;
		gbc_panel_17.gridy = 1;
		panelChicken.add(panel_17, gbc_panel_17);

		JLabel lblNewLabel_18 = new JLabel("Chicken");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_17.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("0.3$");
		lblNewLabel_19.setForeground(Color.RED);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_17.add(lblNewLabel_19);

		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		GridBagConstraints gbc_panel_18 = new GridBagConstraints();
		gbc_panel_18.insets = new Insets(0, 0, 5, 0);
		gbc_panel_18.fill = GridBagConstraints.BOTH;
		gbc_panel_18.gridx = 0;
		gbc_panel_18.gridy = 2;
		panelChicken.add(panel_18, gbc_panel_18);

		JLabel lblNewLabel_20 = new JLabel("Quantity");
		lblNewLabel_20.setBounds(10, 5, 74, 19);
		lblNewLabel_20.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_20.setFont(new Font("Tahoma", Font.ITALIC, 15));
		panel_18.add(lblNewLabel_20);

		JSpinner spinner_4 = new JSpinner();
		spinner_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_4.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_4.setBounds(84, 0, 60, 25);
		panel_18.add(spinner_4);

		JButton btnNewButton_1_1_1 = new JButton("Add Cart");
		btnNewButton_1_1_1.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_1.setForeground(Color.RED);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1_1.gridx = 0;
		gbc_btnNewButton_1_1_1.gridy = 3;
		panelChicken.add(btnNewButton_1_1_1, gbc_btnNewButton_1_1_1);

		JPanel panel_15 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_15.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_13.add(panel_15);

		JPanel panelShrimp = new JPanel();
		panelShrimp.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelShrimp.setAutoscrolls(true);
		panel_15.add(panelShrimp);
		GridBagLayout gbl_panelShrimp = new GridBagLayout();
		gbl_panelShrimp.columnWidths = new int[] { 150 };
		gbl_panelShrimp.rowHeights = new int[] { 150, 30, 30, 30 };
		gbl_panelShrimp.columnWeights = new double[] { 1.0 };
		gbl_panelShrimp.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };
		panelShrimp.setLayout(gbl_panelShrimp);

		JLabel imgShrimp = new JLabel((Icon) null);
		ImageIcon shrimp = new ImageIcon("../FastFoodStoreManager/img/shrimp.png");
		Image imageShrimp = shrimp.getImage();
		Image resizeImageShrimp = imageShrimp.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon shrimpImg = new ImageIcon(resizeImageShrimp);
		imgShrimp.setIcon(shrimpImg);
		GridBagConstraints gbc_imgShrimp = new GridBagConstraints();
		gbc_imgShrimp.fill = GridBagConstraints.BOTH;
		gbc_imgShrimp.insets = new Insets(0, 0, 5, 0);
		gbc_imgShrimp.gridx = 0;
		gbc_imgShrimp.gridy = 0;
		panelShrimp.add(imgShrimp, gbc_imgShrimp);

		JPanel panel_17_1 = new JPanel();
		GridBagConstraints gbc_panel_17_1 = new GridBagConstraints();
		gbc_panel_17_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_17_1.fill = GridBagConstraints.BOTH;
		gbc_panel_17_1.gridx = 0;
		gbc_panel_17_1.gridy = 1;
		panelShrimp.add(panel_17_1, gbc_panel_17_1);

		JLabel lblNewLabel_18_1 = new JLabel("Shrimp");
		lblNewLabel_18_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_17_1.add(lblNewLabel_18_1);

		JLabel lblNewLabel_19_1 = new JLabel("0.3$");
		lblNewLabel_19_1.setForeground(Color.RED);
		lblNewLabel_19_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_17_1.add(lblNewLabel_19_1);

		JPanel panel_18_1 = new JPanel();
		panel_18_1.setLayout(null);
		GridBagConstraints gbc_panel_18_1 = new GridBagConstraints();
		gbc_panel_18_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_18_1.fill = GridBagConstraints.BOTH;
		gbc_panel_18_1.gridx = 0;
		gbc_panel_18_1.gridy = 2;
		panelShrimp.add(panel_18_1, gbc_panel_18_1);

		JLabel lblNewLabel_20_1 = new JLabel("Quantity");
		lblNewLabel_20_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_20_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_20_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_20_1.setBounds(10, 5, 74, 19);
		panel_18_1.add(lblNewLabel_20_1);

		JSpinner spinner_4_4 = new JSpinner();
		spinner_4_4.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_4_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_4_4.setBounds(84, 0, 60, 25);
		panel_18_1.add(spinner_4_4);

		JButton btnNewButton_1_1_1_1 = new JButton("Add Cart");
		btnNewButton_1_1_1_1.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_1_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_1_1.setForeground(Color.RED);
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_1_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1_1_1.gridx = 0;
		gbc_btnNewButton_1_1_1_1.gridy = 3;
		panelShrimp.add(btnNewButton_1_1_1_1, gbc_btnNewButton_1_1_1_1);

		JPanel panelCheese = new JPanel();
		panelCheese.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCheese.setAutoscrolls(true);
		panel_15.add(panelCheese);
		GridBagLayout gbl_panelCheese = new GridBagLayout();
		gbl_panelCheese.columnWidths = new int[] { 150 };
		gbl_panelCheese.rowHeights = new int[] { 150, 30, 30, 30 };
		gbl_panelCheese.columnWeights = new double[] { 1.0 };
		gbl_panelCheese.rowWeights = new double[] { 0.0, 1.0, 1.0, 0.0 };
		panelCheese.setLayout(gbl_panelCheese);

		JLabel imgCheese = new JLabel((Icon) null);
		ImageIcon cheese = new ImageIcon("../FastFoodStoreManager/img/cheese.png");
		Image imageCheese = cheese.getImage();
		Image resizeImageCheese = imageCheese.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon cheeseImg = new ImageIcon(resizeImageCheese);
		imgCheese.setIcon(cheeseImg);
		GridBagConstraints gbc_imgCheese = new GridBagConstraints();
		gbc_imgCheese.fill = GridBagConstraints.BOTH;
		gbc_imgCheese.insets = new Insets(0, 0, 5, 0);
		gbc_imgCheese.gridx = 0;
		gbc_imgCheese.gridy = 0;
		panelCheese.add(imgCheese, gbc_imgCheese);

		JPanel panel_17_1_1 = new JPanel();
		GridBagConstraints gbc_panel_17_1_1 = new GridBagConstraints();
		gbc_panel_17_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_17_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_17_1_1.gridx = 0;
		gbc_panel_17_1_1.gridy = 1;
		panelCheese.add(panel_17_1_1, gbc_panel_17_1_1);

		JLabel lblNewLabel_18_1_1 = new JLabel("Cheese");
		lblNewLabel_18_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_17_1_1.add(lblNewLabel_18_1_1);

		JLabel lblNewLabel_19_1_1 = new JLabel("0.3$");
		lblNewLabel_19_1_1.setForeground(Color.RED);
		lblNewLabel_19_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_17_1_1.add(lblNewLabel_19_1_1);

		JPanel panel_18_1_1 = new JPanel();
		panel_18_1_1.setLayout(null);
		GridBagConstraints gbc_panel_18_1_1 = new GridBagConstraints();
		gbc_panel_18_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_18_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_18_1_1.gridx = 0;
		gbc_panel_18_1_1.gridy = 2;
		panelCheese.add(panel_18_1_1, gbc_panel_18_1_1);

		JLabel lblNewLabel_20_1_1 = new JLabel("Quantity");
		lblNewLabel_20_1_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_20_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_20_1_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_20_1_1.setBounds(10, 5, 74, 19);
		panel_18_1_1.add(lblNewLabel_20_1_1);

		JSpinner spinner_4_4_1 = new JSpinner();
		spinner_4_4_1
				.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_4_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_4_4_1.setBounds(84, 0, 60, 25);
		panel_18_1_1.add(spinner_4_4_1);

		JButton btnNewButton_1_1_1_1_1 = new JButton("Add Cart");
		btnNewButton_1_1_1_1_1.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_1_1_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_1_1_1.setForeground(Color.RED);
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_1_1_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1_1_1_1.gridx = 0;
		gbc_btnNewButton_1_1_1_1_1.gridy = 3;
		panelCheese.add(btnNewButton_1_1_1_1_1, gbc_btnNewButton_1_1_1_1_1);

	}
}