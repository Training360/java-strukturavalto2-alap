package chars;

import java.util.Scanner;

public class Words {

    public String pushWord(String word) {
        char[] charsOfWord = word.toCharArray();
        for (int i = 0; i < charsOfWord.length; i++) {
            charsOfWord[i] += 1;
        }
        String result = new String(charsOfWord);
        return result;
    }

    public static void main(String[] args) {
        Words words = new Words();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy tetszőleges szót!");
        String word = scanner.nextLine();

        String result = words.pushWord(word);
        System.out.println("Az eredmény: " + result);
    }
}
