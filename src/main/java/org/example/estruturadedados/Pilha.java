package org.example.estruturadedados;

public class Pilha {
    private int valores[];
    private int topo;

    // metodo construtor (vou criar uma pilha com 10 elementos)
    public Pilha() {
        valores = new int[10];
        topo = -1;
    }

    // empilhar
    public void push(int elemento) {
        topo = topo + 1;
        valores[topo] = elemento;
    }

    // está vazio?
    public boolean isEmpty() {
        return (topo == -1);
    }

    // está cheio?
    public boolean isFull() {
        return (topo == 9);

    }

    // desempilhar
    public int pop() {
        int elem = valores[topo];
        topo--;
        return elem;
    }
}

// (172)10 = (10101100)2

/*
Um exemplo das divisoes suscessivas
172 / 2
0 86 / 2
0 43 / 2
1 21 / 2
1 10 / 2
0 5 / 2
1 2 / 2
0 1 / 2
1 0
*/
