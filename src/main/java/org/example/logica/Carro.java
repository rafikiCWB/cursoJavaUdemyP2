package org.example.logica;

import java.util.*;

import static java.lang.System.out;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void exibirInformacoes() {
        out.println("marca: " + this.marca);
        out.println("modelo: " + this.modelo);
        out.println("ano: " + this.ano);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();
        Carro car = new Carro("Volkswagen", "Fusca", 1950);
        listaCarros.add(car);
        for (Carro carro : listaCarros) {
            out.println(carro);
        }

        Map<String, Double> listaProduto = new HashMap<>();
        listaProduto.put("Pão", 3.0);
        listaProduto.put("Leite", 2.0);
        listaProduto.put("Ovo", 4.0);

        double total = 0;
        for (double lista : listaProduto.values()) {
            total += lista;
        }

        double media = total / listaProduto.size();
        out.print("Media da compra: " + media);

        /*
         * var teclado = new Scanner(System.in);
         * int anosEmDias = teclado.nextInt();
         * int dia, mes, ano, resto;
         * ano = (anosEmDias / 365);
         * resto = (anosEmDias % 365);
         * mes = (resto / 30);
         * dia = (resto % 30);
         * out.println("Ano(s) " + ano);
         * out.println("Mes(es) " + mes);
         * out.println("dia(s) " + dia);
         *
         * teclado.close();
         */

        // String[][] chessboard = new String[8][8];
        //
        //// initializing board
        // for (int i = 0; i < chessboard.length; i++) {
        // for (int j = 0; j < chessboard[i].length; j++) {
        // chessboard[i][j] = "";
        // }
        // }
        //
        //// Setting up the board. This is just an example, you can set it up as you
        // want
        //// First and last row is filled with 'P' representing pawns
        // for (int i = 0; i < chessboard.length; i++) {
        // chessboard[1][i] = "P";
        // chessboard[6][i] = "P";
        // }
        //
        //// The rooks (Torres)
        // chessboard[0][0] = "R";
        // chessboard[0][7] = "R";
        // chessboard[7][0] = "R";
        // chessboard[7][7] = "R";
        //
        //// The knights (Cavalos)
        // chessboard[0][1] = "N";
        // chessboard[0][6] = "N";
        // chessboard[7][1] = "N";
        // chessboard[7][6] = "N";
        //
        //// The bishops (Bispos)
        // chessboard[0][2] = "B";
        // chessboard[0][5] = "B";
        // chessboard[7][2] = "B";
        // chessboard[7][5] = "B";
        //
        //// The Queens (Rainhas)
        // chessboard[0][3] = "Q";
        // chessboard[7][3] = "Q";
        //
        //// The Kings (Reis)
        // chessboard[0][4] = "K";
        // chessboard[7][4] = "K";
        //
        //
        // for (int i = 0; i < chessboard.length; i++) {
        // for (int j = 0; j < chessboard[i].length; j++) {
        // System.out.print(chessboard[i][j] + " ");
        // }
        // System.out.println();
        // }
        // }
        out.println();
        String[][] matriz = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = "x";
            }
        }

        printMatriz(matriz);
    }

    public static void printMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                out.print(matriz[i][j] + " ");
            }
            out.println();
        }
    }

}
