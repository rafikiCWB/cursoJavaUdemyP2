package org.example.desafiotecnicojunior;

import java.util.ArrayList;
import java.util.List;

public class Parseando {

  public static void main(String[] args) {
    Parseando parseando = new Parseando();

    System.out.println(parseando.crypto("rafael"));

  }
  // função que criptografa um texto e retorna números nas suas respectivas ordens,
  // por, exemplo a = 1, b = 2, c= 3 e assim por diante;
  public int crypto(String texto) {
    char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    List<Integer> retorno = new ArrayList<>();

    for (int i = 0; i < texto.split("").length; i++) {
      for (int j = 0; j < alfabeto.length; j++) {
        if (texto.charAt(i) == alfabeto[j]) {
          retorno.add(j + 1);
        }
      }
    }

    String str = "";
    for (Integer ret : retorno) {
      str = str + ret.toString();
    }
    return Integer.parseInt(str);

  }

  public static void alphabet() {
    char[] alphabet = new char[26];
    for (int i = 0; i < 26; i++) {
      alphabet[i] = (char) ('a' + i);
    }
    for (char letter : alphabet) {
      // System.out.print(STR."\{letter} ");
    }
  }
}
