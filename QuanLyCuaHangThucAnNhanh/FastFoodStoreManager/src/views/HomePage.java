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
        setBounds(0, 0, 1200, 650);
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
        panel_1.setBounds(10, 34, 463, 270);
        panel.add(panel_1);
        panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        
        JPanel panel_4 = new JPanel();
        panel_1.add(panel_4);
        
        // Thêm ảnh vào panel_4
        ImageIcon imageIcon = new ImageIcon("F:/Github/ProjectQuanLyCuaHangThucAnNhanh/QuanLyCuaHangThucAnNhanh/FastFoodStoreManager/img/buger.png");
        Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon resizedImageIcon = new ImageIcon(image);
        GridBagLayout gbl_panel_4 = new GridBagLayout();
        gbl_panel_4.columnWidths = new int[]{100, 0};
        gbl_panel_4.rowHeights = new int[] {100, 10, 10, 10, 0};
        gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4.setLayout(gbl_panel_4);
        JLabel imageLabel = new JLabel(resizedImageIcon);
        imageLabel.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel = new GridBagConstraints();
        gbc_imageLabel.fill = GridBagConstraints.BOTH;
        gbc_imageLabel.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel.gridx = 0;
        gbc_imageLabel.gridy = 0;
        panel_4.add(imageLabel, gbc_imageLabel);
        
        JLabel lblNewLabel_2 = new JLabel("Buger ");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setEnabled(false);
        lblNewLabel_2.setPreferredSize(new Dimension(50, 20));
        GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
        gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2.gridx = 0;
        gbc_lblNewLabel_2.gridy = 1;
        panel_4.add(lblNewLabel_2, gbc_lblNewLabel_2);
        
        JLabel label = new JLabel("2$");
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setPreferredSize(new Dimension(50, 20));
        GridBagConstraints gbc_label = new GridBagConstraints();
        gbc_label.anchor = GridBagConstraints.EAST;
        gbc_label.fill = GridBagConstraints.VERTICAL;
        gbc_label.insets = new Insets(0, 0, 5, 0);
        gbc_label.gridx = 0;
        gbc_label.gridy = 2;
        panel_4.add(label, gbc_label);
        
        JButton btnNewButton_1 = new JButton("Add Cart");
        btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnNewButton_1.setPreferredSize(new Dimension(50, 20));
        GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
        gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1.gridx = 0;
        gbc_btnNewButton_1.gridy = 3;
        panel_4.add(btnNewButton_1, gbc_btnNewButton_1);
        
        JPanel panel_4_1 = new JPanel();
        panel_1.add(panel_4_1);
        GridBagLayout gbl_panel_4_1 = new GridBagLayout();
        gbl_panel_4_1.columnWidths = new int[]{50, 0};
        gbl_panel_4_1.rowHeights = new int[]{80, 10, 10, 10, 0};
        gbl_panel_4_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_1.setLayout(gbl_panel_4_1);
        
        JLabel imageLabel_1 = new JLabel((Icon) null);
        imageLabel_1.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_1 = new GridBagConstraints();
        gbc_imageLabel_1.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_1.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_1.gridx = 0;
        gbc_imageLabel_1.gridy = 0;
        panel_4_1.add(imageLabel_1, gbc_imageLabel_1);
        
        JLabel lblNewLabel_2_1 = new JLabel("Buger ");
        lblNewLabel_2_1.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_1.gridx = 0;
        gbc_lblNewLabel_2_1.gridy = 1;
        panel_4_1.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);
        
        JLabel label_1 = new JLabel("2$");
        label_1.setPreferredSize(new Dimension(50, 20));
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_1 = new GridBagConstraints();
        gbc_label_1.fill = GridBagConstraints.VERTICAL;
        gbc_label_1.anchor = GridBagConstraints.EAST;
        gbc_label_1.insets = new Insets(0, 0, 5, 0);
        gbc_label_1.gridx = 0;
        gbc_label_1.gridy = 2;
        panel_4_1.add(label_1, gbc_label_1);
        
        JButton btnNewButton_1_1 = new JButton("Add Cart");
        btnNewButton_1_1.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_1.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
        gbc_btnNewButton_1_1.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_1.gridx = 0;
        gbc_btnNewButton_1_1.gridy = 3;
        panel_4_1.add(btnNewButton_1_1, gbc_btnNewButton_1_1);
        
        JPanel panel_4_2 = new JPanel();
        panel_1.add(panel_4_2);
        GridBagLayout gbl_panel_4_2 = new GridBagLayout();
        gbl_panel_4_2.columnWidths = new int[]{50, 0};
        gbl_panel_4_2.rowHeights = new int[]{80, 10, 10, 10, 0};
        gbl_panel_4_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_2.setLayout(gbl_panel_4_2);
        
        JLabel imageLabel_2 = new JLabel((Icon) null);
        imageLabel_2.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_2 = new GridBagConstraints();
        gbc_imageLabel_2.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_2.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_2.gridx = 0;
        gbc_imageLabel_2.gridy = 0;
        panel_4_2.add(imageLabel_2, gbc_imageLabel_2);
        
        JLabel lblNewLabel_2_2 = new JLabel("Buger ");
        lblNewLabel_2_2.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_2.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_2 = new GridBagConstraints();
        gbc_lblNewLabel_2_2.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_2.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_2.gridx = 0;
        gbc_lblNewLabel_2_2.gridy = 1;
        panel_4_2.add(lblNewLabel_2_2, gbc_lblNewLabel_2_2);
        
        JLabel label_2 = new JLabel("2$");
        label_2.setPreferredSize(new Dimension(50, 20));
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_2 = new GridBagConstraints();
        gbc_label_2.fill = GridBagConstraints.VERTICAL;
        gbc_label_2.anchor = GridBagConstraints.EAST;
        gbc_label_2.insets = new Insets(0, 0, 5, 0);
        gbc_label_2.gridx = 0;
        gbc_label_2.gridy = 2;
        panel_4_2.add(label_2, gbc_label_2);
        
        JButton btnNewButton_1_2 = new JButton("Add Cart");
        btnNewButton_1_2.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_2.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_2.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_2 = new GridBagConstraints();
        gbc_btnNewButton_1_2.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_2.gridx = 0;
        gbc_btnNewButton_1_2.gridy = 3;
        panel_4_2.add(btnNewButton_1_2, gbc_btnNewButton_1_2);
        
        JPanel panel_4_3 = new JPanel();
        panel_1.add(panel_4_3);
        GridBagLayout gbl_panel_4_3 = new GridBagLayout();
        gbl_panel_4_3.columnWidths = new int[]{50, 0};
        gbl_panel_4_3.rowHeights = new int[]{80, 10, 10, 10, 0};
        gbl_panel_4_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_3.setLayout(gbl_panel_4_3);
        
        JLabel imageLabel_3 = new JLabel((Icon) null);
        imageLabel_3.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_3 = new GridBagConstraints();
        gbc_imageLabel_3.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_3.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_3.gridx = 0;
        gbc_imageLabel_3.gridy = 0;
        panel_4_3.add(imageLabel_3, gbc_imageLabel_3);
        
        JLabel lblNewLabel_2_3 = new JLabel("Buger ");
        lblNewLabel_2_3.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_3.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_3 = new GridBagConstraints();
        gbc_lblNewLabel_2_3.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_3.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_3.gridx = 0;
        gbc_lblNewLabel_2_3.gridy = 1;
        panel_4_3.add(lblNewLabel_2_3, gbc_lblNewLabel_2_3);
        
        JLabel label_3 = new JLabel("2$");
        label_3.setPreferredSize(new Dimension(50, 20));
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_3 = new GridBagConstraints();
        gbc_label_3.fill = GridBagConstraints.VERTICAL;
        gbc_label_3.anchor = GridBagConstraints.EAST;
        gbc_label_3.insets = new Insets(0, 0, 5, 0);
        gbc_label_3.gridx = 0;
        gbc_label_3.gridy = 2;
        panel_4_3.add(label_3, gbc_label_3);
        
        JButton btnNewButton_1_3 = new JButton("Add Cart");
        btnNewButton_1_3.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_3.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_3.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_3 = new GridBagConstraints();
        gbc_btnNewButton_1_3.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_3.gridx = 0;
        gbc_btnNewButton_1_3.gridy = 3;
        panel_4_3.add(btnNewButton_1_3, gbc_btnNewButton_1_3);
        
        JPanel panel_4_4 = new JPanel();
        panel_1.add(panel_4_4);
        GridBagLayout gbl_panel_4_4 = new GridBagLayout();
        gbl_panel_4_4.columnWidths = new int[]{50, 0};
        gbl_panel_4_4.rowHeights = new int[]{80, 10, 10, 10, 0};
        gbl_panel_4_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_4.setLayout(gbl_panel_4_4);
        
        JLabel imageLabel_4 = new JLabel((Icon) null);
        imageLabel_4.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_4 = new GridBagConstraints();
        gbc_imageLabel_4.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_4.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_4.gridx = 0;
        gbc_imageLabel_4.gridy = 0;
        panel_4_4.add(imageLabel_4, gbc_imageLabel_4);
        
        JLabel lblNewLabel_2_4 = new JLabel("Buger ");
        lblNewLabel_2_4.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_4.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_4 = new GridBagConstraints();
        gbc_lblNewLabel_2_4.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_4.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_4.gridx = 0;
        gbc_lblNewLabel_2_4.gridy = 1;
        panel_4_4.add(lblNewLabel_2_4, gbc_lblNewLabel_2_4);
        
        JLabel label_4 = new JLabel("2$");
        label_4.setPreferredSize(new Dimension(50, 20));
        label_4.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_4 = new GridBagConstraints();
        gbc_label_4.fill = GridBagConstraints.VERTICAL;
        gbc_label_4.anchor = GridBagConstraints.EAST;
        gbc_label_4.insets = new Insets(0, 0, 5, 0);
        gbc_label_4.gridx = 0;
        gbc_label_4.gridy = 2;
        panel_4_4.add(label_4, gbc_label_4);
        
        JButton btnNewButton_1_4 = new JButton("Add Cart");
        btnNewButton_1_4.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_4.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_4.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_4 = new GridBagConstraints();
        gbc_btnNewButton_1_4.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_4.gridx = 0;
        gbc_btnNewButton_1_4.gridy = 3;
        panel_4_4.add(btnNewButton_1_4, gbc_btnNewButton_1_4);
        
        JPanel panel_4_5 = new JPanel();
        panel_1.add(panel_4_5);
        GridBagLayout gbl_panel_4_5 = new GridBagLayout();
        gbl_panel_4_5.columnWidths = new int[]{50, 0};
        gbl_panel_4_5.rowHeights = new int[]{80, 10, 10, 10, 0};
        gbl_panel_4_5.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_5.setLayout(gbl_panel_4_5);
        
        JLabel imageLabel_5 = new JLabel((Icon) null);
        imageLabel_5.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_5 = new GridBagConstraints();
        gbc_imageLabel_5.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_5.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_5.gridx = 0;
        gbc_imageLabel_5.gridy = 0;
        panel_4_5.add(imageLabel_5, gbc_imageLabel_5);
        
        JLabel lblNewLabel_2_5 = new JLabel("Buger ");
        lblNewLabel_2_5.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_5.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_5 = new GridBagConstraints();
        gbc_lblNewLabel_2_5.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_5.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_5.gridx = 0;
        gbc_lblNewLabel_2_5.gridy = 1;
        panel_4_5.add(lblNewLabel_2_5, gbc_lblNewLabel_2_5);
        
        JLabel label_5 = new JLabel("2$");
        label_5.setPreferredSize(new Dimension(50, 20));
        label_5.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_5 = new GridBagConstraints();
        gbc_label_5.fill = GridBagConstraints.VERTICAL;
        gbc_label_5.anchor = GridBagConstraints.EAST;
        gbc_label_5.insets = new Insets(0, 0, 5, 0);
        gbc_label_5.gridx = 0;
        gbc_label_5.gridy = 2;
        panel_4_5.add(label_5, gbc_label_5);
        
        JButton btnNewButton_1_5 = new JButton("Add Cart");
        btnNewButton_1_5.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_5.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_5.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_5 = new GridBagConstraints();
        gbc_btnNewButton_1_5.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_5.gridx = 0;
        gbc_btnNewButton_1_5.gridy = 3;
        panel_4_5.add(btnNewButton_1_5, gbc_btnNewButton_1_5);
        
        

        JPanel panel_2 = new JPanel();
        FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
        flowLayout.setAlignment(FlowLayout.LEFT);
        panel_2.setBounds(10, 358, 463, 177);
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

        JLabel lblNewLabel = new JLabel("Food");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(10, 0, 94, 32);
        panel.add(lblNewLabel);

        JLabel lblBeverage = new JLabel("Beverage");
        lblBeverage.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblBeverage.setBounds(10, 315, 94, 32);
        panel.add(lblBeverage);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setBounds(481, 34, 572, 270);
        panel.add(panel_1_1);
        panel_1_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        
        JPanel panel_4_6 = new JPanel();
        panel_1_1.add(panel_4_6);
        GridBagLayout gbl_panel_4_6 = new GridBagLayout();
        gbl_panel_4_6.columnWidths = new int[]{50, 0};
        gbl_panel_4_6.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_6.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_6.setLayout(gbl_panel_4_6);
        
        JLabel imageLabel_6 = new JLabel((Icon) null);
        imageLabel_6.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_6 = new GridBagConstraints();
        gbc_imageLabel_6.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_6.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_6.gridx = 0;
        gbc_imageLabel_6.gridy = 0;
        panel_4_6.add(imageLabel_6, gbc_imageLabel_6);
        
        JLabel lblNewLabel_2_6 = new JLabel("Buger ");
        lblNewLabel_2_6.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_6.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_6 = new GridBagConstraints();
        gbc_lblNewLabel_2_6.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_6.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_6.gridx = 0;
        gbc_lblNewLabel_2_6.gridy = 1;
        panel_4_6.add(lblNewLabel_2_6, gbc_lblNewLabel_2_6);
        
        JLabel label_6 = new JLabel("2$");
        label_6.setPreferredSize(new Dimension(50, 20));
        label_6.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_6 = new GridBagConstraints();
        gbc_label_6.fill = GridBagConstraints.VERTICAL;
        gbc_label_6.anchor = GridBagConstraints.EAST;
        gbc_label_6.insets = new Insets(0, 0, 5, 0);
        gbc_label_6.gridx = 0;
        gbc_label_6.gridy = 2;
        panel_4_6.add(label_6, gbc_label_6);
        
        JButton btnNewButton_1_6 = new JButton("Add Cart");
        btnNewButton_1_6.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_6.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_6.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_6 = new GridBagConstraints();
        gbc_btnNewButton_1_6.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_6.gridx = 0;
        gbc_btnNewButton_1_6.gridy = 3;
        panel_4_6.add(btnNewButton_1_6, gbc_btnNewButton_1_6);
        
        JPanel panel_4_7 = new JPanel();
        panel_1_1.add(panel_4_7);
        GridBagLayout gbl_panel_4_7 = new GridBagLayout();
        gbl_panel_4_7.columnWidths = new int[]{50, 0};
        gbl_panel_4_7.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_7.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_7.setLayout(gbl_panel_4_7);
        
        JLabel imageLabel_7 = new JLabel((Icon) null);
        imageLabel_7.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_7 = new GridBagConstraints();
        gbc_imageLabel_7.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_7.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_7.gridx = 0;
        gbc_imageLabel_7.gridy = 0;
        panel_4_7.add(imageLabel_7, gbc_imageLabel_7);
        
        JLabel lblNewLabel_2_7 = new JLabel("Buger ");
        lblNewLabel_2_7.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_7.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_7.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_7 = new GridBagConstraints();
        gbc_lblNewLabel_2_7.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_7.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_7.gridx = 0;
        gbc_lblNewLabel_2_7.gridy = 1;
        panel_4_7.add(lblNewLabel_2_7, gbc_lblNewLabel_2_7);
        
        JLabel label_7 = new JLabel("2$");
        label_7.setPreferredSize(new Dimension(50, 20));
        label_7.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_7 = new GridBagConstraints();
        gbc_label_7.fill = GridBagConstraints.VERTICAL;
        gbc_label_7.anchor = GridBagConstraints.EAST;
        gbc_label_7.insets = new Insets(0, 0, 5, 0);
        gbc_label_7.gridx = 0;
        gbc_label_7.gridy = 2;
        panel_4_7.add(label_7, gbc_label_7);
        
        JButton btnNewButton_1_7 = new JButton("Add Cart");
        btnNewButton_1_7.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_7.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_7.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_7 = new GridBagConstraints();
        gbc_btnNewButton_1_7.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_7.gridx = 0;
        gbc_btnNewButton_1_7.gridy = 3;
        panel_4_7.add(btnNewButton_1_7, gbc_btnNewButton_1_7);
        
        JPanel panel_4_8 = new JPanel();
        panel_1_1.add(panel_4_8);
        GridBagLayout gbl_panel_4_8 = new GridBagLayout();
        gbl_panel_4_8.columnWidths = new int[]{50, 0};
        gbl_panel_4_8.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_8.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_8.setLayout(gbl_panel_4_8);
        
        JLabel imageLabel_8 = new JLabel((Icon) null);
        imageLabel_8.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_8 = new GridBagConstraints();
        gbc_imageLabel_8.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_8.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_8.gridx = 0;
        gbc_imageLabel_8.gridy = 0;
        panel_4_8.add(imageLabel_8, gbc_imageLabel_8);
        
        JLabel lblNewLabel_2_8 = new JLabel("Buger ");
        lblNewLabel_2_8.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_8.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_8.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_8 = new GridBagConstraints();
        gbc_lblNewLabel_2_8.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_8.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_8.gridx = 0;
        gbc_lblNewLabel_2_8.gridy = 1;
        panel_4_8.add(lblNewLabel_2_8, gbc_lblNewLabel_2_8);
        
        JLabel label_8 = new JLabel("2$");
        label_8.setPreferredSize(new Dimension(50, 20));
        label_8.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_8 = new GridBagConstraints();
        gbc_label_8.fill = GridBagConstraints.VERTICAL;
        gbc_label_8.anchor = GridBagConstraints.EAST;
        gbc_label_8.insets = new Insets(0, 0, 5, 0);
        gbc_label_8.gridx = 0;
        gbc_label_8.gridy = 2;
        panel_4_8.add(label_8, gbc_label_8);
        
        JButton btnNewButton_1_8 = new JButton("Add Cart");
        btnNewButton_1_8.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_8.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_8.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_8 = new GridBagConstraints();
        gbc_btnNewButton_1_8.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_8.gridx = 0;
        gbc_btnNewButton_1_8.gridy = 3;
        panel_4_8.add(btnNewButton_1_8, gbc_btnNewButton_1_8);
        
        JPanel panel_4_9 = new JPanel();
        panel_1_1.add(panel_4_9);
        GridBagLayout gbl_panel_4_9 = new GridBagLayout();
        gbl_panel_4_9.columnWidths = new int[]{50, 0};
        gbl_panel_4_9.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_9.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_9.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_9.setLayout(gbl_panel_4_9);
        
        JLabel imageLabel_9 = new JLabel((Icon) null);
        imageLabel_9.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_9 = new GridBagConstraints();
        gbc_imageLabel_9.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_9.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_9.gridx = 0;
        gbc_imageLabel_9.gridy = 0;
        panel_4_9.add(imageLabel_9, gbc_imageLabel_9);
        
        JLabel lblNewLabel_2_9 = new JLabel("Buger ");
        lblNewLabel_2_9.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_9.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_9.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_9 = new GridBagConstraints();
        gbc_lblNewLabel_2_9.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_9.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_9.gridx = 0;
        gbc_lblNewLabel_2_9.gridy = 1;
        panel_4_9.add(lblNewLabel_2_9, gbc_lblNewLabel_2_9);
        
        JLabel label_9 = new JLabel("2$");
        label_9.setPreferredSize(new Dimension(50, 20));
        label_9.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_9 = new GridBagConstraints();
        gbc_label_9.fill = GridBagConstraints.VERTICAL;
        gbc_label_9.anchor = GridBagConstraints.EAST;
        gbc_label_9.insets = new Insets(0, 0, 5, 0);
        gbc_label_9.gridx = 0;
        gbc_label_9.gridy = 2;
        panel_4_9.add(label_9, gbc_label_9);
        
        JButton btnNewButton_1_9 = new JButton("Add Cart");
        btnNewButton_1_9.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_9.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_9.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_9 = new GridBagConstraints();
        gbc_btnNewButton_1_9.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_9.gridx = 0;
        gbc_btnNewButton_1_9.gridy = 3;
        panel_4_9.add(btnNewButton_1_9, gbc_btnNewButton_1_9);
        
        JPanel panel_4_10 = new JPanel();
        panel_1_1.add(panel_4_10);
        GridBagLayout gbl_panel_4_10 = new GridBagLayout();
        gbl_panel_4_10.columnWidths = new int[]{50, 0};
        gbl_panel_4_10.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_10.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_10.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_10.setLayout(gbl_panel_4_10);
        
        JLabel imageLabel_10 = new JLabel((Icon) null);
        imageLabel_10.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_10 = new GridBagConstraints();
        gbc_imageLabel_10.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_10.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_10.gridx = 0;
        gbc_imageLabel_10.gridy = 0;
        panel_4_10.add(imageLabel_10, gbc_imageLabel_10);
        
        JLabel lblNewLabel_2_10 = new JLabel("Buger ");
        lblNewLabel_2_10.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_10.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_10.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_10 = new GridBagConstraints();
        gbc_lblNewLabel_2_10.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_10.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_10.gridx = 0;
        gbc_lblNewLabel_2_10.gridy = 1;
        panel_4_10.add(lblNewLabel_2_10, gbc_lblNewLabel_2_10);
        
        JLabel label_10 = new JLabel("2$");
        label_10.setPreferredSize(new Dimension(50, 20));
        label_10.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_10 = new GridBagConstraints();
        gbc_label_10.fill = GridBagConstraints.VERTICAL;
        gbc_label_10.anchor = GridBagConstraints.EAST;
        gbc_label_10.insets = new Insets(0, 0, 5, 0);
        gbc_label_10.gridx = 0;
        gbc_label_10.gridy = 2;
        panel_4_10.add(label_10, gbc_label_10);
        
        JButton btnNewButton_1_10 = new JButton("Add Cart");
        btnNewButton_1_10.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_10.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_10.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_10 = new GridBagConstraints();
        gbc_btnNewButton_1_10.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_10.gridx = 0;
        gbc_btnNewButton_1_10.gridy = 3;
        panel_4_10.add(btnNewButton_1_10, gbc_btnNewButton_1_10);
        
        JPanel panel_4_11 = new JPanel();
        panel_1_1.add(panel_4_11);
        GridBagLayout gbl_panel_4_11 = new GridBagLayout();
        gbl_panel_4_11.columnWidths = new int[]{50, 0};
        gbl_panel_4_11.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_11.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_11.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_11.setLayout(gbl_panel_4_11);
        
        JLabel imageLabel_11 = new JLabel((Icon) null);
        imageLabel_11.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_11 = new GridBagConstraints();
        gbc_imageLabel_11.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_11.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_11.gridx = 0;
        gbc_imageLabel_11.gridy = 0;
        panel_4_11.add(imageLabel_11, gbc_imageLabel_11);
        
        JLabel lblNewLabel_2_11 = new JLabel("Buger ");
        lblNewLabel_2_11.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_11.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_11.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_11 = new GridBagConstraints();
        gbc_lblNewLabel_2_11.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_11.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_11.gridx = 0;
        gbc_lblNewLabel_2_11.gridy = 1;
        panel_4_11.add(lblNewLabel_2_11, gbc_lblNewLabel_2_11);
        
        JLabel label_11 = new JLabel("2$");
        label_11.setPreferredSize(new Dimension(50, 20));
        label_11.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_11 = new GridBagConstraints();
        gbc_label_11.fill = GridBagConstraints.VERTICAL;
        gbc_label_11.anchor = GridBagConstraints.EAST;
        gbc_label_11.insets = new Insets(0, 0, 5, 0);
        gbc_label_11.gridx = 0;
        gbc_label_11.gridy = 2;
        panel_4_11.add(label_11, gbc_label_11);
        
        JButton btnNewButton_1_11 = new JButton("Add Cart");
        btnNewButton_1_11.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_11.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_11.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_11.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_11 = new GridBagConstraints();
        gbc_btnNewButton_1_11.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_11.gridx = 0;
        gbc_btnNewButton_1_11.gridy = 3;
        panel_4_11.add(btnNewButton_1_11, gbc_btnNewButton_1_11);
        
        JPanel panel_4_12 = new JPanel();
        panel_1_1.add(panel_4_12);
        GridBagLayout gbl_panel_4_12 = new GridBagLayout();
        gbl_panel_4_12.columnWidths = new int[]{50, 0};
        gbl_panel_4_12.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_12.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_12.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_12.setLayout(gbl_panel_4_12);
        
        JLabel imageLabel_12 = new JLabel((Icon) null);
        imageLabel_12.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_12 = new GridBagConstraints();
        gbc_imageLabel_12.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_12.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_12.gridx = 0;
        gbc_imageLabel_12.gridy = 0;
        panel_4_12.add(imageLabel_12, gbc_imageLabel_12);
        
        JLabel lblNewLabel_2_12 = new JLabel("Buger ");
        lblNewLabel_2_12.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_12.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_12.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_12 = new GridBagConstraints();
        gbc_lblNewLabel_2_12.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_12.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_12.gridx = 0;
        gbc_lblNewLabel_2_12.gridy = 1;
        panel_4_12.add(lblNewLabel_2_12, gbc_lblNewLabel_2_12);
        
        JLabel label_12 = new JLabel("2$");
        label_12.setPreferredSize(new Dimension(50, 20));
        label_12.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_12 = new GridBagConstraints();
        gbc_label_12.fill = GridBagConstraints.VERTICAL;
        gbc_label_12.anchor = GridBagConstraints.EAST;
        gbc_label_12.insets = new Insets(0, 0, 5, 0);
        gbc_label_12.gridx = 0;
        gbc_label_12.gridy = 2;
        panel_4_12.add(label_12, gbc_label_12);
        
        JButton btnNewButton_1_12 = new JButton("Add Cart");
        btnNewButton_1_12.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_12.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_12.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_12.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_12 = new GridBagConstraints();
        gbc_btnNewButton_1_12.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_12.gridx = 0;
        gbc_btnNewButton_1_12.gridy = 3;
        panel_4_12.add(btnNewButton_1_12, gbc_btnNewButton_1_12);
        
        JPanel panel_4_13 = new JPanel();
        panel_1_1.add(panel_4_13);
        GridBagLayout gbl_panel_4_13 = new GridBagLayout();
        gbl_panel_4_13.columnWidths = new int[]{50, 0};
        gbl_panel_4_13.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_13.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_13.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_13.setLayout(gbl_panel_4_13);
        
        JLabel imageLabel_13 = new JLabel((Icon) null);
        imageLabel_13.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_13 = new GridBagConstraints();
        gbc_imageLabel_13.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_13.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_13.gridx = 0;
        gbc_imageLabel_13.gridy = 0;
        panel_4_13.add(imageLabel_13, gbc_imageLabel_13);
        
        JLabel lblNewLabel_2_13 = new JLabel("Buger ");
        lblNewLabel_2_13.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_13.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_13.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_13 = new GridBagConstraints();
        gbc_lblNewLabel_2_13.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_13.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_13.gridx = 0;
        gbc_lblNewLabel_2_13.gridy = 1;
        panel_4_13.add(lblNewLabel_2_13, gbc_lblNewLabel_2_13);
        
        JLabel label_13 = new JLabel("2$");
        label_13.setPreferredSize(new Dimension(50, 20));
        label_13.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_13 = new GridBagConstraints();
        gbc_label_13.fill = GridBagConstraints.VERTICAL;
        gbc_label_13.anchor = GridBagConstraints.EAST;
        gbc_label_13.insets = new Insets(0, 0, 5, 0);
        gbc_label_13.gridx = 0;
        gbc_label_13.gridy = 2;
        panel_4_13.add(label_13, gbc_label_13);
        
        JButton btnNewButton_1_13 = new JButton("Add Cart");
        btnNewButton_1_13.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_13.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_13.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_13.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_13 = new GridBagConstraints();
        gbc_btnNewButton_1_13.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_13.gridx = 0;
        gbc_btnNewButton_1_13.gridy = 3;
        panel_4_13.add(btnNewButton_1_13, gbc_btnNewButton_1_13);

        JPanel panel_2_1 = new JPanel();
        FlowLayout flowLayout_1 = (FlowLayout) panel_2_1.getLayout();
        flowLayout_1.setAlignment(FlowLayout.LEFT);
        panel_2_1.setBounds(483, 358, 570, 177);
        panel.add(panel_2_1);
        
        JPanel panel_4_18 = new JPanel();
        panel_2_1.add(panel_4_18);
        GridBagLayout gbl_panel_4_18 = new GridBagLayout();
        gbl_panel_4_18.columnWidths = new int[]{50, 0};
        gbl_panel_4_18.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_18.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_18.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_18.setLayout(gbl_panel_4_18);
        
        JLabel imageLabel_18 = new JLabel((Icon) null);
        imageLabel_18.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_18 = new GridBagConstraints();
        gbc_imageLabel_18.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_18.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_18.gridx = 0;
        gbc_imageLabel_18.gridy = 0;
        panel_4_18.add(imageLabel_18, gbc_imageLabel_18);
        
        JLabel lblNewLabel_2_18 = new JLabel("Buger ");
        lblNewLabel_2_18.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_18.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_18.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_18 = new GridBagConstraints();
        gbc_lblNewLabel_2_18.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_18.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_18.gridx = 0;
        gbc_lblNewLabel_2_18.gridy = 1;
        panel_4_18.add(lblNewLabel_2_18, gbc_lblNewLabel_2_18);
        
        JLabel label_18 = new JLabel("2$");
        label_18.setPreferredSize(new Dimension(50, 20));
        label_18.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_18 = new GridBagConstraints();
        gbc_label_18.fill = GridBagConstraints.VERTICAL;
        gbc_label_18.anchor = GridBagConstraints.EAST;
        gbc_label_18.insets = new Insets(0, 0, 5, 0);
        gbc_label_18.gridx = 0;
        gbc_label_18.gridy = 2;
        panel_4_18.add(label_18, gbc_label_18);
        
        JButton btnNewButton_1_18 = new JButton("Add Cart");
        btnNewButton_1_18.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_18.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_18.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_18.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_18 = new GridBagConstraints();
        gbc_btnNewButton_1_18.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_18.gridx = 0;
        gbc_btnNewButton_1_18.gridy = 3;
        panel_4_18.add(btnNewButton_1_18, gbc_btnNewButton_1_18);
        
        JPanel panel_4_19 = new JPanel();
        panel_2_1.add(panel_4_19);
        GridBagLayout gbl_panel_4_19 = new GridBagLayout();
        gbl_panel_4_19.columnWidths = new int[]{50, 0};
        gbl_panel_4_19.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_19.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_19.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_19.setLayout(gbl_panel_4_19);
        
        JLabel imageLabel_19 = new JLabel((Icon) null);
        imageLabel_19.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_19 = new GridBagConstraints();
        gbc_imageLabel_19.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_19.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_19.gridx = 0;
        gbc_imageLabel_19.gridy = 0;
        panel_4_19.add(imageLabel_19, gbc_imageLabel_19);
        
        JLabel lblNewLabel_2_19 = new JLabel("Buger ");
        lblNewLabel_2_19.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_19.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_19.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_19 = new GridBagConstraints();
        gbc_lblNewLabel_2_19.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_19.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_19.gridx = 0;
        gbc_lblNewLabel_2_19.gridy = 1;
        panel_4_19.add(lblNewLabel_2_19, gbc_lblNewLabel_2_19);
        
        JLabel label_19 = new JLabel("2$");
        label_19.setPreferredSize(new Dimension(50, 20));
        label_19.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_19 = new GridBagConstraints();
        gbc_label_19.fill = GridBagConstraints.VERTICAL;
        gbc_label_19.anchor = GridBagConstraints.EAST;
        gbc_label_19.insets = new Insets(0, 0, 5, 0);
        gbc_label_19.gridx = 0;
        gbc_label_19.gridy = 2;
        panel_4_19.add(label_19, gbc_label_19);
        
        JButton btnNewButton_1_19 = new JButton("Add Cart");
        btnNewButton_1_19.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_19.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_19.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_19.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_19 = new GridBagConstraints();
        gbc_btnNewButton_1_19.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_19.gridx = 0;
        gbc_btnNewButton_1_19.gridy = 3;
        panel_4_19.add(btnNewButton_1_19, gbc_btnNewButton_1_19);
        
        JPanel panel_4_20 = new JPanel();
        panel_2_1.add(panel_4_20);
        GridBagLayout gbl_panel_4_20 = new GridBagLayout();
        gbl_panel_4_20.columnWidths = new int[]{50, 0};
        gbl_panel_4_20.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_20.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_20.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_20.setLayout(gbl_panel_4_20);
        
        JLabel imageLabel_20 = new JLabel((Icon) null);
        imageLabel_20.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_20 = new GridBagConstraints();
        gbc_imageLabel_20.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_20.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_20.gridx = 0;
        gbc_imageLabel_20.gridy = 0;
        panel_4_20.add(imageLabel_20, gbc_imageLabel_20);
        
        JLabel lblNewLabel_2_20 = new JLabel("Buger ");
        lblNewLabel_2_20.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_20.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_20.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_20 = new GridBagConstraints();
        gbc_lblNewLabel_2_20.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_20.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_20.gridx = 0;
        gbc_lblNewLabel_2_20.gridy = 1;
        panel_4_20.add(lblNewLabel_2_20, gbc_lblNewLabel_2_20);
        
        JLabel label_20 = new JLabel("2$");
        label_20.setPreferredSize(new Dimension(50, 20));
        label_20.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_20 = new GridBagConstraints();
        gbc_label_20.fill = GridBagConstraints.VERTICAL;
        gbc_label_20.anchor = GridBagConstraints.EAST;
        gbc_label_20.insets = new Insets(0, 0, 5, 0);
        gbc_label_20.gridx = 0;
        gbc_label_20.gridy = 2;
        panel_4_20.add(label_20, gbc_label_20);
        
        JButton btnNewButton_1_20 = new JButton("Add Cart");
        btnNewButton_1_20.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_20.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_20.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_20.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_20 = new GridBagConstraints();
        gbc_btnNewButton_1_20.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_20.gridx = 0;
        gbc_btnNewButton_1_20.gridy = 3;
        panel_4_20.add(btnNewButton_1_20, gbc_btnNewButton_1_20);
        
        JPanel panel_4_21 = new JPanel();
        panel_2_1.add(panel_4_21);
        GridBagLayout gbl_panel_4_21 = new GridBagLayout();
        gbl_panel_4_21.columnWidths = new int[]{50, 0};
        gbl_panel_4_21.rowHeights = new int[]{50, 10, 10, 10, 0};
        gbl_panel_4_21.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_4_21.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        panel_4_21.setLayout(gbl_panel_4_21);
        
        JLabel imageLabel_21 = new JLabel((Icon) null);
        imageLabel_21.setPreferredSize(new Dimension(50, 50));
        GridBagConstraints gbc_imageLabel_21 = new GridBagConstraints();
        gbc_imageLabel_21.fill = GridBagConstraints.BOTH;
        gbc_imageLabel_21.insets = new Insets(0, 0, 5, 0);
        gbc_imageLabel_21.gridx = 0;
        gbc_imageLabel_21.gridy = 0;
        panel_4_21.add(imageLabel_21, gbc_imageLabel_21);
        
        JLabel lblNewLabel_2_21 = new JLabel("Buger ");
        lblNewLabel_2_21.setPreferredSize(new Dimension(50, 20));
        lblNewLabel_2_21.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_21.setEnabled(false);
        GridBagConstraints gbc_lblNewLabel_2_21 = new GridBagConstraints();
        gbc_lblNewLabel_2_21.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2_21.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_2_21.gridx = 0;
        gbc_lblNewLabel_2_21.gridy = 1;
        panel_4_21.add(lblNewLabel_2_21, gbc_lblNewLabel_2_21);
        
        JLabel label_21 = new JLabel("2$");
        label_21.setPreferredSize(new Dimension(50, 20));
        label_21.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label_21 = new GridBagConstraints();
        gbc_label_21.fill = GridBagConstraints.VERTICAL;
        gbc_label_21.anchor = GridBagConstraints.EAST;
        gbc_label_21.insets = new Insets(0, 0, 5, 0);
        gbc_label_21.gridx = 0;
        gbc_label_21.gridy = 2;
        panel_4_21.add(label_21, gbc_label_21);
        
        JButton btnNewButton_1_21 = new JButton("Add Cart");
        btnNewButton_1_21.setPreferredSize(new Dimension(50, 20));
        btnNewButton_1_21.setMargin(new Insets(0, 0, 0, 0));
        btnNewButton_1_21.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_1_21.setFont(new Font("Tahoma", Font.BOLD, 10));
        GridBagConstraints gbc_btnNewButton_1_21 = new GridBagConstraints();
        gbc_btnNewButton_1_21.fill = GridBagConstraints.BOTH;
        gbc_btnNewButton_1_21.gridx = 0;
        gbc_btnNewButton_1_21.gridy = 3;
        panel_4_21.add(btnNewButton_1_21, gbc_btnNewButton_1_21);

        JLabel lblTopping = new JLabel("Topping");
        lblTopping.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTopping.setBounds(483, 0, 94, 32);
        panel.add(lblTopping);

        JLabel lblTopping_1 = new JLabel("Topping");
        lblTopping_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTopping_1.setBounds(481, 315, 94, 32);
        panel.add(lblTopping_1);

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

        JButton btnThngK = new JButton("Thống kê");
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

        JButton btnQunLSn = new JButton("Quản lý sản phẩm");
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
