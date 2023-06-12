package views;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderManager extends JFrame {

	private JPanel contentPane;
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderManager frame = new OrderManager();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OrderManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, this.screenSize.width, this.screenSize.height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel menu = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension arcs = new Dimension(15, 15); // Border corners arcs {width,height}, change this to whatever
														// you want
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				graphics.setColor(getBackground());
				graphics.fillRoundRect(0, 0, width - 1, height - 1, 15, 15);// paint background

			}
		};
		menu.setOpaque(false);
		menu.setBackground(new Color(255, 255, 255));
		menu.setBounds(0, 0, 172, 827);
		contentPane.add(menu);
		menu.setLayout(null);

		JButton btnHome = new JButton("Home");
		btnHome.setBorderPainted(false);
		btnHome.setForeground(new Color(0, 0, 0));
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 15));

		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHome.setBounds(26, 86, 112, 21);
		menu.add(btnHome);

		JButton btnPersonManager = new JButton("Person Manager");
		btnPersonManager.setBorderPainted(false);
		btnPersonManager.setForeground(Color.BLACK);
		btnPersonManager.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPersonManager.setBackground(Color.WHITE);
		btnPersonManager.setBounds(7, 212, 159, 27);
		btnPersonManager.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnPersonManager.setHorizontalTextPosition(SwingConstants.CENTER);

		menu.add(btnPersonManager);

		JButton btnOrderManager = new JButton("Order Manager");
		btnOrderManager.setBorderPainted(false);
		btnOrderManager.setForeground(Color.BLACK);
		btnOrderManager.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOrderManager.setBackground(Color.WHITE);
		btnOrderManager.setBounds(7, 338, 162, 21);
		menu.add(btnOrderManager);

		JButton btnNotifyManager = new JButton("Notify Manager");
		btnNotifyManager.setBorderPainted(false);
		btnNotifyManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNotifyManager.setForeground(Color.BLACK);
		btnNotifyManager.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNotifyManager.setBackground(Color.WHITE);
		btnNotifyManager.setBounds(7, 464, 162, 21);
		menu.add(btnNotifyManager);

		JButton btnProductManager = new JButton("Product Manager");
		btnProductManager.setBorderPainted(false);
		btnProductManager.setForeground(Color.BLACK);
		btnProductManager.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnProductManager.setBackground(Color.WHITE);
		btnProductManager.setBounds(4, 590, 162, 21);
		menu.add(btnProductManager);

		JLabel lblHomeIcon = new JLabel("");
		lblHomeIcon.setBounds(67, 43, 64, 33);
		// resized icon
		ImageIcon originalIconHome = new ImageIcon("img\\home.png");
		Image originalImageHome = originalIconHome.getImage();
		Image resizedImageHome = originalImageHome.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon resizedIconHome = new ImageIcon(resizedImageHome);
		lblHomeIcon.setIcon(resizedIconHome);
		menu.add(lblHomeIcon);

		JLabel lblPersonIcon = new JLabel("");
		lblPersonIcon.setBounds(67, 169, 64, 33);
		ImageIcon originalIconPerson = new ImageIcon("img\\person.png");
		Image originalImagePerson = originalIconPerson.getImage();
		Image resizedImagePerson = originalImagePerson.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon resizedIconPerson = new ImageIcon(resizedImagePerson);
		lblPersonIcon.setIcon(resizedIconPerson);
		menu.add(lblPersonIcon);
		
		JLabel lblOrderIcon = new JLabel("");
		lblOrderIcon.setBounds(67, 295, 64, 33);
		ImageIcon originalIconOrder = new ImageIcon("img\\order.png");
		Image originalImageOrder = originalIconOrder.getImage();
		Image resizedImageOrder = originalImageOrder.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon resizedIconOrder = new ImageIcon(resizedImageOrder);
		lblOrderIcon.setIcon(resizedIconOrder);
		menu.add(lblOrderIcon);
		
		JLabel lblNotifyIcon = new JLabel("");
		lblNotifyIcon.setBounds(67, 421, 64, 33);
		ImageIcon originalIconNotify = new ImageIcon("img\\notify.png");
		Image originalImageNotify = originalIconNotify.getImage();
		Image resizedImageNotify = originalImageNotify.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon resizedIconNotify = new ImageIcon(resizedImageNotify);
		lblNotifyIcon.setIcon(resizedIconNotify);
		menu.add(lblNotifyIcon);
		
		JLabel lblProductIcon = new JLabel("");
		lblProductIcon.setBounds(67, 547, 64, 33);
		ImageIcon originalIconProduct = new ImageIcon("img\\product.png");
		Image originalImageProduct = originalIconProduct.getImage();
		Image resizedImageProduct = originalImageProduct.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon resizedIconProduct = new ImageIcon(resizedImageProduct);
		lblProductIcon.setIcon(resizedIconProduct);
		menu.add(lblProductIcon);

		JPanel mainContent = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension arcs = new Dimension(15, 15); // Border corners arcs {width,height}, change this to whatever
														// you want
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				graphics.setColor(getBackground());
				graphics.fillRoundRect(0, 0, width - 1, height - 1, 15, 15);// paint background

			}
		};
		mainContent.setForeground(new Color(255, 255, 255));

		mainContent.setLayout(null);
		mainContent.setOpaque(false);
		mainContent.setBackground(new Color(255, 255, 255));
		mainContent.setBounds(250, 46, 1235, 721);
		contentPane.add(mainContent);

		JPanel panel_2 = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension arcs = new Dimension(15, 15); // Border corners arcs {width,height}, change this to whatever
														// you want
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				graphics.setColor(getBackground());
				graphics.fillRoundRect(0, 0, width - 1, height - 1, 15, 15);// paint background

			}
		};
		panel_2.setLayout(null);
		panel_2.setOpaque(false);
		panel_2.setBackground(new Color(255, 128, 64));
		panel_2.setBounds(63, 652, 117, 45);
		mainContent.add(panel_2);

		JLabel lblNewLabel = new JLabel("Total");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(35, 10, 72, 25);
		panel_2.add(lblNewLabel);

		JPanel panel_2_1 = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension arcs = new Dimension(15, 15); // Border corners arcs {width,height}, change this to whatever
														// you want
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				graphics.setColor(getBackground());
				graphics.fillRoundRect(0, 0, width - 1, height - 1, 15, 15);// paint background
			}
		};
		panel_2_1.setLayout(null);
		panel_2_1.setOpaque(false);
		panel_2_1.setBackground(new Color(255, 128, 64));
		panel_2_1.setBounds(630, 652, 219, 45);
		mainContent.add(panel_2_1);

		JLabel lblNewLabel_1 = new JLabel("Number of products");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(23, 10, 222, 25);
		panel_2_1.add(lblNewLabel_1);

	}
}
