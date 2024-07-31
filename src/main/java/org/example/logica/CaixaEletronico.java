package org.example.logica;

import java.util.Scanner;

public class CaixaEletronico {

  public static final String MOTIVO_VALOR_ULTRAPASSOU = "Valor ultrapassa 1000$";
  public static final String MOTIVO_VALOR_BAIXO = "Valor menor que 10$";

  public static void main(String[] args) {

    var teclado = new Scanner(System.in);

    System.out.println("Digite seu Nome:");
    String nome = teclado.next();
    System.out.println("Digite o saldo que deseja sacar");
    Integer valor = teclado.nextInt();

    Double saldo = 462.50;

    if (valor > 1000) {
      System.out.println(String.format(
          "Olá %s! o saque de valor %d$ não pode ser realizado %s", nome, valor, MOTIVO_VALOR_ULTRAPASSOU));
    }
    if (valor < 10) {
      System.out.println(String.format(
          "Olá %s! o saque de valor %d$ não pode ser realizado %s", nome, valor, MOTIVO_VALOR_BAIXO));
    }
    // Caixa só possui cédulas de 10 20 50 100. Você não pode sacar 55 | 102
    // Só pode sacar 10 | 150 || 220 | 30
    // Só pode sacar valores que sejam compativeis com as cedulas disponíveis
    /**
     * se o valor sacado == soma das cedulas então, sucesses saque
     * saque = valor + valor + cerdulas
     */
    // se o valor for multiplo de 10
    // multiplos de 10x1 10x2 10x3 10x4 10x5
    // multiplos de 3x1 3x2
    /*
     * 10 é multiplo de 10 porque 10x1 == 10
     * 20 é multiplo de 10 porque 10x2 == 20
     * 50 é multiplo de 10 porque 10x5 == 50
     * 100 é multiplo de 10 porque 10x10 == 100
     */
    // Se o 'resto' da 'divisao' do 'valor' por '2' for igual a '0' == success
    // O caixa eletronico só tem cedulas de 10 20 50 100
    if (valor % 10 == 0) { // ex2: valor % 2 == 0 ||  
      System.out.println(String.format("Saque %d$ bem sucedido", valor));
    } else {
      System.out.println("Valor não disponivel");
    }

  }
}
