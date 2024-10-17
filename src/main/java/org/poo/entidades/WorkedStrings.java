package org.poo.entidades;

import static java.lang.System.out;

public class WorkedStrings {
    public static void main(String[] args) {
        String str = "Hello";
        str = str + "-World";
        out.println(str);

        out.println("-----------");

        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append("Hello");
        strBuffer.append(" World");

        out.println(strBuffer);
    }
}
