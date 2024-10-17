package org.poo.entidades;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Ler um número inteiro N e uma matriz de ordem N
 * contendo números inteiros. Em seguida, mostrar a diagonal principal
 * e quantidade de valores negativos da matriz;
 */
public class Matrizes {

    public static final Double PI = 3.14159;

    public static void main(String[] args) {
        out.println(PI);
        var teclado = new Scanner(System.in);

        var tamanhoDaMatriz = teclado.nextInt();
        int[][] matriz = new int[tamanhoDaMatriz][tamanhoDaMatriz];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        out.println("Main diagonal");
        for (int i = 0; i < matriz.length; i++) {
            out.print(matriz[i][i] + " ");
        }
        out.println();

        // Mostrar quais números da matriz são negativos.
        int count = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    count++;
                }
            }
        }

        out.println("Total negative numbers = " + count);


        teclado.close();
    }

}
