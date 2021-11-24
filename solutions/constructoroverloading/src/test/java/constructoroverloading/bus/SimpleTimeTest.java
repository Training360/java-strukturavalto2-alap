package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleTimeTest {

    @Test
    void constructorTest2Parameters() {
        //Given
        SimpleTime time = new SimpleTime(15, 16);
        //Then
        assertEquals(15, time.getHours());
        assertEquals(16, time.getMinutes());
    }

    @Test
    void constructorTest1Parameter() {
        //Given
        SimpleTime time = new SimpleTime(15);
        //Then
        assertEquals(15, time.getHours());
        assertEquals(0, time.getMinutes());
    }

    @Test
    void constructorTestSimpleTimeParameter() {
        //Given
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        //Then
        assertEquals(15, time.getHours());
        assertEquals(16, time.getMinutes());
    }

    @Test
    void differenceAfter() {
        //Given
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        SimpleTime anotherTime = new SimpleTime(new SimpleTime(14, 10));
        //Then
        assertEquals(66, time.getDifference(anotherTime));
    }

    @Test
    void differenceIfEqual() {
        //Given
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        SimpleTime anotherTime = new SimpleTime(new SimpleTime(15, 16));
        //Then
        assertEquals(0, time.getDifference(anotherTime));
    }

    @Test
    void differenceEarlier() {
        //Given
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        SimpleTime anotherTime = new SimpleTime(new SimpleTime(17, 26));
        //Then
        assertEquals(-130, time.getDifference(anotherTime));
    }

    @Test
    void toStringTest() {
        //Given
        SimpleTime time = new SimpleTime(new SimpleTime(15, 16));
        //Then
        assertEquals("15:16", time.toString());
    }
}