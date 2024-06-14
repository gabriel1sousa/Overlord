/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_mod24;

/**
 *
 * @author gabri
 */
import br.com.gabri.dao.ClienteDao;
import br.com.gabri.dao.ClienteDaoMock;
import br.com.gabri.dao.IClienteDao;
import br.com.gabri.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTeste {
     @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
}
