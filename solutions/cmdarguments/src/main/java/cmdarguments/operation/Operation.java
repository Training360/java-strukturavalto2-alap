package cmdarguments.operation;

public class Operation {

    public static void main(String[] args) {
        for (String s : args) {
            if (s.equals("/list")) {
                System.out.println("Listázás");
            } else if (s.equals("/add")) {
                System.out.println("Hozzáadás");
            } else if (s.equals("/delete")) {
                System.out.println("Törlés");
            } else {
                System.out.println("Ismeretlen művelet");
            }
        }
    }
}
