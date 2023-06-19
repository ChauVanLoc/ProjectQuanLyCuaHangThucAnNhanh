//package views;
//
//import java.awt.Color;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.SwingConstants;
//import javax.swing.JLabel;
//import java.awt.Font;
//import java.awt.Image;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class HomePage extends JFrame {
//
//	private JPanel contentPane;
//	private Profile panelFrofile;
//	private History panelHistory;
//	private Stats panelStats;
//	private Menu panelMenu;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					HomePage frame = new HomePage();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public HomePage() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(0, 0, 1650, 680);
//		contentPane = new JPanel();
//		contentPane.setBackground(new Color(0, 128, 128));
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(null);
//		
//		//set icon logo
//	    String imagePath = "../FastFoodStoreManager/img/logo.png";
//        ImageIcon icon = new ImageIcon(imagePath);
//        this.setIconImage(icon.getImage());
//
//		setContentPane(contentPane);
//		
//		//add panel
//		panelMenu = new Menu();
//		panelHistory = new History();
//		panelFrofile = new Profile();
//		panelStats = new Stats();
//		
//		
//		JPanel menu = new JPanel();
//		menu.setLayout(null);
//		menu.setBackground(Color.WHITE);
//		menu.setBounds(5, 62, 78, 570);
//		contentPane.add(menu);
//		
//		JPanel panel = new JPanel();
//		panel.setBounds(89, 62, 1184, 570);
//		contentPane.add(panel);
//		panel.setLayout(null);
//		
//		panel.add(panelMenu);
//		panel.add(panelHistory);
//		panel.add(panelFrofile);
//		panel.add(panelStats);
//		
//		menuClicked(panelMenu);
//		
//		JLabel lblNewLabel_2 = new JLabel();
//        ImageIcon img = new ImageIcon("../FastFoodStoreManager/img/logo.png");
//        Image image = img.getImage();
//        Image resizedImage = image.getScaledInstance(68, 51, Image.SCALE_SMOOTH);
//        ImageIcon logoImg = new ImageIcon(resizedImage);
//        lblNewLabel_2.setIcon(logoImg);
//        lblNewLabel_2.setBounds(10, 5, 68, 51);
//		contentPane.add(lblNewLabel_2);
//		
//		JLabel lblNewLabel_3 = new JLabel("FAST FOOD STORE");
//		lblNewLabel_3.setForeground(Color.YELLOW);
//		lblNewLabel_3.setFont(new Font("Juice ITC", Font.BOLD, 60));
//		lblNewLabel_3.setBounds(412, 5, 403, 68);
//		contentPane.add(lblNewLabel_3);
//		
//		JButton btnMenu = new JButton();
//		btnMenu.setVerticalAlignment(SwingConstants.BOTTOM);
//		btnMenu.setBackground(Color.WHITE);
//		ImageIcon iconMenu = new ImageIcon("../FastFoodStoreManager/img/menuIcon.png");
//		btnMenu.addMouseListener(new PanelButtonMouseAdapter(panelMenu) {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				menuClicked(panelMenu);
//			}
//		});
//		btnMenu.setIcon(iconMenu);
//		btnMenu.setBounds(0, 0, 78, 70);
//		menu.add(btnMenu);
//		
//		JButton btnHistory = new JButton();
//		btnHistory.setBackground(Color.WHITE);
//		ImageIcon iconHistory = new ImageIcon("../FastFoodStoreManager/img/HistoryIcon.png");
//		btnHistory.addMouseListener(new PanelButtonMouseAdapter(panelHistory) {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				menuClicked(panelHistory);
//			}
//		});
//		btnHistory.setIcon(iconHistory);
//		btnHistory.setBounds(0, 95, 78, 70);
//		menu.add(btnHistory);
//		
//		JButton btnFrofile = new JButton();
//		btnFrofile.setBackground(Color.WHITE);
//		ImageIcon iconFrofile = new ImageIcon("../FastFoodStoreManager/img/FrofileIcon.png");
//		btnFrofile.addMouseListener(new PanelButtonMouseAdapter(panelFrofile) {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				menuClicked(panelFrofile);
//			}
//		});
//		btnFrofile.setIcon(iconFrofile);
//		btnFrofile.setBounds(0, 195, 78, 70);
//		menu.add(btnFrofile);
//		
//		JButton btnStats = new JButton();
//		btnStats.setBackground(Color.WHITE);
//		ImageIcon iconStats = new ImageIcon("../FastFoodStoreManager/img/StatsIcon.png");
//		btnStats.addMouseListener(new PanelButtonMouseAdapter(panelStats) {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				menuClicked(panelStats);
//			}
//		});
//		btnStats.setIcon(iconStats);
//		btnStats.setBounds(0, 291, 78, 70);
//		menu.add(btnStats);
//		
//		JButton btnLogOut = new JButton();
//		btnLogOut.setBackground(Color.WHITE);
//		ImageIcon iconLogOut = new ImageIcon("../FastFoodStoreManager/img/exitIcon.png");
//		btnLogOut.setIcon(iconLogOut);
//		btnLogOut.setBounds(0, 488, 78, 70);
//		menu.add(btnLogOut);
//		
//		JLabel lblNewLabel_4 = new JLabel("Menu");
//		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
//		lblNewLabel_4.setBounds(0, 70, 78, 14);
//		menu.add(lblNewLabel_4);
//		
//		JLabel lblNewLabel_4_1 = new JLabel("History");
//		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
//		lblNewLabel_4_1.setBounds(0, 164, 78, 20);
//		menu.add(lblNewLabel_4_1);
//		
//		JLabel lblNewLabel_4_2 = new JLabel("Frofile");
//		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
//		lblNewLabel_4_2.setBounds(0, 266, 78, 14);
//		menu.add(lblNewLabel_4_2);
//		
//		JLabel lblNewLabel_4_3 = new JLabel("Stats");
//		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
//		lblNewLabel_4_3.setBounds(0, 360, 78, 14);
//		menu.add(lblNewLabel_4_3);
//	}
//	
//	
//	public void menuClicked(JPanel selectedPanel) {
//		panelMenu.setVisible(false);
//		panelHistory.setVisible(false);
//		panelFrofile.setVisible(false);
//		panelStats.setVisible(false);
//		
//		selectedPanel.setVisible(true);
//	}
//	
//	public class PanelButtonMouseAdapter extends MouseAdapter{
//		JPanel panel;
//		
//		public PanelButtonMouseAdapter(JPanel panel) {
//			this.panel = panel;
//		}
//
//		public void mouseEntered(MouseEvent e) {
//			panel.setBackground(new Color(0, 128, 128));
//		}
//		
//		public void mouseExited(MouseEvent e) {
//			panel.setBackground(new Color(0, 128, 128));
//		}
//		
//		public void mousePressed(MouseEvent e) {
//			panel.setBackground(new Color(0, 128, 128));
//		}
//		
//		public void mouseReleased(MouseEvent e) {
//			panel.setBackground(new Color(0, 128, 128));
//		}
//	}
//}
