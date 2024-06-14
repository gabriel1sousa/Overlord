/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvd_mod22;

/**
 *
 * @author gabri
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    private String cidade;

    public Pessoa(String nome, String sexo, int idade, String cidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para terminar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo: ");
            String sexo = scanner.nextLine();

            System.out.print("Digite a idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite a cidade: ");
            String cidade = scanner.nextLine();

            pessoas.add(new Pessoa(nome, sexo, idade, cidade));
        }

        List<Pessoa> mulheres = pessoas.stream()
                                        .filter(p -> p.getSexo().equalsIgnoreCase("feminino"))
                                        .collect(Collectors.toList());

        System.out.println("Lista de mulheres:");
        mulheres.forEach(System.out::println);
    }
}

    

