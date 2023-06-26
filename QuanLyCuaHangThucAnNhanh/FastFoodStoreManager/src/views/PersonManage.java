package views;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;

public class PersonManage extends JPanel {

	/**
	 * Create the panel.
	 */
	public PersonManage() {
		setBorder(null);
		setBackground(SystemColor.desktop);
		setBounds(0, 0, 1228, 619);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(SystemColor.window);
		tabbedPane.setBounds(0, 0, 1228, 619);
		add(tabbedPane);
		
		JPanel jp_customer = new JPanel();
		jp_customer.setBackground(SystemColor.window);
		jp_customer.setBorder(null);
		tabbedPane.add(jp_customer, "Customer");
		
		JPanel jp_employee = new JPanel();
		jp_employee.setBackground(SystemColor.window);
		jp_employee.setBorder(null);
		tabbedPane.add(jp_employee, "Employee");
		
	}

}
