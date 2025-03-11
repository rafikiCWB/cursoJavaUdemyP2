package org.example.java.streams.professorisidro;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Dia4 extends DiaGenerico {
    @Override
    public void executarDesafio(List<Pessoa> lista) {
        if (lista != null) {
            List<Pessoa> nomesFiltrados = lista.stream()
                    .filter(p -> p.getNome().contains("Ana") && p.getIdade() >= 30 && p.getIdade() <= 35)
                    .collect(Collectors.toList());

            nomesFiltrados.forEach(System.out::println);

            try {
                salvarEmArquivoTxt(nomesFiltrados, "C:\\Users\\rafae\\temp\\data.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("The list is null.");
        }
    }

    public void salvarEmArquivoTxt(List<Pessoa> lista, String arquivo) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(lista);
        Files.write(Paths.get(arquivo), json.getBytes());
    }
}
