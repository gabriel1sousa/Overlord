/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod17;

/**
 *
 * @author gabri
 */
public class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    
}
     @Override
    public String toString() {
        return "Carro{" +
               "marca='" + marca + '\'' +
               ", modelo='" + modelo + '\'' +
               '}';
    }
}
