package com.github.henriquefdesouza.models;

import java.util.ArrayList;

public class Estoque {

    private int quantidadeTotalDeRoupas;
    ArrayList<Roupas> roupasEmEstoque = new ArrayList<>();

    public int getQuantidadeTotalDeRoupas() {
        return quantidadeTotalDeRoupas;
    }

    public void setQuantidadeTotalDeRoupas(int quantidadeTotalDeRoupas) {
        this.quantidadeTotalDeRoupas = quantidadeTotalDeRoupas;
    }


    public void adicionarRoupas(Roupas roupas) {
        roupasEmEstoque.add(roupas);
    }

    public void removerRoupas(Roupas roupas) {
        roupasEmEstoque.remove(roupas);
    }

    public void exibirInformacoesDeEstoque() {
        quantidadeTotalDeRoupas = roupasEmEstoque.size();
        System.out.printf("Quantidade total de roupas em estoque: %d%n", quantidadeTotalDeRoupas);
        System.out.println("------------------------------------------");

        System.out.println("Lista do Estoque: ");
        for (Roupas estoqueAtual : roupasEmEstoque) {
            estoqueAtual.imprimirDetalhes();
        }
    }
}
