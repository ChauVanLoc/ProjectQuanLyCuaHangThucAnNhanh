package views;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.BorderLayout;

public class HomePage extends JFrame {

	private CardLayout cardLayout;
	private JPanel jp_content;
	private JPanel jp_nav;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HomePage() {
		cardLayout = new CardLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1350, 747);
		getContentPane().setLayout(null);

		JPanel primary_panel = new JPanel();
		primary_panel.setBackground(SystemColor.desktop);
		primary_panel.setBounds(0, 77, 1336, 629);
		getContentPane().add(primary_panel);
		primary_panel.setLayout(null);

		JPanel nav_panel = new Navigate();
		nav_panel.setBounds(10, 0, 78, 619);
		primary_panel.add(nav_panel);

		jp_content = new JPanel();
		jp_content.setBounds(98, 0, 1228, 619);
		primary_panel.add(jp_content);
		jp_content.setLayout(cardLayout);

		JPanel content_panel = new Content();
		jp_content.add(content_panel, "Menu");
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.desktop);
		panel.setBounds(0, 0, 1336, 79);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("FAST FOOD STORE");
		lblNewLabel.setBounds(0, 0, 1336, 79);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));

	}
}