/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod15;

/**
 *
 * @author gabri
 */
public class Demo {
     public static void main(String[] args) {
        Cliente cliente = new Cliente("A", false);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.create(cliente.getGradeRequest());
        carro.startEngine();
    }

    private static Fabrica getFabrica(Cliente cliente) {
        if (cliente.hasCompanyContract()) {
            return new ContratosFabrica();
        } else {
            return new SemContratosFabrica();
        }
    }
}
