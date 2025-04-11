
import java.io.*;

/**
 * Represents a programming language with associated properties and keywords.
 */
public class Language implements LanguageInterface {

    // Fields
    private String name;
    private String filename;
    private Type type;
    private String[] keywords; // To store language keywords
    private int keywordCount; // Number of keywords currently stored

    /**
     * Constructs a Language object with the given properties.
     * 
     * @param name     the name of the language.
     * @param filename the filename associated with the language.
     * @param type     the type of the language.
     * @throws IllegalArgumentException if name or filename is null or type is null.
     */
    public Language(String name, String filename, Type type) {
        if (name == null || filename == null || type == null) {
            throw new IllegalArgumentException("Name, filename, and type must not be null.");
        }
        this.name = name;
        this.filename = filename;
        this.type = type;
        this.keywords = new String[100]; // Arbitrary initial capacity
        this.keywordCount = 0;
    }

    // Getter methods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFilename() {
        return filename;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public int getKwdCount() {
        return keywordCount;
    }

    @Override
    public String getKwd(int index) {
        if (index < 0 || index >= keywordCount) {
            return null; // Return null for invalid index
        }
        return keywords[index];
    }

    @Override
    public int findKwd(String keyword) {
        if (keyword == null) {
            throw new IllegalArgumentException("Keyword must not be null.");
        }
        for (int i = 0; i < keywordCount; i++) {
            if (keywords[i].equals(keyword)) {
                return i;
            }
        }
        return -1; // Not found
    }

    @Override
    public int findShortestKwdLength() {
        if (keywordCount == 0) {
            return -1; // No keywords available
        }
        int shortest = Integer.MAX_VALUE;
        for (int i = 0; i < keywordCount; i++) {
            shortest = Math.min(shortest, keywords[i].length());
        }
        return shortest;
    }

    @Override
    public int findLongestKwdLength() {
        if (keywordCount == 0) {
            return -1; // No keywords available
        }
        int longest = 0;
        for (int i = 0; i < keywordCount; i++) {
            longest = Math.max(longest, keywords[i].length());
        }
        return longest;
    }

    @Override
    public void sortKwds() {
        for (int i = 1; i < keywordCount; i++) {
            String temp = keywords[i];
            int j = i - 1;
            while (j >= 0 && keywords[j].compareTo(temp) > 0) {
                keywords[j + 1] = keywords[j];
                j--;
            }
            keywords[j + 1] = temp;
        }
    }

    /**
     * Adds a keyword to the array.
     * 
     * @param keyword the keyword to add.
     * @throws IllegalArgumentException if keyword is null or empty.
     * @throws IllegalStateException    if the keyword array is full.
     */
    public void addKeyword(String keyword) {
        if (keyword == null || keyword.isEmpty()) {
            throw new IllegalArgumentException("Keyword must not be null or empty.");
        }
        if (keywordCount >= keywords.length) {
            throw new IllegalStateException("Keyword array is full.");
        }
        keywords[keywordCount++] = keyword;
    }
}
