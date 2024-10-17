package org.example.java.beecrowd.animal.vertebrado;

import org.example.java.beecrowd.animal.controller.Animal;

public abstract class Vertebrado implements Animal {
    protected String tipo;

    @Override
    public String getTipo(){
        return tipo;
    }
}
