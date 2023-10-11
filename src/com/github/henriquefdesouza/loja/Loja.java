package com.github.henriquefdesouza.loja;

import com.github.henriquefdesouza.models.Cliente;
import com.github.henriquefdesouza.models.Estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

    Scanner sc = new Scanner(System.in);
    ArrayList<Cliente> clienteArray;
    Estoque estoque;

    public void cadastrarCliente(int quantidadeDeClientes) {

        for (int i = 0; i < quantidadeDeClientes; i++) {
            Cliente cliente = new Cliente();
            System.out.println("Cadastrando " + (i + 1) + " Cliente: ");
            coletarDadosCliente(cliente);
            clienteArray.add(cliente);
        }
        System.out.println("-----Lista de Clientes Cadastrados: ");
        imprimirClientesCadastrados();
        System.out.println("-----------------------------------------");
    }

    private void coletarDadosCliente(Cliente clienteDados) {
        System.out.print("Nome do Cliente: ");
        String nome = sc.nextLine();
        clienteDados.setNome(nome);
        System.out.print("Idade do Cliente: ");
        int idade = sc.nextInt();
        clienteDados.setIdade(idade);
        System.out.print("CPF do Cliente: ");
        sc.nextLine();
        String cpf = sc.nextLine();
        clienteDados.setCpf(cpf);
    }

    private void imprimirClientesCadastrados() {
        for (Cliente clientes : clienteArray) {
            System.out.printf("Nome: %s, Idade: %d, CPF: %s%n", clientes.getNome(), clientes.getIdade(), clientes.getCpf());
        }
    }

}
