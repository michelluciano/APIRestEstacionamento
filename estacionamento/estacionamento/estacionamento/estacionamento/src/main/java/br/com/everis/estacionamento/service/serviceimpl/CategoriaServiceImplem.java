package br.com.everis.estacionamento.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everis.estacionamento.model.Categoria;
import br.com.everis.estacionamento.repository.CategoriaRepository;
import br.com.everis.estacionamento.service.CategoriaService;

@Service // mostrar para a spring que esta classe é um Bean regenciado por ele, assim pode criar pontos de injeção
public class CategoriaServiceImplem implements CategoriaService{

	@Autowired
	CategoriaRepository categoriaRepository;
		
	@Override
	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}

	@Override
	public Categoria findById(long IdCategoria) {
		return categoriaRepository.findById(IdCategoria).get();
	}

	@Override
	public Categoria save(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
}
