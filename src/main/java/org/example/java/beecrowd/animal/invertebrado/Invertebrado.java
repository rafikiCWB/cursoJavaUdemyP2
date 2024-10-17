package org.example.java.beecrowd.animal.invertebrado;

import org.example.java.beecrowd.animal.controller.Animal;

public abstract class Invertebrado implements Animal {
    protected String tipo;

    @Override
    public String getTipo() {
        return tipo;
    }
}
