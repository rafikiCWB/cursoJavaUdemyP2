package org.example.app.workingwithfile.testes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class PrimeiroInteracaoComGeracaoDeArquivo {

    public static void main(String[] args) {

        var file = new File("C:\\temp\\teste.csv");
        Scanner keyboard = null;
        try {
            keyboard = new Scanner(file);
            while (keyboard.hasNextLine()) {
                out.println(keyboard.nextLine());
            }
        } catch (IOException e) {
            out.println("Error" + e.getMessage());
        } finally {
            if (keyboard != null) {
                keyboard.close();
            }
        }
    }
}
