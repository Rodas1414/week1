package week2.OOP3;

public class Book {
    // Private fields
    private String title;
    private String author;
    private int pages;
    private boolean isFiction;

    // Constructor
    public Book(String title, String author, int pages, boolean isFiction) {
        this.title = title;
        this.author = author;
        setPages(pages);         // Validation via setter
        setIsFiction(isFiction); // Fun message via setter
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Pages must be greater than 0.");
        }
        this.pages = pages;
    }

    public boolean isFiction() {
        return isFiction;
    }

    public void setIsFiction(boolean isFiction) {
        this.isFiction = isFiction;
        if (isFiction) {
            System.out.println("Ah, a fictional tale!");
        } else {
            System.out.println("Real-life drama, huh?");
        }
    }

    // Bonus method
    public void read() {
        if (pages < 100) {
            System.out.println("'" + title + "' is a quick read.");
        } else if (pages <= 300) {
            System.out.println("'" + title + "' is a nice, solid book.");
        } else {
            System.out.println("'" + title + "' is a long read—get comfy!");
        }
    }
}

