/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod17;

/**
 *
 * @author gabri
 */
import java.util.ArrayList;
import java.util.List;
    public class Main {
public static void main(String[] args) {
        // Criação da lista genérica para armazenar carros
        List<Carro> listaDeCarros = new ArrayList<>();

        // Adicionando diferentes tipos de carros na lista
        listaDeCarros.add(new Sedan("Toyota", "Corolla"));
        listaDeCarros.add(new SUV("Honda", "CR-V"));
        listaDeCarros.add(new Carro("Fiat", "Uno"));

        // Imprimindo os carros na lista
        for (Carro carro : listaDeCarros) {
            System.out.println(carro);
        }
    }
}
