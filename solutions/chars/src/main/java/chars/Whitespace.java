package chars;

public class Whitespace {

    public String makeWhitespaceToStar(String text) {
        char[] charsOfText = text.toCharArray();
        for (int i = 0; i < charsOfText.length; i++) {
            if (Character.isWhitespace(charsOfText[i])) {
                charsOfText[i] = '*';
            }
        }
        String result = new String(charsOfText);
        return result;
    }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("Ez itt egy alma."));
    }
}
