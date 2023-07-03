package views;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class SwingTableExample extends JFrame {

    public SwingTableExample(ArrayList<MyObject> dataList) {
        setTitle("Swing Table Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a custom table model with the object list and column names
        CustomTableModel tableModel = new CustomTableModel(dataList);

        // Create JTable with the custom table model
        JTable table = new JTable(tableModel);
        
        // Set custom cell renderer to apply hover effect
        table.setDefaultRenderer(Object.class, new HoverCellRenderer());

        // Add JTable to JScrollPane for scrolling support
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane);

        pack();
        setLocationRelativeTo(null);
    }

    // Custom table model extends AbstractTableModel
    class CustomTableModel extends AbstractTableModel {
        private ArrayList<MyObject> dataList;
        private String[] columnNames = { "Column 1", "Column 2", "Column 3" };

        public CustomTableModel(ArrayList<MyObject> dataList) {
            this.dataList = dataList;
        }

        @Override
        public int getRowCount() {
            return dataList.size();
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }

        @Override
        public Object getValueAt(int row, int column) {
            MyObject myObject = dataList.get(row);
            switch (column) {
                case 0:
                    return myObject.getProperty1();
                case 1:
                    return myObject.getProperty2();
                case 2:
                    return myObject.getProperty3();
                default:
                    return null;
            }
        }
    }

    // Custom cell renderer to apply hover effect
    class HoverCellRenderer extends DefaultTableCellRenderer {
        private Color hoverBackgroundColor = new Color(200, 200, 255);

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
            Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Apply hover effect when the cell is not selected
            if (!isSelected) {
                if (table.isRowSelected(row)) {
                    cellComponent.setBackground(table.getSelectionBackground());
                } else {
                    cellComponent.setBackground(row % 2 == 0 ? table.getBackground() : hoverBackgroundColor);
                }
            }

            return cellComponent;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ArrayList<MyObject> dataList = new ArrayList<>();
            dataList.add(new MyObject("Value 1", "Value 2", "Value 3"));
            dataList.add(new MyObject("Value 4", "Value 5", "Value 6"));
            dataList.add(new MyObject("Value 7", "Value 8", "Value 9"));
            dataList.add(new MyObject("số 4", "fad", "mous"));

            SwingTableExample example = new SwingTableExample(dataList);
            example.setVisible(true);
        });
    }
}

// Define the MyObject class to represent objects in the ArrayList
class MyObject {
    private String property1;
    private String property2;
    private String property3;

    public MyObject(String property1, String property2, String property3) {
        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
    }

    public String getProperty1() {
        return property1;
    }

    public String getProperty2() {
        return property2;
    }

    public String getProperty3() {
        return property3;
    }
}
