package numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongNumbersTest {


    @Test
    void testIsArmstrongNumber() {
        ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();

        assertTrue(armstrongNumbers.isArmstrongNumber(2));
        assertTrue(armstrongNumbers.isArmstrongNumber(9));
        assertTrue(armstrongNumbers.isArmstrongNumber(153));
        assertTrue(armstrongNumbers.isArmstrongNumber(370));
        assertTrue(armstrongNumbers.isArmstrongNumber(472335975));
        assertTrue(armstrongNumbers.isArmstrongNumber(534494836));

        assertFalse(armstrongNumbers.isArmstrongNumber(10));
        assertFalse(armstrongNumbers.isArmstrongNumber(672537621));
        assertFalse(armstrongNumbers.isArmstrongNumber(154));

    }

    @Test
    void testIsArmstrongNumberWithNegativeValue() {
        ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> armstrongNumbers.isArmstrongNumber(-2));
        assertEquals("Number can't be negative: -2",iae.getMessage());

        iae = assertThrows(IllegalArgumentException.class, () -> armstrongNumbers.isArmstrongNumber(-4));
        assertEquals("Number can't be negative: -4",iae.getMessage());
    }

}