package math.primeFactor;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

import static math.primeFactor.PrimeFactors.generate;

public class PrimeFactorsTest extends TestCase {
    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints) {
            list.add(i);
        }
        return list;
    }

    public void testOne() throws Exception {
        assertEquals(list(), generate(1));
    }

    public void testTwo() throws Exception {
        assertEquals(list(2), generate(2));
    }

    public void testThree() throws Exception {
        assertEquals(list(3), generate(3));
    }
}
