/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atvebac12;

/**
 *
 * @author Gabriel Sousa
 */

        import java.util.ArrayList;
import java.util.Scanner;
public class Atvebac12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> masculinos = new ArrayList<>();
        ArrayList<String> femininos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculinos.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                femininos.add(nome);
            } else {
                System.out.println("Sexo inválido. Use 'M' para masculino e 'F' para feminino.");
            }
        }

        System.out.println("\nGrupo Masculino:");
        for (String nome : masculinos) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : femininos) {
            System.out.println(nome);
        }
    }
}

  

