package sentences;

public class SentenceTransformer {

    public static final String ENDS = ".!?";

    public String shortenSentence(String sentence) {
        if (!isValidStarting(sentence)) {
            throw new IllegalArgumentException("Must start with capital letter!");
        }
        if (!isValidEnding(sentence)) {
            throw new IllegalArgumentException("Must end with . ! or ?");
        }
        String[] temp = sentence.split(" ");
        if (temp.length > 4) {
            return new StringBuilder(temp[0]).append(" ... ").append(temp[temp.length - 1]).toString();
        }
        return sentence;
    }

    private boolean isValidStarting(String sentence) {
        return sentence.charAt(0) == sentence.toUpperCase().charAt(0);
    }

    private boolean isValidEnding(String sentence) {
        return ENDS.contains("" + sentence.charAt(sentence.length() - 1));
    }
}
