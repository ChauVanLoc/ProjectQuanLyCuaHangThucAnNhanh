package views;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class Content extends JPanel {

	private Food panelFood;
	private JButton btn_food;
	private JButton btn_beverage;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JLabel lblNewLabel_3;
	private JScrollPane scrollPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Content frame = new Content();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Content() {
		setBackground(SystemColor.desktop);
		setBounds(0, 0, 1230, 619);
		setLayout(null);
		
		btn_food = new JButton("Food");
		btn_food.setFocusPainted(false);
		btn_food.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_food.setBounds(0, 0, 127, 32);
		add(btn_food);
		
		btn_beverage = new JButton("Beverage");
		btn_beverage.setFocusPainted(false);
		btn_beverage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_beverage.setBounds(126, 0, 127, 32);
		add(btn_beverage);
		
		Food food = new Food();
		food.setBounds(0, 32, 885, 585);
		add(food);
		
		lblNewLabel = new JLabel("Decorate");
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setBackground(SystemColor.textText);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(537, 0, 347, 30);
		add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.controlLtHighlight);
		panel.setBounds(894, 0, 336, 619);
		add(panel);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Order Information");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(0, 10, 336, 42);
		panel.add(lblNewLabel_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 55, 336, 447);
		panel.add(scrollPane);
		
		panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		
		lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(24, 519, 66, 27);
		panel.add(lblNewLabel_2);
		
		btnNewButton = new JButton("Pay");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(24, 556, 286, 42);
		panel.add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("10$");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(135, 519, 146, 27);
		panel.add(lblNewLabel_3);
	}
}