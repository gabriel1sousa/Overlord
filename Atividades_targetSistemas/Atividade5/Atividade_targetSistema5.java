/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_targetsistema5;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
        
public class Atividade_targetSistema5 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que digite a string
        System.out.print("Digite a string que deseja inverter: ");
        String input = scanner.nextLine();
        
        // Converte a string para um array de caracteres
        char[] caracteres = input.toCharArray();
        
        // Inicializa uma nova string para armazenar o resultado
        String invertida = "";

        // Percorre a string de trás para frente
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i]; // Adiciona cada caractere à nova string
        }
        
        // Exibe a string invertida
        System.out.println("String invertida: " + invertida);
    }
}
