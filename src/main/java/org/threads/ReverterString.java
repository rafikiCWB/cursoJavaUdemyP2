package org.threads;

public class ReverterString {
    public static void main(String[] args) {
        String nome = "rafael";
        for (int i = nome.length() - 1; i >= 0; i--) {
            System.out.print(nome.charAt(i));

        }
        System.out.println();
        StringBuilder builder = new StringBuilder();
        builder.append(nome);
        builder.reverse();
        System.out.print(builder);

        System.out.println();
        ReverterString rv = new ReverterString();
        rv.reverse("abacate");
    }

    public String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));

        }
        return reversed;
    }
}
