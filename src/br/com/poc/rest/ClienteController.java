package br.com.poc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.poc.modelo.Cliente;
import br.com.poc.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody ClienteResponse createUser(@RequestBody Cliente cliente) {
		ClienteResponse res = new ClienteResponse();
		
		clienteService.saveCliente(cliente);
		res.setMessage("Novo usuário Criado");
		res.setSuccess(true);
		
		return res;
	}

	
}
