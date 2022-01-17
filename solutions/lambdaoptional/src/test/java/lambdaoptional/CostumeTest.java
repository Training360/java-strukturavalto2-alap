package lambdaoptional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CostumeTest {

    @Test
    void testCreate() {
        Costume costume = new Costume("tűzokádó sárkány jelmez", Size.S, 2500);

        assertEquals("tűzokádó sárkány jelmez", costume.getDescription());
        assertEquals(Size.S, costume.getSize());
        assertEquals(2500, costume.getPrice());
    }
}