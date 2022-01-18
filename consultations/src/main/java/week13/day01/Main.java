package week13.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    //1,6,4,3,8,9,2
    //1,4,3,6,8,2,9
    //1,3,4,6,2,8,9
    //1,3,4,2,6,8,9
    //1,3,2,4,6,8,9
    //1,2,3,4,6,8,9


    public static void main(String[] args) {
        Integer[] numbers = {1, 6, 4, 3, 8, 9, 2};

        Collections.sort(Arrays.asList(numbers));

//        for (int i = numbers.length; i > 0; i--) {
//            for (int j = 0; j < i-1; j++) {
//              if(numbers[j]>numbers[j+1]){
//                  int temp = numbers[j+1];
//                  numbers[j+1] = numbers[j];
//                  numbers[j] = temp;
//              }
//            }
//        }
//
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
}
