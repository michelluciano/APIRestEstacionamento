package br.com.everis.estacionamento.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.com.everis.estacionamento.model.Veiculo;

public class VeiculoDto {
	
	private Long id;
	private String placaveiculo;
	private String marcaveiculo;
	private String modeloveiculo;
	private String corveiculo;
	
	//construtor
	public VeiculoDto(Veiculo veiculo) {
		this.id = veiculo.getIdveiculo();
		this.placaveiculo = veiculo.getPlacaveiculo();
		this.marcaveiculo = veiculo.getMarcaveiculo();
		this.modeloveiculo = veiculo.getModeloveiculo();
		this.corveiculo = veiculo.getCorveiculo();		
	}
	
	public Long getId() {
		return id;
	}
	public String getPlacaveiculo() {
		return placaveiculo;
	}
	public String getMarcaveiculo() {
		return marcaveiculo;
	}
	public String getModeloveiculo() {
		return modeloveiculo;
	}
	public String getCorveiculo() {
		return corveiculo;
	}

	public static List<VeiculoDto> converter(List<Veiculo> veiculos) {
		return veiculos.stream().map(VeiculoDto::new).collect(Collectors.toList());
	}

	public static Page<VeiculoDto> converterp(Page<Veiculo> veiculos) {
		return veiculos.map(VeiculoDto::new);
	}


}
