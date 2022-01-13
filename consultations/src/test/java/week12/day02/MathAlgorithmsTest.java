package week12.day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {


    @Test
    void greatestCommonDivisorTest(){
        MathAlgorithms ma = new MathAlgorithms();

        assertEquals(6,ma.greatestCommonDivisor(12,18));
        assertEquals(1,ma.greatestCommonDivisor(25,9));
        assertEquals(6,ma.greatestCommonDivisorWhile(12,18));
        assertEquals(1,ma.greatestCommonDivisorWhile(25,9));
    }

}