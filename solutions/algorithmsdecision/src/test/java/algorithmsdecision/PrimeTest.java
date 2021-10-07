package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void testIsPrime() {
        Prime prime = new Prime();

        assertEquals(false, prime.isPrime(-1));
        assertEquals(false, prime.isPrime(0));
        assertEquals(false, prime.isPrime(1));
        assertEquals(true, prime.isPrime(2));
        assertEquals(false, prime.isPrime(27));
        assertEquals(true, prime.isPrime(29));
    }
}