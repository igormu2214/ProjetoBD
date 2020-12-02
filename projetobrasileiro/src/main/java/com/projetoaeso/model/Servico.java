package com.projetoaeso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Servico {
	private int tipoServico;
	private double precoServico;
	private String descricao;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdServico;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "idCliente")
	private Cliente cliente;
	
	public int getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(int tipoServico) {
		this.tipoServico = tipoServico;
	}
	public double getPrecoServico() {
		return precoServico;
	}
	public void setPrecoServico(double precoServico) {
		this.precoServico = precoServico;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getIdServico() {
		return IdServico;
	}
	public void setIdServico(Long idServico) {
		IdServico = idServico;
	}
	
}