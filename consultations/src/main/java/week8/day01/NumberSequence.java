package week8.day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

    private List<Integer> numbers = new ArrayList<>();

    public NumberSequence(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public NumberSequence(int count, int minValue, int maxValue) {
        Random random = new Random();
        for(int i=0;i<count;i++){
            numbers.add(random.nextInt(minValue,maxValue+1));
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public List<Integer> closeToAverage(int value){
        List<Integer> result = new ArrayList<>();

        double avg = calculateAvg();

        for(int act : numbers){
            if(Math.abs(act-avg)<=value){
                result.add(act);
            }
        }
        return result;
    }

    private double calculateAvg(){
        double sum = 0;
        for(int act : numbers){
            sum+=act;
        }
        return sum/numbers.size();
    }

}
