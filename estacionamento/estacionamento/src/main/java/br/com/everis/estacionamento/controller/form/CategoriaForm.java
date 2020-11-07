package br.com.everis.estacionamento.controller.form;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.everis.estacionamento.model.CatStatus;
import br.com.everis.estacionamento.model.Categoria;
import br.com.everis.estacionamento.repository.CategoriaRepository;

public class CategoriaForm {
	
	@NotBlank @NotEmpty @NotNull
	private String descricao;
	private CatStatus status;
	@NotNull 
	private BigDecimal valorhora;
	
	public String getDescricao() {
		return descricao;
	}
	public CatStatus getStatus() {
		return status;
	}
	public BigDecimal getValorhora() {
		return valorhora;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setStatus(CatStatus status) {
		this.status = status;
	}
	public void setValorhora(BigDecimal valorhora) {
		this.valorhora = valorhora;
	}
	
	public Categoria converter(CategoriaRepository categoriaRepository) {
		return new Categoria(descricao,valorhora,status);
	}
}
