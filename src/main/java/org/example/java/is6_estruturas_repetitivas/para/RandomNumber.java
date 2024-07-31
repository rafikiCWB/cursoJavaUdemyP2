package org.example.java.is6_estruturas_repetitivas.para;

import java.util.*;

import static java.lang.System.out;

public class RandomNumber {
    public static void main(String[] args) {
        var random = new Random();
        out.println(random.nextInt(0, 10));
        
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        map.values().stream().forEach(out::println);

        for (Map.Entry entry : map.entrySet()) {
            out.println(entry.getKey() + ": " + entry.getValue());
        }
         pessoa();
    }

    public static void pessoa() {
        List<String> dadosPessoa = new Stack<>();
        dadosPessoa.add("Teresa");
        dadosPessoa.add("rafa");
        dadosPessoa.add("rafael");
        dadosPessoa.add("Polly");
        dadosPessoa.add("Poliana");
        dadosPessoa.add("Jacke");
        dadosPessoa.add("Jackelyne");
        for (String dados : dadosPessoa) {
            out.println(dados);
        }
    }
}
