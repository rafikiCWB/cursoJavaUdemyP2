package org.example.java.hackerhank.is1_stdoutII;

import java.util.Scanner;

/**
 * Note: If you use the nextLine() method immediately following the nextInt()
 * method,
 * recall that nextInt() reads integer tokens; because of this, the last newline
 * character for that line of integer input is still queued in the input buffer
 * and
 * the next nextLine() will be reading the remainder of the integer line (which
 * is empty).
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}
