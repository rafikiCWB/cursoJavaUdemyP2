package org.example.treiniprojectjava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // ano bisexto
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
        scanner.close();
    }
}