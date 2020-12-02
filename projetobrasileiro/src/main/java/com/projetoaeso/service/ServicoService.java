package com.projetoaeso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetoaeso.model.*;
import com.projetoaeso.repository.*;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository servicoRepository;
	
	public Servico salvar(Servico servico) {
		return servicoRepository.save(servico);
	}
}
