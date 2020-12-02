package com.projetoaeso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetoaeso.model.*;
import com.projetoaeso.repository.*;

@Service
public class QuartoService {

	@Autowired
	private QuartoRepository quartoRepository;
	
	public Quarto salvar(Quarto quarto) {
		return quartoRepository.save(quarto);
	}
}
