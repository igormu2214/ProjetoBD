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
@RequestMapping("/quarto")
public class QuartoController {
	
	@Autowired
	private QuartoService quartoService;
	
	@Autowired
	private QuartoRepository quartoRepository;
	
	@PostMapping
	public Quarto salvar(@RequestBody Quarto quarto) {
		return quartoService.salvar(quarto);
		
	}
	
	@GetMapping
	public List<Quarto> listar(){
		return quartoRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		quartoRepository.deleteById(id);
	}
}
