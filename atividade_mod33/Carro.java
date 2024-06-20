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

@Entity
@Table(name = "TB_CARRO")


public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String modelo;

    @OneToOne
    @JoinColumn(name = "marca_id", referencedColumnName = "id")
    private Marca marca;

    @OneToOne
    @JoinColumn(name = "acessorio_id", referencedColumnName = "id")
    private Acessorio acessorio;

    // Construtores
    public Carro() {}

    public Carro(String modelo, Marca marca, Acessorio acessorio) {
        this.modelo = modelo;
        this.marca = marca;
        this.acessorio = acessorio;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca=" + marca +
                ", acessorio=" + acessorio +
                '}';
    }
}

