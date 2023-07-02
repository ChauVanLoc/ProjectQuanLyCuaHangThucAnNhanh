package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class ManageBase extends JPanel {
	private JPanel primary_panel;
	private JPanel panel_title;
	private JLabel lb_title;
	private JButton btnNewButton;
	private JButton btn_create;
	private JButton btnCancel;
	private JButton btnDisable;
	private JPanel panel_btn;
	private JPanel panel_change;
	private JPanel content_panel;
	private JRadioButton rdbtnFemale;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnOtherGender;
	private ButtonGroup buttonGroup;
	private JPasswordField jt_name;
	private JPasswordField jt_cccd;
	private JPasswordField jt_phone;
	private JPasswordField jt_email;
	private JComboBox ex_day;
	private JComboBox ex_month;
	private JComboBox ex_year;
	private JComboBox comboBoxType;
	private JComboBox dob_day;
	private JComboBox dob_month;
	private JComboBox dob_year;
	private JTextArea ta_address;

	public ManageBase() {
		setBackground(SystemColor.window);
		setBorder(null);
		setLayout(null);

		primary_panel = new JPanel();
		primary_panel.setBorder(new LineBorder(SystemColor.windowBorder, 1, true));
		primary_panel.setBackground(SystemColor.window);
		primary_panel.setBounds(0, 0, 400, 584);
		add(primary_panel);
		primary_panel.setLayout(null);

		panel_title = new JPanel();
		panel_title.setBounds(0, 0, 400, 50);
		primary_panel.add(panel_title);
		panel_title.setLayout(null);

	}

	public void initTitle() {
		lb_title = new JLabel("Information");
		lb_title.setBounds(140, 0, 260, 50);
		panel_title.add(lb_title);
		lb_title.setBackground(SystemColor.window);
		lb_title.setBorder(null);
		lb_title.setHorizontalTextPosition(SwingConstants.CENTER);
		lb_title.setHorizontalAlignment(SwingConstants.LEFT);
		lb_title.setFont(new Font("Tahoma", Font.BOLD, 20));

		btnNewButton = new JButton("Create");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(10, 8, 110, 35);
		panel_title.add(btnNewButton);
	}

	public void initCreateButton() {
		panel_btn = new JPanel();
		panel_btn.setBackground(SystemColor.window);
		panel_btn.setBounds(0, 474, 400, 110);
		primary_panel.add(panel_btn);
		panel_btn.setLayout(null);

		btn_create = new JButton("Create");
		btn_create.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_create.setForeground(SystemColor.text);
		btn_create.setBackground(SystemColor.desktop);
		btn_create.setBounds(247, 29, 104, 39);
		panel_btn.add(btn_create);
	}

	public void initChangeButton() {
		panel_change = new JPanel();
		panel_change.setBackground(SystemColor.window);
		panel_change.setBounds(0, 474, 400, 110);
		primary_panel.add(panel_change);
		panel_change.setLayout(null);

		btnNewButton = new JButton("Save");
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(266, 27, 98, 33);
		panel_change.add(btnNewButton);

		btnCancel = new JButton("Cancel");
		btnCancel.setForeground(SystemColor.text);
		btnCancel.setBackground(new Color(139, 0, 0));
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBounds(146, 27, 98, 33);
		panel_change.add(btnCancel);

		btnDisable = new JButton("Disable");
		btnDisable.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDisable.setBounds(24, 27, 98, 33);
		panel_change.add(btnDisable);
		
		initContent(true);
		initCreateButton();
	}

	public void initContent(boolean isRead) {
		content_panel = new JPanel();
		content_panel.setBackground(SystemColor.window);
		content_panel.setBounds(0, 50, 400, 428);
		primary_panel.add(content_panel);
		content_panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Type");
		lblNewLabel.setBounds(36, 11, 68, 26);
		content_panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(36, 52, 68, 26);
		content_panel.add(lblName);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 17));

		JLabel lblSex = new JLabel("Sex");
		lblSex.setBounds(36, 134, 68, 26);
		content_panel.add(lblSex);
		lblSex.setFont(new Font("Tahoma", Font.PLAIN, 17));

		JLabel lblCccd = new JLabel("CCCD");
		lblCccd.setBounds(36, 95, 68, 26);
		content_panel.add(lblCccd);
		lblCccd.setFont(new Font("Tahoma", Font.PLAIN, 17));

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(36, 214, 68, 26);
		content_panel.add(lblEmail);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));

		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setBounds(36, 171, 79, 26);
		content_panel.add(lblBirthday);
		lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 17));

		rdbtnFemale = new JRadioButton("FeMale");
		rdbtnFemale.setBounds(128, 137, 86, 23);
		content_panel.add(rdbtnFemale);
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnFemale.setFocusPainted(false);
		rdbtnFemale.setBackground(Color.WHITE);

		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(216, 136, 70, 23);
		content_panel.add(rdbtnMale);
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnMale.setFocusPainted(false);
		rdbtnMale.setBackground(Color.WHITE);

		rdbtnOtherGender = new JRadioButton("Other");
		rdbtnOtherGender.setBounds(288, 136, 80, 23);
		content_panel.add(rdbtnOtherGender);
		buttonGroup.add(rdbtnOtherGender);
		rdbtnOtherGender.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnOtherGender.setFocusPainted(false);
		rdbtnOtherGender.setBackground(Color.WHITE);

		jt_name = new JPasswordField();
		jt_name.setBounds(128, 52, 240, 30);
		content_panel.add(jt_name);

		jt_cccd = new JPasswordField();
		jt_cccd.setBounds(128, 93, 240, 30);
		content_panel.add(jt_cccd);

		comboBoxType = new JComboBox();
		comboBoxType.setBounds(128, 11, 240, 30);
		content_panel.add(comboBoxType);

		dob_day = new JComboBox();
		dob_day.setBounds(128, 172, 57, 30);
		content_panel.add(dob_day);

		dob_month = new JComboBox();
		dob_month.setBounds(206, 172, 57, 30);
		content_panel.add(dob_month);

		dob_year = new JComboBox();
		dob_year.setBounds(290, 172, 78, 30);
		content_panel.add(dob_year);

		jt_email = new JPasswordField();
		jt_email.setBounds(128, 213, 240, 30);
		content_panel.add(jt_email);

		JLabel lblPhone_1 = new JLabel("Phone");
		lblPhone_1.setBounds(36, 256, 68, 26);
		content_panel.add(lblPhone_1);
		lblPhone_1.setFont(new Font("Tahoma", Font.PLAIN, 17));

		jt_phone = new JPasswordField();
		jt_phone.setBounds(128, 255, 240, 30);
		content_panel.add(jt_phone);

		JLabel lblExpire = new JLabel("Expire");
		lblExpire.setBounds(36, 298, 79, 26);
		content_panel.add(lblExpire);
		lblExpire.setFont(new Font("Tahoma", Font.PLAIN, 17));

		ex_day = new JComboBox();
		ex_day.setBounds(128, 299, 57, 30);
		content_panel.add(ex_day);

		ex_month = new JComboBox();
		ex_month.setBounds(206, 299, 57, 30);
		content_panel.add(ex_month);

		ex_year = new JComboBox();
		ex_year.setBounds(290, 299, 78, 30);
		content_panel.add(ex_year);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(36, 342, 79, 26);
		content_panel.add(lblAddress);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 17));

		ta_address = new JTextArea();
		ta_address.setBounds(128, 344, 240, 73);
		content_panel.add(ta_address);
	}

}
