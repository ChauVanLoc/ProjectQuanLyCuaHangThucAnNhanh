package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RegisterForm extends JFrame {

	private JPanel contentPane;
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private JTextField tf_pass;
	private JTextField tf_email;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		int width = this.screenSize.width;
		int height = this.screenSize.height;
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
				graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint background
			}
		};
		panel.setOpaque(false);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(this.screenSize.width * 1 / 4, this.screenSize.height * 1 / 8, this.screenSize.width * 2 / 4,
				this.screenSize.height * 6 / 8);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(286, 37, 187, 53);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(81, 141, 82, 31);
		panel.add(lblNewLabel_2);

		JPanel panel_email = new PanelCustom(15, 15, new Color(255, 255, 255), new Color(223, 228, 234)).getP();
		panel_email.setBounds(81, 192, 606, 59);
		panel.add(panel_email);
		panel_email.setOpaque(false);

		tf_email = new JTextField();
		tf_email.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_email.setColumns(10);
		tf_email.setBorder(null);
		tf_email.setBounds(81 + 20, 192 + 5, 606 - 40, 59 - 10);
		panel.add(tf_email);

		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(81, 259 + 20, 119, 31);
		panel.add(lblNewLabel_2_1);

		JPanel panel_pass = new PanelCustom(15, 15, new Color(255, 255, 255), new Color(223, 228, 234)).getP();
		panel_pass.setBounds(81, 308 + 20, 606, 59);
		panel.add(panel_pass);
		panel_pass.setOpaque(false);

		tf_pass = new JTextField();
		tf_pass.setBorder(null);
		tf_pass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_pass.setBounds(81 + 20, 308 + 5 + 20, 606 - 40, 59 - 10);
		panel.add(tf_pass);
		tf_pass.setColumns(10);

		JLabel lblNewLabel_2_1_1 = new JLabel("Forgot password?");
		lblNewLabel_2_1_1.setForeground(new Color(112, 161, 255));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblNewLabel_2_1_1.setBounds(524, 392, 187, 31);
		panel.add(lblNewLabel_2_1_1);

		JPanel panel_login = new PanelCustom(15, 15, new Color(112, 161, 255), new Color(223, 228, 234)).getP();
		panel_login.setBounds(81, 474 - 10 - 10 - 10, 606, 59);
		panel_login.setOpaque(false);
		panel_login.setLayout(null);
		panel.add(panel_login);

		JButton btn_login = new JButton("Login now");
		btn_login.setBorder(null);
		btn_login.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_login.setForeground(new Color(255, 255, 255));
		btn_login.setBackground(new Color(112, 161, 255));
		btn_login.setFocusPainted(false);
		btn_login.setBounds(81 + 20, 474 - 5 - 10 - 10, 606 - 40, 59 - 10);
		panel.add(btn_login);

		JLabel lblNewLabel_3 = new JLabel("Bạn chưa có tài khoản?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(223, 518, 199, 28);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Đăng ký ngay");
		lblNewLabel_3_1.setForeground(new Color(238, 77, 45));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(422, 518, 130, 28);
		panel.add(lblNewLabel_3_1);
	}

}
