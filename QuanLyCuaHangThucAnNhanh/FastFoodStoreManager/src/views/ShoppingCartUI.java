package views;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import models.product.Product;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartUI extends JFrame {
    private DefaultListModel<Product> productListModel;
    private JList<Product> productList;
    private JButton addButton;
    private JButton removeButton;
    private JButton checkoutButton;

    public ShoppingCartUI() {
        setTitle("Giỏ hàng - Cửa hàng thức ăn nhanh");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Panel chính
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(mainPanel);

        // Danh sách sản phẩm
        productListModel = new DefaultListModel<>();
        productList = new JList<>(productListModel);
        JScrollPane scrollPane = new JScrollPane(productList);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Panel nút điều khiển
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Nút thêm sản phẩm
        addButton = new JButton("Thêm sản phẩm");
        buttonPanel.add(addButton);

        // Nút xóa sản phẩm
        removeButton = new JButton("Xóa sản phẩm");
        buttonPanel.add(removeButton);

        // Nút hoàn thành đơn hàng
        checkoutButton = new JButton("Hoàn thành đơn hàng");
        buttonPanel.add(checkoutButton);

        // Xử lý sự kiện
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hiển thị hộp thoại để thêm sản phẩm
                String id = JOptionPane.showInputDialog(ShoppingCartUI.this, "Nhập ID sản phẩm:");
                String name = JOptionPane.showInputDialog(ShoppingCartUI.this, "Nhập tên sản phẩm:");
                float quantity = Float.parseFloat(JOptionPane.showInputDialog(ShoppingCartUI.this, "Nhập số lượng sản phẩm:"));
                float quantitySold = Float.parseFloat(JOptionPane.showInputDialog(ShoppingCartUI.this, "Nhập số lượng đã bán:"));
                float price = Float.parseFloat(JOptionPane.showInputDialog(ShoppingCartUI.this, "Nhập giá sản phẩm:"));
                String addressImage = JOptionPane.showInputDialog(ShoppingCartUI.this, "Nhập đường dẫn hình ảnh:");
                // Tạo đối tượng Product mới
                Product product = new Product(id, name, quantity, quantitySold, price, addressImage, new ArrayList<>(), null);
                productListModel.addElement(product);
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = productList.getSelectedIndex();
                if (selectedIndex != -1) {
                    productListModel.remove(selectedIndex);
                }
            }
        });

        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Xử lý hoàn thành đơn hàng ở đây
                JOptionPane.showMessageDialog(ShoppingCartUI.this, "Đơn hàng đã được hoàn thành!");
                productListModel.clear();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ShoppingCartUI shoppingCartUI = new ShoppingCartUI();
                shoppingCartUI.setVisible(true);
            }
        });
    }
}

