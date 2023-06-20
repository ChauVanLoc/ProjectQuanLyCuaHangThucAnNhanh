package views;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.Rectangle;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class History extends JPanel {
	private JTable tableHistory;

	/**
	 * Create the panel.
	 */
	public History() {
		setBounds(0, 0, 1184, 570);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(1184, 570);
		panel.setBackground(new Color(0, 128, 128));
		add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.setBounds(0, 40, 1184, 530);
		panel.add(panel_1);
		panel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.setLayout(null);

		// Tạo dữ liệu mẫu cho JTable
		String[] columnNames = { "Main dishes", "Quantity", "Topping", "Quantity", "Total cost", "Status" };
		Object[][] data = { { "Tea", 1, "suger", 2, 10.0, "done" }, { "Spaghetti", 2, "beef", 1, 5.0, "pending" },
				{ "burger fish", 1, "fish", 3, 15.0, "deliveirng" } };

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 17));
		scrollPane.setBounds(5, 0, 1179, 525);
		panel_1.add(scrollPane);

		tableHistory = new JTable(data, columnNames);
		tableHistory.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
        // Đặt chiều cao cho mỗi dòng là 30px
        tableHistory.setRowHeight(30);
		scrollPane.setViewportView(tableHistory);
		
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(0, 0, 902, 40);
				panel.add(panel_2);
				panel_2.setLayout(null);
				
						JButton btnAll = new JButton("All");
						btnAll.setBounds(0, 0, 150, 40);
						btnAll.setMargin(new Insets(0, 0, 0, 0));
						btnAll.setFont(new Font("Tahoma", Font.BOLD, 20));
						btnAll.setActionCommand("");
						panel_2.add(btnAll);
						
								JButton btnPaid = new JButton("Paid");
								btnPaid.setMargin(new Insets(0, 0, 0, 0));
								btnPaid.setFont(new Font("Tahoma", Font.BOLD, 20));
								btnPaid.setActionCommand("");
								btnPaid.setBounds(151, 0, 150, 40);
								panel_2.add(btnPaid);
								
										JButton btnPending = new JButton("Pending");
										btnPending.setMargin(new Insets(0, 0, 0, 0));
										btnPending.setFont(new Font("Tahoma", Font.BOLD, 20));
										btnPending.setActionCommand("");
										btnPending.setBounds(300, 0, 150, 40);
										panel_2.add(btnPending);
										
												JButton btnDelivering = new JButton("Delivering");
												btnDelivering.setMargin(new Insets(0, 0, 0, 0));
												btnDelivering.setFont(new Font("Tahoma", Font.BOLD, 20));
												btnDelivering.setActionCommand("");
												btnDelivering.setBounds(450, 0, 150, 40);
												panel_2.add(btnDelivering);
												
														JButton btnDone = new JButton("Done");
														btnDone.setFont(new Font("Tahoma", Font.BOLD, 20));
														btnDone.setActionCommand("");
														btnDone.setBounds(600, 0, 150, 40);
														panel_2.add(btnDone);
														
																JButton btnCancel = new JButton("Cancel");
																btnCancel.setMargin(new Insets(0, 0, 0, 0));
																btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
																btnCancel.setActionCommand("");
																btnCancel.setBounds(750, 0, 150, 40);
																panel_2.add(btnCancel);

	}
}
