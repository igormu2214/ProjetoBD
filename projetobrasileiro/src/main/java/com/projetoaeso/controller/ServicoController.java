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
@RequestMapping("/servico")
public class ServicoController {
	
	@Autowired
	private ServicoService servicoService;
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	@PostMapping
	public Servico salvar(@RequestBody Servico servico) {
		return servicoService.salvar(servico);
		
	}
	
	@GetMapping
	public List<Servico> listarS(){
		return servicoRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void removerS(@PathVariable Long id) {
		servicoRepository.deleteById(id);
	}
}
