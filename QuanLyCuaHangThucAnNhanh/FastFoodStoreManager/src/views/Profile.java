package views;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class Profile extends JPanel {

	/**
	 * Create the panel.
	 */
	public Profile() {
		setBounds(0, 0, 1184, 570);
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		add(panel);

	}

}
