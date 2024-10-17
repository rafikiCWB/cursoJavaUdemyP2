package org.example.logica;

public class StrReverse {

    public static void main(String[] args) {
        String str = "RAFAEL";
        var reversedStr = reverseString(str);
        System.out.println(reversedStr);

    }

    private static Object reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

}