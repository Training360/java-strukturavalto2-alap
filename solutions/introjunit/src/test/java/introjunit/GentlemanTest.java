package introjunit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GentlemanTest {

    @Test
    public void testSayHelloWithNormalName() {
        // Given
        String name = "John Doe";

        // When
        String greeting = new Gentleman().sayHello(name);

        // Then
        assertEquals("Hello John Doe", greeting);
    }

    @Test
    public void testSayHelloWithNullName() {
        // Given
        String name = null;

        // When
        String greeting = new Gentleman().sayHello(name);

        // Then
        assertEquals("Hello Anonymous", greeting);
    }
}
