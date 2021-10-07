package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String text) {
        text = text.trim();
        StringBuilder sb = new StringBuilder(text);

        return text.equalsIgnoreCase(sb.reverse().toString());
    }

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();

        System.out.println(palindromeValidator.isPalindrome("Racecar"));
        System.out.println(palindromeValidator.isPalindrome("start"));
        System.out.println(palindromeValidator.isPalindrome(""));
        System.out.println(palindromeValidator.isPalindrome("\n\t"));
    }
}
