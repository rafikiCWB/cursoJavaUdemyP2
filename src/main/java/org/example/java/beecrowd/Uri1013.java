package org.example.java.beecrowd;

import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            var a = sc.nextInt();
            var b = sc.nextInt();
            var c = sc.nextInt();
            
            var maiorAB  = (a + b + Math.abs(a - b)) / 2;
            var maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) /2;
            System.out.println(STR."\{maiorABC} É o maior");
        }
    }
}
