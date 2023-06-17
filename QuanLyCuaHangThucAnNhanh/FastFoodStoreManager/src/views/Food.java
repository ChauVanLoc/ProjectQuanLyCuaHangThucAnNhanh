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
import java.awt.Component;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;

public class Food extends JPanel {

	/**
	 * Create the panel.
	 */
	public Food() {
		setBounds(0, 0, 900, 548);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 0, 0));
		panel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setBounds(0, 0, 900, 548);
		add(panel);
				panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
				JPanel panelBurgurBeef = new JPanel();
				panelBurgurBeef.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel.add(panelBurgurBeef);
				GridBagLayout gbl_panelBurgurBeef = new GridBagLayout();
				gbl_panelBurgurBeef.columnWidths = new int[] { 200, 0 };
				gbl_panelBurgurBeef.rowHeights = new int[] { 200, 30, 30 };
				gbl_panelBurgurBeef.columnWeights = new double[] { 0.0, 1.0 };
				gbl_panelBurgurBeef.rowWeights = new double[] { 0.0, 1.0, 1.0 };
				panelBurgurBeef.setLayout(gbl_panelBurgurBeef);
				
						JLabel lblImgBurgurBeef = new JLabel();
						lblImgBurgurBeef.setIcon(burgurBeefImg);
						GridBagConstraints gbc_lblImgBurgurBeef = new GridBagConstraints();
						gbc_lblImgBurgurBeef.fill = GridBagConstraints.HORIZONTAL;
						gbc_lblImgBurgurBeef.insets = new Insets(0, 0, 5, 5);
						gbc_lblImgBurgurBeef.gridx = 0;
						gbc_lblImgBurgurBeef.gridy = 0;
						panelBurgurBeef.add(lblImgBurgurBeef, gbc_lblImgBurgurBeef);
						
								JPanel panel_2 = new JPanel();
								GridBagConstraints gbc_panel_2 = new GridBagConstraints();
								gbc_panel_2.insets = new Insets(0, 0, 5, 5);
								gbc_panel_2.fill = GridBagConstraints.BOTH;
								gbc_panel_2.gridx = 0;
								gbc_panel_2.gridy = 1;
								panelBurgurBeef.add(panel_2, gbc_panel_2);
								panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
								
										JLabel lblBurgerBeef = new JLabel("Burgur Beef");
										lblBurgerBeef.setFont(new Font("Tahoma", Font.BOLD, 15));
										panel_2.add(lblBurgerBeef);
										
												JLabel lblCostBBeef = new JLabel("5$");
												lblCostBBeef.setAlignmentX(Component.RIGHT_ALIGNMENT);
												lblCostBBeef.setForeground(new Color(255, 0, 0));
												lblCostBBeef.setFont(new Font("Tahoma", Font.BOLD, 15));
												panel_2.add(lblCostBBeef);
												
														JSpinner spinner = new JSpinner();
														panel_2.add(spinner);
														spinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));
														
																JButton btnAddCart = new JButton("Add Cart");
																btnAddCart.setFont(new Font("Tahoma", Font.BOLD, 15));
																btnAddCart.setForeground(new Color(255, 0, 0));
																GridBagConstraints gbc_btnAddCart = new GridBagConstraints();
																gbc_btnAddCart.insets = new Insets(0, 0, 5, 5);
																gbc_btnAddCart.gridx = 0;
																gbc_btnAddCart.gridy = 2;
																panelBurgurBeef.add(btnAddCart, gbc_btnAddCart);
		
		JPanel panelBurgurChicken = new JPanel();
		panelBurgurChicken.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gbl_panelBurgurChicken = new GridBagLayout();
		gbl_panelBurgurChicken.columnWidths = new int[] {200, 0};
		gbl_panelBurgurChicken.rowHeights = new int[] {200, 30, 30};
		gbl_panelBurgurChicken.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelBurgurChicken.rowWeights = new double[]{0.0, 1.0};
		panelBurgurChicken.setLayout(gbl_panelBurgurChicken);
		
		JLabel lblImgBurgurChicken = new JLabel();
		lblImgBurgurChicken.setIcon(burgurChickenImg);
		panel.add(panelBurgurChicken);
		GridBagConstraints gbc_lblImgBurgurChicken = new GridBagConstraints();
		gbc_lblImgBurgurChicken.insets = new Insets(0, 0, 5, 0);
		gbc_lblImgBurgurChicken.gridx = 0;
		gbc_lblImgBurgurChicken.gridy = 0;
		panelBurgurChicken.add(lblImgBurgurChicken, gbc_lblImgBurgurChicken);
		
		JPanel panel_2_1 = new JPanel();
		GridBagConstraints gbc_panel_2_1 = new GridBagConstraints();
		gbc_panel_2_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2_1.fill = GridBagConstraints.BOTH;
		gbc_panel_2_1.gridx = 0;
		gbc_panel_2_1.gridy = 1;
		panelBurgurChicken.add(panel_2_1, gbc_panel_2_1);
		panel_2_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblBurgerChicken = new JLabel("Burgur Chicken");
		lblBurgerChicken.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_2_1.add(lblBurgerChicken);
		
		JLabel lblCostBBeef_1 = new JLabel("5$");
		lblCostBBeef_1.setForeground(Color.RED);
		lblCostBBeef_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCostBBeef_1.setAlignmentX(1.0f);
		panel_2_1.add(lblCostBBeef_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		panel_2_1.add(spinner_1);
		
		JButton btnAddCart_1 = new JButton("Add Cart");
		btnAddCart_1.setForeground(Color.RED);
		btnAddCart_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnAddCart_1 = new GridBagConstraints();
		gbc_btnAddCart_1.gridx = 0;
		gbc_btnAddCart_1.gridy = 2;
		panelBurgurChicken.add(btnAddCart_1, gbc_btnAddCart_1);
		lblImgBurgurChicken.setIcon(burgurFishImg);
		
		JPanel panelBurgurFish = new JPanel();
		panel.add(panelBurgurFish);
		GridBagLayout gbl_panelBurgurFish = new GridBagLayout();
		gbl_panelBurgurFish.columnWidths = new int[] {200, 0};
		gbl_panelBurgurFish.rowHeights = new int[] {200, 30, 30};
		gbl_panelBurgurFish.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelBurgurFish.rowWeights = new double[]{0.0, 1.0};
		panelBurgurFish.setLayout(gbl_panelBurgurFish);
		
		JLabel lblImgBurgurFish = new JLabel();
		GridBagConstraints gbc_lblImgBurgurFish = new GridBagConstraints();
		gbc_lblImgBurgurFish.insets = new Insets(0, 0, 5, 0);
		gbc_lblImgBurgurFish.gridx = 0;
		gbc_lblImgBurgurFish.gridy = 0;
		panelBurgurFish.add(lblImgBurgurFish, gbc_lblImgBurgurFish);
		
		JPanel panel_2_1_1 = new JPanel();
		GridBagConstraints gbc_panel_2_1_1 = new GridBagConstraints();
		gbc_panel_2_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_2_1_1.gridx = 0;
		gbc_panel_2_1_1.gridy = 1;
		panelBurgurFish.add(panel_2_1_1, gbc_panel_2_1_1);
		panel_2_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblBurgerFish = new JLabel("Burgur Fish");
		lblBurgerFish.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_2_1_1.add(lblBurgerFish);
		
		JLabel lblCostBBeef_1_1 = new JLabel("3.5$");
		lblCostBBeef_1_1.setForeground(Color.RED);
		lblCostBBeef_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCostBBeef_1_1.setAlignmentX(1.0f);
		panel_2_1_1.add(lblCostBBeef_1_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		panel_2_1_1.add(spinner_1_1);
		
		JButton btnAddCart_2 = new JButton("Add Cart");
		btnAddCart_2.setForeground(Color.RED);
		btnAddCart_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_btnAddCart_2 = new GridBagConstraints();
		gbc_btnAddCart_2.gridx = 0;
		gbc_btnAddCart_2.gridy = 2;
		panelBurgurFish.add(btnAddCart_2, gbc_btnAddCart_2);
		
		JPanel panelBurgurShrimp = new JPanel();
		panel.add(panelBurgurShrimp);
		GridBagLayout gbl_panelBurgurShrimp = new GridBagLayout();
		gbl_panelBurgurShrimp.columnWidths = new int[] {200, 0};
		gbl_panelBurgurShrimp.rowHeights = new int[] {200, 30, 30};
		gbl_panelBurgurShrimp.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panelBurgurShrimp.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelBurgurShrimp.setLayout(gbl_panelBurgurShrimp);
		
		JLabel lblImgBurgurShrimp = new JLabel();
		GridBagConstraints gbc_lblImgBurgurShrimp = new GridBagConstraints();
		gbc_lblImgBurgurShrimp.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblImgBurgurShrimp.gridx = 0;
		gbc_lblImgBurgurShrimp.gridy = 0;
		panelBurgurShrimp.add(lblImgBurgurShrimp, gbc_lblImgBurgurShrimp);
		
		JPanel panelSpagetti = new JPanel();
		panel.add(panelSpagetti);
		GridBagLayout gbl_panelSpagetti = new GridBagLayout();
		gbl_panelSpagetti.columnWidths = new int[] {200, 0};
		gbl_panelSpagetti.rowHeights = new int[] {200, 30, 30};
		gbl_panelSpagetti.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panelSpagetti.rowWeights = new double[]{Double.MIN_VALUE};
		panelSpagetti.setLayout(gbl_panelSpagetti);
		
		JPanel panelChips = new JPanel();
		panel.add(panelChips);
		GridBagLayout gbl_panelChips = new GridBagLayout();
		gbl_panelChips.columnWidths = new int[] {200, 0};
		gbl_panelChips.rowHeights = new int[] {200, 30, 30};
		gbl_panelChips.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panelChips.rowWeights = new double[]{Double.MIN_VALUE};
		panelChips.setLayout(gbl_panelChips);
		
		JPanel panelFriedChicken = new JPanel();
		panel.add(panelFriedChicken);
		GridBagLayout gbl_panelFriedChicken = new GridBagLayout();
		gbl_panelFriedChicken.columnWidths = new int[] {200, 0};
		gbl_panelFriedChicken.rowHeights = new int[] {200, 30, 30};
		gbl_panelFriedChicken.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panelFriedChicken.rowWeights = new double[]{Double.MIN_VALUE};
		panelFriedChicken.setLayout(gbl_panelFriedChicken);
		ImageIcon burgurBeef = new ImageIcon("../FastFoodStoreManager/img/burgurBeef.png");
		Image imageBurgurBeef = burgurBeef.getImage();
		Image resizedImageBurgurBeef = imageBurgurBeef.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon burgurBeefImg = new ImageIcon(resizedImageBurgurBeef);
		ImageIcon burgurChicken = new ImageIcon("../FastFoodStoreManager/img/burgurChicken.png");
		Image imageBurgurChicken = burgurChicken.getImage();
		Image resizedImageBurgurChicken = imageBurgurChicken.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon burgurChickenImg = new ImageIcon(resizedImageBurgurChicken);
		ImageIcon burgurFish = new ImageIcon("../FastFoodStoreManager/img/burgurFish.png");
		Image imageBurgurFish = burgurFish.getImage();
		Image resizedImageBurgurFish = imageBurgurFish.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon burgurFishImg = new ImageIcon(resizedImageBurgurFish);

	}

}
