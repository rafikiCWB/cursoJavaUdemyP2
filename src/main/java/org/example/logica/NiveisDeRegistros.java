package org.example.logica;

public class NiveisDeRegistros {
    public static void main(String[] args) {
        //"[<LEVEL>]: <MESSAGE>".
        String nome = "   R a f a e l 1   ";
        System.out.println(nome.trim().replaceAll("[\\s\\d]", "")); // a função trim() remove todos os espaços | a função replaceAll() usa regex para formatar uma String, Exemplo: {\\s remove os espaços em branco e \\d remove números}
        // exemplo de substring
        String str = "string";
        var result = str.substring(0,3);
        System.out.println(result);

    }
}
