package amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void testAmount() {
        Payable payable = new Amount();

        assertEquals(123, payable.getPayableAmount(123));
    }

    @Test
    void testCash() {
        Payable payable = new Cash();

        assertEquals(125, payable.getPayableAmount(126));
        assertEquals(125, payable.getPayableAmount(123));
        assertEquals(120, payable.getPayableAmount(121));
        assertEquals(120, payable.getPayableAmount(120));
        assertEquals(120, payable.getPayableAmount(118));
    }

    @Test
    void testBankAtm() {
        Payable payable = new BankAtm();

        assertEquals(1000, payable.getPayableAmount(123));
    }
}