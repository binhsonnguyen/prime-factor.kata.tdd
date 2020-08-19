package math.primeFactor;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsTest extends TestCase {
    private List<Integer> list() {
        return new ArrayList<Integer>();
    }

    public void testOne() throws Exception {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    public void testTwo() throws Exception {
        assertEquals(list(2), PrimeFactors.generate(2));
    }
}
