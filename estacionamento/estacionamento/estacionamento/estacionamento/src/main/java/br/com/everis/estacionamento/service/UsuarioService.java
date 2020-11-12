package br.com.everis.estacionamento.service;

import java.util.List;

import br.com.everis.estacionamento.model.Usuario;

public interface UsuarioService {
	
	List<Usuario> findAll();
	Usuario findById(Long IdUsuario);
	
	Usuario save(Usuario usuario);

}
