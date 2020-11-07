package br.com.everis.estacionamento.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.everis.estacionamento.controller.dto.CategoriaDto;
import br.com.everis.estacionamento.controller.form.CategoriaForm;
import br.com.everis.estacionamento.model.Categoria;
import br.com.everis.estacionamento.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<CategoriaDto> lista(String descricaoCategoria) {		
		if (descricaoCategoria == null) {
			System.out.println(descricaoCategoria);
			List<Categoria> categorias = categoriaRepository.findAll();
			return CategoriaDto.converter(categorias);
		} else {
			System.out.println(descricaoCategoria);
			List<Categoria> categorias = categoriaRepository.findBydescricao(descricaoCategoria);
			return CategoriaDto.converter(categorias);
		}
	}
	
	@PostMapping
	public ResponseEntity<CategoriaDto> cadastrar(@RequestBody @Valid CategoriaForm form, UriComponentsBuilder uriBuilder) {
		Categoria categoria = form.converter(categoriaRepository);
		categoriaRepository.save(categoria);
		URI uri = uriBuilder.path("/categoria/{id}").buildAndExpand(categoria.getIdcategoria()).toUri();
		return ResponseEntity.created(uri).body(new CategoriaDto(categoria));
	}

}
