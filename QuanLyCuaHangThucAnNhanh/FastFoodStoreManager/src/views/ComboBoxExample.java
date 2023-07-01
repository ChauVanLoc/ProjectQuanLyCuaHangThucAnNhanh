package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.YearMonth;

public class ComboBoxExample extends JFrame {
    private JComboBox<Integer> comboBoxMonths;
    private JComboBox<Integer> comboBoxDays;

    public ComboBoxExample() {
        setTitle("ComboBox Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Tạo danh sách các tháng từ 1 đến 12
        Integer[] months = new Integer[12];
        for (int i = 0; i < 12; i++) {
            months[i] = i + 1;
        }

        // Tạo JComboBox cho tháng và thêm các mục vào đó
        comboBoxMonths = new JComboBox<>(months);

        // Thêm ActionListener để xử lý sự kiện khi người dùng chọn một tháng
        comboBoxMonths.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy tháng được chọn
                int selectedMonth = (int) comboBoxMonths.getSelectedItem();

                // Lấy số ngày trong tháng được chọn
                YearMonth yearMonthObject = YearMonth.of(2023, selectedMonth);
                int daysInMonth = yearMonthObject.lengthOfMonth();

                // Cập nhật danh sách các ngày trong JComboBox ngày
                Integer[] days = new Integer[daysInMonth];
                for (int i = 0; i < daysInMonth; i++) {
                    days[i] = i + 1;
                }
                comboBoxDays.setModel(new DefaultComboBoxModel<>(days));
            }
        });

        // Tạo JComboBox cho ngày (ban đầu rỗng)
        comboBoxDays = new JComboBox<>();

        // Thêm JComboBox tháng và ngày vào JFrame
        add(comboBoxMonths);
        add(comboBoxDays);

        pack();
        setLocationRelativeTo(null); // Hiển thị cửa sổ JFrame ở giữa màn hình
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ComboBoxExample();
            }
        });
    }
}
