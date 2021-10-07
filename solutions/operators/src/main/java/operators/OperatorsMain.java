package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        Operators operators = new Operators();

        System.out.println(Integer.toBinaryString(25));

        System.out.println(operators.isEven(1));
        System.out.println(operators.isEven(2));

        System.out.println(operators.getResultOfDivision(16, 3));

        System.out.println(operators.isNull(null));
        System.out.println(operators.isNull(""));

        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty("abc"));
    }
}
