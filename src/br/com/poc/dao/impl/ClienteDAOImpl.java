package br.com.poc.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.poc.dao.ClienteDAO;
import br.com.poc.modelo.Cliente;

public class ClienteDAOImpl implements ClienteDAO{
	
	EntityManager manager;

	@Override
	public void salvarCliente(Cliente cliente) {
		this.manager.persist(cliente);
	}

	@Override
	public void removeCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscaCliente(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> listaCliente() {
		// TODO Auto-generated method stub
		return null;
	}

}
