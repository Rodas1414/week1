package week5.cardealership;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DealershipUI().setVisible(true));
    }
}