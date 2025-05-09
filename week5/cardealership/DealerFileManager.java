package week5.cardealership;
import java.io.*;

public class DealerFileManager {

    // Load dealership information and vehicles from CSV file
    public Dealership getDealership() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/inventory.csv"))) {
            String dealershipInfo = br.readLine();
            if (dealershipInfo == null) return new Dealership("Unknown", "", "");

            // Parse dealership info (name|address|phone)
            String[] dealershipParts = dealershipInfo.split("\\|");
            Dealership dealership = new Dealership(dealershipParts[0], dealershipParts[1], dealershipParts[2]);

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                Vehicle v = new Vehicle(
                        Integer.parseInt(parts[0]), Integer.parseInt(parts[1]),
                        parts[2], parts[3], parts[4], parts[5],
                        Integer.parseInt(parts[6]), Double.parseDouble(parts[7])
                );
                dealership.addVehicle(v);
            }
            return dealership;
        } catch (IOException e) {
            e.printStackTrace();
            return new Dealership("Error", "N/A", "N/A");
        }
    }

    // Save dealership and vehicles back to CSV file
    public void saveDealership(Dealership dealership) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/inventory.csv"))) {
            // Write dealership basic info
            bw.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone());
            bw.newLine();

            // Write vehicle info
            for (Vehicle v : dealership.getAllVehicles()) {
                bw.write(v.getVin() + "|" + v.getYear() + "|" + v.getMake() + "|" + v.getModel() + "|"
                        + v.getType() + "|" + v.getColor() + "|" + v.getOdometer() + "|" + v.getPrice());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
