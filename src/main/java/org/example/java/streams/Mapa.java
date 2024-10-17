package org.example.java.streams;

import java.util.HashMap;
import java.util.Map;

//Formas de percorrer um map em java
public class Mapa {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);

        map.forEach((k, v) -> System.out.println(STR."\{k} \{v}"));

    }

}
