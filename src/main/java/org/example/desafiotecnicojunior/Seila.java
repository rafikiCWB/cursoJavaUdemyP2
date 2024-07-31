package org.example.desafiotecnicojunior;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Tenho que criar um array com todas as letras do alfabeto
 * e retornar o valor correspondente, por exemplo, se eu digitar 2 tem que retornar a e b
 * se eu digitar 5 tem que retornar a b c d e
 */
public class Seila {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        // Se eu digitar 2 a saída vai ser 'a' 'b'. Se eu digitar 5 a saída vair ser 'a' 'b' 'c' 'd' 'e'
        char[] arrayAlfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (char letra : arrayAlfabeto) {
            out.print(letra + " ");
        }
        out.println("\n");
        int numero = teclado.nextInt();
        for (int i = 0; numero > i; i = i + 1) {
            out.print(arrayAlfabeto[i] + " ");
        }

        out.println("\n\n----------------------------------------------------");

        Map<Integer, String> mapAlfabeto = getMap();
        // esse for é a forma de percorrer um map e mostrar a chave e o valor alinhados
        out.println("\n");
        for (Map.Entry<Integer, String> entry : mapAlfabeto.entrySet()) {
            out.println(entry.getKey() + ": " + entry.getValue());
        }

        int mapNumber = teclado.nextInt();
        // Esse for faz o mesmo que o for lá em cima, mas de uma forma que suporta o map.
        for (int j = 0; mapNumber > j; j = j + 1) {
            out.print(mapAlfabeto.get(j + 1) + " ");
        }

        teclado.close();
    }

    @NotNull
    private static Map<Integer, String> getMap() {
        Map<Integer, String> mapAlfabeto = new HashMap<>();
        mapAlfabeto.put(1, "A");
        mapAlfabeto.put(2, "B");
        mapAlfabeto.put(3, "C");
        mapAlfabeto.put(4, "D");
        mapAlfabeto.put(5, "E");
        mapAlfabeto.put(6, "F");
        mapAlfabeto.put(7, "G");
        mapAlfabeto.put(8, "H");
        mapAlfabeto.put(9, "I");
        mapAlfabeto.put(10, "J");
        mapAlfabeto.put(11, "K");
        mapAlfabeto.put(12, "L");
        mapAlfabeto.put(13, "M");
        mapAlfabeto.put(14, "N");
        mapAlfabeto.put(15, "O");
        mapAlfabeto.put(16, "P");
        mapAlfabeto.put(17, "Q");
        mapAlfabeto.put(18, "R");
        mapAlfabeto.put(19, "S");
        mapAlfabeto.put(20, "T");
        mapAlfabeto.put(21, "U");
        mapAlfabeto.put(22, "V");
        mapAlfabeto.put(23, "W");
        mapAlfabeto.put(24, "X");
        mapAlfabeto.put(25, "Y");
        mapAlfabeto.put(26, "Z");
        return mapAlfabeto;
    }
}
