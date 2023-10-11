package com.github.henriquefdesouza.models;

import java.util.Objects;

public class Roupas {

    private String nome;
    private char tamanho;
    private String cor;
    private double preco;

    public Roupas(String nome, double preco) {
        Objects.requireNonNull(nome, "Nome não pode ser null");
        if (preco < 0) {
            throw new IllegalArgumentException("O preço inicial não pode ser menor que zero");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public void imprimirDetalhes() {
        System.out.printf("Nome: %s, Tamanho: %s, Cor: %s, Preço: R$%.2f%n", nome, tamanho, cor, preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
