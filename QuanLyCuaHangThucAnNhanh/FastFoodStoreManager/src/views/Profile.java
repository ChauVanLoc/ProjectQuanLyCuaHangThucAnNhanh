package views;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JPasswordField;

public class Profile extends JPanel {
	private JTextField textFieldFullName;
	private JTextField txtxxx;
	private JTextField textField_1;
	private JTextField txtTrantunguyetgmailcom;
	
    private JList<String> listDay;
    private JList<String> listMonth;
    private JList<String> listYear;
    private JPasswordField passwordField;

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
		imgAvatar.setBounds(50, 50, 200, 200);
		panel.add(imgAvatar);
		
		JLabel lblNewLabel = new JLabel("PROFILE");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(0, 0, 305, 50);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 260, 305, 288);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("TRẦN TÚ NGUYỆT");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(0, 0, 305, 40);
		panel_2.add(lblNewLabel_1);
		
		JButton btOrdered = new JButton("Order");
		btOrdered.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btOrdered.setBounds(0, 50, 300, 50);
		panel_2.add(btOrdered);
		
		JButton btLogOut = new JButton("Log Out");
		btLogOut.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btLogOut.setBounds(0, 123, 300, 50);
		panel_2.add(btLogOut);
		
		JButton btDeleteAccount = new JButton("Delete Account");
		btDeleteAccount.setMargin(new Insets(0, 0, 0, 0));
		btDeleteAccount.setForeground(Color.LIGHT_GRAY);
		btDeleteAccount.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btDeleteAccount.setBounds(0, 227, 300, 50);
		panel_2.add(btDeleteAccount);
		
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
		
		JScrollPane scrollPaneListDay = new JScrollPane();
		scrollPaneListDay.setFont(new Font("Tahoma", Font.PLAIN, 17));
		scrollPaneListDay.setBounds(170, 150, 70, 50);
		panel_3.add(scrollPaneListDay);
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 17));
		scrollPaneListDay.setViewportView(list);
		
		JLabel lblNewLabel_3 = new JLabel("Day");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		scrollPaneListDay.setColumnHeaderView(lblNewLabel_3);
		
		JScrollPane scrollPaneListMonth = new JScrollPane();
		scrollPaneListMonth.setBounds(242, 151, 70, 50);
		panel_3.add(scrollPaneListMonth);
		
		JList list_1 = new JList();
		scrollPaneListMonth.setViewportView(list_1);
		
		JLabel lblNewLabel_4 = new JLabel("Month");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPaneListMonth.setColumnHeaderView(lblNewLabel_4);
		
		JScrollPane scrollPaneListYear = new JScrollPane();
		scrollPaneListYear.setBounds(314, 151, 70, 50);
		panel_3.add(scrollPaneListYear);
		
		JList list_2 = new JList();
		scrollPaneListYear.setViewportView(list_2);
		
		JLabel lblNewLabel_5 = new JLabel("Year");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		scrollPaneListYear.setColumnHeaderView(lblNewLabel_5);
		
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
        
        // Tạo JList và gán danh sách cho từng JList
        listDay = new JList<>(dayListModel);
        listMonth = new JList<>(monthListModel);
        listYear = new JList<>(yearListModel);
        
        // Gán JList cho scroll pane tương ứng
        scrollPaneListDay.setViewportView(listDay);
        scrollPaneListMonth.setViewportView(listMonth);
        scrollPaneListYear.setViewportView(listYear);
		
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
		
		JLabel lblNewLabel_2_1 = new JLabel("ACCOUNT");
		lblNewLabel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(450, 0, 400, 50);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblFullName_4 = new JLabel("Account");
		lblFullName_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_4.setBounds(460, 72, 150, 30);
		panel_1.add(lblFullName_4);
		
		JLabel lblFullName_5 = new JLabel("Trần Tú Nguyệt");
		lblFullName_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_5.setBounds(689, 72, 150, 30);
		panel_1.add(lblFullName_5);
		
		JLabel lblFullName_6 = new JLabel("Password");
		lblFullName_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_6.setBounds(460, 135, 150, 30);
		panel_1.add(lblFullName_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(689, 135, 150, 30);
		panel_1.add(passwordField);
		
		JLabel lblFullName_6_1 = new JLabel("Create Date");
		lblFullName_6_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_6_1.setBounds(460, 194, 150, 30);
		panel_1.add(lblFullName_6_1);
		
		JLabel lblFullName_6_1_1 = new JLabel("01/02/2023");
		lblFullName_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFullName_6_1_1.setBounds(689, 194, 150, 30);
		panel_1.add(lblFullName_6_1_1);

	}
}
