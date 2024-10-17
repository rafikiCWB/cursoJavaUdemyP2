package org.example.logica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Andrey");
        palavras.add("Iris");
        palavras.add("Rafael");

        Comparator<String> comparator = new ComparadorPorTamanho();
        palavras.sort(comparator);
        System.out.println(palavras);

        palavras.forEach(System.out::println);

        for (String s : palavras) {
            System.out.println(s);
        }

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);
    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String t) {
        System.out.println(t);
    }

}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length())
            return -1;
        if (o1.length() > o2.length())
            return 1;
        return 0;

    }

}
