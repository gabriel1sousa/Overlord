/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod32;

/**
 *
 * @author gabri
 */
public class Main {
     public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("minha-persistence-unit");
        EntityManager em = emf.createEntityManager();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        
        Produto novoProduto = new Produto("Laptop", 2500.00);

        
        produtoDAO.cadastrar(novoProduto);

        
        Produto produtoConsultado = produtoDAO.consultar(novoProduto.getId());
        System.out.println("Produto: " + produtoConsultado);

       
        produtoConsultado.setPreco(2400.00);
        produtoDAO.atualizar(produtoConsultado);

        
        List<Produto> produtos = produtoDAO.buscarTodos();
        produtos.forEach(System.out::println);

        
        produtoDAO.excluir(novoProduto.getId());

        em.close();
        emf.close();
    }
}
