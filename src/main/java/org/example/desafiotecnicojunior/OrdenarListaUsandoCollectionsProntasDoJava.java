package org.example.desafiotecnicojunior;

import java.util.ArrayList;
import java.util.List;

public class OrdenarListaUsandoCollectionsProntasDoJava {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(-1);
        lista.add(1);
        lista.add(4);
        lista.add(8);
        lista.add(-3);

        for (Integer l : lista) {
            System.out.print(STR."\{l} ");
        }
        System.out.println("\n=========\n");
//       ordenar a lista usando o método sort da classe Collections
        lista.sort(Integer::compareTo);
        System.out.println(lista);

        List<String> listaString = new ArrayList<>();
        listaString.add("Maria");
        listaString.add("João");
        listaString.add("Ana");

        for (String l : listaString) {
            System.out.print(STR."\{l} ");
        }
        System.out.println("\n=========\n");
//       ordenar a lista usando o método sort da classe Collections
        listaString.sort(String::compareTo);
        System.out.println(listaString);
    }
}
