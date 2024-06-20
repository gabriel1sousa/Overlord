/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.Factory;

/**
 *
 * @author gabri
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.rpires.domain.Cliente;
import br.com.rpires.domain.Venda;
import br.com.rpires.domain.Venda.Status;


public class VendaFactory {
    
	public static Venda convert(ResultSet rs) throws SQLException {
		Cliente cliente = ClienteFactory.convert(rs);
		Venda venda = new Venda();
		venda.setCliente(cliente);
		venda.setId(rs.getLong("ID_VENDA"));
		venda.setCodigo(rs.getString("CODIGO"));
		venda.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
		venda.setDataVenda(rs.getTimestamp("DATA_VENDA").toInstant());
		venda.setStatus(Status.getByName(rs.getString("STATUS_VENDA")));
		return venda;
	}
}
