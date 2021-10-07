package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adjon meg egy legfeljebb 5 betűt tartalmazó szót!");
        String word = scanner.nextLine();
        if (word.length() > 5) {
            throw new IllegalArgumentException("Word is too long!");
        }
        char[] charsOfWord = word.toCharArray();
        for (char c : charsOfWord) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException("Not a word: " + word);
            }
        }
        System.out.println("Az Ön által megadott szó: " + word);
    }
}
