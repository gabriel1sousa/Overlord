/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod15;

/**
 *
 * @author gabri
 */
public abstract class Fabrica {
    public Carro create(String requestedGrade) {
        Carro carro = retrieveCar(requestedGrade);
        carro = prepareCarro(carro);
        return carro;
    }
    private Carro prepareCarro(Carro carro){
        carro.clean();
        carro.mechanicCheck();
        carro.fuelCar();
        return carro;
    }
    abstract Carro retrieveCarro(String requestedGrade);
}
    

