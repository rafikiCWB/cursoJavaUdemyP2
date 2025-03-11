package org.example.logica;

import java.util.Scanner;

public class BinarioParaDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número em binário");
        String binaryNumber = scanner.nextLine();
        binaryForDecimal(binaryNumber, scanner);
    }

    private static void binaryForDecimal(String binaryNumber, Scanner scanner) {
        try {
            int i = Integer.parseInt(binaryNumber, 2);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Número inválido");
        } finally {
            scanner.close();
        }
    }
}
