package org.example.logica;

import java.util.Arrays;

/*
* A função split divide uma String em uma substring
 */
public class FunctionSplit {
    public static void main(String[] args) {
        String s = "Apple Orange Manga Potato";
        String[] vect = s.split(" "); // O console vai imprimir uma virgúla em todos os espaços em branco(usando regex)
        System.out.println(Arrays.toString(vect));
        System.out.println("------------");
        String b = "boo:and:foo";
        String[] result = b.split("[^oa]"); // Aqui estou usando regex para imprimir a String exceto a letra 'o' e leta 'a'
        System.out.println(Arrays.toString(result));

    }
}
