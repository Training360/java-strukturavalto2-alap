package nestedclasses.localinner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OuterTest {

    @Test
    public void testSaySomething() {
        assertEquals("Hello", new Outer().saySomething());
    }
}
