/**
 * Required methods and enums for the Language class
 * @author      Bill Barry
 * @version     2023-06-24
 */
public interface LanguageInterface {

    /**
     * categories into which languages fit (mutually exclusive)
     */
    public enum Type {
        /** typically implemented as a compiled language */
        COMPILED,
        /** typically implemented as an interpreted language */
        INTERPRETED,
        /** a scripting language, designed for integrating and communicating with other languages */
        SCRIPTING,
        /** specialty languages that analyze and interpret data sets */
        NUMERICAL_ANALYSIS
    }

    /**
     * Retrieves the name of the language
     * @return      language name
     */
    public String getName();

    /**
     * Retrieves the filename for keywords
     * @return      filename in which keywords do (or would) reside
     */
    public String getFilename();

    /**
     * Retrieves the typical implementation type for the language
     * @return      typical implementation type
     */
    public Type getType();

    /**
     * Retrieves a count of keywords for the language
     * @return      count of keywords
     */
    public int getKwdCount();

    /**
     * Retrieves the keyword at the specified index
     * @param index     index of the keyword; must be a valid index in the range 0 to count - 1
     * @return          keyword at the specified index in the list
     */
    public String getKwd(int index);

    /**
     * Retrieves the index associated with the specified keyword
     * @param keyword       keyword to search for
     * @return              index of keyword, or -1 if no match is found
     */
    public int findKwd(String keyword);

    /**
     * determines the length of the shortest keyword in the keyword list
     * @return  length of the shortest keyword, or -1 if there are no keywords in the list
     */
    public int findShortestKwdLength();

    /**
     * determines the length of the longest keyword in the keyword list
     * @return  length of the longest keyword, or -1 if there are no keywords in the list
     */
    public int findLongestKwdLength();

    /**
     * Retrieves a representation of basic language information
     * @return      string representation of the language
     */

    /**
     * Sorts keywords alphabetically (case-sensitive).  Implements an Insertion Sort adapted from the
     *      code given in class (see slides on Sorting).
     */
    public void sortKwds();


}
