package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class History extends JPanel {
	private JTable tableHistory;
	private JTable table;

	public History() {
		setBounds(0, 0, 1228, 619);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tổng chi tiêu");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(82, 22, 114, 30);
		add(lblNewLabel);
		
		JLabel lblTngnHng = new JLabel("Tổng đơn hàng");
		lblTngnHng.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTngnHng.setBounds(308, 22, 140, 30);
		add(lblTngnHng);
		
		JLabel lblnHy = new JLabel("Đã hủy");
		lblnHy.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblnHy.setBounds(879, 62, 108, 30);
		add(lblnHy);
		
		JLabel lblChVnChuyn = new JLabel("Chờ vận chuyển");
		lblChVnChuyn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblChVnChuyn.setBounds(570, 62, 140, 30);
		add(lblChVnChuyn);
		
		JLabel lblThnhCng = new JLabel("Thành công");
		lblThnhCng.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblThnhCng.setBounds(570, 22, 108, 30);
		add(lblThnhCng);
		
		JLabel lblChThanhTon = new JLabel("Chờ thanh toán");
		lblChThanhTon.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblChThanhTon.setBounds(879, 22, 140, 30);
		add(lblChThanhTon);
		
		JLabel lblNewLabel_1 = new JLabel("10$");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(82, 62, 182, 30);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("10$");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(308, 62, 182, 30);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("100");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(729, 22, 108, 30);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("100");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_1.setBounds(729, 62, 108, 30);
		add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("100");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2.setBounds(1028, 22, 108, 30);
		add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("100");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2_1.setBounds(1028, 62, 108, 30);
		add(lblNewLabel_1_2_2_1);
		
		JButton btnNewButton = new JButton("Tất cả");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(82, 114, 114, 30);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Chờ vận chuyển");
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(194, 114, 160, 30);
		add(btnNewButton_1);
		
		JButton btnThnhCng = new JButton("Thành công");
		btnThnhCng.setFocusPainted(false);
		btnThnhCng.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnThnhCng.setBounds(348, 114, 136, 30);
		add(btnThnhCng);
		
		JButton btnHy = new JButton("Đã hủy");
		btnHy.setFocusPainted(false);
		btnHy.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnHy.setBounds(482, 114, 114, 30);
		add(btnHy);
		
		String[][] data = {
				{ "Kundan Kumar Jha", "4031", "CSE" },
				{ "Anand Jha", "6014", "IT" }
		};
		// Column Names
		String[] columnNames = { "Name", "Roll Number", "Department" };
		table = new JTable(data, columnNames);
		table.setBounds(82, 341, 1054, -169);
		add(table);
		

		
	}
}