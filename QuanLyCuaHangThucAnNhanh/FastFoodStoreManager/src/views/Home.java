package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Home extends JFrame {

	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private JPanel contentPane;
	private PanelCustom navPanelCustom;
	private PanelCustom contentPanelCustom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, screenSize.width, screenSize.height);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(160, 165, 177));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		navPanelCustom = new PanelCustom(15, 15, 159, 765, 25, new Color(243, 243, 243), new Color(243, 243, 243));
		JPanel nav_panel = navPanelCustom.getP();
		nav_panel.setLayout(null);
		contentPane.add(nav_panel);
		
		JLabel lblNewLabel = new JLabel("🏠 Home");
		lblNewLabel.setBounds(40, 40, 103, 35);
		nav_panel.add(lblNewLabel);
		
		contentPanelCustom = new PanelCustom(200, 15, 1320, 765, 25, new Color(243, 243, 243), new Color(243, 243, 243));
		JPanel content_panel = contentPanelCustom.getP();
		contentPane.add(content_panel);
		
	}
}
