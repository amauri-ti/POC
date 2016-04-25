package br.com.poc.service;

import java.util.List;

import br.com.poc.modelo.Cliente;

public interface ClienteService {
	
	public void saveCliente(Cliente cliente);
	
	public void removeCliente(Cliente cliente);
	
	public Cliente buscaCliente(Integer id);
	
	public List<Cliente> listaCliente();

}
