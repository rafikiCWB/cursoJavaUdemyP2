package org.example.java.streams.professorisidro;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    void main() {
        try {
            String jsonStr = new String(Files.readAllBytes(Paths.get("pessoa.json/")));
            Gson gson = new Gson();
            Type type = new TypeToken<List<Pessoa>>() {
            }.getType();
            List<Pessoa> lista = gson.fromJson(jsonStr, type);
            lista.forEach(System.out::println);

            Pessoa p = new Pessoa(1, "Rafa", "rafae@email.com", "987.654.321-00", 28);
            List<Pessoa> streamP = lista.stream().collect(Collectors.toList());
            lista.add(p);
            System.out.println(streamP);

            DiaGenerico dia = new Dia3();
            dia.executarDesafio(lista);

            System.out.println("================= Contains Ana ===============");
            Dia4 dia4 = new Dia4();
            dia4.executarDesafio(lista);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


