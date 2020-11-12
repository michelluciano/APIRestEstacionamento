package br.com.everis.estacionamento.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TicketForm {
	
	@NotBlank @NotEmpty @NotNull
	private String placaveiculo;

	public String getPlacaveiculo() {
		return placaveiculo;
	}

	public void setPlacaveiculo(String placaveiculo) {
		this.placaveiculo = placaveiculo;
	}

//	public Ticket converter(VeiculoRepository veiculoRepository) {
//		Veiculo placa = veiculoRepository.findByplaca(placaveiculo);
//		return new Ticket(placa);
//	}
//	
	
}
