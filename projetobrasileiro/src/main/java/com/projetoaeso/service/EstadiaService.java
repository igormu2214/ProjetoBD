package com.projetoaeso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetoaeso.model.*;
import com.projetoaeso.repository.*;

@Service
public class EstadiaService {

	@Autowired
	private EstadiaRepository estadiaRepository;
	
	public Estadia salvar(Estadia estadia) {
		return estadiaRepository.save(estadia);
	}
}
