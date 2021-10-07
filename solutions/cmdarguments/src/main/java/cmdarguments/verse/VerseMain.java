package cmdarguments.verse;

public class VerseMain {

    public static void main(String[] args) {
        for (String s : args) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
