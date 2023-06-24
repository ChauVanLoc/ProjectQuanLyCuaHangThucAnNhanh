package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Profile extends JPanel {
	private JTextField textFieldFullName;
	private JTextField txtxxx;
	private JTextField textField_1;
	private JTextField txtTrantunguyetgmailcom;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JTextField textFieldCreditCart;

	/**
	 * Create the panel.
	 */
	public Profile() {
		setBounds(0, 0, 1184, 570);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 305, 548);
		add(panel);
		panel.setLayout(null);

		JLabel imgAvatar = new JLabel() {
			@Override
			protected void paintComponent(Graphics g) {
				if (g instanceof Graphics2D) {
					Graphics2D g2d = (Graphics2D) g;
					g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
					Shape shape = new Ellipse2D.Double(0, 0, getWidth(), getHeight());
					g2d.clip(shape);
				}
				super.paintComponent(g);
			}
		};
		ImageIcon juice = new ImageIcon("../FastFoodStoreManager/img/bird.jpg");
		Image imageJuice = juice.getImage();
		Image resizeImageJuice = imageJuice.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon juiceImg = new ImageIcon(resizeImageJuice);
		imgAvatar.setIcon(juiceImg);
		imgAvatar.setBounds(50, 50, 200, 199);
		panel.add(imgAvatar);

		JLabel lblNewLabel = new JLabel("PROFILE");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(0, 0, 305, 50);
		panel.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 250, 305, 298);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("TRẦN TÚ NGUYỆT");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(0, 0, 305, 40);
		panel_2.add(lblNewLabel_1);

		JButton btLogOut = new JButton("Log Out");
		btLogOut.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btLogOut.setBounds(0, 158, 300, 50);
		panel_2.add(btLogOut);

		JButton btDeleteAccount = new JButton("Delete Account");
		btDeleteAccount.setMargin(new Insets(0, 0, 0, 0));
		btDeleteAccount.setForeground(Color.LIGHT_GRAY);
		btDeleteAccount.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btDeleteAccount.setBounds(0, 248, 300, 50);
		panel_2.add(btDeleteAccount);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 42, 305, 105);
		panel_2.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblRankCustomer = new JLabel("Gold Customer");
		lblRankCustomer.setBounds(20, 31, 144, 50);
		lblRankCustomer.setFont(new Font("MingLiU-ExtB", Font.BOLD, 17));
		panel_6.add(lblRankCustomer);

		JLabel imgRankCustomer = new JLabel("img rank");
		imgRankCustomer.setBounds(174, 0, 100, 100);
		panel_6.add(imgRankCustomer);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(325, 11, 849, 548);
		add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(0, 0, 450, 548);
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("INFORMATION");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(0, 0, 450, 50);
		panel_3.add(lblNewLabel_2);

		JLabel lblFullName = new JLabel("Name");
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName.setBounds(10, 75, 150, 30);
		panel_3.add(lblFullName);

		textFieldFullName = new JTextField();
		textFieldFullName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldFullName.setText("Trần Tú Nguyệt");
		textFieldFullName.setBounds(170, 75, 270, 30);
		panel_3.add(textFieldFullName);
		textFieldFullName.setColumns(10);

		JLabel lblFullName_1 = new JLabel("PhoneNumber");
		lblFullName_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_1.setBounds(10, 260, 150, 30);
		panel_3.add(lblFullName_1);

		JLabel lblFullName_2 = new JLabel("Citizen identification");
		lblFullName_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_2.setBounds(10, 300, 160, 30);
		panel_3.add(lblFullName_2);

		JLabel lblFullName_3 = new JLabel("Address");
		lblFullName_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_3.setBounds(10, 340, 150, 30);
		panel_3.add(lblFullName_3);

		txtxxx = new JTextField();
		txtxxx.setText("091494XXX");
		txtxxx.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtxxx.setColumns(10);
		txtxxx.setBounds(170, 260, 270, 30);
		panel_3.add(txtxxx);

		textField_1 = new JTextField();
		textField_1.setText("031 002 034 7895");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(170, 300, 270, 30);
		panel_3.add(textField_1);

		JScrollPane scrollPaneAddress = new JScrollPane();
		scrollPaneAddress.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneAddress.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneAddress.setBounds(170, 340, 270, 152);
		panel_3.add(scrollPaneAddress);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textArea.setLineWrap(true);
		scrollPaneAddress.setViewportView(textArea);

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(170, 116, 70, 23);
		panel_3.add(rdbtnFemale);

		JLabel lblFullName_1_1 = new JLabel("Gender");
		lblFullName_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_1_1.setBounds(10, 116, 150, 30);
		panel_3.add(lblFullName_1_1);

		JLabel lblBirthday = new JLabel("Day Of Birthday");
		lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBirthday.setBounds(10, 159, 150, 30);
		panel_3.add(lblBirthday);

		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(242, 116, 70, 23);
		panel_3.add(rdbtnMale);

		JRadioButton rdbtnOtherGender = new JRadioButton("Other");
		rdbtnOtherGender.setBounds(314, 116, 70, 23);
		panel_3.add(rdbtnOtherGender);

		// Tạo danh sách ngày, tháng, năm
		DefaultListModel<String> dayListModel = new DefaultListModel<>();
		for (int i = 1; i <= 31; i++) {
			dayListModel.addElement(String.valueOf(i));
		}

		DefaultListModel<String> monthListModel = new DefaultListModel<>();
		for (int i = 1; i <= 12; i++) {
			monthListModel.addElement(String.valueOf(i));
		}

		DefaultListModel<String> yearListModel = new DefaultListModel<>();
		for (int i = 1900; i <= 2023; i++) {
			yearListModel.addElement(String.valueOf(i));
		}

		JButton btnSave = new JButton("SAVE");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSave.setBounds(290, 504, 150, 30);
		panel_3.add(btnSave);

		JLabel lblBirthday_1 = new JLabel("Email");
		lblBirthday_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBirthday_1.setBounds(10, 219, 150, 30);
		panel_3.add(lblBirthday_1);

		txtTrantunguyetgmailcom = new JTextField();
		txtTrantunguyetgmailcom.setText("trantunguyet@gmail.com");
		txtTrantunguyetgmailcom.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtTrantunguyetgmailcom.setColumns(10);
		txtTrantunguyetgmailcom.setBounds(170, 219, 270, 30);
		panel_3.add(txtTrantunguyetgmailcom);

		JComboBox comboBoxDay = new JComboBox();
		comboBoxDay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBoxDay.setBounds(170, 150, 70, 40);
		panel_3.add(comboBoxDay);

		JComboBox comboBoxMonth = new JComboBox();
		comboBoxMonth.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBoxMonth.setBounds(242, 150, 70, 40);
		panel_3.add(comboBoxMonth);

		JComboBox comboBoxYear = new JComboBox();
		comboBoxYear.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBoxYear.setBounds(314, 150, 70, 40);
		panel_3.add(comboBoxYear);

		JLabel lblNewLabel_2_1 = new JLabel("ACCOUNT");
		lblNewLabel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(450, 0, 400, 50);
		panel_1.add(lblNewLabel_2_1);

		JLabel lblFullName_4 = new JLabel("Account");
		lblFullName_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_4.setBounds(460, 50, 150, 30);
		panel_1.add(lblFullName_4);

		JLabel lblFullName_5 = new JLabel("Trần Tú Nguyệt");
		lblFullName_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_5.setBounds(650, 50, 150, 30);
		panel_1.add(lblFullName_5);

		JLabel lblFullName_6 = new JLabel("Password");
		lblFullName_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_6.setBounds(460, 90, 150, 30);
		panel_1.add(lblFullName_6);

		passwordField = new JPasswordField();
		passwordField.setBounds(650, 90, 200, 30);
		panel_1.add(passwordField);

		JLabel lblFullName_6_1 = new JLabel("New Password");
		lblFullName_6_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_6_1.setBounds(460, 130, 150, 30);
		panel_1.add(lblFullName_6_1);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(450, 246, 400, 302);
		panel_1.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_2_1_1 = new JLabel("PAYMENT");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2_1_1.setBounds(0, 0, 400, 41);
		panel_4.add(lblNewLabel_2_1_1);

		JLabel lblCard = new JLabel();
		ImageIcon creditCard = new ImageIcon("../FastFoodStoreManager/img/creditCard.jpg");
		Image imageCreditCard = creditCard.getImage();
		Image resizeImageCreditCard = imageCreditCard.getScaledInstance(367, 181, Image.SCALE_SMOOTH);
		ImageIcon creditCardImg = new ImageIcon(resizeImageCreditCard);
		lblCard.setIcon(creditCardImg);
		lblCard.setBounds(10, 43, 367, 181);
		panel_4.add(lblCard);

		JButton btnSave_1_1 = new JButton("SAVE");
		btnSave_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSave_1_1.setBounds(240, 261, 150, 30);
		panel_4.add(btnSave_1_1);

		textFieldCreditCart = new JTextField();
		textFieldCreditCart.setText("091494XXX");
		textFieldCreditCart.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldCreditCart.setColumns(10);
		textFieldCreditCart.setBounds(10, 229, 255, 30);
		panel_4.add(textFieldCreditCart);

		JLabel lblFullName_6_1_1 = new JLabel("Rewrite new password");
		lblFullName_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_6_1_1.setBounds(460, 170, 200, 30);
		panel_1.add(lblFullName_6_1_1);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(650, 131, 200, 30);
		panel_1.add(passwordField_1);

		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(650, 170, 200, 30);
		panel_1.add(passwordField_2);

		JButton btnSave_1 = new JButton("SAVE");
		btnSave_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSave_1.setBounds(699, 211, 150, 30);
		panel_1.add(btnSave_1);

	}
}