package views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
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
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import constant.Sex;
import models.PersonObserver;

public class Profile extends JPanel {
	private JTextField textFieldFullName;
	private JTextField jt_phone;
	private JTextField jt_cccd;
	private JTextField jt_email;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private JLabel lb_avatar;
	private JButton btnChangeImage;
	private JRadioButton rdbtnFemale;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnOtherGender;

	private String full_name;
	private String email;
	private String cccd;
	private String phone;
	private Date dob;

	/**
	 * Create the panel.
	 */
	public Profile(PersonObserver personObserver) {
		setBackground(SystemColor.window);
		setBounds(0, 0, 1228, 619);
		setLayout(null);
		ImageIcon juice = new ImageIcon("../FastFoodStoreManager/img/avatar.png");
		Image imageJuice = juice.getImage();
		Image resizeImageJuice = imageJuice.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon juiceImg = new ImageIcon(resizeImageJuice);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlightText);
		panel_1.setBounds(0, 0, 1228, 619);
		add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel_3.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_3.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_3.setBackground(SystemColor.window);
		panel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(0, 0, 718, 619);
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("INFORMATION");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(0, 0, 718, 50);
		panel_3.add(lblNewLabel_2);

		JLabel lblFullName = new JLabel("Name");
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName.setBounds(253, 70, 150, 30);
		panel_3.add(lblFullName);

		textFieldFullName = new JTextField();
		textFieldFullName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldFullName.setText(personObserver.getPerson().getName());
		textFieldFullName.setBounds(413, 70, 270, 30);
		panel_3.add(textFieldFullName);
		textFieldFullName.setColumns(10);

		JLabel lblFullName_1 = new JLabel("PhoneNumber");
		lblFullName_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_1.setBounds(253, 264, 150, 30);
		panel_3.add(lblFullName_1);

		JLabel lblFullName_2 = new JLabel("CCCD");
		lblFullName_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_2.setBounds(253, 314, 160, 30);
		panel_3.add(lblFullName_2);

		JLabel lblFullName_3 = new JLabel("Address");
		lblFullName_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_3.setBounds(253, 369, 150, 30);
		panel_3.add(lblFullName_3);

		jt_phone = new JTextField();
		jt_phone.setText(personObserver.getPerson().getPhone());
		jt_phone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jt_phone.setColumns(10);
		jt_phone.setBounds(413, 264, 270, 30);
		panel_3.add(jt_phone);

		jt_cccd = new JTextField();
		jt_cccd.setText(personObserver.getPerson().getCccd() != null ? personObserver.getPerson().getCccd() : "");
		jt_cccd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jt_cccd.setColumns(10);
		jt_cccd.setBounds(413, 314, 270, 30);
		panel_3.add(jt_cccd);

		JScrollPane scrollPaneAddress = new JScrollPane();
		scrollPaneAddress.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneAddress.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneAddress.setBounds(413, 369, 270, 152);
		panel_3.add(scrollPaneAddress);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textArea.setLineWrap(true);
		scrollPaneAddress.setViewportView(textArea);
		textArea.setText(
				personObserver.getPerson().getAddress() != null ? personObserver.getPerson().getAddress().toString()
						: "");

		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFocusPainted(false);
		rdbtnFemale.setBackground(SystemColor.window);
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnFemale.setBounds(413, 118, 86, 23);
		panel_3.add(rdbtnFemale);

		JLabel lblFullName_1_1 = new JLabel("Gender");
		lblFullName_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_1_1.setBounds(253, 118, 150, 30);
		panel_3.add(lblFullName_1_1);

		JLabel lblBirthday = new JLabel("Day Of Birthday");
		lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBirthday.setBounds(253, 158, 150, 30);
		panel_3.add(lblBirthday);

		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFocusPainted(false);
		rdbtnMale.setBackground(SystemColor.window);
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnMale.setBounds(501, 118, 70, 23);
		panel_3.add(rdbtnMale);

		rdbtnOtherGender = new JRadioButton("Other");
		rdbtnOtherGender.setFocusPainted(false);
		rdbtnOtherGender.setBackground(SystemColor.window);
		rdbtnOtherGender.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnOtherGender.setBounds(573, 118, 80, 23);
		panel_3.add(rdbtnOtherGender);

		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnFemale);
		group.add(rdbtnMale);
		group.add(rdbtnOtherGender);

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

		JButton btnSave = new JButton("Save");
		btnSave.setEnabled(false);
		btnSave.setForeground(SystemColor.text);
		btnSave.setBackground(SystemColor.desktop);
		btnSave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSave.setBounds(533, 556, 150, 30);
		panel_3.add(btnSave);

		JLabel lblBirthday_1 = new JLabel("Email");
		lblBirthday_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBirthday_1.setBounds(253, 214, 150, 30);
		panel_3.add(lblBirthday_1);

		jt_email = new JTextField();
		jt_email.setText(personObserver.getPerson().getAccount().getEmail());
		jt_email.setFont(new Font("Tahoma", Font.PLAIN, 17));
		jt_email.setColumns(10);
		jt_email.setBounds(413, 214, 270, 30);
		panel_3.add(jt_email);

		JComboBox comboBoxDay = new JComboBox();
		comboBoxDay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBoxDay.setBounds(413, 159, 70, 30);
		panel_3.add(comboBoxDay);

		JComboBox comboBoxMonth = new JComboBox();
		comboBoxMonth.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBoxMonth.setBounds(501, 158, 70, 30);
		panel_3.add(comboBoxMonth);

		JComboBox comboBoxYear = new JComboBox();
		comboBoxYear.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBoxYear.setBounds(593, 158, 70, 30);
		panel_3.add(comboBoxYear);

		lb_avatar = new JLabel();
		lb_avatar.setIcon(Helper.getImageIconScale("../FastFoodStoreManager/img/avatar.png", 174, 174));
		lb_avatar.setBounds(31, 70, 174, 174);
		panel_3.add(lb_avatar);

		btnChangeImage = new JButton("Change Image");
		btnChangeImage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnChangeImage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChangeImage.setBounds(31, 282, 174, 30);
		panel_3.add(btnChangeImage);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancel.setEnabled(false);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBackground(new Color(128, 0, 0));
		btnCancel.setBounds(356, 556, 150, 30);
		panel_3.add(btnCancel);
		btnChangeImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showFileChooser();
			}
		});

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(SystemColor.window);
		panel_4.setBounds(717, 294, 511, 325);
		panel_1.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_2_1_1 = new JLabel("PAYMENT");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2_1_1.setBounds(0, 0, 511, 41);
		panel_4.add(lblNewLabel_2_1_1);
		ImageIcon creditCard = new ImageIcon("../FastFoodStoreManager/img/creditCard.jpg");
		Image imageCreditCard = creditCard.getImage();
		Image resizeImageCreditCard = imageCreditCard.getScaledInstance(367, 181, Image.SCALE_SMOOTH);
		ImageIcon creditCardImg = new ImageIcon(resizeImageCreditCard);

		JLabel lblFullName_6_2 = new JLabel("Amount");
		lblFullName_6_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_6_2.setBounds(47, 73, 150, 30);
		panel_4.add(lblFullName_6_2);

		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(246, 73, 200, 30);
		panel_4.add(passwordField_3);

		JButton btnSave_1_1 = new JButton("Save");
		btnSave_1_1.setEnabled(false);
		btnSave_1_1.setForeground(SystemColor.text);
		btnSave_1_1.setBackground(SystemColor.desktop);
		btnSave_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSave_1_1.setBounds(264, 170, 150, 30);
		panel_4.add(btnSave_1_1);
		btnSave_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(SystemColor.window);
		panel.setBounds(717, 0, 511, 294);
		panel_1.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2_1 = new JLabel("PASSWORD");
		lblNewLabel_2_1.setBounds(0, 0, 511, 50);
		panel.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));

		JLabel lblFullName_6 = new JLabel("Password");
		lblFullName_6.setBounds(44, 67, 150, 30);
		panel.add(lblFullName_6);
		lblFullName_6.setFont(new Font("Tahoma", Font.PLAIN, 17));

		passwordField = new JPasswordField();
		passwordField.setBounds(243, 67, 200, 30);
		panel.add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(243, 122, 200, 30);
		panel.add(passwordField_1);

		JLabel lblFullName_6_1 = new JLabel("New Password");
		lblFullName_6_1.setBounds(44, 121, 150, 30);
		panel.add(lblFullName_6_1);
		lblFullName_6_1.setFont(new Font("Tahoma", Font.PLAIN, 17));

		JLabel lblFullName_6_1_1 = new JLabel("Confirm New Password");
		lblFullName_6_1_1.setBounds(44, 179, 200, 30);
		panel.add(lblFullName_6_1_1);
		lblFullName_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));

		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(243, 179, 200, 30);
		panel.add(passwordField_2);

		JButton btnSave_1 = new JButton("Save");
		btnSave_1.setEnabled(false);
		btnSave_1.setBackground(SystemColor.desktop);
		btnSave_1.setForeground(SystemColor.text);
		btnSave_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSave_1.setBounds(293, 235, 150, 30);
		panel.add(btnSave_1);
		btnSave_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		selectedSex(personObserver.getPerson().getSex() != null ? personObserver.getPerson().getSex() : "");

	}

	public void showFileChooser() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "gif"));

		int result = fileChooser.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();
			if (selectedFile != null) {
				try {
					// Đọc file ảnh và lấy kích thước
					Image image = ImageIO.read(selectedFile);
					int width = image.getWidth(null);
					int height = image.getHeight(null);

					// Tạo ảnh mới chỉ lấy nửa trái
					Image leftHalfImage = image.getScaledInstance(width / 2, height, Image.SCALE_SMOOTH);

					ImageIcon icon = new ImageIcon(leftHalfImage);
					lb_avatar.setIcon(Helper.getImageIconScale(selectedFile.getAbsolutePath(), 200, 200));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	public void selectedSex(String sex) {
		if (sex.equals(Sex.FEMALE)) {
			rdbtnFemale.setSelected(true);
		} else if (sex.equals(Sex.MALE)) {
			rdbtnMale.setSelected(true);
		} else {
			rdbtnOtherGender.setSelected(true);
		}
	}
}