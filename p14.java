/* Solution to problem 14 */

import java.math.BigInteger;

public final class p14 implements EulerProblems {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(new p14().run());
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1000000000.0);
    }

    private static final int LIMIT = 1000000;

    public String run() {
        long maxArg = -1;
        long maxChain = 0;
        for (int i = 1; i < LIMIT; i++) {
            int chainLen = collatzChainLength(BigInteger.valueOf(i));
            if (chainLen > maxChain) {
                maxArg = i;
                maxChain = chainLen;
            }
        }
        return Long.toString(maxArg);
    }

    private static final BigInteger CACHE_SIZE = BigInteger.valueOf(LIMIT);

    // Memorization

    private int[] collatzChainLength = new int[CACHE_SIZE.intValue()];

    // Help function to return chain length of given integer

    private int collatzChainLength(BigInteger n) {
        if (n.signum() < 0)
            throw new IllegalArgumentException();

        if (n.compareTo(CACHE_SIZE) >= 0) //  caching not available
            return collatzChainLengthDirect(n);
        int index = n.intValue(); // index the cache

        if (collatzChainLength[index] == 0)
            collatzChainLength[index] = collatzChainLengthDirect(n);
        return collatzChainLength[index];
    }
    // Solve using recursion
    private int collatzChainLengthDirect(BigInteger n) {
        if (n.compareTo(BigInteger.ONE)==0) // Base case
            return 1;
        else if (!n.testBit(0)) // if n is even
            return collatzChainLength(n.shiftRight(1)) +1;
        else // if n is odd
            return collatzChainLength(n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE)) + 1 ;
    }
}
