package br.com.poc.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.poc.dao.ClienteDAO;
import br.com.poc.modelo.Cliente;
import br.com.poc.service.ClienteService;

@Service("ClienteService")
@Transactional
public class ClienteServiceImpl implements ClienteService{
	
	@Inject
	private ClienteDAO dao;  
	
	@Override
	public void saveCliente(Cliente cliente) {
		dao.salvarCliente(cliente);
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
