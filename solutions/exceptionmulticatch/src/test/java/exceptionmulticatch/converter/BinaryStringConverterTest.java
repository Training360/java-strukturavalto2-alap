package exceptionmulticatch.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryStringConverterTest {

    @Test
    void testBinaryStringToBooleanArrayShouldInvalidStringThrowException() {
        String binaryString = "011200";
        BinaryStringConverter converter = new BinaryStringConverter();

        Exception ex = assertThrows(IllegalArgumentException.class, () -> converter.binaryStringToBooleanArray(binaryString));
        assertEquals("Binary string is not valid.", ex.getMessage());
    }

    @Test
    void testBinaryStringToBooleanArrayShouldConvert() {
        String binaryString = "0111001";
        BinaryStringConverter converter = new BinaryStringConverter();
        boolean[] expected = new boolean[]{false, true, true, true, false, false, true};

        assertArrayEquals(expected, converter.binaryStringToBooleanArray(binaryString));
    }

    @Test
    void testBooleanArrayToBinaryStringShouldEmptyArrayThrowException() {
        boolean[] booleans = new boolean[0];
        BinaryStringConverter converter = new BinaryStringConverter();

        Exception ex = assertThrows(IllegalArgumentException.class, () -> converter.booleanArrayToBinaryString(booleans));
        assertEquals("Boolean array is empty.", ex.getMessage());
    }

    @Test
    void testBooleanArrayToBinaryStringShouldConvert() {
        boolean[] booleans = new boolean[]{false, true, true, false, false};
        BinaryStringConverter converter = new BinaryStringConverter();
        String expected = "01100";

        assertEquals(expected, converter.booleanArrayToBinaryString(booleans));
    }
}