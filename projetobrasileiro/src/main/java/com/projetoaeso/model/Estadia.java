package com.projetoaeso.model;


import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Estadia {

	private int n_ocupantes;
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdEstadia;
	public int getN_ocupantes() {
		return n_ocupantes;
	}
	public void setN_ocupantes(int n_ocupantes) {
		this.n_ocupantes = n_ocupantes;
	}
	public Long getIdEstadia() {
		return IdEstadia;
	}
	public void setIdEstadia(Long idEstadia) {
		IdEstadia = idEstadia;
	}
	
	@OneToOne
	@JoinColumn(referencedColumnName = "idOcupacao")
	private Ocupacao ocupacao;
	
	@OneToOne(mappedBy = "estadia")
	private Quarto quarto;
	
	@OneToMany(mappedBy ="estadia")
	private List<Cliente> cliente;
}
	
