package org.example.java.secao8_introducao_oop.task1.entities;

public class Produto {
    private String nome;
    private Double price;
    private Integer qtd;

    public Double totalValorNoEstoque() {
        return price * qtd;
    }

    public void addProduto(Integer qtd) {
        this.qtd += qtd;
    }

    public void removerProduto(Integer qtd) {
        this.qtd -= qtd;
    }

    @Override
    public String toString() {
        return String.format("%s, $%.2f, %d units, Total: $%.2f",
                nome, price, qtd, totalValorNoEstoque());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
}
