package interfacerules.bill;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BillWriterTest {

    Bill bill;
    BillWriter billWriter;
    List<String> billItems;

    @BeforeEach
    void setUp() {
        bill = new Bill();
        Path path = Paths.get("src/test/resources/billitems.txt");
        billItems = bill.readBillItemsFromFile(path);
    }

    @Test
    void testReadFromFile() {
        assertEquals(4, billItems.size());
        assertTrue(billItems.get(0).startsWith("kenyér"));
    }

    @Test
    void testWriteBillWithSimpleBillWriter() {
        billWriter = new SimpleBillWriter();
        String result = billWriter.writeBill(billItems);

        assertTrue(result.startsWith("kenyér, 1 * 400 = 400 Ft\n"));
    }

    @Test
    void testWriteBillWithComplexBillWriter() {
        billWriter = new ComplexBillWriter();
        String result = billWriter.writeBill(billItems);

        assertTrue(result.startsWith("kenyér; darabszám: 1, egységár: 400, összesen: 400 Ft\n"));
    }
}