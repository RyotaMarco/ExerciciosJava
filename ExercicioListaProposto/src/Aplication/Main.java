package Aplication;

import Entities.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Crie um objeto chamado Cliente com os atributos: id, nome, idade, telefone. Faça um programa para solicitar
        // os dados de vários clientes e armazenar em um ArrayList até que se digite um número de ID negativo.
        // Em seguida exiba os dados de todos os clientes via SystemOut, formatando cada objeto separado por linhas.

        List<Cliente> list = new ArrayList<>();

        System.out.println("Informe quantos clientes irao ser adicionados: ");
        int n = sc.nextInt();

        for (int i=0;i<n;i++){

            System.out.printf("Id do cliente #%d: ", i+1);
            int id = sc.nextInt();
            System.out.printf("nome do cliente #%d: ", i+1);
            String nome = sc.nextLine();
            sc.nextLine();
            System.out.printf("idade #%d: ", i+1);
            int idade = sc.nextInt();
            System.out.printf("telefone #%d: ", i+1);
            double telefone = sc.nextInt();

            Cliente cliente = new Cliente(id,nome,idade,telefone);

            list.add(cliente);
         }

        for (Cliente x : list){
            System.out.println(x);
        }
    }
}
