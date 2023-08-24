package org.example.treiniprojectjava;

import java.util.Scanner;

import static java.lang.System.out;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char player = 'X';
        int row, col;

        while (true) {
            out.println(" 0 1 2");
            out.println("0 " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
            out.println(" -+-+-");
            out.println("1 " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
            out.println(" -+-+-");
            out.println("2 " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

            out.println("Vez do jogardor " + player + ".");
            out.println("Digite a linha: ");
            row = scanner.nextInt();
            out.println("Digite a colunar: ");
            col = scanner.nextInt();

            if (row < 0 || row > 2 && col < 0 || col > 2 || board[row][col] != ' ') {
                out.println("Jogada inválida");
                continue;
            }

            board[row][col] = player;
            if (    board[0][0] == player && board[0][1] == player && board[0][2] == player ||
                    board[1][0] == player && board[1][1] == player && board[1][2] == player ||
                    board[2][0] == player && board[2][1] == player && board[2][2] == player ||
                    board[0][0] == player && board[1][0] == player && board[2][0] == player ||
                    board[0][1] == player && board[1][1] == player && board[2][1] == player ||
                    board[0][2] == player && board[1][2] == player && board[2][2] == player ||
                    board[0][0] == player && board[1][1] == player && board[2][2] == player ||
                    board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                out.println("Jogador " + player + " venceu!");
                break;

            }
            if (player == 'X') {
                player = 'O';
            } else {
                player = 'X';
            }
        }
        scanner.close();
    }
}

