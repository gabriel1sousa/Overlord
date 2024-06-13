/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod19;

/**
 *
 * @author gabri
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtém a classe ClassAnotacao
            Class<?> clazz = ClassAnotacao.class;

            // Verifica se a classe está anotada com @PrimeiraAnotacao
            if (clazz.isAnnotationPresent(PrimeiraAnotacao.class)) {
                // Obtém a anotação
                PrimeiraAnotacao anotacao = clazz.getAnnotation(PrimeiraAnotacao.class);
                // Imprime os valores da anotação
                System.out.println("Classe Anotada: " + anotacao);
            }

            // Verifica se o campo "nome" está anotado com @PrimeiraAnotacao
            Field nomeField = clazz.getDeclaredField("nome");
            if (nomeField.isAnnotationPresent(PrimeiraAnotacao.class)) {
                // Obtém a anotação
                PrimeiraAnotacao anotacao = nomeField.getAnnotation(PrimeiraAnotacao.class);
                // Imprime os valores da anotação
                System.out.println("Campo Anotado: " + anotacao);
            }

            // Verifica se o construtor está anotado com @PrimeiraAnotacao
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            if (constructor.isAnnotationPresent(PrimeiraAnotacao.class)) {
                // Obtém a anotação
                PrimeiraAnotacao anotacao = constructor.getAnnotation(PrimeiraAnotacao.class);
                // Imprime os valores da anotação
                System.out.println("Construtor Anotado: " + anotacao);
            }

        } catch (NoSuchFieldException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
