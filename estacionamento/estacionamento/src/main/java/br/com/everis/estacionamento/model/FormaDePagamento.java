package br.com.everis.estacionamento.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FormaDePagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idformadepagamento;
	
	@Enumerated(EnumType.STRING)
	private Fpsatatus status;
	private String fpdescricao;
	
	//construtor default
	public FormaDePagamento() {
	}

	public FormaDePagamento(String descricao, Fpsatatus status) {
		this.status = status;
		this.fpdescricao = descricao;
	}


	public Long getIdformadepagamento() {
		return idformadepagamento;
	}
	public void setIdformadepagamento(Long idformadepagamento) {
		this.idformadepagamento = idformadepagamento;
	}
	public Fpsatatus getStatus() {
		return status;
	}
	public void setStatus(Fpsatatus status) {
		this.status = status;
	}
	public String getFpdescricao() {
		return fpdescricao;
	}
	public void setFpdescricao(String fpdescricao) {
		this.fpdescricao = fpdescricao;
	}
}
