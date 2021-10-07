package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WithoutAccentsTest {

    @Test
    void testWith() {
        assertEquals('a', new WithoutAccents().convertToCharWithoutAccents('á'));
        assertEquals('e', new WithoutAccents().convertToCharWithoutAccents('é'));
        assertEquals('u', new WithoutAccents().convertToCharWithoutAccents('ű'));
        assertEquals('U', new WithoutAccents().convertToCharWithoutAccents('Ű'));
    }

    @Test
    void testWithout() {
        assertEquals('a', new WithoutAccents().convertToCharWithoutAccents('a'));
        assertEquals('g', new WithoutAccents().convertToCharWithoutAccents('g'));
        assertEquals('z', new WithoutAccents().convertToCharWithoutAccents('z'));
    }
}
