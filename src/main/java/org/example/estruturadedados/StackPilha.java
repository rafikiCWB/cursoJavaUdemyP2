package org.example.estruturadedados;

import java.util.*;

import static java.lang.System.out;

public class StackPilha {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // Pushing elements in the stack
        stack.push("element4");
        stack.push("element3");
        stack.push("element1");
        stack.push("element2");
        out.println("Initial Stack: " + stack);

        // Remove elements in LIFO order
        out.println("Popped element: " + stack.pop());
        out.println("Stack after pop operation: " + stack);

        out.println("- - - - --------------  - - - -");
        //Example code to Array list
        //Array lista permite elementos repetidos e imprime em ordem
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Rafael");
        arrayList.add("Grando");
        arrayList.add("Grando");
        out.println("Elementos do ArrayList" + arrayList);

        out.println("- - - - ----------------- - - - -");

        /**
         *  HashSet imprime os elementos no formato
         *  LIFO == last in first out, ou seja,
         *  último a entrar primeiro a sair, ou seja,
         *  último a ser adicionado primeiro a ser impresso
         *  e não permite elementos repetidos.
         */
        //Example code to Set
        Set<String> setList = new HashSet<>();
        setList.add("Rafael");
        setList.add("Grando");
        setList.add("Rafael");
        setList.add("Paulo");
        setList.add("Iris");
        System.out.println("Elementos de TreeSet" + setList);

        out.println("- - - - --------------- - - - -");

        /**
         * Map é um conjunto chave, valor que não permite elementos
         * repetidos e a impressão de elementos é no formato
         * LIFO
         */
        Map<String, Long> listMap = new HashMap<>();
        listMap.put("Rafael", 27L);
        listMap.put("Paulo", 49L);
        listMap.put("Paulo", 48L);
        listMap.put("Iris", 49L);
        System.out.print("Lista de Map: " + listMap);
    }
}
