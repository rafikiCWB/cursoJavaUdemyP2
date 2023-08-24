package org.example.treiniprojectjava;

import java.util.Scanner;
import static java.lang.System.out;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Digite o primeo número: ");
        float number1 = scanner.nextFloat();
        out.println("Digite a operaÇão (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        out.println("Digite o segundo número: ");
        float number2 = scanner.nextFloat();
        
        scanner.close();

        float result;

        switch (op) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                out.println("OperaÇão inválida.");
                return;
        }
        out.println(number1 + " " + op + " " + number2 + " " + result);
    }

}
