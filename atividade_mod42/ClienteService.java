/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author gabri
 */
import br.com.gabri.dao.IClienteDAO;
import br.com.gabri.domain.Cliente;
import br.com.gabri.exceptions.DAOException;
import br.com.gabri.exceptions.MaisDeUmRegistroException;
import br.com.gabri.exceptions.TableException;
import br.com.gabri.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		
	}


	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


