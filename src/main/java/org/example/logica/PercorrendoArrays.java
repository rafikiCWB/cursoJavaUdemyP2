package org.example.logica;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class PercorrendoArrays {

    public static void main(String[] args) {

//        O objetivo é percorrer o vetor e multiplicar por 2 ou por ele mesmo.
        int[] vector = new int[]{2, 5, 7, 8, 10};
        int resultado;
        for (int i = 0; i < vector.length; i++) {
            resultado = vector[i];
            int potencia = resultado * vector[i];
            out.print(potencia + " ");
        }

        out.println("\n");
        List<Integer> lista = Arrays.asList(2, 5, 7, 8, 10);
        int r;
        for (int i = 0; i < lista.size(); i++) {
            r = lista.get(i);
            int p = r * lista.get(i);
            out.print(p + " ");
        }

        out.println("\n");
        List<Integer> outraForaDeFazerAMesmaCoisa = Arrays.asList(2, 5, 7, 8, 10);
        int result;
        for (Integer posicaoNoArray : outraForaDeFazerAMesmaCoisa) {
            result = posicaoNoArray * posicaoNoArray;
            out.print(result + " ");
            out.println("Tem posição: " + outraForaDeFazerAMesmaCoisa.indexOf(posicaoNoArray));
        }
        out.println("Fim");
    }
}
