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

public class History extends JPanel {
	private JTable tableHistory;

	public History() {
		setBounds(0, 0, 1230, 619);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(1230, 619);
		panel.setBackground(new Color(0, 128, 128));
		add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.setBounds(0, 135, 1230, 484);
		panel.add(panel_1);
		panel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.setLayout(null);

		String[] columnNames = { "Main dishes", "Quantity", "Topping", "Quantity", "Total cost", "Status" };
		Object[][] data = { { "Tea", 1, "suger", 2, 10.0, "done" }, { "Spaghetti", 2, "beef", 1, 5.0, "pending" },
				{ "burger fish", 1, "fish", 3, 15.0, "deliveirng" } };

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 17));
		scrollPane.setBounds(0, 0, 1230, 484);
		panel_1.add(scrollPane);

		tableHistory = new JTable(data, columnNames);
		tableHistory.setFont(new Font("Tahoma", Font.PLAIN, 17));

		tableHistory.setRowHeight(30);
		scrollPane.setViewportView(tableHistory);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(0, 0, 1230, 134);
		panel.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 236, 236, 236, 236, 236 };
		gbl_panel_2.rowHeights = new int[] { 30, 100 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0 };
		panel_2.setLayout(gbl_panel_2);

		JButton btnAll = new JButton("All");
		btnAll.setForeground(Color.RED);
		btnAll.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_btnAll = new GridBagConstraints();
		gbc_btnAll.fill = GridBagConstraints.BOTH;
		gbc_btnAll.insets = new Insets(0, 0, 5, 5);
		gbc_btnAll.gridx = 0;
		gbc_btnAll.gridy = 0;
		panel_2.add(btnAll, gbc_btnAll);

		JButton btnPaid = new JButton("PAID");
		btnPaid.setForeground(Color.RED);
		btnPaid.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_btnPaid = new GridBagConstraints();
		gbc_btnPaid.fill = GridBagConstraints.BOTH;
		gbc_btnPaid.insets = new Insets(0, 0, 5, 5);
		gbc_btnPaid.gridx = 1;
		gbc_btnPaid.gridy = 0;
		panel_2.add(btnPaid, gbc_btnPaid);

		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setForeground(Color.RED);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.fill = GridBagConstraints.BOTH;
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 2;
		gbc_btnCancel.gridy = 0;
		panel_2.add(btnCancel, gbc_btnCancel);

		JButton btnTotalMoney = new JButton("TOTAL MONEY");
		btnTotalMoney.setForeground(Color.RED);
		btnTotalMoney.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_btnTotalMoney = new GridBagConstraints();
		gbc_btnTotalMoney.fill = GridBagConstraints.BOTH;
		gbc_btnTotalMoney.insets = new Insets(0, 0, 5, 5);
		gbc_btnTotalMoney.gridx = 3;
		gbc_btnTotalMoney.gridy = 0;
		panel_2.add(btnTotalMoney, gbc_btnTotalMoney);

		JButton btnReturnMoney = new JButton("RETURN MONEY");
		btnReturnMoney.setForeground(Color.RED);
		btnReturnMoney.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_btnReturnMoney = new GridBagConstraints();
		gbc_btnReturnMoney.fill = GridBagConstraints.BOTH;
		gbc_btnReturnMoney.insets = new Insets(0, 0, 5, 0);
		gbc_btnReturnMoney.gridx = 4;
		gbc_btnReturnMoney.gridy = 0;
		panel_2.add(btnReturnMoney, gbc_btnReturnMoney);

		JLabel lblAll = new JLabel("115");
		lblAll.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblAll = new GridBagConstraints();
		gbc_lblAll.insets = new Insets(0, 0, 0, 5);
		gbc_lblAll.gridx = 0;
		gbc_lblAll.gridy = 1;
		panel_2.add(lblAll, gbc_lblAll);

		JLabel lblPaid = new JLabel("115");
		lblPaid.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblPaid = new GridBagConstraints();
		gbc_lblPaid.insets = new Insets(0, 0, 0, 5);
		gbc_lblPaid.gridx = 1;
		gbc_lblPaid.gridy = 1;
		panel_2.add(lblPaid, gbc_lblPaid);

		JLabel lblCancel = new JLabel("0");
		lblCancel.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblCancel = new GridBagConstraints();
		gbc_lblCancel.insets = new Insets(0, 0, 0, 5);
		gbc_lblCancel.gridx = 2;
		gbc_lblCancel.gridy = 1;
		panel_2.add(lblCancel, gbc_lblCancel);

		JLabel lblTotalMoney = new JLabel("3.330.000");
		lblTotalMoney.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_lblTotalMoney = new GridBagConstraints();
		gbc_lblTotalMoney.insets = new Insets(0, 0, 0, 5);
		gbc_lblTotalMoney.gridx = 3;
		gbc_lblTotalMoney.gridy = 1;
		panel_2.add(lblTotalMoney, gbc_lblTotalMoney);

		JLabel lblReturnMoney = new JLabel("0");
		lblReturnMoney.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_lblReturnMoney = new GridBagConstraints();
		gbc_lblReturnMoney.gridx = 4;
		gbc_lblReturnMoney.gridy = 1;
		panel_2.add(lblReturnMoney, gbc_lblReturnMoney);

	}
}