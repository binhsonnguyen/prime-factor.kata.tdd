package math.primeFactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        while (n > 1) {
            if (n % 2 == 0) {
                primes.add(2);
                n /= 2;
            }
            if (n > 1)
                primes.add(n);
        }
        return primes;
    }
}
