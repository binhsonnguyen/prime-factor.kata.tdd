package math.primeFactor;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsTest extends TestCase {
    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints) {
            list.add(i);
        }
        return list;
    }

    public void testOne() throws Exception {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    public void testTwo() throws Exception {
        assertEquals(list(2), PrimeFactors.generate(2));
    }
}
