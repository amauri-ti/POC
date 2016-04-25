package br.com.poc.dao;

import java.util.List;

import br.com.poc.modelo.Cliente;

public interface ClienteDAO {
	
	public void salvarCliente(Cliente cliente);
	
	public void removeCliente(Cliente cliente);
	
	public Cliente buscaCliente(Integer id);
	
	public List<Cliente> listaCliente();

}
