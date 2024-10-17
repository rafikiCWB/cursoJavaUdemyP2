package org.example.desafiotecnicojunior;

public class SomaDeDuasMatrizes {
    //Fazer uma função, criar duas matrizes e tenha como resultado a soma delas.
    public static void main(String[] args) {
        String[][] matriz1 = {
                {"1", "2"},
                {"3", "4"}
        };
        System.out.println("---------");
        String[][] matriz2 = {
                {"1", "2"},
                {"3", "4"}
        };

        int rows = matriz1.length;
        int cols = matriz2.length;
        String[][] somaMatriz = new String[rows][cols];

        // Soma das duas matrizes
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                somaMatriz[i][j] = String.valueOf(
                        Integer.parseInt(matriz1[i][j]) +
                                Integer.parseInt(matriz2[i][j]));
            }
        }

        System.out.println("Result print");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(somaMatriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
