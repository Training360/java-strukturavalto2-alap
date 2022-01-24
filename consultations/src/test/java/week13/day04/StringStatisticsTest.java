package week13.day04;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {



    @Test
    void testVowelsCount(){
        StringStatistics stringStatistics = new StringStatistics();

        Map<Character,Integer> result = stringStatistics.vowelCounter("appletree");

        assertEquals(1,result.get('a'));
        assertEquals(3,result.get('e'));
        assertNull(result.get('u'));
    }

    @Test
    public void mapOrderingByValue(){
        StringStatistics stringStatistics = new StringStatistics();

        Map<Character,Integer> result = stringStatistics.vowelCounter("eappluetruee");

        List<Map.Entry<Character,Integer>> entryList = new LinkedList<>(result.entrySet());

        Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));

        for(Map.Entry<Character,Integer> act : entryList){
            System.out.println(act.getKey()+" "+act.getValue());
        }

    }
}