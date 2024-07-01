package org.example.senai.devinhouse;

import java.util.*;

public class MediaDeAvaliacoesListaProdutos {
    public static void main(String[] args) {
//        // Show departamento
//        System.out.println("Departamento = Cuidados com o Corpo\n");
//
//        // Lista de Produtos
//        List<String> nomes = Arrays.asList("Shampoo X", "Condicionador X", "Sabonete em Barra Y",
//                "Sabonete Líquido Y", "Creme Z");
//        for (String p : nomes) {
//            System.out.print(" | " + p);
//        }
//        System.out.println();
//
//        // Lista de Avaliação dos produtos
//        List<Double> avaliacoes = Arrays.asList(4.5, 3.8, 4.9, 2.7, 4.3);
//        for (Double a : avaliacoes) {
//            System.out.print(" | " + a);
//        }
//        System.out.println();
//
//        // Média das Avaliações
//        double total = 0;
//        for (Double avaliacao : avaliacoes) {
//            total += avaliacao;
//        }
//        double media = (total / 2);
//        System.out.printf("Média das avaliações: %.2f ", media);

        Map<String, Double> listaProdutos = new HashMap<>();
        listaProdutos.put("Shampoo X", 4.5);
        listaProdutos.put("Condicionador X", 3.8);
        listaProdutos.put("Sabonete em Barra Y", 4.9);
        listaProdutos.put("Sabonete Líquido Y", 2.7);
        listaProdutos.put("Creme Z", 4.3);

        // Média das Avaliações
        double total = 0;
        for (Double avaliacao : listaProdutos.values()) {
            total += avaliacao;
        }
        double media = total / listaProdutos.size();

        System.out.println(listaProdutos);
        System.out.printf("Média das avaliações: %.2f ", media);
    }
}


