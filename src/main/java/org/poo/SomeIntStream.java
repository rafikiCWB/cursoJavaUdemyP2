package org.poo;

import java.util.*;
import java.util.stream.IntStream;

import static java.lang.System.out;

/**
 * The SomeIntStream class contains utility methods for working with integer streams.
 * It provides methods to perform operations on streams like filtering, printing, and manipulating
 * collections like lists and sets. It also demonstrates the usage of String formatting.
 *
 * The class provides the following methods:
 * - someStream: performs filtering on a stream of integers and prints the filtered values.
 * - listaLigada: populates a list with integers using IntStream and prints the list.
 * - tupla: creates an integer array and prints its contents.
 * - useStringFormat: demonstrates the usage of String formatting by printing a formatted string.
 * - conjunto: performs operations on a set like adding, removing, checking for presence, and printing its elements.
 *
 * The class also contains a main method that demonstrates the usage of the above methods.
 */
public class SomeIntStream {

    private static final List<Integer> listNumbers = new ArrayList<>();
    private static int[] vetorNumbers;

    public static void someStream() {
        var stream = IntStream.range(1, 10);
        stream.filter(n -> n % 2 == 0)
                .forEach(out::println);
    }

    public static void listaLigada() {
        IntStream.range(1, 10).forEach(listNumbers::add);
        out.println(listNumbers);
    }

    public static void tupla() {
        vetorNumbers = new int[10];
        out.println(Arrays.toString(vetorNumbers));
    }

    public static void useStringFormat() {
        String nome = "rafael";
        String sobrenome = "Grando";
        int idade = 18;
        out.printf("%s %s %d%n", nome, sobrenome, idade);
    }

    public void conjunto() {
        Set<String> set = new HashSet<>();

        // Adicionando elementos ao conjunto
        set.add("Morando");
        set.add("Maçã");
        set.add("Banana");
        set.add("Laranja");
        set.add("Maçã");  // Duplicata, não será adicionada
        set.add("Pera");
        set.add("Melancia");
        out.println(set);

        // Verificando se um elemento está no conjunto
        boolean containsBanana = set.contains("Banana");
        out.println("\nConjunto contém 'Banana': " + containsBanana);

        // Tamanho do conjunto
        int size = set.size();
        out.println("\nTamanho do conjunto: " + size);

        // Removendo um elemento
        set.remove("Pera");
        out.println("\nElementos no conjunto após remoção:");
        for (String fruit : set) {
            out.println(">" + fruit);
        }
    }

    // Method Main
    public static void main(String[] args) {
        listaLigada();
        tupla();
        someStream();
        useStringFormat();

        var some = new SomeIntStream();
        some.conjunto();
    }
}
