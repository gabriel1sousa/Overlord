/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod33;

/**
 *
 * @author gabri
 */
import javax.persistence.*;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("minha-persistence-unit");
        EntityManager em = emf.createEntityManager();

        // Criando as entidades
        Marca marca = new Marca("Toyota");
        Acessorio acessorio = new Acessorio("Ar Condicionado");
        Carro carro = new Carro("Corolla", marca, acessorio);

        // Persistindo as entidades
        em.getTransaction().begin();
        em.persist(marca);
        em.persist(acessorio);
        em.persist(carro);
        em.getTransaction().commit();

        // Consultando o carro
        Carro carroConsultado = em.find(Carro.class, carro.getId());
        System.out.println("Carro Consultado: " + carroConsultado);

        em.close();
        emf.close();
    }
}
