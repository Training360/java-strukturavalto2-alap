package numbers;

public class ArmstrongNumbers {


    public boolean isArmstrongNumber(int number){
        if(number<0){
            throw new IllegalArgumentException("Number can't be negative: "+number);
        }
        int sum = 0;
        int numberOfDigits = Integer.toString(number).length();
        int original = number;
        while(number !=0){
            int digit = number%10;
            number = number/10;
            sum+=Math.pow(digit,numberOfDigits);
        }
        return sum == original;
    }

}
