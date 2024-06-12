/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod18;

/**
 *
 * @author gabri
 */
@PrimeiraAnotacao(value = "Gabriel", clientes = "Teste", numeroCpf = 10)
public class ClassAnotacao {
    
     @PrimeiraAnotacao(value = "Sousa", clientes = {"Teste", "Teste1"}, numeroCpf = 20, valores = 100d)
    private String nome;

    @PrimeiraAnotacao(value = "Rodrigo", clientes = "Teste", numeroCpf = 10)
    public ClassAnotacao() {

    }
}
