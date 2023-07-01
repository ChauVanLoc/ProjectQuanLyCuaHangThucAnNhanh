package views;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class RadioButtonExample extends JFrame {
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;
	private JRadioButton radioButton3;
	private ButtonGroup buttonGroup;

	public RadioButtonExample() {
		setTitle("Radio Button Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		radioButton1 = new JRadioButton("Option 1");
		radioButton2 = new JRadioButton("Option 2");
		radioButton3 = new JRadioButton("Option 3");

		buttonGroup = new ButtonGroup();
		buttonGroup.add(radioButton1);
		buttonGroup.add(radioButton2);
		buttonGroup.add(radioButton3);

		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton selectedRadioButton = getSelectedRadioButton();
				if (selectedRadioButton != null) {
					String selectedText = selectedRadioButton.getText();
					System.out.println("Selected radio button: " + selectedText);
				} else {
					System.out.println("No radio button selected.");
				}
			}
		});

		add(radioButton1);
		add(radioButton2);
		add(radioButton3);
		add(submitButton);

		pack();
		setVisible(true);
	}

	private JRadioButton getSelectedRadioButton(ButtonGroup buttonGroup) {
		ButtonModel selectedModel = buttonGroup.getSelection();
		if (selectedModel != null) {
			for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
				JRadioButton radioButton = (JRadioButton) buttons.nextElement();
				if (radioButton.getModel() == selectedModel) {
					return radioButton;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new RadioButtonExample();
			}
		});
	}
}
