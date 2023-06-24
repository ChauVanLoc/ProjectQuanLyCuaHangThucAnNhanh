package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private Content panelMenu;
	private History panelHistory;
	private Profile panelProfile;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1350, 732);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		String imagePath = "../FastFoodStoreManager/img/logo.png";
		ImageIcon icon = new ImageIcon(imagePath);
		this.setIconImage(icon.getImage());

		setContentPane(contentPane);

		panelMenu = new Content();
		panelMenu.setBounds(0, 0, 1232, 631);
		panelHistory = new History();
		panelHistory.setBounds(0, 0, 1232, 631);
		panelProfile = new Profile();
		panelProfile.setBounds(0, 0, 1232, 631);

		JPanel menu = new JPanel();
		menu.setLayout(null);
		menu.setBackground(Color.WHITE);
		menu.setBounds(10, 66, 78, 616);
		contentPane.add(menu);

		JPanel panel = new JPanel();
		panel.setBounds(94, 66, 1232, 630);
		contentPane.add(panel);
		panel.setLayout(null);

		// all add panel
		panel.add(panelMenu);
		panel.add(panelHistory);
		panel.add(panelProfile);

		JLabel lblNewLabel_2 = new JLabel();
		ImageIcon img = new ImageIcon("../FastFoodStoreManager/img/logo.png");
		Image image = img.getImage();
		Image resizedImage = image.getScaledInstance(68, 51, Image.SCALE_SMOOTH);
		ImageIcon logoImg = new ImageIcon(resizedImage);
		lblNewLabel_2.setIcon(logoImg);
		lblNewLabel_2.setBounds(10, 5, 68, 51);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("FAST FOOD STORE");
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setFont(new Font("Juice ITC", Font.BOLD, 60));
		lblNewLabel_3.setBounds(459, 5, 403, 68);
		contentPane.add(lblNewLabel_3);

		JButton btnMenu = new JButton();
		btnMenu.addMouseListener(new PanelButtonMouseAdapter(panelMenu) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelMenu);
			}
		});
		btnMenu.setVerticalAlignment(SwingConstants.BOTTOM);
		btnMenu.setBackground(Color.WHITE);
		ImageIcon iconMenu = new ImageIcon("../FastFoodStoreManager/img/icon/menu.png");
		btnMenu.setIcon(iconMenu);
		btnMenu.setBounds(0, 0, 78, 70);
		menu.add(btnMenu);

		JButton btnHistory = new JButton();
		btnHistory.addMouseListener(new PanelButtonMouseAdapter(panelHistory) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHistory);
			}
		});
		btnHistory.setBackground(Color.WHITE);
		ImageIcon iconHistory = new ImageIcon("../FastFoodStoreManager/img/icon/history.png");
		btnHistory.setIcon(iconHistory);
		btnHistory.setBounds(0, 95, 78, 70);
		menu.add(btnHistory);

		JButton btnFrofile = new JButton();
		btnFrofile.addMouseListener(new PanelButtonMouseAdapter(panelProfile) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelProfile);
			}
		});
		btnFrofile.setBackground(Color.WHITE);
		ImageIcon iconFrofile = new ImageIcon("../FastFoodStoreManager/img/icon/profile.png");
		btnFrofile.setIcon(iconFrofile);
		btnFrofile.setBounds(0, 195, 78, 70);
		menu.add(btnFrofile);

		JButton btnLogOut = new JButton();
		btnLogOut.setBackground(Color.WHITE);
		ImageIcon iconLogOut = new ImageIcon("../FastFoodStoreManager/img/icon/logout.png");
		btnLogOut.setIcon(iconLogOut);
		btnLogOut.setBounds(0, 488, 78, 70);
		menu.add(btnLogOut);

		JLabel lblNewLabel_4 = new JLabel("Menu");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(0, 70, 78, 14);
		menu.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("History");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(0, 164, 78, 20);
		menu.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_2 = new JLabel("Frofile");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(0, 266, 78, 14);
		menu.add(lblNewLabel_4_2);
	}

	public void menuClicked(JPanel selectedPanel) {
		panelMenu.setVisible(false);
		panelHistory.setVisible(false);
		panelProfile.setVisible(false);

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