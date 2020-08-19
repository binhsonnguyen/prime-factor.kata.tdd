package math.primeFactor;

import junit.framework.TestCase;

import java.util.List;

public class PrimeFactorsTest extends TestCase {
    public void testOne() throws Exception {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    private List<Integer> list() {
        return null;
    }
}
