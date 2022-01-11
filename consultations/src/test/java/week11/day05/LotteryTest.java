package week11.day05;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {



    @Test
    void testStartLottery(){
        Lottery lottery = new Lottery(5,90);

        List<Integer> result = lottery.startLottery();
        assertEquals(5,result.size());

        for(int i=0;i<result.size();i++){
            assertFalse(result.subList(i+1,result.size()).contains(result.get(i)));
        }

    }

}