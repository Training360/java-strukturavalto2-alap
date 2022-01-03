package week9.day03;

public class Main {


    public static void main(String[] args) {
        Encryption encryption = new Caesar(13);

        String s = encryption.encrypts("APPLE");

        System.out.println(s);
    }
}
