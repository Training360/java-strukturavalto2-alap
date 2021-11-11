package firstnumber;

public class FirstNumberMain {

    public static void main(String[] args) {
        FirstNumber firstNumber = new FirstNumber();

        System.out.println(firstNumber.getFirstNumber("This is a String")); // a konzolon ilyenkor egy üres sor látszik
        System.out.println(firstNumber.getFirstNumber("Thi3s is4 a St5ring")); // 3
    }
}
