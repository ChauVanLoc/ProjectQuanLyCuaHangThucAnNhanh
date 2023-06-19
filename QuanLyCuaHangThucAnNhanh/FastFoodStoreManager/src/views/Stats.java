package views;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Stats extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Stats() {
		setBounds(0, 0, 1184, 570);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);

	}

}
