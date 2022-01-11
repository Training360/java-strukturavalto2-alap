package week11.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {


    private int numberOfNumbers;
    private int limit;
    private Random random = new Random();

    public Lottery(int numberOfNumbers, int limit) {
        this.numberOfNumbers = numberOfNumbers;
        this.limit = limit;
    }


    public List<Integer> startLottery(){
        List<Integer> result = new ArrayList<>();

        while(result.size()!=numberOfNumbers){
            int actualNumber = random.nextInt(1,limit+1);
            if(!result.contains(actualNumber)){
                result.add(actualNumber);
            }
        }
        return result;
    }
}
