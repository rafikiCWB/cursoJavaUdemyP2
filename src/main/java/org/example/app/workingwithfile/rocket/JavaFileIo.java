package org.example.app.workingwithfile.rocket;

import java.io.File;
import java.io.IOException;


public class JavaFileIo {

    public static void main(String[] args) {

        var diretorio = new File("C:\\temp\\rocket\\curso-java");
        System.out.println(STR."Diretório existe?\{diretorio.exists()}");
        if (!diretorio.exists()) {
            diretorio.mkdirs();
            System.out.println("Diretório criado com sucesso!");
        } else {
            System.out.println("Diretório já existe!");
        }

        try {
            File arquivo = new File(diretorio,"aula-java.txt");
            arquivo.createNewFile();
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
