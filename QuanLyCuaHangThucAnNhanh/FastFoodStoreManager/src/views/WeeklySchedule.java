package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class WeeklySchedule {
	private JFrame frame;
	private JPanel panel;
	private JButton[][] scheduleButtons;
	private JButton registerButton;
	private JButton saveButton;
	private boolean isRegisterMode;

	// Store the registered employees for each shift
	private List<String>[][] registeredEmployees;

	public WeeklySchedule() {
		frame = new JFrame("Weekly Schedule");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);

		panel = new JPanel(new GridLayout(8, 4));
		scheduleButtons = new JButton[7][3];
		registerButton = new JButton("Đăng kí");
		saveButton = new JButton("Lưu");
		isRegisterMode = true;

		String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		registeredEmployees = new List[7][3];

		// Initialize the registeredEmployees list
		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 3; col++) {
				registeredEmployees[row][col] = new ArrayList<>();
			}
		}

		// Create header row
		for (int i = 0; i < 4; i++) {
			if (i == 0) {
				panel.add(new JLabel(""));
			} else {
				panel.add(new JLabel("Shift " + i));
			}
		}

		// Create schedule grid
		for (int row = 0; row < 7; row++) {
			panel.add(new JLabel(daysOfWeek[row]));

			for (int col = 0; col < 3; col++) {
				scheduleButtons[row][col] = new JButton();
				scheduleButtons[row][col].setPreferredSize(new Dimension(100, 60));
				scheduleButtons[row][col].setFont(new Font("Arial", Font.PLAIN, 12));
				scheduleButtons[row][col].setHorizontalAlignment(SwingConstants.LEFT);
				panel.add(scheduleButtons[row][col]);

				final int currentRow = row;
				final int currentCol = col;

				// Add action listener to each button
				scheduleButtons[row][col].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if (isRegisterMode) {
							String shift = "Shift " + (currentCol + 1);
							String day = daysOfWeek[currentRow];

							if (registeredEmployees[currentRow][currentCol].size() >= 3) {
								JOptionPane.showMessageDialog(frame, "Ca làm đã đủ người đăng kí!");
							} else {
								String employeeName = JOptionPane.showInputDialog(frame, "Nhập tên nhân viên:");
								registeredEmployees[currentRow][currentCol].add(employeeName);
								updateButtonLabel(currentRow, currentCol);
							}
						} else {
							registeredEmployees[currentRow][currentCol].clear();
							updateButtonLabel(currentRow, currentCol);
						}
					}
				});
			}
		}

		// Register button
		registerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isRegisterMode = true;
				setButtonState(true);
			}
		});

		// Save button
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isRegisterMode = false;
				setButtonState(false);
			}
		});

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(registerButton);
		buttonPanel.add(saveButton);

		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
	}

	public void display() {
		frame.setVisible(true);
	}

	private void setButtonState(boolean enabled) {
		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 3; col++) {
				scheduleButtons[row][col].setEnabled(enabled);
			}
		}
	}

	private void updateButtonLabel(int row, int col) {
		List<String> employees = registeredEmployees[row][col];
		if (employees.isEmpty()) {
			scheduleButtons[row][col].setText("");
		} else if (employees.size() <= 3) {
			StringBuilder label = new StringBuilder();
			for (String employee : employees) {
				label.append(employee).append("<br>");
			}
			scheduleButtons[row][col].setText("<html><body>" + label.toString() + "</body></html>");
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				WeeklySchedule schedule = new WeeklySchedule();
				schedule.display();
			}
		});
	}
}
