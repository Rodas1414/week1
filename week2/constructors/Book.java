package week2.constructors;

public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Overloaded constructor
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.pages = 0;
    }

    public void describe() {
        System.out.println("This book is " + title + " by " + author + " with " + pages + " pages.");
    }
}
