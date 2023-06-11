package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApplication extends JFrame {
    private JPanel cardPanel;
    private CardLayout cardLayout;
    private JButton loginButton;
    private JButton registerButton;

    public SwingApplication() {
        // Thiết lập các thuộc tính cho JFrame
        setTitle("Ứng dụng Java Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Tạo một JPanel chứa CardLayout
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        // Tạo các giao diện login và register
        JPanel loginPanel = createLoginPanel();
        JPanel registerPanel = createRegisterPanel();

        // Thêm các giao diện vào cardPanel
        cardPanel.add(loginPanel, "login");
        cardPanel.add(registerPanel, "register");

        // Tạo nút chuyển đổi giữa giao diện login và register
        loginButton = new JButton("Đăng nhập");
        registerButton = new JButton("Đăng ký");

        // Thiết lập sự kiện ActionListener cho nút chuyển đổi
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "login");
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "register");
            }
        });

        // Tạo một JPanel chứa nút chuyển đổi
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);

        // Thêm các JPanel vào JFrame
        add(cardPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private JPanel createLoginPanel() {
        JPanel loginPanel = new JPanel();
        loginPanel.setBackground(Color.RED);
        JLabel label = new JLabel("Giao diện đăng nhập");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        loginPanel.add(label);
        return loginPanel;
    }

    private JPanel createRegisterPanel() {
        JPanel registerPanel = new JPanel();
        registerPanel.setBackground(Color.BLUE);
        JLabel label = new JLabel("Giao diện đăng ký");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        registerPanel.add(label);
        return registerPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SwingApplication app = new SwingApplication();
            app.setVisible(true);
        });
    }
}








