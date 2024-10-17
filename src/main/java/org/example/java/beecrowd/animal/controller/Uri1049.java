package org.example.java.beecrowd.animal.controller;

import java.util.Scanner;

// Animal
public class Uri1049 {

    public static void main(String[] args) {

        var teclado = new Scanner(System.in);
        String escolha1 = teclado.nextLine();
        String escolha2 = teclado.nextLine();
        String escolha3 = teclado.nextLine();

        Animal animal = AnimalFactory.getAnimal(escolha1, escolha2, escolha3);
        if (animal != null) {
            System.out.println(animal.getTipo());
        } 
        teclado.close();
    }
}
