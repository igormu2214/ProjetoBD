package com.projetoaeso.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Cliente {
	
	private String CPF;
	private String nome;
	private String sobrenome;
	private String sexo;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	@OneToOne
	@JoinColumn(referencedColumnName = "idEndereco")
	private EnderecoCliente enderecoCliente;
	
	@OneToOne
	@JoinColumn(referencedColumnName = "idComunicacao")
	private ComunicacoesCliente comunicacoesCliente;
	
	@OneToMany(mappedBy="cliente")
	private List<Servico> servico;
	

   @ManyToOne
	@JoinColumn(referencedColumnName = "idEstadia")
	private Estadia estadia;
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	} 
	

}