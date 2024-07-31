package org.example.app.workingwithfile.rocket;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {

        try {
            Path path = Paths.get("C:\\temp\\rocket\\curso-java\\aula-java.txt");
            // Ler o conteúdo do path
//            List<String> linhas = Files.readAllLines(path);
//            linhas.forEach(System.out::println);

            // Escrever no path
//            String conteudo = "Rafael Grando";
//            Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));

            List<String> nomes = new ArrayList<>();
            nomes.add("Rafael");
            nomes.add("Grando");

            StringBuilder conteudo = new StringBuilder();
            nomes.forEach(write -> conteudo.append(write).append("\n"));
//            nomes.forEach(conteudo::append); // outra forma de fazer á mesma coisa que o código acima
            Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
//            Files.writeString(path, conteudo.toString()); // outra forma de fazer a mesma coisa que o código a cima


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
