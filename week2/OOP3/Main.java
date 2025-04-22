package week2.OOP3;

public class Main {
    public static void main(String[] args) {
        // Create Book objects using constructor
        Book book1 = new Book("1984", "George Orwell", 328, true);
        Book book2 = new Book("Becoming", "Michelle Obama", 426, false);

        // Use getters
        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor());
        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor());

        // Use read method
        book1.read();
        book2.read();

        // Use setters
        book1.setPages(250);  // updates page count
        book2.setIsFiction(true); // switches to fiction (and prints message)

        // Recheck
        System.out.println("\nUpdated Book 2: " + book2.getTitle() + ", Fiction: " + book2.isFiction());
    }
}

