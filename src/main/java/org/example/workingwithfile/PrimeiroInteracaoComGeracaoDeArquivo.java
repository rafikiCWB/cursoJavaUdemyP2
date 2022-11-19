package org.example.workingwithfile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PrimeiroInteracaoComGeracaoDeArquivo {

    public static void main(String[] args) {

        var file = new File("C:\\temp\\teste.txt");
        Scanner keyboard = null;
        try {
            keyboard = new Scanner(file);
            while (keyboard.hasNextLine()) {
                System.out.println(keyboard.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        } finally {
            if (keyboard != null) {
                keyboard.close();
            }
        }
    }
}
