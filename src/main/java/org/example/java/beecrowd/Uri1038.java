package org.example.java.beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

// Lanche
public class Uri1038 {
    public static void main(String[] args) {

      /*  out.println("CÓDIGO      ESPECIFICAÇÃO    PREÇO");
        out.println("1           Cachorro Quente  $ 4.00");
        out.println("2           X-Salada         $ 4.00");
        out.println("3           X-Bacon          $ 4.00");
        out.println("4           Torrada Simples  $ 4.00");
        out.println("5           Refrigerante     $ 4.00");

        out.println("=====================================");

        var teclado = new Scanner(System.in);
        out.println("Faça seu pedido");
        String input;
        int pedido;
        do {
            out.println("Digite o número do pedido ou 'SAIR' para encerrar: ");
            input = teclado.nextLine();
            if (input.equalsIgnoreCase("SAIR")) {
                break;
            }
            try {
                pedido = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                out.println("Opção inválida.");
                continue;
            }
            switch (pedido) {
                case 1:
                    out.println("1           Cachorro Quente  $ 4.00");
                    break;
                case 2:
                    out.println("2           X-Salada         $ 4.00");
                    break;
                case 3:
                    out.println("3           X-Bacon          $ 4.00");
                    break;
                case 4:
                    out.println("4           Torrada Simples  $ 4.00");
                    break;
                case 5:
                    out.println("5           Refrigerante     $ 4.00");
                    break;
                default:
                    out.println("Opção inválida.");
            }
        } while (!input.equalsIgnoreCase("SAIR"));
        out.println("Fim do pedido.");

        double total = 0.0;
        // somar o total do pédido e mostrar na tela


        teclado.close();
    }*/

        List<String> entrada = new ArrayList<>();
        entrada.add("CÓDIGO      ESPECIFICAÇÃO    PREÇO");
        entrada.add("1           Cachorro Quente  $ 4.00");
        entrada.add("2           X-Salada         $ 4.50");
        entrada.add("3           X-Bacon          $ 5.00");
        entrada.add("4           Torrada Simples  $ 2.00");
        entrada.add("5           Refrigerante     $ 1.50");

        entrada.forEach(out::println);

        out.println("=====================================");

        var teclado = new Scanner(System.in);
        String  codigo;
        int quantidade;
        do {
            out.println("Dígite o número do pedido ou 'SAIR' para encerrar: ");
            codigo = teclado.nextLine();
            if (codigo.equalsIgnoreCase("SAIR")) {
                break;
            }
            out.println("Digite a quantidade:");
            codigo = teclado.nextLine();

           quantidade = Integer.parseInt(codigo);
            switch (codigo) {
                case "1":
                    out.println(quantidade + " - Cachorro Quente  Total R$" + (4.00 * quantidade));
                    break;
                case "2":
                    out.println(quantidade + " - X-Salada         Total R$" + (4.50 * quantidade));
                    break;
                case "3":
                    out.println(quantidade + " - X-Bacon          Total R$" + (5.00 * quantidade));
                    break;
                case "4":
                    out.println(quantidade + " - Torrada Simples  Total R$" + (2.00 * quantidade));
                    break;
                case "5":
                    out.println(quantidade + " - Refrigerante     Total R$" + (1.50 * quantidade));
                    break;
                default:
                    out.println("Opção inválida.");
            }

        } while (true);
        out.println("Fim do pedido.");
        teclado.close();
    }

}



