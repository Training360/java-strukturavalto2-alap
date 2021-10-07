package chars;

import java.util.Arrays;

public class CharsMain {

    public static void main(String[] args) {
//        char c = 'a';
//
//        if ('0' <= c && c < '9') {
//            System.out.println("számjegy");
//        }
//        if ('a' <= c && c < 'z') {
//            System.out.println("kisbetű");
//        }
//
//        System.out.println(Character.isAlphabetic(c));
//        System.out.println(Character.isDigit(c));

//        if (c == 'b') {
//            System.out.println("Ez egy a karakter");
//        }

        String welcome = "Hello";
        System.out.println(welcome.charAt(0));

        char[] letters = welcome.toCharArray();
        System.out.println(Arrays.toString(letters));

        for (char c: letters) {
            System.out.println(c);
        }

        char[] word = {'h', 'e', 'l', 'l', 'o'};
        String message = new String(word);
        System.out.println(message);
    }
}
