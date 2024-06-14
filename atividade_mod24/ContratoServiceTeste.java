/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod24;

/**
 *
 * @author gabri
 */

import br.com.gabri.dao.ContratoDao;
import br.com.gabri.dao.IContratoDao;
import br.com.gabri.dao.mocks.ContratoDaoMock;
import br.com.gabri.service.ContratoService;
import br.com.gabri.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTeste {
      @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    
}
