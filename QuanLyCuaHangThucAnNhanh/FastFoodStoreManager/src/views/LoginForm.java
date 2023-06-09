package views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import constant.Colors;
import constant.Fonts;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private JTextField tf_pass;
	private JTextField tf_email;
	private JTextField textField;
	private JLabel lb_email;
	private JLabel lb_password;
	private PanelCustom passwordPanelCustom;
	private PanelCustom emailPanelCustom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, this.screenSize.width, this.screenSize.height);
		contentPane = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Image image = new ImageIcon("img\\primary.jpg").getImage();
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel() {
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
		panel.setOpaque(false);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(this.screenSize.width * 1 / 4, this.screenSize.height * 1 / 6, this.screenSize.width * 2 / 4,
				this.screenSize.height * 4 / 6);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Login to your account");
		lblNewLabel.setFont(Fonts.tahoma_bold_40);
		lblNewLabel.setBounds(81, 60, 485, 53);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Welcome back");
		lblNewLabel_1.setFont(Fonts.tahoma_plain_25);
		lblNewLabel_1.setBounds(81, 20, 187, 41);
		panel.add(lblNewLabel_1);

		lb_email = new JLabel("Email");
		lb_email.setFont(Fonts.tahoma_plain_25);
		lb_email.setBounds(81, 141, 82, 31);
		panel.add(lb_email);
		
		lb_email.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emailPanelCustom.getPs().requestFocus();
			}
		});

		emailPanelCustom = new PanelCustom(81, 188, 606, 49, 15, new Color(223, 228, 234), new Color(255, 255, 255));
		JPanel emailPanel = emailPanelCustom.createTextFiel(38, Fonts.tahoma_plain_18);
		panel.add(emailPanel);
		
		lb_password = new JLabel("Password");
		lb_password.setFont(Fonts.tahoma_plain_25);
		lb_password.setBounds(81, 270, 149, 31);
		panel.add(lb_password);
		
		passwordPanelCustom = new PanelCustom(81, 318, 606, 49, 15, new Color(223, 228, 234), new Color(255, 255, 255));
		JPanel passwordPanel = passwordPanelCustom.createPasswordTextFiel(38, Fonts.tahoma_plain_18);
		panel.add(passwordPanel);
		
		lb_password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordPanelCustom.getPs().requestFocus();
			}
		});

		JLabel lb_forgot_password = new JLabel("Forgot password?");
		lb_forgot_password.setForeground(new Color(112, 161, 255));
		lb_forgot_password.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lb_forgot_password.setBounds(524, 392, 187, 31);
		panel.add(lb_forgot_password);

		JLabel lblNewLabel_3 = new JLabel("Bạn chưa có tài khoản?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(223, 518, 199, 28);
		panel.add(lblNewLabel_3);
		
		PanelCustom panelLoginCustom = new PanelCustom(81, 447, 606, 59, 15, new Color(223, 228, 234), Colors.blue);
		JPanel loginPanel = panelLoginCustom.createButton("Login", Fonts.tahoma_bold_20, new Color(255, 255, 255));
		panel.add(loginPanel);
		
		JLabel lb_register_now = new JLabel("Đăng ký ngay");
		lb_register_now.setForeground(new Color(238, 77, 45));
		lb_register_now.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lb_register_now.setBounds(422, 518, 130, 28);
		lb_register_now.setCursor(new Cursor(12));
		panel.add(lb_register_now);

	}
}