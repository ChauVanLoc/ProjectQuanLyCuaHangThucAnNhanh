package views;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class Beverage extends JPanel {

	/**
	 * Create the panel.
	 */
	public Beverage() {
		setBounds(0, 0, 900,548);
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(168, 246, 89, 23);
		add(btnNewButton);
		setVisible(true);
	}

}
