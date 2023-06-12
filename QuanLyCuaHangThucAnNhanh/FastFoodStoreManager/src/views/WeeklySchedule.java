package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeeklySchedule {
    private JFrame frame;
    private JPanel panel;
    private JButton[][] scheduleButtons;

    public WeeklySchedule() {
        frame = new JFrame("Weekly Schedule");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        panel = new JPanel(new GridLayout(8, 4));
        scheduleButtons = new JButton[7][3];

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

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
                panel.add(scheduleButtons[row][col]);

                final int currentRow = row;
                final int currentCol = col;

                // Add action listener to each button
                scheduleButtons[row][col].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String shift = "Shift " + (currentCol + 1);
                        String day = daysOfWeek[currentRow];
                        JOptionPane.showMessageDialog(frame, "Selected: " + shift + ", " + day);
                    }
                });
            }
        }

        frame.getContentPane().add(panel);
    }

    public void display() {
        frame.setVisible(true);
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
