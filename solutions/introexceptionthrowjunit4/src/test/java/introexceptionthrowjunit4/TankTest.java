package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TankTest {

    private Tank tank = new Tank();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testGetAngle() {
        tank.modifyAngle(2087);
        tank.modifyAngle(-2010);

        assertEquals(77, tank.getAngle());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetAngleSimpleExpection() {
        tank.modifyAngle(2000);
    }

    @Test
    public void testGetAngleExpectedExpection() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Turret can not reach a position between 80° and 280°!");
        tank.modifyAngle(2000);
    }

    @Test
    public void testGetAngleAssertThrows() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(2000));
        assertEquals("Turret can not reach a position between 80° and 280°!", exception.getMessage());
    }
}