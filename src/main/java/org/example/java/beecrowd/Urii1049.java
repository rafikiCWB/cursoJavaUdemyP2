package org.example.java.beecrowd;

import java.util.Scanner;

//Animal adaptado para submeter no Uri
public class Urii1049 {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);

        String escolha1 = teclado.nextLine();
        String escolha2 = teclado.nextLine();
        String escolha3 = teclado.nextLine();

        if (escolha1.equalsIgnoreCase("vertebrado")) {
            if (escolha2.equalsIgnoreCase("ave")) {
                if (escolha3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else if (escolha3.equalsIgnoreCase("onivoro")) {
                    System.out.println("pomba");
                }
            }
        }
        if (escolha1.equalsIgnoreCase("vertebrado")) {
            if (escolha2.equalsIgnoreCase("mamifero")) {
                if (escolha3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else if (escolha3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (escolha1.equalsIgnoreCase("invertebrado")) {
            if (escolha2.equalsIgnoreCase("inseto")) {
                if (escolha3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else if (escolha3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("lagarta");
                }
            }
        }
        if (escolha1.equalsIgnoreCase("invertebrado")) {
            if (escolha2.equalsIgnoreCase("anelideo")) {
                if (escolha3.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }

        teclado.close();
    }
}
