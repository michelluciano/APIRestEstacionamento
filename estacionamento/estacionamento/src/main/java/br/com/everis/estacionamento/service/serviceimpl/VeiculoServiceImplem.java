package br.com.everis.estacionamento.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everis.estacionamento.model.Veiculo;
import br.com.everis.estacionamento.repository.VeiculoRepository;
import br.com.everis.estacionamento.service.VeiculoService;

@Service
public class VeiculoServiceImplem implements VeiculoService{
	
	@Autowired
	VeiculoRepository veiculoRepository;
	
	@Override
	public List<Veiculo> findAll() {
		return veiculoRepository.findAll();
	}

	@Override
	public Veiculo findById(Long Idveiculo) {
		return veiculoRepository.findById(Idveiculo).get();
	}

	@Override
	public Veiculo save(Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}

}
