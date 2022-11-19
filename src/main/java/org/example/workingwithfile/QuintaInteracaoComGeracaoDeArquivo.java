package org.example.workingwithfile;

import java.io.File;
import java.util.Scanner;

public class QuintaInteracaoComGeracaoDeArquivo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = teclado.nextLine();

        File path = new File(strPath);

        System.out.println("Get path: " + path.getPath());
        System.out.println("Get parent: " + path.getParent());
        System.out.println("Get name: " + path.getName());

        teclado.close();
    }
}
