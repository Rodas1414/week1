package week3;

import java.io.*;
import java.util.*;

public class FilePracticeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\n📁 File I/O Menu:");
            System.out.println("1. Write 'Hello, file world!' to a file");
            System.out.println("2. Read that line back");
            System.out.println("3. Write a short poem to a file");
            System.out.println("4. Read the poem line by line");
            System.out.println("5. Ask user for 3 lines and save");
            System.out.println("6. Count how many times a word appears");
            System.out.println("7. Save Book objects to a file");
            System.out.println("8. Read file & build Book objects");
            System.out.println("9. Add a Book to file (append)");
            System.out.println("0. Exit");
            System.out.print("Choose (0–9): ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> writeHello();
                case 2 -> readHello();
                case 3 -> writePoem();
                case 4 -> readPoem();
                case 5 -> saveUserLines(scanner);
                case 6 -> countWord(scanner);
                case 7 -> saveBooks();
                case 8 -> loadBooks();
                case 9 -> appendBook(scanner);
                case 0 -> {
                    System.out.println("👋 Goodbye!");
                    run = false;
                }
                default -> System.out.println("❌ Invalid choice.");
            }
        }
    }

    static void writeHello() {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, file world!");
            System.out.println("✅ Wrote to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readHello() {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line = reader.readLine();
            System.out.println("📄 File says: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writePoem() {
        String[] lines = {
                "Roses are red,",
                "Violets are blue,",
                "Java is cool,",
                "And so are you!"
        };

        try (FileWriter writer = new FileWriter("poem.txt")) {
            for (String line : lines) {
                writer.write(line + "\n");
            }
            System.out.println("✅ Poem written to poem.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readPoem() {
        try (BufferedReader reader = new BufferedReader(new FileReader("poem.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("📖 " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void saveUserLines(Scanner scanner) {
        try (FileWriter writer = new FileWriter("user_input.txt")) {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter line " + i + ": ");
                String line = scanner.nextLine();
                writer.write(line + "\n");
            }
            System.out.println("✅ Saved your lines to user_input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void countWord(Scanner scanner) {
        System.out.print("Enter a word to search for: ");
        String word = scanner.nextLine();
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("user_input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(word.toLowerCase())) {
                    count++;
                }
            }
            System.out.println("🔍 The word \"" + word + "\" appears in " + count + " line(s).");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void saveBooks() {
        Book[] books = {
                new Book("Clean Code", "Robert C. Martin"),
                new Book("Effective Java", "Joshua Bloch"),
                new Book("Head First Java", "Kathy Sierra")
        };

        try (FileWriter writer = new FileWriter("books.txt")) {
            for (Book b : books) {
                writer.write(b.title + ";" + b.author + "\n");
            }
            System.out.println("📚 Book list saved to books.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void loadBooks() {
        List<Book> books = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("books.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";", 2);
                if (parts.length == 2) {
                    books.add(new Book(parts[0], parts[1]));
                }
            }

            System.out.println("📖 Loaded Books:");
            for (Book b : books) {
                System.out.println("- " + b.title + " by " + b.author);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void appendBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        try (FileWriter writer = new FileWriter("books.txt", true)) {
            writer.write(title + ";" + author + "\n");
            System.out.println("✅ Book added to books.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Book class
    static class Book {
        String title;
        String author;

        Book(String t, String a) {
            this.title = t;
            this.author = a;
        }
    }
}

