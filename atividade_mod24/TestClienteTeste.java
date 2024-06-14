/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod24;

/**
 *
 * @author gabri
 */

import org.junit.Assert;
import org.junit.Test;

import br.com.gabri.TesteCliente;
public class TestClienteTeste {
    @Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Gabriel");
		cli.adicionarNome1("Gabriel");

		Assert.assertEquals("Gabriel", cli.getNome());
	}
    
}
