/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod23;

/**
 *
 * @author gabri
 */
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClasseTeste {
     @Test
    public void testFiltrarMulheres() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "feminino", 30, "São Paulo"));
        pessoas.add(new Pessoa("João", "masculino", 25, "Rio de Janeiro"));
        pessoas.add(new Pessoa("Maria", "feminino", 22, "Curitiba"));
        pessoas.add(new Pessoa("Pedro", "masculino", 28, "Belo Horizonte"));

        List<Pessoa> mulheres = Main.filtrarMulheres(pessoas);

        // Verifica se todos os elementos na lista 'mulheres' têm o sexo "feminino"
}
