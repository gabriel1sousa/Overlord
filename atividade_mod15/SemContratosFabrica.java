/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod15;

/**
 *
 * @author gabri
 */
public class SemContratosFabrica extends Fabrica{
    @Override
    Carro retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new SaoPaulo(100, "cheio", "azul");
        } else {
            return null;
        }
    }

    @Override
    Carro retrieveCarro(String requestedGrade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
