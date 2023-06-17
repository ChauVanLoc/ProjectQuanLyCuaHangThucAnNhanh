package views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.Icon;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;

public class HomePage extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HomePage frame = new HomePage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public HomePage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1219, 697);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(173, 255, 47));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(173, 255, 47));
        panel.setBounds(113, 56, 1063, 546);
        contentPane.add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 34, 539, 270);
        panel.add(panel_1);
        panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        
        // Thêm ảnh vào panel_4
        ImageIcon imageIcon = new ImageIcon("F:/Github/ProjectQuanLyCuaHangThucAnNhanh/QuanLyCuaHangThucAnNhanh/FastFoodStoreManager/img/buger.png");
        Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon resizedImageIcon = new ImageIcon(image);
        
        

        JPanel panel_2 = new JPanel();
        FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
        flowLayout.setAlignment(FlowLayout.LEFT);
        panel_2.setBounds(10, 358, 539, 177);
        panel.add(panel_2);
        
        JPanel panel_4_14 = new JPanel();
        panel_2.add(panel_4_14);
        GridBagLayout gbl_panel_4_14 = new GridBagLayout();
        gbl_panel_4_14.columnWidths = new int[]{50, 0};
        gbl_panel_4_14.rowHeights = new int[]{100, 10, 10, 10, 0};
        gbl_panel_4_14.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_14.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_14.setLayout(gbl_panel_4_14);
        
        JLabel imageLabel_14 = new JLabel((Icon) null);
        imageLabel_14.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_14 = new GridBagConstraints();
        gbc_imageLabel_14.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_14.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_14.gridx = 0;
        gbc_imageLabel_14.gridy = 0;
        panel_4_14.add(imageLabel_14, gbc_imageLabel_14);
        
        JLabel lblNewLabel_2_14 = new JLabel("Buger ");
        lblNewLabel_2_14.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_14.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_14.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_14 = new GridBagConstraints();
        gbc_lblNewLabel_2_14.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_14.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_14.gridx = 0;
        gbc_lblNewLabel_2_14.gridy = 1;
        panel_4_14.add(lblNewLabel_2_14, gbc_lblNewLabel_2_14);
        
        JLabel label_14 = new JLabel("2$");
        label_14.setPreferredSize(new Dimension(50, 20));
        label_14.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_14 = new GridBagConstraints();
        gbc_label_14.fill = GridBagConstraints.VERTICAL;
        gbc_label_14.anchor = GridBagConstraints.EAST;
        gbc_label_14.insets = new Insets(0, 0, 5, 0);
        gbc_label_14.gridx = 0;
        gbc_label_14.gridy = 2;
        panel_4_14.add(label_14, gbc_label_14);
        
        JButton btnNewButton_1_14 = new JButton("Add Cart");
        btnNewButton_1_14.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_14.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_14.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_14.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_14 = new GridBagConstraints();
        gbc_btnNewButton_1_14.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_14.gridx = 0;
        gbc_btnNewButton_1_14.gridy = 3;
        panel_4_14.add(btnNewButton_1_14, gbc_btnNewButton_1_14);
        
        JPanel panel_4_15 = new JPanel();
        panel_2.add(panel_4_15);
        GridBagLayout gbl_panel_4_15 = new GridBagLayout();
        gbl_panel_4_15.columnWidths = new int[]{50, 0};
        gbl_panel_4_15.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_15.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_15.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_15.setLayout(gbl_panel_4_15);
        
        JLabel imageLabel_15 = new JLabel((Icon) null);
        imageLabel_15.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_15 = new GridBagConstraints();
        gbc_imageLabel_15.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_15.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_15.gridx = 0;
        gbc_imageLabel_15.gridy = 0;
        panel_4_15.add(imageLabel_15, gbc_imageLabel_15);
        
        JLabel lblNewLabel_2_15 = new JLabel("Buger ");
        lblNewLabel_2_15.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_15.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_15.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_15 = new GridBagConstraints();
        gbc_lblNewLabel_2_15.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_15.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_15.gridx = 0;
        gbc_lblNewLabel_2_15.gridy = 1;
        panel_4_15.add(lblNewLabel_2_15, gbc_lblNewLabel_2_15);
        
        JLabel label_15 = new JLabel("2$");
        label_15.setPreferredSize(new Dimension(50, 20));
        label_15.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_15 = new GridBagConstraints();
        gbc_label_15.fill = GridBagConstraints.VERTICAL;
        gbc_label_15.anchor = GridBagConstraints.EAST;
        gbc_label_15.insets = new Insets(0, 0, 5, 0);
        gbc_label_15.gridx = 0;
        gbc_label_15.gridy = 2;
        panel_4_15.add(label_15, gbc_label_15);
        
        JButton btnNewButton_1_15 = new JButton("Add Cart");
        btnNewButton_1_15.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_15.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_15.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_15.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_15 = new GridBagConstraints();
        gbc_btnNewButton_1_15.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_15.gridx = 0;
        gbc_btnNewButton_1_15.gridy = 3;
        panel_4_15.add(btnNewButton_1_15, gbc_btnNewButton_1_15);
        
        JPanel panel_4_16 = new JPanel();
        panel_2.add(panel_4_16);
        GridBagLayout gbl_panel_4_16 = new GridBagLayout();
        gbl_panel_4_16.columnWidths = new int[]{50, 0};
        gbl_panel_4_16.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_16.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_16.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_16.setLayout(gbl_panel_4_16);
        
        JLabel imageLabel_16 = new JLabel((Icon) null);
        imageLabel_16.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_16 = new GridBagConstraints();
        gbc_imageLabel_16.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_16.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_16.gridx = 0;
        gbc_imageLabel_16.gridy = 0;
        panel_4_16.add(imageLabel_16, gbc_imageLabel_16);
        
        JLabel lblNewLabel_2_16 = new JLabel("Buger ");
        lblNewLabel_2_16.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_16.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_16.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_16 = new GridBagConstraints();
        gbc_lblNewLabel_2_16.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_16.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_16.gridx = 0;
        gbc_lblNewLabel_2_16.gridy = 1;
        panel_4_16.add(lblNewLabel_2_16, gbc_lblNewLabel_2_16);
        
        JLabel label_16 = new JLabel("2$");
        label_16.setPreferredSize(new Dimension(50, 20));
        label_16.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_16 = new GridBagConstraints();
        gbc_label_16.fill = GridBagConstraints.VERTICAL;
        gbc_label_16.anchor = GridBagConstraints.EAST;
        gbc_label_16.insets = new Insets(0, 0, 5, 0);
        gbc_label_16.gridx = 0;
        gbc_label_16.gridy = 2;
        panel_4_16.add(label_16, gbc_label_16);
        
        JButton btnNewButton_1_16 = new JButton("Add Cart");
        btnNewButton_1_16.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_16.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_16.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_16.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_16 = new GridBagConstraints();
        gbc_btnNewButton_1_16.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_16.gridx = 0;
        gbc_btnNewButton_1_16.gridy = 3;
        panel_4_16.add(btnNewButton_1_16, gbc_btnNewButton_1_16);
        
        JPanel panel_4_17 = new JPanel();
        panel_2.add(panel_4_17);
        GridBagLayout gbl_panel_4_17 = new GridBagLayout();
        gbl_panel_4_17.columnWidths = new int[]{50, 0};
        gbl_panel_4_17.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_17.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_17.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_17.setLayout(gbl_panel_4_17);
        
        JLabel imageLabel_17 = new JLabel((Icon) null);
        imageLabel_17.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_17 = new GridBagConstraints();
        gbc_imageLabel_17.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_17.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_17.gridx = 0;
        gbc_imageLabel_17.gridy = 0;
        panel_4_17.add(imageLabel_17, gbc_imageLabel_17);
        
        JLabel lblNewLabel_2_17 = new JLabel("Buger ");
        lblNewLabel_2_17.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_17.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_17.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_17 = new GridBagConstraints();
        gbc_lblNewLabel_2_17.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_17.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_17.gridx = 0;
        gbc_lblNewLabel_2_17.gridy = 1;
        panel_4_17.add(lblNewLabel_2_17, gbc_lblNewLabel_2_17);
        
        JLabel label_17 = new JLabel("2$");
        label_17.setPreferredSize(new Dimension(50, 20));
        label_17.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_17 = new GridBagConstraints();
        gbc_label_17.fill = GridBagConstraints.VERTICAL;
        gbc_label_17.anchor = GridBagConstraints.EAST;
        gbc_label_17.insets = new Insets(0, 0, 5, 0);
        gbc_label_17.gridx = 0;
        gbc_label_17.gridy = 2;
        panel_4_17.add(label_17, gbc_label_17);
        
        JButton btnNewButton_1_17 = new JButton("Add Cart");
        btnNewButton_1_17.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_17.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_17.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_17.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_17 = new GridBagConstraints();
        gbc_btnNewButton_1_17.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_17.gridx = 0;
        gbc_btnNewButton_1_17.gridy = 3;
        panel_4_17.add(btnNewButton_1_17, gbc_btnNewButton_1_17);
        
        JPanel panel_4 = new JPanel();
        panel_4.setAutoscrolls(true);
        panel_2.add(panel_4);
        GridBagLayout gbl_panel_4 = new GridBagLayout();
        gbl_panel_4.columnWidths = new int[]{100, 0};
        gbl_panel_4.rowHeights = new int[]{100, 10, 10, 10, 0};
        gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4.setLayout(gbl_panel_4);
        
        JLabel imageLabel = new JLabel((Icon) null);
        imageLabel.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel = new GridBagConstraints();
        gbc_imageLabel.fill = GridBagConstraints.BOTH;
        gbc_imageLabel.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel.gridx = 0;
        gbc_imageLabel.gridy = 0;
        panel_4.add(imageLabel, gbc_imageLabel);
        
        JLabel lblNewLabel_2 = new JLabel("Buger ");
        lblNewLabel_2.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
        gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2.gridx = 0;
        gbc_lblNewLabel_2.gridy = 1;
        panel_4.add(lblNewLabel_2, gbc_lblNewLabel_2);
        
        JLabel label = new JLabel("2$");
        label.setPreferredSize(new Dimension(50, 20));
        label.setHorizontalAlignment(SwingConstants.LEFT);
        GridBagConstraints gbc_label = new GridBagConstraints();
        gbc_label.fill = GridBagConstraints.VERTICAL;
        gbc_label.anchor = GridBagConstraints.EAST;
        gbc_label.insets = new Insets(0, 0, 5, 0);
        gbc_label.gridx = 0;
        gbc_label.gridy = 2;
        panel_4.add(label, gbc_label);
        
        JButton btnNewButton_1 = new JButton("Add Cart");
        btnNewButton_1.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
        gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1.gridx = 0;
        gbc_btnNewButton_1.gridy = 3;
        panel_4.add(btnNewButton_1, gbc_btnNewButton_1);

        JLabel lblNewLabel = new JLabel("Food");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(10, 0, 94, 32);
        panel.add(lblNewLabel);

        JLabel lblBeverage = new JLabel("Beverage");
        lblBeverage.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblBeverage.setBounds(10, 315, 94, 32);
        panel.add(lblBeverage);

        JLabel lblTopping = new JLabel("Cart");
        lblTopping.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTopping.setBounds(598, 0, 94, 32);
        panel.add(lblTopping);

        JLabel lblTopping_1 = new JLabel("Topping");
        lblTopping_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTopping_1.setBounds(598, 315, 94, 32);
        panel.add(lblTopping_1);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane_1.setBounds(598, 361, 454, 174);
        panel.add(scrollPane_1);
        
        JPanel panel_1_1 = new JPanel();
        scrollPane_1.setViewportView(panel_1_1);
        panel_1_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        
        JPanel panel_4_14_3 = new JPanel();
        panel_1_1.add(panel_4_14_3);
        GridBagLayout gbl_panel_4_14_3 = new GridBagLayout();
        gbl_panel_4_14_3.columnWidths = new int[]{50, 0};
        gbl_panel_4_14_3.rowHeights = new int[]{100, 10, 10, 10, 0};
        gbl_panel_4_14_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_14_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_14_3.setLayout(gbl_panel_4_14_3);
        
        JLabel imageLabel_14_3 = new JLabel((Icon) null);
        imageLabel_14_3.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_14_3 = new GridBagConstraints();
        gbc_imageLabel_14_3.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_14_3.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_14_3.gridx = 0;
        gbc_imageLabel_14_3.gridy = 0;
        panel_4_14_3.add(imageLabel_14_3, gbc_imageLabel_14_3);
        
        JLabel lblNewLabel_2_14_3 = new JLabel("Buger ");
        lblNewLabel_2_14_3.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_14_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_14_3.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_14_3 = new GridBagConstraints();
        gbc_lblNewLabel_2_14_3.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_14_3.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_14_3.gridx = 0;
        gbc_lblNewLabel_2_14_3.gridy = 1;
        panel_4_14_3.add(lblNewLabel_2_14_3, gbc_lblNewLabel_2_14_3);
        
        JLabel label_14_3 = new JLabel("2$");
        label_14_3.setPreferredSize(new Dimension(50, 20));
        label_14_3.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_14_3 = new GridBagConstraints();
        gbc_label_14_3.fill = GridBagConstraints.VERTICAL;
        gbc_label_14_3.anchor = GridBagConstraints.EAST;
        gbc_label_14_3.insets = new Insets(0, 0, 5, 0);
        gbc_label_14_3.gridx = 0;
        gbc_label_14_3.gridy = 2;
        panel_4_14_3.add(label_14_3, gbc_label_14_3);
        
        JButton btnNewButton_1_14_3 = new JButton("Add Cart");
        btnNewButton_1_14_3.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_14_3.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_14_3.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_14_3.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_14_3 = new GridBagConstraints();
        gbc_btnNewButton_1_14_3.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_14_3.gridx = 0;
        gbc_btnNewButton_1_14_3.gridy = 3;
        panel_4_14_3.add(btnNewButton_1_14_3, gbc_btnNewButton_1_14_3);
        
        JPanel panel_4_14_4 = new JPanel();
        panel_1_1.add(panel_4_14_4);
        GridBagLayout gbl_panel_4_14_4 = new GridBagLayout();
        gbl_panel_4_14_4.columnWidths = new int[]{50, 0};
        gbl_panel_4_14_4.rowHeights = new int[]{100, 10, 10, 10, 0};
        gbl_panel_4_14_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_14_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_14_4.setLayout(gbl_panel_4_14_4);
        
        JLabel imageLabel_14_4 = new JLabel((Icon) null);
        imageLabel_14_4.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_14_4 = new GridBagConstraints();
        gbc_imageLabel_14_4.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_14_4.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_14_4.gridx = 0;
        gbc_imageLabel_14_4.gridy = 0;
        panel_4_14_4.add(imageLabel_14_4, gbc_imageLabel_14_4);
        
        JLabel lblNewLabel_2_14_4 = new JLabel("Buger ");
        lblNewLabel_2_14_4.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_14_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_14_4.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_14_4 = new GridBagConstraints();
        gbc_lblNewLabel_2_14_4.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_14_4.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_14_4.gridx = 0;
        gbc_lblNewLabel_2_14_4.gridy = 1;
        panel_4_14_4.add(lblNewLabel_2_14_4, gbc_lblNewLabel_2_14_4);
        
        JLabel label_14_4 = new JLabel("2$");
        label_14_4.setPreferredSize(new Dimension(50, 20));
        label_14_4.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_14_4 = new GridBagConstraints();
        gbc_label_14_4.fill = GridBagConstraints.VERTICAL;
        gbc_label_14_4.anchor = GridBagConstraints.EAST;
        gbc_label_14_4.insets = new Insets(0, 0, 5, 0);
        gbc_label_14_4.gridx = 0;
        gbc_label_14_4.gridy = 2;
        panel_4_14_4.add(label_14_4, gbc_label_14_4);
        
        JButton btnNewButton_1_14_4 = new JButton("Add Cart");
        btnNewButton_1_14_4.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_14_4.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_14_4.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_14_4.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_14_4 = new GridBagConstraints();
        gbc_btnNewButton_1_14_4.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_14_4.gridx = 0;
        gbc_btnNewButton_1_14_4.gridy = 3;
        panel_4_14_4.add(btnNewButton_1_14_4, gbc_btnNewButton_1_14_4);
        
        JPanel panel_4_14_5 = new JPanel();
        panel_1_1.add(panel_4_14_5);
        GridBagLayout gbl_panel_4_14_5 = new GridBagLayout();
        gbl_panel_4_14_5.columnWidths = new int[]{50, 0};
        gbl_panel_4_14_5.rowHeights = new int[]{100, 10, 10, 10, 0};
        gbl_panel_4_14_5.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_14_5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_14_5.setLayout(gbl_panel_4_14_5);
        
        JLabel imageLabel_14_5 = new JLabel((Icon) null);
        imageLabel_14_5.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_14_5 = new GridBagConstraints();
        gbc_imageLabel_14_5.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_14_5.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_14_5.gridx = 0;
        gbc_imageLabel_14_5.gridy = 0;
        panel_4_14_5.add(imageLabel_14_5, gbc_imageLabel_14_5);
        
        JLabel lblNewLabel_2_14_5 = new JLabel("Buger ");
        lblNewLabel_2_14_5.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_14_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_14_5.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_14_5 = new GridBagConstraints();
        gbc_lblNewLabel_2_14_5.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_14_5.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_14_5.gridx = 0;
        gbc_lblNewLabel_2_14_5.gridy = 1;
        panel_4_14_5.add(lblNewLabel_2_14_5, gbc_lblNewLabel_2_14_5);
        
        JLabel label_14_5 = new JLabel("2$");
        label_14_5.setPreferredSize(new Dimension(50, 20));
        label_14_5.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_14_5 = new GridBagConstraints();
        gbc_label_14_5.fill = GridBagConstraints.VERTICAL;
        gbc_label_14_5.anchor = GridBagConstraints.EAST;
        gbc_label_14_5.insets = new Insets(0, 0, 5, 0);
        gbc_label_14_5.gridx = 0;
        gbc_label_14_5.gridy = 2;
        panel_4_14_5.add(label_14_5, gbc_label_14_5);
        
        JButton btnNewButton_1_14_5 = new JButton("Add Cart");
        btnNewButton_1_14_5.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_14_5.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_14_5.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_14_5.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_14_5 = new GridBagConstraints();
        gbc_btnNewButton_1_14_5.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_14_5.gridx = 0;
        gbc_btnNewButton_1_14_5.gridy = 3;
        panel_4_14_5.add(btnNewButton_1_14_5, gbc_btnNewButton_1_14_5);
        
        JPanel panel_4_14_6 = new JPanel();
        panel_1_1.add(panel_4_14_6);
        GridBagLayout gbl_panel_4_14_6 = new GridBagLayout();
        gbl_panel_4_14_6.columnWidths = new int[]{50, 0};
        gbl_panel_4_14_6.rowHeights = new int[]{100, 10, 10, 10, 0};
        gbl_panel_4_14_6.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_14_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_14_6.setLayout(gbl_panel_4_14_6);
        
        JLabel imageLabel_14_6 = new JLabel((Icon) null);
        imageLabel_14_6.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_14_6 = new GridBagConstraints();
        gbc_imageLabel_14_6.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_14_6.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_14_6.gridx = 0;
        gbc_imageLabel_14_6.gridy = 0;
        panel_4_14_6.add(imageLabel_14_6, gbc_imageLabel_14_6);
        
        JLabel lblNewLabel_2_14_6 = new JLabel("Buger ");
        lblNewLabel_2_14_6.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_14_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_14_6.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_14_6 = new GridBagConstraints();
        gbc_lblNewLabel_2_14_6.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_14_6.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_14_6.gridx = 0;
        gbc_lblNewLabel_2_14_6.gridy = 1;
        panel_4_14_6.add(lblNewLabel_2_14_6, gbc_lblNewLabel_2_14_6);
        
        JLabel label_14_6 = new JLabel("2$");
        label_14_6.setPreferredSize(new Dimension(50, 20));
        label_14_6.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_14_6 = new GridBagConstraints();
        gbc_label_14_6.fill = GridBagConstraints.VERTICAL;
        gbc_label_14_6.anchor = GridBagConstraints.EAST;
        gbc_label_14_6.insets = new Insets(0, 0, 5, 0);
        gbc_label_14_6.gridx = 0;
        gbc_label_14_6.gridy = 2;
        panel_4_14_6.add(label_14_6, gbc_label_14_6);
        
        JButton btnNewButton_1_14_6 = new JButton("Add Cart");
        btnNewButton_1_14_6.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_14_6.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_14_6.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_14_6.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_14_6 = new GridBagConstraints();
        gbc_btnNewButton_1_14_6.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_14_6.gridx = 0;
        gbc_btnNewButton_1_14_6.gridy = 3;
        panel_4_14_6.add(btnNewButton_1_14_6, gbc_btnNewButton_1_14_6);
        
        JPanel panel_4_14_7 = new JPanel();
        panel_1_1.add(panel_4_14_7);
        GridBagLayout gbl_panel_4_14_7 = new GridBagLayout();
        gbl_panel_4_14_7.columnWidths = new int[]{50, 0};
        gbl_panel_4_14_7.rowHeights = new int[]{100, 10, 10, 10, 0};
        gbl_panel_4_14_7.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_14_7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_14_7.setLayout(gbl_panel_4_14_7);
        
        JLabel imageLabel_14_7 = new JLabel((Icon) null);
        imageLabel_14_7.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_14_7 = new GridBagConstraints();
        gbc_imageLabel_14_7.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_14_7.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_14_7.gridx = 0;
        gbc_imageLabel_14_7.gridy = 0;
        panel_4_14_7.add(imageLabel_14_7, gbc_imageLabel_14_7);
        
        JLabel lblNewLabel_2_14_7 = new JLabel("Buger ");
        lblNewLabel_2_14_7.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_14_7.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_14_7.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_14_7 = new GridBagConstraints();
        gbc_lblNewLabel_2_14_7.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_14_7.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_14_7.gridx = 0;
        gbc_lblNewLabel_2_14_7.gridy = 1;
        panel_4_14_7.add(lblNewLabel_2_14_7, gbc_lblNewLabel_2_14_7);
        
        JLabel label_14_7 = new JLabel("2$");
        label_14_7.setPreferredSize(new Dimension(50, 20));
        label_14_7.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_14_7 = new GridBagConstraints();
        gbc_label_14_7.fill = GridBagConstraints.VERTICAL;
        gbc_label_14_7.anchor = GridBagConstraints.EAST;
        gbc_label_14_7.insets = new Insets(0, 0, 5, 0);
        gbc_label_14_7.gridx = 0;
        gbc_label_14_7.gridy = 2;
        panel_4_14_7.add(label_14_7, gbc_label_14_7);
        
        JButton btnNewButton_1_14_7 = new JButton("Add Cart");
        btnNewButton_1_14_7.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_14_7.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_14_7.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_14_7.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_14_7 = new GridBagConstraints();
        gbc_btnNewButton_1_14_7.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_14_7.gridx = 0;
        gbc_btnNewButton_1_14_7.gridy = 3;
        panel_4_14_7.add(btnNewButton_1_14_7, gbc_btnNewButton_1_14_7);
        
        JPanel panel_4_14_8 = new JPanel();
        panel_1_1.add(panel_4_14_8);
        GridBagLayout gbl_panel_4_14_8 = new GridBagLayout();
        gbl_panel_4_14_8.columnWidths = new int[]{50, 0};
        gbl_panel_4_14_8.rowHeights = new int[]{100, 10, 10, 10, 0};
        gbl_panel_4_14_8.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_14_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_14_8.setLayout(gbl_panel_4_14_8);
        
        JLabel imageLabel_14_8 = new JLabel((Icon) null);
        imageLabel_14_8.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_14_8 = new GridBagConstraints();
        gbc_imageLabel_14_8.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_14_8.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_14_8.gridx = 0;
        gbc_imageLabel_14_8.gridy = 0;
        panel_4_14_8.add(imageLabel_14_8, gbc_imageLabel_14_8);
        
        JLabel lblNewLabel_2_14_8 = new JLabel("Buger ");
        lblNewLabel_2_14_8.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_14_8.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_14_8.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_14_8 = new GridBagConstraints();
        gbc_lblNewLabel_2_14_8.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_14_8.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_14_8.gridx = 0;
        gbc_lblNewLabel_2_14_8.gridy = 1;
        panel_4_14_8.add(lblNewLabel_2_14_8, gbc_lblNewLabel_2_14_8);
        
        JLabel label_14_8 = new JLabel("2$");
        label_14_8.setPreferredSize(new Dimension(50, 20));
        label_14_8.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_14_8 = new GridBagConstraints();
        gbc_label_14_8.fill = GridBagConstraints.VERTICAL;
        gbc_label_14_8.anchor = GridBagConstraints.EAST;
        gbc_label_14_8.insets = new Insets(0, 0, 5, 0);
        gbc_label_14_8.gridx = 0;
        gbc_label_14_8.gridy = 2;
        panel_4_14_8.add(label_14_8, gbc_label_14_8);
        
        JButton btnNewButton_1_14_8 = new JButton("Add Cart");
        btnNewButton_1_14_8.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_14_8.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_14_8.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_14_8.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_14_8 = new GridBagConstraints();
        gbc_btnNewButton_1_14_8.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_14_8.gridx = 0;
        gbc_btnNewButton_1_14_8.gridy = 3;
        panel_4_14_8.add(btnNewButton_1_14_8, gbc_btnNewButton_1_14_8);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(173, 255, 47));
        panel_3.setForeground(new Color(0, 0, 0));
        panel_3.setBounds(10, 56, 93, 546);
        contentPane.add(panel_3);
        panel_3.setLayout(null);

        JButton btnNewButton = new JButton("Home");
        btnNewButton.setBounds(10, 11, 73, 43);
        panel_3.add(btnNewButton);

        JButton btnMenu = new JButton("Menu");
        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnMenu.setBounds(10, 76, 73, 43);
        panel_3.add(btnMenu);

        JButton btnGiHng = new JButton("Giỏ hàng");
        btnGiHng.setMargin(new Insets(0, 0, 0, 0));
        btnGiHng.setBounds(10, 144, 73, 43);
        panel_3.add(btnGiHng);

        JButton btnThngK = new JButton("Lịch sử");
        btnThngK.setMargin(new Insets(0, 0, 0, 0));
        btnThngK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnThngK.setBounds(10, 214, 73, 43);
        panel_3.add(btnThngK);

        JButton btnngXut = new JButton("Đăng xuất");
        btnngXut.setMargin(new Insets(0, 0, 0, 0));
        btnngXut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnngXut.setBounds(10, 492, 73, 43);
        panel_3.add(btnngXut);

        JButton btnQunLSn = new JButton("Hồ sơ");
        btnQunLSn.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        btnQunLSn.setMargin(new Insets(0, 0, 0, 0));
        btnQunLSn.setBounds(10, 277, 73, 43);
        panel_3.add(btnQunLSn);

        JLabel lblNewLabel_1 = new JLabel("Fast Food Store");
        lblNewLabel_1.setForeground(Color.RED);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 27));
        lblNewLabel_1.setBounds(113, 11, 1063, 35);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_3 = new JLabel("Logo img đồ đó");
        lblNewLabel_3.setBounds(30, 11, 54, 34);
        contentPane.add(lblNewLabel_3);
    }
}
