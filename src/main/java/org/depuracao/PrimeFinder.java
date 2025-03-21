package org.depuracao;

import java.util.stream.IntStream;

public class PrimeFinder {
    static int skip = 0;
    static int limit = 100;


    public static void main(String[] args) {
        if (args.length >= 1) skip = Integer.parseInt(args[0]);
        if (args.length >= 2) limit = Integer.parseInt(args[1]);

        IntStream.iterate(2, n -> n + 1)
                .skip(skip)
                .limit(limit)
                .filter(PrimeTest::isPrime)
                .forEach(System.out::println);
    }
}

class PrimeTest {
    static boolean isPrime(int candidate) {
        //candidate == 91 || // a bug here
        return IntStream.rangeClosed(2, (int) Math.sqrt(candidate))
                .noneMatch(n -> (candidate % n == 0));
    }
}
