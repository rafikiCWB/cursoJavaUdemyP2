package org.example.treiniprojectjava;

import java.util.Random;
import java.util.Scanner;

public class SymmetricOrPalindromo {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        var palindromo = teclado.nextLine();
        var random = new Random();
        var numberRandom = random.nextInt(50);
        System.out.println(isSimmetric(palindromo) ? "1" : numberRandom);
        teclado.close();
    }
    public static boolean isSimmetric(String a) {
       /// String str = Integer.toString(a); // Essa linha de código converte um valor inteiro em uma String
        String reverseStr = new StringBuilder(a)
                .reverse().toString();
        return (a.equals(reverseStr));
    }
}
