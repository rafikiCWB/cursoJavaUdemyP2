package org.example.estruturadedados;

import static java.lang.System.out;

public class BubbleSort {

    public static void main(String[] args) {
        // Vetor desordenado
        int[] vetor = {1, 6, 2, 8, 7};
        // Aplica o algoritmo Bubber Sort
        bubbleSort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            out.println(vetor[i] + " ");
        }
    }

    private static void bubbleSort(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    // Troca vetor[j+1] e vetor[i]
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    
                }
            }
        }
    }

}
