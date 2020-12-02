package com.projetoaeso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetoaeso.model.*;
import com.projetoaeso.repository.*;

@Service
public class ComunicacoesClienteService {

	@Autowired
	private ComunicacoesClienteRepository comunicacoesClienteRepository;
	
	public ComunicacoesCliente salvar(ComunicacoesCliente comunicacoesCliente) {
		return comunicacoesClienteRepository.save(comunicacoesCliente);
	}
}