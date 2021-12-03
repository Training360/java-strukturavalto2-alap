package exceptionmulticatch.aid;

import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AidTest {

    Aid aid = new Aid(1_489_600);

    @Test
    void testCountAmountsOfAid() {
        List<String> expected = Arrays.asList(
                "Budapest: 1489600",
                "Kukutyin: 53200",
                "Kiskunalsófelső: 2800"
        );

        assertEquals(expected, aid.countAmountsOfAid(Paths.get("src/test/resources/population1.txt")));
    }

    @Test
    void testCountAmountsOfAidWithNullParameter() {
        Exception ex = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(null));
        assertEquals("Something went wrong while counting.", ex.getMessage());
        assertEquals(NullPointerException.class, ex.getCause().getClass());
    }

    @Test
    void testCountAmountsOfAidWithNotExistingFilename() {
        Exception ex = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(Paths.get("src/test/resources/xyz.txt")));
        assertEquals("Something went wrong while counting.", ex.getMessage());
        assertEquals(NoSuchFileException.class, ex.getCause().getClass());
    }

    @Test
    void testCountAmountsOfAidWithInvalidLine() {
        Exception ex = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(Paths.get("src/test/resources/population2.txt")));
        assertEquals("Something went wrong while counting.", ex.getMessage());
        assertEquals(ArrayIndexOutOfBoundsException.class, ex.getCause().getClass());
    }

    @Test
    void testCountAmountsOfAidWithInvalidNumber() {
        Exception ex = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(Paths.get("src/test/resources/population3.txt")));
        assertEquals("Something went wrong while counting.", ex.getMessage());
        assertEquals(NumberFormatException.class, ex.getCause().getClass());
    }

    @Test
    void testCountAmountsOfAidWithZeroNumber() {
        Exception ex = assertThrows(IllegalStateException.class,
                () -> aid.countAmountsOfAid(Paths.get("src/test/resources/population4.txt")));
        assertEquals("Something went wrong while counting.", ex.getMessage());
        assertEquals(ArithmeticException.class, ex.getCause().getClass());
    }
}