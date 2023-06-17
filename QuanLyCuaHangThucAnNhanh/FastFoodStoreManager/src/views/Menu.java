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

public class Menu extends JFrame {

	private JPanel contentPane;
    private Food panelFood;
    private Beverage panelBeverage;
    private Topping panelTopping;
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
		panelTopping = new Topping();
		
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
		
		JButton btnCart = new JButton();
		btnCart.setBackground(Color.WHITE);
		ImageIcon iconCart = new ImageIcon("../FastFoodStoreManager/img/cartIcon.png");
		btnCart.setIcon(iconCart);
		btnCart.setBounds(0, 80, 78, 70);
		menu.add(btnCart);
		
		JButton btnHistory = new JButton();
		btnHistory.setBackground(Color.WHITE);
		ImageIcon iconHistory = new ImageIcon("../FastFoodStoreManager/img/HistoryIcon.png");
		btnHistory.setIcon(iconHistory);
		btnHistory.setBounds(0, 160, 78, 70);
		menu.add(btnHistory);
		
		JButton btnFrofile = new JButton();
		btnFrofile.setBackground(Color.WHITE);
		ImageIcon iconFrofile = new ImageIcon("../FastFoodStoreManager/img/FrofileIcon.png");
		btnFrofile.setIcon(iconFrofile);
		btnFrofile.setBounds(0, 240, 78, 70);
		menu.add(btnFrofile);
		
		JButton btnStats = new JButton();
		btnStats.setBackground(Color.WHITE);
		ImageIcon iconStats = new ImageIcon("../FastFoodStoreManager/img/StatsIcon.png");
		btnStats.setIcon(iconStats);
		btnStats.setBounds(0, 320, 78, 70);
		menu.add(btnStats);
		
		JButton btnLogOut = new JButton();
		btnLogOut.setBackground(Color.WHITE);
		ImageIcon iconLogOut = new ImageIcon("../FastFoodStoreManager/img/exitIcon.png");
		btnLogOut.setIcon(iconLogOut);
		btnLogOut.setBounds(0, 488, 78, 70);
		menu.add(btnLogOut);
		
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
		
		JButton btnTopping = new JButton("TOPPING");
		btnTopping.addMouseListener(new PanelButtonMouseAdapter(panelTopping) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelTopping);
			}
		});
		btnTopping.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTopping.setBounds(295, 62, 122, 23);
		contentPane.add(btnTopping);
		
		//add thuc don
		panelMain.add(panelFood);
		panelMain.add(panelBeverage);
		panelMain.add(panelTopping);
		
		menuClicked(panelFood);
	}
	
	public void menuClicked(JPanel selectedPanel) {
		panelFood.setVisible(false);
		panelBeverage.setVisible(false);
		panelTopping.setVisible(false);
		
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
