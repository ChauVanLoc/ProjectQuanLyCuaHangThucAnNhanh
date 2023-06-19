package views;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.Icon;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.Dimension;
import javax.swing.SpinnerNumberModel;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import java.awt.Container;

public class Beverage extends JPanel {

	/**
	 * Create the panel.
	 */
	public Beverage() {
		setBounds(0, 0, 900,548);
		setLayout(null);
		
		JScrollPane scrollPaneBeverage = new JScrollPane();
		scrollPaneBeverage.setBounds(0, 0, 560, 548);
		add(scrollPaneBeverage);
		
		JPanel panel = new JPanel();
		scrollPaneBeverage.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.add(panel_1);
		
		JPanel panelJuice = new JPanel();
		panelJuice.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelJuice.setAutoscrolls(true);
		panel_1.add(panelJuice);
		GridBagLayout gbl_panelJuice = new GridBagLayout();
		gbl_panelJuice.columnWidths = new int[]{170, 0};
		gbl_panelJuice.rowHeights = new int[]{170, 30, 30, 30, 0};
		gbl_panelJuice.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelJuice.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panelJuice.setLayout(gbl_panelJuice);
		
		JLabel imgJuice = new JLabel((Icon) null);
		ImageIcon juice = new ImageIcon("../FastFoodStoreManager/img/juice.png");
		Image imageJuice = juice.getImage();
		Image resizeImageJuice = imageJuice.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
		ImageIcon juiceImg = new ImageIcon(resizeImageJuice);
		imgJuice.setIcon(juiceImg);
		GridBagConstraints gbc_imgJuice = new GridBagConstraints();
		gbc_imgJuice.fill = GridBagConstraints.BOTH;
		gbc_imgJuice.insets = new Insets(0, 0, 5, 0);
		gbc_imgJuice.gridx = 0;
		gbc_imgJuice.gridy = 0;
		panelJuice.add(imgJuice, gbc_imgJuice);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 1;
		panelJuice.add(panel_5, gbc_panel_5);
		
		JLabel lblJuice = new JLabel("Juice");
		lblJuice.setHorizontalTextPosition(SwingConstants.LEFT);
		lblJuice.setHorizontalAlignment(SwingConstants.LEFT);
		lblJuice.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_5.add(lblJuice);
		
		JLabel lblNewLabel_1 = new JLabel("2$");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_5.add(lblNewLabel_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 2;
		panelJuice.add(panel_7, gbc_panel_7);
		
		JLabel lblNewLabel_3 = new JLabel("Quantity");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3.setBounds(10, 5, 74, 19);
		panel_7.add(lblNewLabel_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner.setBounds(109, 0, 61, 26);
		panel_7.add(spinner);
		
		JButton btnNewButton_1 = new JButton("Add Cart");
		btnNewButton_1.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 3;
		panelJuice.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JPanel panelMixed = new JPanel();
		panelMixed.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMixed.setAutoscrolls(true);
		panel_1.add(panelMixed);
		GridBagLayout gbl_panelMixed = new GridBagLayout();
		gbl_panelMixed.columnWidths = new int[]{170, 0};
		gbl_panelMixed.rowHeights = new int[]{170, 30, 30, 30, 0};
		gbl_panelMixed.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelMixed.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panelMixed.setLayout(gbl_panelMixed);
		
		JLabel imgMixed = new JLabel((Icon) null);
		ImageIcon mixed = new ImageIcon("../FastFoodStoreManager/img/mixed.png");
		Image imageMixed = mixed.getImage();
		Image resizeImageMixed = imageMixed.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
		ImageIcon mixedImg = new ImageIcon(resizeImageMixed);
		imgMixed.setIcon(mixedImg);
		GridBagConstraints gbc_imgMixed = new GridBagConstraints();
		gbc_imgMixed.fill = GridBagConstraints.BOTH;
		gbc_imgMixed.insets = new Insets(0, 0, 5, 0);
		gbc_imgMixed.gridx = 0;
		gbc_imgMixed.gridy = 0;
		panelMixed.add(imgMixed, gbc_imgMixed);
		
		JPanel panel_5_1 = new JPanel();
		GridBagConstraints gbc_panel_5_1 = new GridBagConstraints();
		gbc_panel_5_1.fill = GridBagConstraints.BOTH;
		gbc_panel_5_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5_1.gridx = 0;
		gbc_panel_5_1.gridy = 1;
		panelMixed.add(panel_5_1, gbc_panel_5_1);
		
		JLabel lblBurgerBeef = new JLabel("Mixed");
		lblBurgerBeef.setHorizontalTextPosition(SwingConstants.LEFT);
		lblBurgerBeef.setHorizontalAlignment(SwingConstants.LEFT);
		lblBurgerBeef.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_5_1.add(lblBurgerBeef);
		
		JLabel lblNewLabel_1_1 = new JLabel("5$");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_5_1.add(lblNewLabel_1_1);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		GridBagConstraints gbc_panel_7_1 = new GridBagConstraints();
		gbc_panel_7_1.fill = GridBagConstraints.BOTH;
		gbc_panel_7_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_1.gridx = 0;
		gbc_panel_7_1.gridy = 2;
		panelMixed.add(panel_7_1, gbc_panel_7_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Quantity");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_1.setBounds(10, 5, 74, 19);
		panel_7_1.add(lblNewLabel_3_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_1.setBounds(109, 0, 61, 26);
		panel_7_1.add(spinner_1);
		
		JButton btnNewButton_1_1 = new JButton("Add Cart");
		btnNewButton_1_1.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1.gridx = 0;
		gbc_btnNewButton_1_1.gridy = 3;
		panelMixed.add(btnNewButton_1_1, gbc_btnNewButton_1_1);
		
		JPanel panelTea = new JPanel();
		panelTea.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTea.setAutoscrolls(true);
		panel_1.add(panelTea);
		GridBagLayout gbl_panelTea = new GridBagLayout();
		gbl_panelTea.columnWidths = new int[]{170, 0};
		gbl_panelTea.rowHeights = new int[]{170, 30, 30, 30, 0};
		gbl_panelTea.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelTea.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panelTea.setLayout(gbl_panelTea);
		
		JLabel imgTea = new JLabel((Icon) null);
		ImageIcon tea = new ImageIcon("../FastFoodStoreManager/img/tea.png");
		Image imageTea = tea.getImage();
		Image resizeImageTea = imageTea.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
		ImageIcon teaImg = new ImageIcon(resizeImageTea);
		imgTea.setIcon(teaImg);
		GridBagConstraints gbc_imgTea = new GridBagConstraints();
		gbc_imgTea.fill = GridBagConstraints.BOTH;
		gbc_imgTea.insets = new Insets(0, 0, 5, 0);
		gbc_imgTea.gridx = 0;
		gbc_imgTea.gridy = 0;
		panelTea.add(imgTea, gbc_imgTea);
		
		JPanel panel_5_2 = new JPanel();
		GridBagConstraints gbc_panel_5_2 = new GridBagConstraints();
		gbc_panel_5_2.fill = GridBagConstraints.BOTH;
		gbc_panel_5_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5_2.gridx = 0;
		gbc_panel_5_2.gridy = 1;
		panelTea.add(panel_5_2, gbc_panel_5_2);
		
		JLabel lblBurgerBeef_1 = new JLabel("Tea");
		lblBurgerBeef_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblBurgerBeef_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblBurgerBeef_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_5_2.add(lblBurgerBeef_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("1$");
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_5_2.add(lblNewLabel_1_2);
		
		JPanel panel_7_2 = new JPanel();
		panel_7_2.setLayout(null);
		GridBagConstraints gbc_panel_7_2 = new GridBagConstraints();
		gbc_panel_7_2.fill = GridBagConstraints.BOTH;
		gbc_panel_7_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_2.gridx = 0;
		gbc_panel_7_2.gridy = 2;
		panelTea.add(panel_7_2, gbc_panel_7_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Quantity");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_2.setBounds(10, 5, 74, 19);
		panel_7_2.add(lblNewLabel_3_2);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_2.setBounds(109, 0, 61, 26);
		panel_7_2.add(spinner_2);
		
		JButton btnNewButton_1_2 = new JButton("Add Cart");
		btnNewButton_1_2.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_2.setForeground(Color.RED);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_2 = new GridBagConstraints();
		gbc_btnNewButton_1_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_2.gridx = 0;
		gbc_btnNewButton_1_2.gridy = 3;
		panelTea.add(btnNewButton_1_2, gbc_btnNewButton_1_2);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel.add(panel_2);
		
		JPanel panelCarbonateSoftDrink = new JPanel();
		panelCarbonateSoftDrink.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCarbonateSoftDrink.setAutoscrolls(true);
		panel_2.add(panelCarbonateSoftDrink);
		GridBagLayout gbl_panelCarbonateSoftDrink = new GridBagLayout();
		gbl_panelCarbonateSoftDrink.columnWidths = new int[]{170, 0};
		gbl_panelCarbonateSoftDrink.rowHeights = new int[] {170, 55, 30, 30, 0};
		gbl_panelCarbonateSoftDrink.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelCarbonateSoftDrink.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panelCarbonateSoftDrink.setLayout(gbl_panelCarbonateSoftDrink);
		
		JLabel imgCarbonateSoftDrink = new JLabel((Icon) null);
		ImageIcon carbonateSoftDrink = new ImageIcon("../FastFoodStoreManager/img/carbonateSoftDrink.png");
		Image imageCarbonateSoftDrink = carbonateSoftDrink.getImage();
		Image resizeImageCarbonateSoftDrink = imageCarbonateSoftDrink.getScaledInstance(170, 170, Image.SCALE_SMOOTH);
		ImageIcon carbonateSoftDrinkImg = new ImageIcon(resizeImageCarbonateSoftDrink);
		imgCarbonateSoftDrink.setIcon(carbonateSoftDrinkImg);
		GridBagConstraints gbc_imgCarbonateSoftDrink = new GridBagConstraints();
		gbc_imgCarbonateSoftDrink.fill = GridBagConstraints.BOTH;
		gbc_imgCarbonateSoftDrink.insets = new Insets(0, 0, 5, 0);
		gbc_imgCarbonateSoftDrink.gridx = 0;
		gbc_imgCarbonateSoftDrink.gridy = 0;
		panelCarbonateSoftDrink.add(imgCarbonateSoftDrink, gbc_imgCarbonateSoftDrink);
		
		JPanel panel_5_3 = new JPanel();
		panel_5_3.setLayout(null);
		GridBagConstraints gbc_panel_5_3 = new GridBagConstraints();
		gbc_panel_5_3.fill = GridBagConstraints.BOTH;
		gbc_panel_5_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5_3.gridx = 0;
		gbc_panel_5_3.gridy = 1;
		panelCarbonateSoftDrink.add(panel_5_3, gbc_panel_5_3);
		
		JLabel lblCarbonateSoftDrink = new JLabel("Carbonate Soft Drink");
		lblCarbonateSoftDrink.setBounds(5, 5, 164, 19);
		lblCarbonateSoftDrink.setHorizontalTextPosition(SwingConstants.LEFT);
		lblCarbonateSoftDrink.setHorizontalAlignment(SwingConstants.LEFT);
		lblCarbonateSoftDrink.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_5_3.add(lblCarbonateSoftDrink);
		
		JLabel lblNewLabel_1_3 = new JLabel("2$");
		lblNewLabel_1_3.setForeground(Color.RED);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(72, 26, 20, 19);
		panel_5_3.add(lblNewLabel_1_3);
		
		JPanel panel_7_3 = new JPanel();
		panel_7_3.setLayout(null);
		GridBagConstraints gbc_panel_7_3 = new GridBagConstraints();
		gbc_panel_7_3.fill = GridBagConstraints.BOTH;
		gbc_panel_7_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_3.gridx = 0;
		gbc_panel_7_3.gridy = 2;
		panelCarbonateSoftDrink.add(panel_7_3, gbc_panel_7_3);
		
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
		btnNewButton_1_3.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_3.setForeground(Color.RED);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_3 = new GridBagConstraints();
		gbc_btnNewButton_1_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_3.gridx = 0;
		gbc_btnNewButton_1_3.gridy = 3;
		panelCarbonateSoftDrink.add(btnNewButton_1_3, gbc_btnNewButton_1_3);
		
		JScrollPane scrollPaneBeverageTopping = new JScrollPane();
		scrollPaneBeverageTopping.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPaneBeverageTopping.setBounds(560, 0, 340, 548);
		add(scrollPaneBeverageTopping);
		
		JLabel lblNewLabel_15 = new JLabel("TOPPING");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_15.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, Color.ORANGE, Color.RED, Color.ORANGE));
		scrollPaneBeverageTopping.setColumnHeaderView(lblNewLabel_15);
		
		JPanel panel_3 = new JPanel();
		scrollPaneBeverageTopping.setViewportView(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_4.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_3.add(panel_4);
		
		JPanel panelkCheese = new JPanel();
		panelkCheese.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelkCheese.setAutoscrolls(true);
		panel_4.add(panelkCheese);
		GridBagLayout gbl_panelkCheese = new GridBagLayout();
		gbl_panelkCheese.columnWidths = new int[]{150, 0};
		gbl_panelkCheese.rowHeights = new int[]{150, 30, 30, 30, 0};
		gbl_panelkCheese.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelkCheese.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panelkCheese.setLayout(gbl_panelkCheese);
		
		JLabel imgKCheese = new JLabel((Icon) null);
		ImageIcon kCheese = new ImageIcon("../FastFoodStoreManager/img/kemCheese.png");
		Image imageKCheese = kCheese.getImage();
		Image resizeImageKCheese = imageKCheese.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon kCheeseImg = new ImageIcon(resizeImageKCheese);
		imgKCheese.setIcon(kCheeseImg);
		GridBagConstraints gbc_imgKCheese = new GridBagConstraints();
		gbc_imgKCheese.fill = GridBagConstraints.BOTH;
		gbc_imgKCheese.insets = new Insets(0, 0, 5, 0);
		gbc_imgKCheese.gridx = 0;
		gbc_imgKCheese.gridy = 0;
		panelkCheese.add(imgKCheese, gbc_imgKCheese);
		
		JPanel panel_16 = new JPanel();
		GridBagConstraints gbc_panel_16 = new GridBagConstraints();
		gbc_panel_16.fill = GridBagConstraints.BOTH;
		gbc_panel_16.insets = new Insets(0, 0, 5, 0);
		gbc_panel_16.gridx = 0;
		gbc_panel_16.gridy = 1;
		panelkCheese.add(panel_16, gbc_panel_16);
		
		JLabel lblNewLabel_16 = new JLabel("Cream");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_16.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("0.6$");
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
		panelkCheese.add(panel_7_4_3_1, gbc_panel_7_4_3_1);
		
		JLabel lblNewLabel_3_4_3_1 = new JLabel("Quantity");
		lblNewLabel_3_4_3_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_4_3_1.setBounds(10, 5, 74, 19);
		panel_7_4_3_1.add(lblNewLabel_3_4_3_1);
		
		JSpinner spinner_4_3_1 = new JSpinner();
		spinner_4_3_1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_4_3_1.setBounds(84, 0, 61, 26);
		panel_7_4_3_1.add(spinner_4_3_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Add Cart");
		btnNewButton_1_1_1.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_1.setForeground(Color.RED);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1_1.gridx = 0;
		gbc_btnNewButton_1_1_1.gridy = 3;
		panelkCheese.add(btnNewButton_1_1_1, gbc_btnNewButton_1_1_1);
		
		JPanel panelPudding = new JPanel();
		panelPudding.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPudding.setAutoscrolls(true);
		panel_4.add(panelPudding);
		GridBagLayout gbl_panelPudding = new GridBagLayout();
		gbl_panelPudding.columnWidths = new int[]{150, 0};
		gbl_panelPudding.rowHeights = new int[]{150, 30, 30, 30, 0};
		gbl_panelPudding.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelPudding.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panelPudding.setLayout(gbl_panelPudding);
		
		JLabel imgPudding = new JLabel((Icon) null);
		ImageIcon pudding = new ImageIcon("../FastFoodStoreManager/img/pudding.png");
		Image imagePudding = pudding.getImage();
		Image resizeImagePudding = imagePudding.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon puddingImg = new ImageIcon(resizeImagePudding);
		imgPudding.setIcon(puddingImg);
		GridBagConstraints gbc_imgPudding = new GridBagConstraints();
		gbc_imgPudding.fill = GridBagConstraints.BOTH;
		gbc_imgPudding.insets = new Insets(0, 0, 5, 0);
		gbc_imgPudding.gridx = 0;
		gbc_imgPudding.gridy = 0;
		panelPudding.add(imgPudding, gbc_imgPudding);
		
		JPanel panel_16_1 = new JPanel();
		GridBagConstraints gbc_panel_16_1 = new GridBagConstraints();
		gbc_panel_16_1.fill = GridBagConstraints.BOTH;
		gbc_panel_16_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_16_1.gridx = 0;
		gbc_panel_16_1.gridy = 1;
		panelPudding.add(panel_16_1, gbc_panel_16_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("Pudding");
		lblNewLabel_16_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_16_1.add(lblNewLabel_16_1);
		
		JLabel lblNewLabel_17_1 = new JLabel("0.6$");
		lblNewLabel_17_1.setForeground(Color.RED);
		lblNewLabel_17_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_16_1.add(lblNewLabel_17_1);
		
		JPanel panel_7_4_3_1_1 = new JPanel();
		panel_7_4_3_1_1.setLayout(null);
		GridBagConstraints gbc_panel_7_4_3_1_1 = new GridBagConstraints();
		gbc_panel_7_4_3_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_7_4_3_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_4_3_1_1.gridx = 0;
		gbc_panel_7_4_3_1_1.gridy = 2;
		panelPudding.add(panel_7_4_3_1_1, gbc_panel_7_4_3_1_1);
		
		JLabel lblNewLabel_3_4_3_1_1 = new JLabel("Quantity");
		lblNewLabel_3_4_3_1_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_4_3_1_1.setBounds(10, 5, 74, 19);
		panel_7_4_3_1_1.add(lblNewLabel_3_4_3_1_1);
		
		JSpinner spinner_4_3_1_1 = new JSpinner();
		spinner_4_3_1_1.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_4_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_4_3_1_1.setBounds(84, 0, 61, 26);
		panel_7_4_3_1_1.add(spinner_4_3_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Add Cart");
		btnNewButton_1_1_2.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_1_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_2.setForeground(Color.RED);
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_1_2 = new GridBagConstraints();
		gbc_btnNewButton_1_1_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1_2.gridx = 0;
		gbc_btnNewButton_1_1_2.gridy = 3;
		panelPudding.add(btnNewButton_1_1_2, gbc_btnNewButton_1_1_2);
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_6.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_3.add(panel_6);
		
		JPanel panelSugar = new JPanel();
		panelSugar.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSugar.setAutoscrolls(true);
		panel_6.add(panelSugar);
		GridBagLayout gbl_panelSugar = new GridBagLayout();
		gbl_panelSugar.columnWidths = new int[]{150, 0};
		gbl_panelSugar.rowHeights = new int[]{150, 30, 30, 30, 0};
		gbl_panelSugar.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelSugar.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panelSugar.setLayout(gbl_panelSugar);
		
		JLabel imgSugar = new JLabel((Icon) null);
		ImageIcon sugar = new ImageIcon("../FastFoodStoreManager/img/sugar.png");
		Image imageSugar = sugar.getImage();
		Image resizeImageSugar = imageSugar.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon sugarImg = new ImageIcon(resizeImageSugar);
		imgSugar.setIcon(sugarImg);
		GridBagConstraints gbc_imgSugar = new GridBagConstraints();
		gbc_imgSugar.fill = GridBagConstraints.BOTH;
		gbc_imgSugar.insets = new Insets(0, 0, 5, 0);
		gbc_imgSugar.gridx = 0;
		gbc_imgSugar.gridy = 0;
		panelSugar.add(imgSugar, gbc_imgSugar);
		
		JPanel panel_16_2 = new JPanel();
		GridBagConstraints gbc_panel_16_2 = new GridBagConstraints();
		gbc_panel_16_2.fill = GridBagConstraints.BOTH;
		gbc_panel_16_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_16_2.gridx = 0;
		gbc_panel_16_2.gridy = 1;
		panelSugar.add(panel_16_2, gbc_panel_16_2);
		
		JLabel lblNewLabel_16_2 = new JLabel("Sugar");
		lblNewLabel_16_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_16_2.add(lblNewLabel_16_2);
		
		JLabel lblNewLabel_17_2 = new JLabel("0.2$");
		lblNewLabel_17_2.setForeground(Color.RED);
		lblNewLabel_17_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_16_2.add(lblNewLabel_17_2);
		
		JPanel panel_7_4_3_1_2 = new JPanel();
		panel_7_4_3_1_2.setLayout(null);
		GridBagConstraints gbc_panel_7_4_3_1_2 = new GridBagConstraints();
		gbc_panel_7_4_3_1_2.fill = GridBagConstraints.BOTH;
		gbc_panel_7_4_3_1_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7_4_3_1_2.gridx = 0;
		gbc_panel_7_4_3_1_2.gridy = 2;
		panelSugar.add(panel_7_4_3_1_2, gbc_panel_7_4_3_1_2);
		
		JLabel lblNewLabel_3_4_3_1_2 = new JLabel("Quantity");
		lblNewLabel_3_4_3_1_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_3_4_3_1_2.setBounds(10, 5, 74, 19);
		panel_7_4_3_1_2.add(lblNewLabel_3_4_3_1_2);
		
		JSpinner spinner_4_3_1_2 = new JSpinner();
		spinner_4_3_1_2.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinner_4_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner_4_3_1_2.setBounds(84, 0, 61, 26);
		panel_7_4_3_1_2.add(spinner_4_3_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("Add Cart");
		btnNewButton_1_1_3.setPreferredSize(new Dimension(50, 20));
		btnNewButton_1_1_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_3.setForeground(Color.RED);
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1_1_3 = new GridBagConstraints();
		gbc_btnNewButton_1_1_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1_1_3.gridx = 0;
		gbc_btnNewButton_1_1_3.gridy = 3;
		panelSugar.add(btnNewButton_1_1_3, gbc_btnNewButton_1_1_3);
		
		setVisible(true);
	}
}
