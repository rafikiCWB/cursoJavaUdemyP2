package org.example.java.is6_estruturas_repetitivas.para;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        var random = new Random();

        System.out.println(random.nextInt(0, 10));

    }
}
