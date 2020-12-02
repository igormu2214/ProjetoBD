package com.projetoaeso.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ocupacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOcupacao;
	private String dataEntrada;
	private String dataSaida;
	public Long getIdOcupacao() {
		return idOcupacao;
	}
	public void setIdOcupacao(Long idOcupacao) {
		this.idOcupacao = idOcupacao;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	@OneToOne(mappedBy = "ocupacao")
	private Estadia estadia;

}
