package com.projetoaeso.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class ComunicacoesCliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idComunicacao;
	private int telefone;
	private String email;
	private String redesSociais;
	
	@OneToOne(mappedBy = "comunicacoesCliente")
	private Cliente cliente;
	
	public Long getIdComunicacao() {
		return idComunicacao;
	}
	public void setIdComunicacao(Long idComunicacao) {
		this.idComunicacao = idComunicacao;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRedesSociais() {
		return redesSociais;
	}
	public void setRedesSociais(String redesSociais) {
		this.redesSociais = redesSociais;
	}
	
	
}
