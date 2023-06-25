package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2 extends JFrame {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2 frame = new Test2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Test2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 800);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 400, 800);
		setContentPane(panel);
		JPanel nav = new Navigate();
		panel.add(nav);
		
	}
}
