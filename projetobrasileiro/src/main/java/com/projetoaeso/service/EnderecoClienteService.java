package com.projetoaeso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetoaeso.model.*;
import com.projetoaeso.repository.*;

@Service
public class EnderecoClienteService {

	@Autowired
	private EnderecoClienteRepository enderecoClienteRepository;
	
	public EnderecoCliente salvar(EnderecoCliente enderecoCliente) {
		return enderecoClienteRepository.save(enderecoCliente);
	}
}
