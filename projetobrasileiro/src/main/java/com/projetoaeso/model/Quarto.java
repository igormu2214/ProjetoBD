package com.projetoaeso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Quarto {
	private int tipo;
	private double preco;
	private String descricao;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdQuarto;
	
	@OneToOne
	@JoinColumn(referencedColumnName = "idEstadia")
	private Estadia estadia;
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getIdQuarto() {
		return IdQuarto;
	}
	public void setIdQuarto(Long idQuarto) {
		this.IdQuarto = idQuarto;
	}
	
}
