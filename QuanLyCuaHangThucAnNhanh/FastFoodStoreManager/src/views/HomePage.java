package views;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

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
		setTitle("Fast Food Store");
		setResizable(false);
		cardLayout = new CardLayout();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1350, 743);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JPanel primary_panel = new JPanel();
		primary_panel.setBackground(SystemColor.desktop);
		primary_panel.setBounds(0, 77, 1336, 633);
		getContentPane().add(primary_panel);
		primary_panel.setLayout(null);

		jp_content = new JPanel();
		jp_content.setBounds(98, 0, 1228, 619);
		primary_panel.add(jp_content);
		jp_content.setLayout(cardLayout);
		
		JPanel nav_panel = new Navigate(jp_content, cardLayout);
		nav_panel.setBounds(10, 0, 78, 619);
		primary_panel.add(nav_panel);

		JPanel content_panel = new Content();
		jp_content.add(content_panel, "Menu");
		
		JPanel history_panel = new History();
		jp_content.add(history_panel, "History");
		
		JPanel profile_panel = new Profile();
		jp_content.add(profile_panel, "Profile");
		
		cardLayout.show(jp_content, "Menu");
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.desktop);
		panel.setBounds(0, 0, 1336, 79);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("FAST FOOD STORE");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(0, 0, 1336, 79);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(SystemColor.desktop);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));

	}
}