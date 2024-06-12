/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod18;

/**
 *
 * @author gabri
 */
import java.lang.annotation.Annotation;
public class Main {
    
    public static void main(String[] args) {
        // Cria uma instância da classe Carro
        Carro carro = new Carro("Toyota", "Corolla");

        // Obtém a classe da instância
        Class<?> clazz = carro.getClass();

        // Verifica se a classe está anotada com @Tabela
        if (clazz.isAnnotationPresent(Tabela.class)) {
            // Obtém a anotação
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            // Imprime o valor da anotação
            System.out.println("Nome da Tabela: " + tabela.value());
        }
    }

}
