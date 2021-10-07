package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class EmployeeTest {

    //@Test(expected = IllegalArgumentException.class)

//    @Rule
//    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testCreate() {
//        expectedException.expect(IllegalArgumentException.class);
//        expectedException.expectMessage("Name can not be empty!");

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Employee(""));

        assertEquals("Name can not be empty!", iae.getMessage());
    }
}
