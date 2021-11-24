package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoomTest {

    @Test
    void testCreate() {
        //Given
        Room room = new Room("I. em. 12.", 20);
        //Then
        assertEquals("I. em. 12.", room.getLocation());
        assertEquals(20, room.getCapacity());
    }
}