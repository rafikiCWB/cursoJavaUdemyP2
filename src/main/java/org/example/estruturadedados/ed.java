package org.example.estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ed {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("elemento1");
        fila.add("elemento2");
        fila.add("elemento3");

        System.out.println(fila);

        fila.poll();

        System.out.println(fila);

        fila.add("elemento4");
        System.out.println(fila);

        fila.remove();
        fila.remove();

        System.out.println(fila);

        System.out.println("------------------------");

        Stack<String> pilha = new Stack<>();
        pilha.add("elemento1");
        pilha.add("elemento2");
        pilha.add("elemento3");

        System.out.println(pilha);
        pilha.pop();

        System.out.println(pilha);

        pilha.push("Elemento4");

        System.out.println(pilha);

        pilha.pop();
        pilha.pop();

        System.out.println(pilha);

    }
}

