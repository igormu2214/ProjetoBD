package com.projetoaeso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetoaeso.model.*;
import com.projetoaeso.repository.*;

@Service
public class OcupacaoService {

	@Autowired
	private OcupacaoRepository ocupacaoRepository;
	
	public Ocupacao salvar(Ocupacao ocupacao) {
		return ocupacaoRepository.save(ocupacao);
	}
}
