package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Menu extends JFrame {

	private JPanel contentPane;
    private Food panelFood;
    private Beverage panelBeverage;
    private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1650, 680);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		panelFood = new Food();
		panelBeverage = new Beverage();
		
		//set icon logo
	    String imagePath = "F:/Github/ProjectQuanLyCuaHangThucAnNhanh/QuanLyCuaHangThucAnNhanh/FastFoodStoreManager/img/logo.png";
        ImageIcon icon = new ImageIcon(imagePath);
        this.setIconImage(icon.getImage());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setBackground(new Color(255, 255, 255));
		menu.setBounds(5, 62, 78, 570);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JButton btnMenu = new JButton();
		btnMenu.setBackground(Color.WHITE);
		ImageIcon iconMenu = new ImageIcon("../FastFoodStoreManager/img/menuIcon.png");
		btnMenu.setIcon(iconMenu);
		btnMenu.setBounds(0, 0, 78, 70);
		menu.add(btnMenu);
		ImageIcon iconCart = new ImageIcon("../FastFoodStoreManager/img/cartIcon.png");
		
		JButton btnHistory = new JButton();
		btnHistory.setBackground(Color.WHITE);
		ImageIcon iconHistory = new ImageIcon("../FastFoodStoreManager/img/HistoryIcon.png");
		btnHistory.setIcon(iconHistory);
		btnHistory.setBounds(0, 94, 78, 70);
		menu.add(btnHistory);
		
		JButton btnFrofile = new JButton();
		btnFrofile.setBackground(Color.WHITE);
		ImageIcon iconFrofile = new ImageIcon("../FastFoodStoreManager/img/FrofileIcon.png");
		btnFrofile.setIcon(iconFrofile);
		btnFrofile.setBounds(0, 189, 78, 70);
		menu.add(btnFrofile);
		
		JButton btnStats = new JButton();
		btnStats.setBackground(Color.WHITE);
		ImageIcon iconStats = new ImageIcon("../FastFoodStoreManager/img/StatsIcon.png");
		btnStats.setIcon(iconStats);
		btnStats.setBounds(0, 285, 78, 70);
		menu.add(btnStats);
		
		JButton btnLogOut = new JButton();
		btnLogOut.setBackground(Color.WHITE);
		ImageIcon iconLogOut = new ImageIcon("../FastFoodStoreManager/img/exitIcon.png");
		btnLogOut.setIcon(iconLogOut);
		btnLogOut.setBounds(0, 488, 78, 70);
		menu.add(btnLogOut);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 69, 78, 14);
		menu.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("History");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(0, 162, 78, 19);
		menu.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Frofile");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(0, 260, 78, 14);
		menu.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Stats");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(0, 354, 78, 14);
		menu.add(lblNewLabel_5);
		
		JPanel panelMain = new JPanel();
		panelMain.setBounds(89, 84, 900, 548);
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel();
        ImageIcon img = new ImageIcon("../FastFoodStoreManager/img/logo.png");
        Image image = img.getImage();
        Image resizedImage = image.getScaledInstance(68, 51, Image.SCALE_SMOOTH);
        ImageIcon logoImg = new ImageIcon(resizedImage);
        lblNewLabel_2.setIcon(logoImg);
        lblNewLabel_2.setBounds(10, 5, 68, 51);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("FAST FOOD STORE");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel_3.setBounds(404, 11, 592, 45);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(999, 62, 274, 570);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("CART");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(0, 0, 274, 40);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 37, 274, 435);
		panel_1.add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 471, 274, 48);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Total");
		lblNewLabel_7.setBounds(10, 11, 51, 25);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(71, 11, 171, 26);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("$");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8.setBounds(246, 11, 28, 25);
		panel_2.add(lblNewLabel_8);
		
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
		btnFood.setBounds(89, 62, 89, 23);
		contentPane.add(btnFood);
		
		JButton btnBeverage = new JButton("BEVERAGE");
		btnBeverage.addMouseListener(new PanelButtonMouseAdapter(panelBeverage) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelBeverage);
			}
		});
		btnBeverage.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBeverage.setBounds(177, 62, 122, 23);
		contentPane.add(btnBeverage);
		
		//add thuc don
		panelMain.add(panelFood);
		panelMain.add(panelBeverage);
		
		menuClicked(panelFood);
	}
	
	public void menuClicked(JPanel selectedPanel) {
		panelFood.setVisible(false);
		panelBeverage.setVisible(false);
		
		selectedPanel.setVisible(true);
	}
	
	public class PanelButtonMouseAdapter extends MouseAdapter{
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