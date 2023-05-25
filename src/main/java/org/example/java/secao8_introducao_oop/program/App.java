package org.example.java.secao8_introducao_oop.program;

import org.example.java.secao8_introducao_oop.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

public class App {

    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        var produto = new Produto();

        out.println("Dados do produto ");
        out.println("Nome");
        produto.setNome((teclado.nextLine()));

        out.println("preço");
        produto.setPrice(teclado.nextDouble());

        out.println("Quantidade em Stock ");
        produto.setQtd(teclado.nextInt());

        out.println("Product data: " + produto);

        var continuar = true;
        do {
        out.println("add in stock");
        Integer quantidadeAdicionada = teclado.nextInt();
        produto.addProduto(quantidadeAdicionada);

        out.println("Update data" + produto);

        out.println("Remove in stock");
        Integer quantidadeRemovida = teclado.nextInt();
        produto.removerProduto(quantidadeRemovida);

        out.println("Update data" + produto);
        } while (continuar);

        teclado.close();
    }
}
