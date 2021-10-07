package recursion;

import java.util.Arrays;

public class Palindrome {

    public boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }

        char[] charsOfWord = word.toCharArray();
        if (charsOfWord[0] == charsOfWord[charsOfWord.length - 1]) {
            char[] charsReduced = Arrays.copyOfRange(charsOfWord, 1, charsOfWord.length - 1);
            return isPalindrome(new String(charsReduced));
        } else {
            return false;
        }
    }
}
