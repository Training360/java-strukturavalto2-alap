package nestedclasses.memberinner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OuterTest {

    @Test
    public void testOuter() {
        Outer outer = new Outer();
        assertEquals("Hello", outer.saySomething());
    }

    @Test
    public void testInner() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        assertEquals("Hello", inner.sayHello());
    }
}
