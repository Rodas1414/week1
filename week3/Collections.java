package week3;

import java.util.ArrayList;

public class Collections {

    public static void main(String[] args) {

        // Part 1: List of favorite artists (strings)
        ArrayList<String> favoriteArtists = new ArrayList<>();
        favoriteArtists.add("Vincent van Gogh");
        favoriteArtists.add("Pablo Picasso");
        favoriteArtists.add("Claude Monet");

        // Print all favorite artists using a loop
        System.out.println("Favorite Artists:");
        for (String artist : favoriteArtists) {
            System.out.println(artist);
        }

        // Remove the least favorite artist (Claude Monet in this case)
        favoriteArtists.remove("Claude Monet");

        // Add a new artist
        favoriteArtists.add("Frida Kahlo");

        // Print all favorite artists after modifications
        System.out.println("\nUpdated Favorite Artists:");
        for (String artist : favoriteArtists) {
            System.out.println(artist);
        }

        // Part 2: List of favorite numbers (integers)
        ArrayList<Integer> favoriteNumbers = new ArrayList<>();
        favoriteNumbers.add(7);
        favoriteNumbers.add(3);
        favoriteNumbers.add(9);

        // Print all favorite numbers using a loop
        System.out.println("\nFavorite Numbers:");
        for (int number : favoriteNumbers) {
            System.out.println(number);
        }

        // Remove the least favorite number (3 in this case)
        favoriteNumbers.remove(Integer.valueOf(3));

        // Add a new number
        favoriteNumbers.add(42);

        // Print all favorite numbers after modifications
        System.out.println("\nUpdated Favorite Numbers:");
        for (int number : favoriteNumbers) {
            System.out.println(number);
        }

        // Sum all of the numbers and print the total
        int totalSum = 0;
        for (int number : favoriteNumbers) {
            totalSum += number;
        }
        System.out.println("\nTotal Sum of Favorite Numbers: " + totalSum);

        // Part 3: List of Book objects (using a Book class)
        class Book {
            String title;
            String author;

            public Book(String title, String author) {
                this.title = title;
                this.author = author;
            }

            public String getTitle() {
                return title;
            }

            public String getAuthor() {
                return author;
            }
        }

        // Create three Book objects
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create a list of books
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        // Print the title of all books
        System.out.println("\nBooks (Titles Only):");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }

        // Remove the last book
        books.remove(books.size() - 1);

        // Add a new book
        Book book4 = new Book("Moby Dick", "Herman Melville");
        books.add(book4);

        // Print title and author for each book
        System.out.println("\nUpdated Books (Title and Author):");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}
