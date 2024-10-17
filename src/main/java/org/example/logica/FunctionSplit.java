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
        String[] result = b.split("[^oa]"); // Aqui estou usando regex para imprimir a String exceto a letra 'o' e letra 'a'
        System.out.println(Arrays.toString(result));

        StringBuilder strb = new StringBuilder();
        strb.append("Hello World!");
        strb.append(" BRISA ");
        System.out.println(strb);

        strb.insert(5, " Java ");
        System.out.println(strb);

        String nome = "Rafael";
        int idade = 27;
        var resultado = String.format("%s tem %d anos", nome, idade);
        System.out.println(resultado);

        String funTrim = "   Bla bla bla   ";
        var removeEspacosIniciaisEFinaisDeUmaString = funTrim.trim();
        System.out.println(removeEspacosIniciaisEFinaisDeUmaString);

        String funSubstring = "dingue-dongue não delongue";
        String mostrarAStringNaPosicaoQueVoceEscolher = funSubstring.substring(18);
        System.out.println(mostrarAStringNaPosicaoQueVoceEscolher);
    }
}
