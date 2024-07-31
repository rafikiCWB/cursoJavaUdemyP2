package org.example.app.workingwithfile.testes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExercicioManipulacaoDeArquivos {

  public static void main(String[] args) throws IOException {
    String[] contentFile = new String[] { "Bom dia", "Boa tarde", "boa noite" };
    String path = "C:\\temp\\salve.txt";

    var bw = new BufferedWriter(new FileWriter(path));
    for (String file : contentFile) {
      bw.write(file);
      bw.newLine();
    }
    bw.close();
  }

}
