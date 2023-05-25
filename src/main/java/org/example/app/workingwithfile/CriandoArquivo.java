package org.example.app.workingwithfile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriandoArquivo {
    private static final Log LOG = LogFactory.getLog(CriandoArquivo.class);

    public static void main(String[] args) {

        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};
        String path = "C:\\temp\\teste.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
                LOG.debug(String.format("Linha %s escrita com sucesso", line));
                System.out.println(String.format("Line %s written" , line));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
