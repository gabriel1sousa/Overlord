/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author gabri
 */
import br.com.gabri.domain.Cliente;
import br.com.gabri.exceptions.DAOException;
import br.com.gabri.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {


	Cliente buscarPorCPF(Long cpf) throws DAOException;

}