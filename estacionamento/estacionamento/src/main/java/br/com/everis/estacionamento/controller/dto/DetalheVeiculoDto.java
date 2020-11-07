package br.com.everis.estacionamento.controller.dto;

import br.com.everis.estacionamento.model.Veiculo;

public class DetalheVeiculoDto {
	
	private Long id;
	private String placaveiculo;
	private String marcaveiculo;
	private String modeloveiculo;
	private String corveiculo;
	private String descricaoCategoria;
	
	//construtor
	public DetalheVeiculoDto(Veiculo veiculo) {
		this.id = veiculo.getIdveiculo();
		this.placaveiculo = veiculo.getPlacaveiculo();
		this.marcaveiculo = veiculo.getMarcaveiculo();
		this.modeloveiculo = veiculo.getModeloveiculo();
		this.corveiculo = veiculo.getCorveiculo();
		this.descricaoCategoria = veiculo.getCategoria().getDescricao();
	}
	
	
	// getter e setter 
	

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

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPlacaveiculo(String placaveiculo) {
		this.placaveiculo = placaveiculo;
	}

	public void setMarcaveiculo(String marcaveiculo) {
		this.marcaveiculo = marcaveiculo;
	}

	public void setModeloveiculo(String modeloveiculo) {
		this.modeloveiculo = modeloveiculo;
	}

	public void setCorveiculo(String corveiculo) {
		this.corveiculo = corveiculo;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	

	
	
}
