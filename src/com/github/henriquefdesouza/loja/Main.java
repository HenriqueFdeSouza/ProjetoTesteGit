package com.github.henriquefdesouza.loja;

import com.github.henriquefdesouza.models.Estoque;
import com.github.henriquefdesouza.models.Roupas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Loja loja = new Loja();
        loja.clienteArray = new ArrayList<>();
        loja.estoque = estoque;

        Roupas roupas = new Roupas("Camisa Polo", 89.90);
        roupas.setCor("Branca");
        roupas.setTamanho('G');

        loja.estoque.adicionarRoupas(roupas);

        loja.cadastrarCliente(2);

        loja.estoque.exibirInformacoesDeEstoque();


    }
}