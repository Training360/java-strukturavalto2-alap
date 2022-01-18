package lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeNurseryTest {

    TreeNursery treeNursery;

    @BeforeEach
    void init() {
        List<Sapling> saplings = new ArrayList<>(Arrays.asList(
                new Sapling("kocsányos tölgy", 30),
                new Sapling("starking alma", 70),
                new Sapling("besztercei szilva", 85),
                new Sapling("besztercei szilva", 58),
                new Sapling("magyar kajszi", 93),
                new Sapling("besztercei szilva", 102),
                new Sapling("madárbirs", 45)
        ));
        treeNursery = new TreeNursery(saplings);
    }

    @Test
    void testPrune() {
        treeNursery.prune(80);

        assertEquals(70, treeNursery.getSaplings().get(1).getHeight());
        assertEquals(80, treeNursery.getSaplings().get(2).getHeight());
        assertEquals(80, treeNursery.getSaplings().get(4).getHeight());
        assertEquals(45, treeNursery.getSaplings().get(6).getHeight());
    }

    @Test
    void testSell() {
        treeNursery.sell("besztercei szilva", 80);

        assertEquals(5, treeNursery.getSaplings().size());
        assertEquals("besztercei szilva", treeNursery.getSaplings().get(2).getSpecies());
        assertEquals(58, treeNursery.getSaplings().get(2).getHeight());
        assertEquals("madárbirs", treeNursery.getSaplings().get(4).getSpecies());
        assertEquals(45, treeNursery.getSaplings().get(4).getHeight());
    }
}