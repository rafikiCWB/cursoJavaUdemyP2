package org.example.estruturadedados;

import static java.lang.System.out;

public class BubbleSort {

    public static void main(String[] args) {
        // Vetor desordenado
        int[] vetor = {1, 6, 2, 8, 7};
        // Aplica o algoritmo Bubber Sort
        bubbleSort(vetor);
//        out.println(STR."Vetor ordenado: \{Arrays.toString(vetor)}");

        for (int i = 0; i < vetor.length; i++) {
            out.println("Vetor ordenado: " + vetor[i]);
        }
    }

    private static void bubbleSort(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca vetor[j+1] e vetor[i]
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

}
