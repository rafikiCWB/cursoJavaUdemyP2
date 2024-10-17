package org.poo.entidades;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var teclado = new Scanner(System.in);

        out.println("Enter radius: ");
        double radius = teclado.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);
        out.printf("Circumference: %.2f%n", c);
        out.printf("Volume: %.2f%n", v);
        out.printf("PI value: %.2f%n", Calculator.PI);

        teclado.close();
    }

}
