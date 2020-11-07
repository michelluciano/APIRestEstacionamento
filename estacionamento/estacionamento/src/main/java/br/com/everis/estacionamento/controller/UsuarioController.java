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

import br.com.everis.estacionamento.controller.dto.UsuarioDto;
import br.com.everis.estacionamento.controller.form.UsuarioForm;
import br.com.everis.estacionamento.model.Usuario;
import br.com.everis.estacionamento.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<UsuarioDto> lista(String nome){
		if (nome == null) {
			List<Usuario> nomes = usuarioRepository.findAll();
			return UsuarioDto.converter(nomes);
		} else{
			List<Usuario> usuarios = usuarioRepository.findByusuarioNome(nome);
			return UsuarioDto.converter(usuarios);
			}
		
			//List<Veiculo> veiculos = veiculoRepository.findByCategoria_valorhora(placaVeiculo);
			//return VeiculoDto.converter(veiculos);
	}	
	
	@PostMapping
	public ResponseEntity<UsuarioDto> cadastrar(@RequestBody @Valid UsuarioForm form, UriComponentsBuilder uriBuilder) {
		Usuario usuario =form.converter(usuarioRepository);
		usuarioRepository.save(usuario);
		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(usuario.getIdusario()).toUri(); 
		return ResponseEntity.created(uri).body(new UsuarioDto(usuario));
	}
	
	
}
