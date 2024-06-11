/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod15;

/**
 *
 * @author gabri
 */
public abstract class Carro {
    private int cavaloPotencia;
    private String combustivel;
    private String cor;

    public Carro cavaloPotencia, String combustivel,String cor) {
        this.cavaloPotencia = cavaloPotencia;
        this.combustivel = combustivel;
        this.cor = cor;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("O " + combustivel + "o motor foi ligado e está pronto para utilizar " + cavaloPotencia + " horsepowers.n" );
    }
    public void clean(){
        System.out.println("O carro foi limpo e o " + cor.toLowerCase() + " a cor brilha");
    }
    public void mechanicCheck(){
        System.out.println("O carro foi verificado pelo mecânico. Tudo parece bem!");
    }
    public void fuelCar(){
        System.out.println("O carro está sendo abastecido " + combustivel.toLowerCase());
    }
    
}
