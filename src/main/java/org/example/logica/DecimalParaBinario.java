package org.example.logica;

import java.util.Scanner;

public class DecimalParaBinario {
    public static void main(String[] args) {
        System.out.println("Digite um número decimal(base 10)");
        Scanner scanner = new Scanner(System.in);
        int numeroDecimal = scanner.nextInt();
        decimalParaBinario(numeroDecimal);
    }

    private static void decimalParaBinario(int numeroDecimal) {
        if (numeroDecimal < 0) {
            System.out.println("Digite um número positivo");
        } else {
            if (numeroDecimal == 0) {
                System.out.println("O número binário é 0");
            } else {
                StringBuilder numeroBinario = new StringBuilder();
                while (numeroDecimal > 0) {
                    int resto = numeroDecimal % 2;
                    numeroBinario.insert(0, resto);
                    numeroDecimal /= 2;

                }
                System.out.println(numeroBinario);
            }
        }
    }
}
