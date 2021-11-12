package absolute;

public class AbsoluteMain {

    public static void main(String[] args) {
        Absolute absolute = new Absolute();

        System.out.println(absolute.isAbsolute(6)); //true
        System.out.println(absolute.isAbsolute(8128)); //true
        System.out.println(absolute.isAbsolute(7246)); //false
        System.out.println(absolute.isAbsolute(9)); //false
    }
}
