package br.com.everis.estacionamento.service;

import java.util.List;

import br.com.everis.estacionamento.model.FormaDePagamento;

public interface FormaPagamentoService {
	
	List<FormaDePagamento> findAll(); 
	FormaDePagamento findById(Long Idformapagamento);
	
	FormaDePagamento save(FormaDePagamento formapagamento); 

}
