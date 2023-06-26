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
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import models.ProductObserver;

import java.awt.Component;

public class History extends JPanel {
	private JTable tableHistory;
	private JTabbedPane tabbedPane;

	public History() {
		setBackground(SystemColor.window);
		setBounds(0, 0, 1228, 619);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Tổng chi tiêu");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(82, 10, 114, 30);
		add(lblNewLabel);

		JLabel lblTngnHng = new JLabel("Tổng đơn hàng");
		lblTngnHng.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTngnHng.setBounds(308, 10, 140, 30);
		add(lblTngnHng);

		JLabel lblnHy = new JLabel("Đã hủy");
		lblnHy.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblnHy.setBounds(879, 50, 108, 30);
		add(lblnHy);

		JLabel lblChVnChuyn = new JLabel("Chờ vận chuyển");
		lblChVnChuyn.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblChVnChuyn.setBounds(570, 50, 140, 30);
		add(lblChVnChuyn);

		JLabel lblThnhCng = new JLabel("Thành công");
		lblThnhCng.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblThnhCng.setBounds(570, 10, 108, 30);
		add(lblThnhCng);

		JLabel lblChThanhTon = new JLabel("Chờ thanh toán");
		lblChThanhTon.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblChThanhTon.setBounds(879, 10, 140, 30);
		add(lblChThanhTon);

		JLabel lblNewLabel_1 = new JLabel("10$");
		lblNewLabel_1.setForeground(new Color(153, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(82, 50, 182, 30);
		add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("10$");
		lblNewLabel_1_1.setForeground(new Color(153, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(308, 50, 182, 30);
		add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("100");
		lblNewLabel_1_2.setForeground(SystemColor.desktop);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(740, 10, 108, 30);
		add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("100");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_1.setBounds(740, 50, 108, 30);
		add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_2_2 = new JLabel("100");
		lblNewLabel_1_2_2.setForeground(new Color(204, 102, 0));
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2.setBounds(1047, 10, 108, 30);
		add(lblNewLabel_1_2_2);

		JLabel lblNewLabel_1_2_2_1 = new JLabel("100");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2_1.setBounds(1047, 50, 108, 30);
		add(lblNewLabel_1_2_2_1);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 15));
		tabbedPane.setAlignmentY(Component.TOP_ALIGNMENT);
		tabbedPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		tabbedPane.setBackground(new Color(153, 204, 204));
		tabbedPane.setBorder(null);
		tabbedPane.setBounds(82, 90, 1059, 507);
		add(tabbedPane);

		JPanel panel_total = new JPanel();
		panel_total.setBackground(SystemColor.window);
		panel_total.setBorder(null);
		panel_total.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabbedPane.add("Total", panel_total);
		tabbedPane.setBackgroundAt(0, new Color(153, 204, 204));
		panel_total.setLayout(null);

		JPanel panel_success = new JPanel();
		panel_success.setBackground(SystemColor.window);
		panel_success.setBorder(null);
		panel_success.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabbedPane.add("Success", panel_success);

		JPanel panel_delivering = new JPanel();
		panel_delivering.setBackground(SystemColor.window);
		panel_delivering.setBorder(null);
		panel_delivering.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabbedPane.add("Delivering", panel_delivering);

		JPanel panel_cancel = new JPanel();
		panel_cancel.setBackground(SystemColor.window);
		panel_cancel.setBorder(null);
		panel_cancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabbedPane.add("Cancel", panel_cancel);

		JPanel panel_waiting_pay = new JPanel();
		panel_waiting_pay.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_waiting_pay.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_waiting_pay.setBackground(SystemColor.window);
		panel_waiting_pay.setBorder(null);
		panel_waiting_pay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabbedPane.add("Pay", panel_waiting_pay);
		panel_waiting_pay.setLayout(null);

		String[][] data = { { "Kundan Kumar Jha", "4031", "CSE" }, { "Anand Jha", "6014", "IT" } };
		String[] columnNames = { "Name", "Roll Number", "Department" };

	}

	public JScrollPane createScrollPane(JPanel panel, List<Object> datas, List<String> columnTitles) {
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);

		JTable table_1 = new JTable();
		scrollPane.setViewportView(table_1);

		return scrollPane;
	}

}