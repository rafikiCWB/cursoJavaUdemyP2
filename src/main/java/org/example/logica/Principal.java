package org.example.logica;

import java.util.ArrayList;
import java.util.List;

public class Principal {

  public static void main(String[] args) {
    Principal p = new Principal();
    p.adicionarItem("computador");
    System.out.println(p);
  }

  List<String> itens;

  public Principal() {
    itens = new ArrayList<>();
  }

  public void adicionarItem(String item) {
    itens.add(item);
  }

  @Override
  public String toString() {
    return "Principal [itens=" + itens + "]";
  }

}
