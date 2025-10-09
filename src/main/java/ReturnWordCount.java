
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in) {

        String[] words = in.trim().split("\\s+");
        int count = words.length;

        return count;
    }
}
