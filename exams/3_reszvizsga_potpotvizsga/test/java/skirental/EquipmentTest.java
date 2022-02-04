package skirental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentTest {

    @Test
    void testCreate() {
        Equipment equipment = new Equipment(140, 39);

        assertEquals(140, equipment.getSizeOfSkis());
        assertEquals(39, equipment.getSizeOfBoot());
    }
}