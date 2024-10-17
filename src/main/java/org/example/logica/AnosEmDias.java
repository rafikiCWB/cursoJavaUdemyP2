package org.example.logica;

import java.util.Scanner;

public class AnosEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoEmDias = 400;
        int ano, mes, dia, resto;

        ano = anoEmDias / 365; //1
        resto = anoEmDias % 365; // 35

        mes = resto / 30; // 1
        dia = resto % 30; // 5
        System.out.println("anos" + ano);
        System.out.println("mes" + mes);
        System.out.println("dia" + dia);
        
    
        sc.close();
    }
}
