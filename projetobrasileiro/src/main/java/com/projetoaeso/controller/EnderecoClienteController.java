package com.projetoaeso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetoaeso.model.*;
import com.projetoaeso.repository.*;
import com.projetoaeso.service.*;

@RestController
@RequestMapping("/enderecoCliente")
public class EnderecoClienteController {
	
	@Autowired
	private EnderecoClienteService enderecoClienteService;
	
	@Autowired
	private EnderecoClienteRepository enderecoClienteRepository;
	
	@PostMapping
	public EnderecoCliente salvar(@RequestBody EnderecoCliente enderecoCliente) {
		return enderecoClienteService.salvar(enderecoCliente);
		
	}
	
	@GetMapping
	public List<EnderecoCliente> listar(){
		return enderecoClienteRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		enderecoClienteRepository.deleteById(id);
	}
}
