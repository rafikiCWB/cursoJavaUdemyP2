package org.example.estruturadedados;

import java.util.Arrays;

public class OrdenarLista {
    public static void main(String[] args) {

        int[] arrayDesordenado = {5, 1, 16, -5, 12};
        System.out.println(STR."Array desordenado: \{Arrays.toString(arrayDesordenado)}");
        bubbleSort(arrayDesordenado);
        System.out.println(STR."Array ordenado: \{Arrays.toString(arrayDesordenado)}");
    }

    //method para ordenar o array usando Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }
            // Se não ocorreu nenhuma troca na iteração, o array já está ordenado
            if (!trocou) break;
        }
    }

}
