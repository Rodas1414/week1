# Dealership Inventory Management System

Welcome to the **Dealership Inventory Management System**! 🚗💨  
This project is a **Java Swing** application that helps you manage your dealership's vehicle inventory. It allows you to read from and write to a **CSV file**, view vehicle data in a **GUI**, and refresh the inventory whenever needed.

## Features
- 📋 View the list of vehicles in the dealership's inventory.
- 🔄 Refresh the inventory to update the vehicle list.
- 📝 Dealership data (name, address, phone) and vehicle information (VIN, year, make, model, type, color, odometer, price) are stored in a CSV file.
- 🚙 Add/remove vehicles functionality can be added as an extension.

## Technologies Used
- **Java 17+** (or higher) for core language features
- **Java Swing** for GUI components
- **CSV file I/O** for storing and reading dealership data and vehicles

## Project Structure

1. **Main.java**  
   The entry point of the application, which initializes the UI using `SwingUtilities.invokeLater()`.

2. **DealershipUI.java**  
   The graphical user interface for displaying the list of vehicles. It uses `JTable` to show the inventory data and `JButton` for refreshing the list.

3. **Dealership.java**  
   A class representing the dealership's details and managing the list of vehicles.

4. **DealerFileManager.java**  
   Handles reading from and writing to a CSV file (`inventory.csv`), which contains the dealership's and vehicles' data.

5. **Vehicle.java**  
   Represents a vehicle object with properties like VIN, year, make, model, type, color, odometer reading, and price.

## Requirements

- **JDK 17+**
- **IDE** (Optional): IntelliJ IDEA, Eclipse, or any Java IDE to run the application.
- **CSV File**: Ensure the `inventory.csv` file exists in the project directory.

## Setup Instructions

### 1. Clone the repository
Clone the repository or copy the project files to your local machine.

### 2. Set up the CSV file
Create a file named `inventory.csv` in the root directory of the project with the following structure:

