/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividademod11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriel Sousa
 */
public class Atividademod11 {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
      ArrayList<String> masculino = new ArrayList<>();
      ArrayList<String> feminino = new ArrayList<>();
      
      while(true) {
         System.out.print("Digite o nome (ou 'fim' para encerrar): ");
         String nome = sc.nextLine();
         if(nome.equalsIgnoreCase("fim")) {
            break;
         }
         System.out.print("Digite o sexo (M/F): ");
         String sexo = sc.nextLine();
         if(sexo.equalsIgnoreCase("M")) {
            masculino.add(nome);
         } else if(sexo.equalsIgnoreCase("F")) {
            feminino.add(nome);
         } else {
            System.out.println("Sexo inválido");
         }
      }
      
      System.out.println("Pessoas do sexo masculino:");
      for(String nome : masculino) {
         System.out.println(nome);
      }
      
      System.out.println("Pessoas do sexo feminino:");
      for(String nome : feminino) {
         System.out.println(nome);
      }
   }
}
    

