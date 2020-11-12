package br.com.everis.estacionamento.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everis.estacionamento.model.FormaDePagamento;
import br.com.everis.estacionamento.repository.FormaPagamentoRepository;
import br.com.everis.estacionamento.service.FormaPagamentoService;

@Service
public class FormaPagamentoServiceImplem implements FormaPagamentoService{
	
	@Autowired // ponto de injeção do repository para conseguir utilizar as instancias do repository
	FormaPagamentoRepository formaPagamentoRepository; 
	
	@Override
	public List<FormaDePagamento> findAll() {
		return formaPagamentoRepository.findAll();
	}

	@Override
	public FormaDePagamento findById(Long Idformapagamento) {
		// TODO Auto-generated method stub
		return formaPagamentoRepository.findById(Idformapagamento).get();
	}

	@Override
	public FormaDePagamento save(FormaDePagamento formapagamento) {
		return formaPagamentoRepository.save(formapagamento);
	}
	
	

}
