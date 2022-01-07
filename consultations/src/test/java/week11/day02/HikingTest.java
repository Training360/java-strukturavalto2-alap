package week11.day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {


    @Test
    void testGetPlusElevation(){
        int result = new Hiking().getPlusElevation(List.of(10,20,25,15,18));

        assertEquals(18,result);
    }

    @Test
    void testGetFullElevationIncreasing(){
        int result = new Hiking().getPlusElevation(List.of(10,20,25,30,31));

        assertEquals(21,result);
    }

    @Test
    void testGetFullElevationDecreasing(){
        int result = new Hiking().getPlusElevation(List.of(31,30,20,17,15,3));

        assertEquals(0,result);
    }
}