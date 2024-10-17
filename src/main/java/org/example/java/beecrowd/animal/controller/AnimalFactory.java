package org.example.java.beecrowd.animal.controller;

import org.example.java.beecrowd.animal.invertebrado.Lagarta;
import org.example.java.beecrowd.animal.invertebrado.Minhoca;
import org.example.java.beecrowd.animal.invertebrado.Pulga;
import org.example.java.beecrowd.animal.invertebrado.Sanguesussa;
import org.example.java.beecrowd.animal.vertebrado.Aguia;
import org.example.java.beecrowd.animal.vertebrado.Homem;
import org.example.java.beecrowd.animal.vertebrado.Pomba;
import org.example.java.beecrowd.animal.vertebrado.Vaca;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AnimalFactory {

    @Nullable
    public static Animal getAnimal(@NotNull String escolha1, String escolha2, String escolha3) {
        if (escolha1.equalsIgnoreCase("vertebrado")) {
            if (escolha2.equalsIgnoreCase("ave")) {
                if (escolha3.equalsIgnoreCase("carnivoro")) {
                    return new Aguia();
                } else if (escolha3.equalsIgnoreCase("onivoro")) {
                    return new Pomba();
                }
            }
        }
        if (escolha1.equalsIgnoreCase("vertebrado")) {
            if (escolha2.equalsIgnoreCase("mamifero")) {
                if (escolha3.equalsIgnoreCase("onivoro")) {
                    return new Homem();
                } else if (escolha3.equalsIgnoreCase("herbivoro")) {
                    return new Vaca();
                }
            }
        } else if (escolha1.equalsIgnoreCase("invertebrado")) {
            if (escolha2.equalsIgnoreCase("inseto")) {
                if (escolha3.equalsIgnoreCase("hematofago")) {
                    return new Pulga();
                } else if (escolha3.equalsIgnoreCase("herbivoro")) {
                    return new Lagarta();
                }
            }
        }
        if (escolha1.equalsIgnoreCase("invertebrado")) {
            if (escolha2.equalsIgnoreCase("anelideo")) {
                if (escolha3.equalsIgnoreCase("hematofago")) {
                    return new Sanguesussa();
                } else if(escolha3.equalsIgnoreCase("onivoro")){
                    return new Minhoca();
                }
            }
        }
        return null;
    }
}

