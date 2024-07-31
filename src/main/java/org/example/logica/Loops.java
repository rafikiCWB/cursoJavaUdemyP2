package org.example.logica;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);

        String key = "s";
        while (key.equalsIgnoreCase(key)) {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();
            System.out.println("O número digitado foi: " + numero);

            System.out.print("Deseja continuar? [s/n]: ");
            key = teclado.next();
            if (key.equalsIgnoreCase("n")) {
                break;
            }

        }

        teclado.close();
    }
}
