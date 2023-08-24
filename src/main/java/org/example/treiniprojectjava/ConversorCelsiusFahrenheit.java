package org.example.treiniprojectjava;

import java.util.Scanner;

import static java.lang.System.*;

public class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);

        out.println("Digite a temperatura em Celsius: ");
        var temperaturaEmCelcius = teclado.nextFloat();
        var temperaturaEmFahrenheit = temperaturaEmCelcius * 1.8 + 32;
        out.println("A temperatura em Fahrenheit é = " + temperaturaEmFahrenheit);

        teclado.close();
    }
}
