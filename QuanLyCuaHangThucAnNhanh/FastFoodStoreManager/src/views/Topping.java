package views;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Topping extends JPanel {

	/**
	 * Create the panel.
	 */
	public Topping() {
		setBounds(0, 0, 900,548);
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(540, 342, 89, 23);
		add(btnNewButton);
		setVisible(true);
	}

}
