package collectionsautoboxing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {

    Paper paper = new Paper();

    @BeforeEach
    void init() {
        paper.putFurtherPaper("1.a", 23);
        paper.putFurtherPaper("8.b", 15);
        paper.putFurtherPaper("1.a", 13);
        paper.putFurtherPaper("3.c", 56);
        paper.putFurtherPaper("1.a", 47);
        paper.putFurtherPaper("8.b", 3);
        paper.putFurtherPaper("3.c", 145);
        paper.putFurtherPaper("1.a", 63);
        paper.putFurtherPaper("1.a", 71);
    }

    @Test
    void testPutFurtherPaper() {
        paper.putFurtherPaper("8.b", 34);

        assertEquals(52, paper.getPaper().get("8.b"));
    }

    @Test
    void testPutFurtherPaperNewClassName() {
        paper.putFurtherPaper("5.b", 35);

        assertEquals(35, paper.getPaper().get("5.b"));
    }

    @Test
    void testGetWinnerClass() {
        assertEquals("1.a", paper.getWinnerClass());
    }

    @Test
    void testGetTotalWeight() {
        assertEquals(436, paper.getTotalWeight());
    }
}