package org.example.treiniprojectjava;

import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var random = new Random();
        String jogarNovament;
        do {
            int randomNum = random.nextInt(10) + 1;
            out.println("Adivinha o número random entre 0 a 10:");
            int meuNumeroEscolhido = 0;
            while (true) {
                meuNumeroEscolhido = keyboard.nextInt();
                if (meuNumeroEscolhido != randomNum) {
                    System.out.println("Você errou!");
                } else {
                    System.out.println("!!!!!Você acertou!!!!!");
                    System.out.println();
                    break;
                }
            }
            System.out.println("Meu número escolhido é: " + meuNumeroEscolhido);
            System.out.println("Número premiado!: " + randomNum);
            System.out.println("Você gostaria de jogar de novo? ('sim' ou 'não')");
            jogarNovament = keyboard.next();
        } while (jogarNovament.equalsIgnoreCase("sim"));
        System.out.println();

        keyboard.close();
    }
}
