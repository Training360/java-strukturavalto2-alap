package numbers;

public class PerfectNumbersMain {

    public static void main(String[] args) {
        PerfectNumbers perfectNumbers = new PerfectNumbers();

        System.out.println(perfectNumbers.isPerfectNumber(6)); //true
        System.out.println(perfectNumbers.isPerfectNumber(8128)); //true
        System.out.println(perfectNumbers.isPerfectNumber(7246)); //false
        System.out.println(perfectNumbers.isPerfectNumber(9)); //false
    }
}
