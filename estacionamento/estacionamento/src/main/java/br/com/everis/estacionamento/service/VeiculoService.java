package br.com.everis.estacionamento.service;

import java.util.List;

import br.com.everis.estacionamento.model.Veiculo;


public interface VeiculoService {
	
	List<Veiculo> findAll(); 
	Veiculo findById(Long Idveiculo);
	
	Veiculo save(Veiculo veiculo);


}
