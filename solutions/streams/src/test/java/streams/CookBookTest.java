package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CookBookTest {

    CookBook cookBook;

    @BeforeEach
    void init() {
        List<Cake> cakes = Arrays.asList(
                new Cake("Almás pite", Arrays.asList("margarin", "liszt", "cukor", "tojás", "sütőpor", "tejföl", "alma")),
                new Cake("Bejgli", Arrays.asList("liszt", "zsír", "cukor", "élesztő", "tojás", "dió", "mák", "tej", "mazsola", "búzadara")),
                new Cake("Sajtos ropogós", Arrays.asList("liszt", "margarin", "só", "sajt", "tejföl")),
                new Cake("Kókuszgolyó", Arrays.asList("háztartási keksz", "kakaópor", "cukor", "vaj", "tej", "kókuszreszelék")),
                new Cake("Mézeskalács", Arrays.asList("liszt", "cukor", "méz", "margarin", "tojás", "fahéj", "szegfűszeg", "szódabikarbóna")),
                new Cake("Linzer", Arrays.asList("liszt", "vaj", "tojás", "cukor")),
                new Cake("Zserbó", Arrays.asList("liszt", "vaj", "cukor", "tojás", "tej", "sütőpor", "dió", "sárgabarack lekvár", "étcsoki")),
                new Cake("Diós hókifli", Arrays.asList("liszt", "margarin", "tejföl", "cukor", "dió"))
        );
        cookBook = new CookBook(cakes);
    }

    @Test
    void listCakeNamesWithGivenIngredient() {
        List<String> result = cookBook.listCakeNamesWithGivenIngredient("dió");

        assertEquals(3, result.size());
        assertTrue(result.contains("Zserbó"));
        assertFalse(result.contains("Almás pite"));
    }

    @Test
    void listCakeNamesWithMaxIngredients() {
        List<String> result = cookBook.listCakeNamesWithMaxIngredients(5);

        assertEquals(3, result.size());
        assertTrue(result.contains("Linzer"));
        assertFalse(result.contains("Mézeskalács"));
    }
}