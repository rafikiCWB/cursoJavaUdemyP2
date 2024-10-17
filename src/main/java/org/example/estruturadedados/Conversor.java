package org.example.estruturadedados;

import org.jetbrains.annotations.NotNull;

/*[/java]

E agora a aplicação que usa a pilha (no caso o arquivo que faz a conversão de decimal para binário)

Conversor.java
[java]*/
public class Conversor {
    public static void main(@NotNull String[] args) {
        int numero = 172;
        Pilha p = new Pilha();

        int resto;

// fase 1 = empilhamento dos restos
        while (numero != 0) {
            resto = numero % 2; // pego o resto da divisão deste número por 2 (vale 0 ou 1)
            p.push(resto); // armazeno na pilha
            numero = numero / 2; // gero um novo número, resultado da divisão dele por 2
        }

// fase 2 = exibicao dos restos
        while (!p.isEmpty()) {
            resto = p.pop(); // remove da pilha (Sempre o cara que está no topo)
            System.out.print(resto);
        }
        System.out.println("\nfim do programa");
    }
}
