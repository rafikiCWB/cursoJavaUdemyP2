package org.example.app.workingwithfile.testes;

import java.io.File;
import java.util.Scanner;

public class QuartaInteracaoComGeracaoDeArquivo {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);

        System.out.print("Entre com o caminho do arquivo: ");
        String caminho = "C:\\temp"; // or teclado.nextLine();

        File path = new File(caminho);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Pastas");
        for (File pasta : folders) {
            System.out.println(pasta);
        }

        var files = path.listFiles(File::isFile);
        System.out.println("Arquivos");
        for (File arquivo : files) {
            System.out.println(arquivo);
        }
        boolean success = new File(caminho + "\\subpasta").mkdir();
        System.out.println("Diretório criado com sucesso: " + success);

        teclado.close();
    }
}
