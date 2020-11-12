package br.com.everis.estacionamento.controller.form;

import br.com.everis.estacionamento.model.Veiculo;
import br.com.everis.estacionamento.repository.VeiculoRepository;

public class AtualizaVeiculoForm {
	
	private String placa;
	private String marca;
	
	
	public String getPlaca() {
		return placa;
	}
	public String getMarca() {
		return marca;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Veiculo atualizar(Long id, VeiculoRepository veiculoRepository) {
		Veiculo veiculo = veiculoRepository.getOne(id);
		
		veiculo.setPlacaveiculo(this.placa);
		veiculo.setMarcaveiculo(this.marca);
	
		return veiculo;
	}
	
	

}
