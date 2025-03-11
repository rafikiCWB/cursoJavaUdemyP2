package org.example.java.streams;

import java.util.stream.IntStream;

import static java.lang.System.out;

public class ApiStream {
    public static void main(String[] args) {
        someStream();
        maiorNumero();
    }

    public static void someStream() {
        var stream = IntStream.range(1, 10);
        stream.filter(n -> n % 2 == 0)
                .forEach(out::println);
    }

    public static void maiorNumero() {
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maior = IntStream.of(numeros).max().getAsInt();
        int menor = IntStream.of(numeros).min().getAsInt();
        out.println("O maior número é: " + maior);
        out.println("O menor número é: " + menor);
    }
}
