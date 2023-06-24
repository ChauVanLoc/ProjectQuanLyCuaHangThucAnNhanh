package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Content extends JPanel {

	private Food panelFood;
	private Beverage panelBeverage;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Content frame = new Content();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Content() {
		setBounds(0, 0, 1190, 619);
		this.setBackground(new Color(0, 128, 128));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);

		panelFood = new Food();
		panelBeverage = new Beverage();
		ImageIcon iconMenu = new ImageIcon("../FastFoodStoreManager/img/menuIcon.png");
		ImageIcon iconCart = new ImageIcon("../FastFoodStoreManager/img/cartIcon.png");
		ImageIcon iconHistory = new ImageIcon("../FastFoodStoreManager/img/HistoryIcon.png");
		ImageIcon iconFrofile = new ImageIcon("../FastFoodStoreManager/img/FrofileIcon.png");
		ImageIcon iconStats = new ImageIcon("../FastFoodStoreManager/img/StatsIcon.png");
		ImageIcon iconLogOut = new ImageIcon("../FastFoodStoreManager/img/exitIcon.png");

		JPanel panelMain = new JPanel();
		panelMain.setBounds(0, 22, 900, 548);
		this.add(panelMain);
		panelMain.setLayout(null);
		ImageIcon img = new ImageIcon("../FastFoodStoreManager/img/logo.png");
		Image image = img.getImage();
		Image resizedImage = image.getScaledInstance(68, 51, Image.SCALE_SMOOTH);
		ImageIcon logoImg = new ImageIcon(resizedImage);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(910, 0, 274, 619);
		this.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("CART");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(0, 0, 274, 40);
		panel_1.add(lblNewLabel_6);

		JPanel panel = new JPanel();
		panel.setBounds(0, 37, 274, 435);
		panel_1.add(panel);
		panel.setLayout(null);

		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(6, 57, 177, 23);
		panel.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_1.setBounds(6, 111, 127, 23);
		panel.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_2.setBounds(6, 169, 127, 23);
		panel.add(chckbxNewCheckBox_2);

		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.BOLD, 15));
		spinner.setBounds(189, 58, 42, 20);
		panel.add(spinner);

		JButton btnNewButton_1 = new JButton("OK");
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(240, 57, 34, 23);
		panel.add(btnNewButton_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 274, 34);
		panel.add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 90, 90, 90 };
		gbl_panel_3.rowHeights = new int[] { 35 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 0.0, 0.0 };
		gbl_panel_3.rowWeights = new double[] { 0.0 };
		panel_3.setLayout(gbl_panel_3);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 471, 274, 48);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("Total");
		lblNewLabel_7.setBounds(10, 11, 51, 25);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("$");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8.setBounds(246, 11, 28, 25);
		panel_2.add(lblNewLabel_8);

		JLabel lblNewLabel_11 = new JLabel("total cost");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11.setBounds(71, 11, 175, 25);
		panel_2.add(lblNewLabel_11);

		JButton btnNewButton = new JButton("ORDER");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(133, 522, 141, 48);
		panel_1.add(btnNewButton);

		JButton btnFood = new JButton("FOOD");
		btnFood.addMouseListener(new PanelButtonMouseAdapter(panelFood) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelFood);
			}
		});
		btnFood.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFood.setBounds(0, 0, 89, 23);
		this.add(btnFood);

		JButton btnBeverage = new JButton("BEVERAGE");
		btnBeverage.addMouseListener(new PanelButtonMouseAdapter(panelBeverage) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelBeverage);
			}
		});
		btnBeverage.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBeverage.setBounds(88, 0, 122, 23);
		this.add(btnBeverage);

		// add thuc don
		panelMain.add(panelFood);
		panelMain.add(panelBeverage);

		menuClicked(panelFood);
	}

	public void menuClicked(JPanel selectedPanel) {
		panelFood.setVisible(false);
		panelBeverage.setVisible(false);

		selectedPanel.setVisible(true);
	}

	public class PanelButtonMouseAdapter extends MouseAdapter {
		JPanel panel;

		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}

		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(0, 128, 128));
		}

		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(0, 128, 128));
		}

		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(0, 128, 128));
		}

		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(0, 128, 128));
		}
	}
}