package nestedclasses.anonymousinner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OuterTest {

    @Test
    public void testGetListSortedIgnoreCase() {
        List<String> words = Arrays.asList("AAA", "BBB", "CDD", "abb", "bcc", "ccc");
        assertEquals(Arrays.asList("AAA", "abb", "BBB", "bcc", "ccc", "CDD"), new Outer(words).getListSortedIgnoreCase());
    }
}
