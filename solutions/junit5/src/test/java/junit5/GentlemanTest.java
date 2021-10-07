package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GentlemanTest {

    @Test
    void testSayHelloWithNormalName() {
        // Given
        String name = "John Doe";

        // When
        String greeting = new Gentleman().sayHello(name);

        // Then
        assertEquals("Hello John Doe", greeting);
    }

    @Test
    void testSayHelloWithNullName() {
        // Given
        String name = null;

        // When
        String greeting = new Gentleman().sayHello(name);

        // Then
        assertEquals("Hello Anonymous", greeting);
    }
}
