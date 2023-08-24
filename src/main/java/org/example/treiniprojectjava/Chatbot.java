package org.example.treiniprojectjava;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Grande parte do nosso trabalho como desenvolvedor java é
 * manipulação de dados, então é importante saber sobre estrutura de dados
 * para podermos manipular da melhor forma possível esses dados
 * OBS: Qual o motivo de nós programamos em orientação a objetos?
 * R: Para criar novos tipos de dados. 'PONTO!'.
 */
public class Chatbot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de termos que deseja somar:");
        int n = sc.nextInt();

        double soma = 0;
        int sinal = 1;

        for (int i = 1; i <= n; ++i) {
            soma += sinal * (1.0 / i);
            sinal += -1;
        }
        out.print("A soma dos " + n + " primeiros termos da série é: " + soma);

        sc.close();
    }
}
