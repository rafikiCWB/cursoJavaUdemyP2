package org.example.java.streams.professorisidro;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Dia3 extends DiaGenerico {

    @Override
    public void executarDesafio(List<Pessoa> lista) {
        Dia4 d = new Dia4();

        System.out.println("Ordenando em ordem crescente");
        List<Pessoa> all = lista.stream().sorted(Comparator.comparing((Pessoa p) -> p.getNome()).reversed()).toList();
        try {
        d.salvarEmArquivoTxt(all, "C:\\Users\\rafae\\temp\\all.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
