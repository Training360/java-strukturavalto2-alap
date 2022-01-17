package nestedclasses.staticnested;

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
        Outer.Inner inner = new Outer.Inner();
        assertEquals("Hello", inner.sayHello());
    }
}
