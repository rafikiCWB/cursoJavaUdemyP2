package org.example.app.workingwithfile.testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TerceiraInteracaoComGeracaoDeArquivo {

    public static void main(String[] args) {

        var path = "C:\\temp\\teste.csv";

        try (var br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
