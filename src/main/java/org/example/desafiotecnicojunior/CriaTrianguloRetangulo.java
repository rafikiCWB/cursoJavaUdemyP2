package org.example.desafiotecnicojunior;

public class CriaTrianguloRetangulo {
    public static void main(String[] args) {
        criaTrianguloRetangulo(10);

    }

    public static void criaTrianguloRetangulo(int tr) {
        for (int i = 0; i < tr; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}