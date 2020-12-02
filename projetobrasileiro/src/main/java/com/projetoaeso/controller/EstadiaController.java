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
@RequestMapping("/estadia")
public class EstadiaController {
	
	@Autowired
	private EstadiaService estadiaService;
	
	@Autowired
	private EstadiaRepository estadiaRepository;
	
	@PostMapping
	public Estadia salvar(@RequestBody Estadia estadia) {
		return estadiaService.salvar(estadia);
		
	}
	
	@GetMapping
	public List<Estadia> listar(){
		return estadiaRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		estadiaRepository.deleteById(id);
	}
}