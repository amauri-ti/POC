package br.com.poc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.poc.modelo.Cliente;
import br.com.poc.service.ClienteService;

@RestController
public class RestControl {

	@Autowired
	ClienteService clienteService;
	
	@RequestMapping(value = "/cliente/", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody Cliente cliente, UriComponentsBuilder ucBuilder) {
        System.out.println("usuário Criado: " + cliente.getNome());
 
        clienteService.saveCliente(cliente);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/cliente/{id}").buildAndExpand(cliente.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
	
}
