package org.example.logica;

import java.text.NumberFormat;

public class ConverteMoeda {
    public static void main(String[] args) {

        System.out.println("Formatador de moeda");

        double valor = 30000;
        var moeda = NumberFormat.getCurrencyInstance();
        System.out.println(moeda.format(valor));

    }
}
