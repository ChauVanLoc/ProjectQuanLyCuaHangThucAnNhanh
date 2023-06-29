package views;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import constant.Colors;
import constant.Fonts;
import constant.Frame;

public class Register {
	
	private JPanel contentPane;
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private JLabel lb_email;
	private JLabel lb_password;
	private JLabel lb_fullName;
	private JLabel lb_cccd;
	private JLabel lb_confirmPassword;
	private PanelCustom passwordPanelCustom;
	private PanelCustom emailPanelCustom;
	private PanelCustom fullNamePanelCustom;
	private PanelCustom cccdPanelCustom;
	private PanelCustom confirmPasswordPanelCustom;
	public Register() {}
	
	public JPanel createRegister(JPanel parentPanel, CardLayout cardLayout) {
		contentPane = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Image image = new ImageIcon("img\\primary.jpg").getImage();
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(new BorderLayout());

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
				graphics.fillRoundRect(contentPane.getWidth() * 1 / 5, contentPane.getHeight() * 1 / 10,
						contentPane.getWidth() * 3 / 5, contentPane.getHeight() * 8 / 10, 15, 15);// paint background
			}
		};
		panel.setOpaque(false);
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(Fonts.tahoma_bold_40);
		lblNewLabel.setBounds(590, 90, 300, 53);
		panel.add(lblNewLabel);

		lb_fullName = new JLabel("Full Name");
		lb_fullName.setFont(Fonts.tahoma_plain_25);
		lb_fullName.setBounds(365, 160, 130, 31);
		panel.add(lb_fullName);

		fullNamePanelCustom = new PanelCustom(365, 200, 350, 49, 15, new Color(223, 228, 234), new Color(255, 255, 255));
		JPanel fullNamePanel = fullNamePanelCustom.createTextFiel(21, Fonts.tahoma_plain_18);
		panel.add(fullNamePanel);
		
		lb_cccd = new JLabel("Phone");
		lb_cccd.setFont(Fonts.tahoma_plain_25);
		lb_cccd.setBounds(740, 160, 130, 31);
		panel.add(lb_cccd);
		
		cccdPanelCustom = new PanelCustom(740, 200, 230, 49, 15, new Color(223, 228, 234), new Color(255, 255, 255));
		JPanel cccdPanel = cccdPanelCustom.createTextFiel(13, Fonts.tahoma_plain_18);
		panel.add(cccdPanel);
		
		lb_email = new JLabel("Email");
		lb_email.setFont(Fonts.tahoma_plain_25);
		lb_email.setBounds(365, 280, 82, 31);
		panel.add(lb_email);

		emailPanelCustom = new PanelCustom(365, 320, 606, 49, 15, new Color(223, 228, 234), new Color(255, 255, 255));
		JPanel emailPanel = emailPanelCustom.createTextFiel(38, Fonts.tahoma_plain_18);
		panel.add(emailPanel);
		
		lb_password = new JLabel("Password");
		lb_password.setFont(Fonts.tahoma_plain_25);
		lb_password.setBounds(365, 400, 149, 31);
		panel.add(lb_password);
		
		passwordPanelCustom = new PanelCustom(365, 440, 290, 49, 15, new Color(223, 228, 234), new Color(255, 255, 255));
		JPanel passwordPanel = passwordPanelCustom.createPasswordTextFiel(17, Fonts.tahoma_plain_18);
		panel.add(passwordPanel);
		
		lb_confirmPassword = new JLabel("Confirm Password");
		lb_confirmPassword.setFont(Fonts.tahoma_plain_25);
		lb_confirmPassword.setBounds(680, 400, 250, 31);
		panel.add(lb_confirmPassword);
		
		confirmPasswordPanelCustom = new PanelCustom(680, 440, 290, 49, 15, new Color(223, 228, 234), new Color(255, 255, 255));
		JPanel confirmPasswordPanel = confirmPasswordPanelCustom.createPasswordTextFiel(17, Fonts.tahoma_plain_18);
		panel.add(confirmPasswordPanel);
		
		JLabel lblNewLabel_3 = new JLabel("Bạn đã có tài khoản?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(510, 595, 190, 28);
		panel.add(lblNewLabel_3);
		
		PanelCustom panelLoginCustom = new PanelCustom(365, 527, 606, 59, 15, new Color(223, 228, 234), Colors.blue);
		JPanel loginPanel = panelLoginCustom.createButton("Register", Fonts.tahoma_bold_20, new Color(255, 255, 255));
		panel.add(loginPanel);
		
		JLabel lb_login_now = new JLabel("Đăng nhập ngay");
		lb_login_now.setForeground(new Color(238, 77, 45));
		lb_login_now.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lb_login_now.setBounds(700, 595, 140, 28);
		lb_login_now.setCursor(new Cursor(12));
		panel.add(lb_login_now);
		
		lb_login_now.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(parentPanel, Frame.login);
			}
		});
		
		return contentPane;
	}
}
