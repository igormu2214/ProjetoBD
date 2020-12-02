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
@RequestMapping("/ocupacao")
public class OcupacaoController {
	
	@Autowired
	private OcupacaoService ocupacaoService;
	
	@Autowired
	private OcupacaoRepository ocupacaoRepository;
	
	@PostMapping
	public Ocupacao salvar(@RequestBody Ocupacao ocupacao) {
		return ocupacaoService.salvar(ocupacao);
		
	}
	
	@GetMapping
	public List<Ocupacao> listar(){
		return ocupacaoRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		ocupacaoRepository.deleteById(id);
	}
}
