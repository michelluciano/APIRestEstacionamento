package br.com.everis.estacionamento.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.everis.estacionamento.model.FormaDePagamento;
import br.com.everis.estacionamento.model.Fpsatatus;
import br.com.everis.estacionamento.repository.FormaPagamentoRepository;

public class FormapagamentoForm {
	
	@NotBlank @NotEmpty @NotNull
	private String descricao;
	private Fpsatatus status;
	
	public String getFpdescricao() {
		return descricao;
	}
	public Fpsatatus getStatus() {
		return status;
	}
	public void setFpdescricao(String fpdescricao) {
		this.descricao = fpdescricao;
	}
	public void setStatus(Fpsatatus status) {
		this.status = status;
	}
	public FormaDePagamento converter( FormaPagamentoRepository fpagamentoRepository) {
		return new FormaDePagamento(descricao, status);
	}
}