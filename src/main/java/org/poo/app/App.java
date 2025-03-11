package org.poo.app;

public class App {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        System.out.println(cachorro.getTipo());
        cachorro.fazerSom();

        System.out.println(gato.getTipo());
        gato.fazerSom();

    }
}

enum AnimalType {
    CACHORRO,
    GATO,
    UNKNOWN
}

class Animal {
    private AnimalType tipo;

    public Animal(AnimalType tipo) {
        this.tipo = tipo;
    }

    void fazerSom() {
        System.out.println("O animal faz um som");
    }

    public AnimalType getTipo() {
        return tipo;
    }
}

class Cachorro extends Animal {

    public Cachorro() {
        super(AnimalType.CACHORRO);
    }

    @Override
    public void fazerSom() {
        System.out.println("Late");
    }
}

class Gato extends Animal {
    public Gato() {
        super(AnimalType.GATO);
    }

    @Override
    public void fazerSom() {
        System.out.println("Mia");
    }
}


