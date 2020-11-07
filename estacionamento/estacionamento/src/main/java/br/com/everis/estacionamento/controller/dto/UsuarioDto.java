package br.com.everis.estacionamento.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.everis.estacionamento.model.Usuario;

public class UsuarioDto {

	private long id;
	private String nome;
	private String perfil;
	
	public UsuarioDto(Usuario usuario) {
		this.id = usuario.getIdusario();
		this.nome = usuario.getUsuarioNome();
		this.perfil = usuario.getUsuarioPerfil();
	}
	
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getPerfil() {
		return perfil;
	}

	public static List<UsuarioDto> converter(List<Usuario> usuarios) {
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

}
