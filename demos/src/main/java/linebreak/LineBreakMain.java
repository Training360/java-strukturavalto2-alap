package linebreak;

public class LineBreakMain {

    public static void main(String[] args) {
        System.out.println("John");
        System.out.println("Doe");

        System.out.print("John");
        System.out.print("Doe");

        System.out.println();

        System.out.println("John\r\nDoe");
        System.out.println("John\nDoe");

        System.out.println("John" + System.lineSeparator() + "Doe");

        String names = "John Doe " +
                "Jack Doe " +
                "Jane Doe";

        System.out.println(names);

        names = "John Doe\n" +
                "Jack Doe\n" +
                "Jane Doe";

        System.out.println(names);
    }
}
