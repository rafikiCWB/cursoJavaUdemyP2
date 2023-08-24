package org.example.treiniprojectjava;

import java.util.Scanner;

import static java.lang.System.out;

public class LoginSystem {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var username = "admin";
        var password = "password";

        out.println("Login!");
        var login = scanner.nextLine();
        out.println("password!");
        var senha = scanner.nextLine();

        if (login.equals(username) && senha.equals(password)) {
            out.println("Loggin sucess");
        } else {
            out.println("Login or password error");
        }

        scanner.close();
    }

}
