package views;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Stats extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Stats() {
        setBounds(0, 0, 1184, 570);
        setLayout(new FlowLayout());

        // Tạo một button hình tròn
        CircleButtonExample circleButton = new CircleButtonExample("Click");
        circleButton.setBackground(Color.BLUE);

        add(circleButton);
    }

    public static void main(String[] args) {
        Stats stats = new Stats();
        stats.setVisible(true);
	}

}
