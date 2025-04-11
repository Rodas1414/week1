
import java.io.*;

/**
 * Manages a collection of programming languages using arrays.
 */
public class LanguageManager implements LanguageManagerInterface {

    // Fields
    private Language[] languages; // Array to store languages
    private int languageCount; // Tracks the number of languages currently stored

    /**
     * Constructs a LanguageManager with an initial capacity of 100.
     */
    public LanguageManager() {
        this.languages = new Language[100]; // Initial capacity
        this.languageCount = 0;
    }

    @Override
    public int getLanguageCount() {
        return languageCount;
    }

    @Override
    public Language getLanguage(int index) {
        if (index < 0 || index >= languageCount) {
            return null; // Return null for invalid index
        }
        return languages[index];
    }

    @Override
    public int findShortestKwdLength() {
        int shortest = Integer.MAX_VALUE;
        for (int i = 0; i < languageCount; i++) {
            int length = languages[i].findShortestKwdLength();
            if (length != -1 && length < shortest) {
                shortest = length;
            }
        }
        return (shortest == Integer.MAX_VALUE) ? -1 : shortest; // Return -1 if no keywords found
    }

    @Override
    public int findLongestKwdLength() {
        int longest = 0;
        for (int i = 0; i < languageCount; i++) {
            int length = languages[i].findLongestKwdLength();
            if (length != -1 && length > longest) {
                longest = length;
            }
        }
        return longest;
    }

    @Override
    public int findLangWithFewestKwds() {
        int minKwds = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < languageCount; i++) {
            int count = languages[i].getKwdCount();
            if (count > 0 && count < minKwds) {
                minKwds = count;
                minIndex = i;
            }
        }
        return minIndex; // Return -1 if no languages with keywords
    }

    @Override
    public int findLangWithMostKwds() {
        int maxKwds = 0;
        int maxIndex = -1;
        for (int i = 0; i < languageCount; i++) {
            int count = languages[i].getKwdCount();
            if (count > maxKwds) {
                maxKwds = count;
                maxIndex = i;
            }
        }
        return maxIndex; // Return -1 if no languages with keywords
    }

    @Override
    public int[] findLangKwdMatches(String keyword) {
        if (keyword == null || keyword.isEmpty()) {
            throw new IllegalArgumentException("Keyword must not be null or empty.");
        }
        int matchCount = 0;
        for (int i = 0; i < languageCount; i++) {
            if (languages[i].findKwd(keyword) != -1) {
                matchCount++;
            }
        }
        int[] matches = new int[matchCount];
        int index = 0;
        for (int i = 0; i < languageCount; i++) {
            if (languages[i].findKwd(keyword) != -1) {
                matches[index++] = i;
            }
        }
        return matches;
    }

    @Override
    public int[] findLangsOfType(Language.Type type) {
        if (type == null) {
            throw new IllegalArgumentException("Type must not be null.");
        }
        int matchCount = 0;
        for (int i = 0; i < languageCount; i++) {
            if (languages[i].getType() == type) {
                matchCount++;
            }
        }
        int[] matches = new int[matchCount];
        int index = 0;
        for (int i = 0; i < languageCount; i++) {
            if (languages[i].getType() == type) {
                matches[index++] = i;
            }
        }
        return matches;
    }

    @Override
    public void sortLangs() {
        for (int i = 1; i < languageCount; i++) {
            Language temp = languages[i];
            int j = i - 1;
            while (j >= 0 && languages[j].getName().compareTo(temp.getName()) > 0) {
                languages[j + 1] = languages[j];
                j--;
            }
            languages[j + 1] = temp;
        }
    }

    /**
     * Adds a language to the manager.
     * 
     * @param language the language to add.
     * @throws IllegalArgumentException if language is null.
     * @throws IllegalStateException    if the array is full.
     */
    public void addLanguage(Language language) {
        if (language == null) {
            throw new IllegalArgumentException("Language must not be null.");
        }
        if (languageCount >= languages.length) {
            throw new IllegalStateException("Language array is full.");
        }
        languages[languageCount++] = language;
    }
}
