package week5.cardealership;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class DealershipUI extends JFrame {
    private Dealership dealership;
    private JTable vehicleTable;
    private DefaultTableModel tableModel;

    public DealershipUI() {
        setTitle("Dealership Inventory");
        setSize(900, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Load dealership and inventory from the file manager
        dealership = new DealerFileManager().getDealership();

        // Table model for vehicle data
        String[] columns = {"VIN", "Year", "Make", "Model", "Type", "Color", "Odometer", "Price"};
        tableModel = new DefaultTableModel(columns, 0);
        vehicleTable = new JTable(tableModel);

        // Load vehicles into the table
        loadVehicles();

        // Button to refresh vehicle list
        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(e -> loadVehicles());

        // Layout and positioning
        JPanel topPanel = new JPanel();
        topPanel.add(refreshButton);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(vehicleTable), BorderLayout.CENTER);
    }

    // Load vehicles from dealership and update table
    private void loadVehicles() {
        tableModel.setRowCount(0);  // Clear existing data
        List<Vehicle> vehicles = dealership.getAllVehicles();
        for (Vehicle v : vehicles) {
            Object[] row = {
                    v.getVin(), v.getYear(), v.getMake(), v.getModel(),
                    v.getType(), v.getColor(), v.getOdometer(), v.getPrice()
            };
            tableModel.addRow(row);
        }
    }
}
