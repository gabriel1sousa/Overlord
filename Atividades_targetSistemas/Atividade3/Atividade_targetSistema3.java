/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_targetsistema3;

/**
 *
 * @author gabri
 */
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
public class Atividade_targetSistema3 {

    public static void main(String[] args) {
       public static void main(String[] args) {
        // Lista para armazenar os valores de faturamento
        List<Double> faturamentos = new ArrayList<>();
        
        try {
            // Leitura do arquivo JSON
            FileReader reader = new FileReader("faturamento.json");
            JsonArray jsonArray = JsonParser.parseReader(reader).getAsJsonArray();
            
            // Preenchimento da lista com os valores de faturamento
            for (JsonElement elemento : jsonArray) {
                double valor = elemento.getAsJsonObject().get("valor").getAsDouble();
                // Ignora dias sem faturamento
                if (valor != 0.0) {
                    faturamentos.add(valor);
                }
            }
            
            // Calcula o menor valor de faturamento
            double menorFaturamento = faturamentos.stream().min(Double::compare).orElse(0.0);
            
            // Calcula o maior valor de faturamento
            double maiorFaturamento = faturamentos.stream().max(Double::compare).orElse(0.0);
            
            // Calcula a média de faturamento
            OptionalDouble mediaFaturamento = faturamentos.stream().mapToDouble(Double::doubleValue).average();
            
            // Calcula o número de dias com faturamento acima da média
            long diasAcimaDaMedia = faturamentos.stream().filter(f -> f > mediaFaturamento.orElse(0.0)).count();
            
            // Exibe os resultados
            System.out.println("Menor valor de faturamento ocorrido em um dia do mês: " + menorFaturamento);
            System.out.println("Maior valor de faturamento ocorrido em um dia do mês: " + maiorFaturamento);
            System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
            
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    
    }
}
