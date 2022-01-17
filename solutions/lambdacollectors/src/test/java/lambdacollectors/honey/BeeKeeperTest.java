package lambdacollectors.honey;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BeeKeeperTest {

    BeeKeeper beeKeeper;

    @BeforeEach
    void init() {
        List<Honey> glassesOfHoney = new ArrayList<>();
        beeKeeper = new BeeKeeper(glassesOfHoney);
        beeKeeper.addHoney(new Honey(HoneyType.ACACIA, GlassSize.BIG));
        beeKeeper.addHoney(new Honey(HoneyType.LINDEN, GlassSize.BIG));
        beeKeeper.addHoney(new Honey(HoneyType.ACACIA, GlassSize.SMALL));
        beeKeeper.addHoney(new Honey(HoneyType.MULTIFLORAL, GlassSize.TASTER_SIZE));
        beeKeeper.addHoney(new Honey(HoneyType.LINDEN, GlassSize.SMALL));
        beeKeeper.addHoney(new Honey(HoneyType.LINDEN, GlassSize.TASTER_SIZE));
        beeKeeper.addHoney(new Honey(HoneyType.MULTIFLORAL, GlassSize.BIG));
        beeKeeper.addHoney(new Honey(HoneyType.ACACIA, GlassSize.SMALL));
        beeKeeper.addHoney(new Honey(HoneyType.MULTIFLORAL, GlassSize.SMALL));
        beeKeeper.addHoney(new Honey(HoneyType.MULTIFLORAL, GlassSize.BIG));
        beeKeeper.addHoney(new Honey(HoneyType.ACACIA, GlassSize.SMALL));
        beeKeeper.addHoney(new Honey(HoneyType.ACACIA, GlassSize.BIG));
    }

    @Test
    void testGetTotalValueOfGivenGlasses() {
        assertEquals(4050, beeKeeper.getTotalValueOfGivenGlasses(GlassSize.SMALL));
    }

    @Test
    void testGetTotalValueOfGivenGlassesNoSuchGlassSize() {
        beeKeeper = new BeeKeeper(Arrays.asList(
                new Honey(HoneyType.ACACIA, GlassSize.BIG),
                new Honey(HoneyType.LINDEN, GlassSize.BIG),
                new Honey(HoneyType.MULTIFLORAL, GlassSize.TASTER_SIZE)
        ));

        assertEquals(0, beeKeeper.getTotalValueOfGivenGlasses(GlassSize.SMALL));
    }

    @Test
    void testGetTotalValueOfGivenGlassesEmptyList() {
        beeKeeper = new BeeKeeper(new ArrayList<>());

        assertEquals(0, beeKeeper.getTotalValueOfGivenGlasses(GlassSize.SMALL));
    }

    @Test
    void testGetAmountsOfGivenType() {
        Map<GlassSize, Long> expected = Map.of(
                GlassSize.BIG, 2L,
                GlassSize.SMALL, 1L,
                GlassSize.TASTER_SIZE, 1L
        );

        assertEquals(expected, beeKeeper.getAmountsOfGivenType(HoneyType.MULTIFLORAL));
    }

    @Test
    void testGetAmountsOfGivenTypeNoSuchType() {
        beeKeeper = new BeeKeeper(Arrays.asList(
                new Honey(HoneyType.ACACIA, GlassSize.BIG),
                new Honey(HoneyType.LINDEN, GlassSize.BIG),
                new Honey(HoneyType.LINDEN, GlassSize.TASTER_SIZE)
        ));

        assertEquals(new HashMap<>(), beeKeeper.getAmountsOfGivenType(HoneyType.MULTIFLORAL));
    }

    @Test
    void testGetAmountsOfGivenTypeEmptyList() {
        beeKeeper = new BeeKeeper(new ArrayList<>());

        assertEquals(new HashMap<>(), beeKeeper.getAmountsOfGivenType(HoneyType.MULTIFLORAL));
    }

    @Test
    void testGetGroupsByGivenTypeAndSize() {
        Map<Boolean, List<Honey>> expected = beeKeeper.getGroupsByGivenTypeAndSize(HoneyType.ACACIA, GlassSize.BIG);

        assertEquals(2, expected.size());
        assertEquals(2, expected.get(true).size());
        assertEquals(10, expected.get(false).size());
    }

    @Test
    void testGetGroupsByGivenTypeAndSizeNotFoundSuchType() {
        beeKeeper = new BeeKeeper(Arrays.asList(
                new Honey(HoneyType.ACACIA, GlassSize.BIG),
                new Honey(HoneyType.LINDEN, GlassSize.BIG),
                new Honey(HoneyType.MULTIFLORAL, GlassSize.TASTER_SIZE)
        ));
        Map<Boolean, List<Honey>> expected = beeKeeper.getGroupsByGivenTypeAndSize(HoneyType.MULTIFLORAL, GlassSize.BIG);

        assertEquals(2, expected.size());
        assertEquals(0, expected.get(true).size());
        assertEquals(3, expected.get(false).size());
    }

    @Test
    void testGetGroupsByGivenTypeAndSizeNotFoundSuchSize() {
        beeKeeper = new BeeKeeper(Arrays.asList(
                new Honey(HoneyType.ACACIA, GlassSize.BIG),
                new Honey(HoneyType.LINDEN, GlassSize.BIG),
                new Honey(HoneyType.MULTIFLORAL, GlassSize.TASTER_SIZE)
        ));
        Map<Boolean, List<Honey>> expected = beeKeeper.getGroupsByGivenTypeAndSize(HoneyType.ACACIA, GlassSize.SMALL);

        assertEquals(2, expected.size());
        assertEquals(0, expected.get(true).size());
        assertEquals(3, expected.get(false).size());
    }

    @Test
    void testGetGroupsByGivenTypeAndSizeEmptyList() {
        beeKeeper = new BeeKeeper(new ArrayList<>());
        Map<Boolean, List<Honey>> expected = beeKeeper.getGroupsByGivenTypeAndSize(HoneyType.ACACIA, GlassSize.SMALL);

        assertEquals(2, expected.size());
        assertEquals(0, expected.get(true).size());
        assertEquals(0, expected.get(false).size());
    }
}