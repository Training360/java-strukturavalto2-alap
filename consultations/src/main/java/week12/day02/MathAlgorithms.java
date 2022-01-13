package week12.day02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MathAlgorithms {

    private List<Integer> myArrayList = new ArrayList<>();
    private List<Integer> myLinkedList = new LinkedList<>();

   public int greatestCommonDivisor(int firstNumber, int secondNumber){

       int gcd=1;
       for(int i=2; i<=firstNumber && i<=secondNumber;i++){
           if(firstNumber%i==0 && secondNumber%i==0){
               gcd=i;
           }
       }
       return gcd;

   }


   public int greatestCommonDivisorWhile(int firstNumber, int secondNumber){

       while(firstNumber!=secondNumber){
            if(firstNumber>secondNumber){
                firstNumber-=secondNumber;
            }else{
                secondNumber-=firstNumber;
            }
       }

       return firstNumber;
   }

}
