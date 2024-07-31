package org.example.app.workingwithfile.rocket;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO2 {
    public static void main(String[] args) {
        try {

            List<String> contatos = new ArrayList<>();

            contatos.add("(83) 2148-5886 Joemia Giron Lyrio Monnerat");
            contatos.add("(21) 2705-6726 Reginaldo Folly Barboza Brito");
            contatos.add("(91) 2416 - 8455 Mariza Gadelha Bastida Carneiro");
            contatos.add("(68) 3259 - 8389 Mirian Venancio Portela Ignacia");

            Path arquivoDestino = Paths.get("C:\\temp\\rocket\\listaContatos.txt");

            //Escrita do Arquivo
            StringBuilder conteudo = new StringBuilder();
            for (String linhaContato : contatos) {
                conteudo.append(linhaContato).append(System.lineSeparator());
                Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8));
            }

            // Leitura do arquivo
            List<String> leitura = Files.readAllLines(arquivoDestino);
            //Imprimir cada linha obtida no arquivo
            for (String linha : contatos) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
