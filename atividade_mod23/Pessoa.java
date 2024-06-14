/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod23;

/**
 *
 * @author gabri
 */
public class Pessoa {
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

