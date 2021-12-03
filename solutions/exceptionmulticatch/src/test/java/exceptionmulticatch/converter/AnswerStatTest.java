package exceptionmulticatch.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerStatTest {

    @Test
    void testConvertNullShouldThrowException() {
        AnswerStat answerStat = new AnswerStat(new BinaryStringConverter());

        Exception ex = assertThrows(InvalidBinaryStringException.class, () -> answerStat.convert(null));
        assertEquals("Binary string is null.", ex.getCause().getMessage());
    }

    @Test
    void testConvertInvalidStringShouldThowException() {
        AnswerStat answerStat = new AnswerStat(new BinaryStringConverter());

        Exception ex = assertThrows(InvalidBinaryStringException.class, () -> answerStat.convert("1133"));
        assertEquals("Binary string is not valid.", ex.getCause().getMessage());
    }

    @Test
    void testConvertShouldReturn() {
        BinaryStringConverter binaryStringConverter = new BinaryStringConverter();
        AnswerStat answerStat = new AnswerStat(binaryStringConverter);
        String good = "1100010";

        assertArrayEquals(binaryStringConverter.binaryStringToBooleanArray(good), answerStat.convert(good));
    }

    @Test
    void testAnswerTruePercent() {
        BinaryStringConverter binaryStringConverter = new BinaryStringConverter();
        AnswerStat answerStat = new AnswerStat(binaryStringConverter);

        assertEquals(50, answerStat.answerTruePercent("11000101"));
        assertEquals(80, answerStat.answerTruePercent("1111111100"));
    }
}