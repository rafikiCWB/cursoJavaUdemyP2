package org.example.treiniprojectjava;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        var number = keyboard.nextInt();
        if ((number > -15 && number <= 12) || (number > 14 && number < 17) || (number >= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        keyboard.close();
    }
}
