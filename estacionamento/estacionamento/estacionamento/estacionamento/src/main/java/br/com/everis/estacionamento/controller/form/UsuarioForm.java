package br.com.everis.estacionamento.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.everis.estacionamento.model.Usuario;
import br.com.everis.estacionamento.repository.UsuarioRepository;

public class UsuarioForm {
	
	@NotBlank @NotEmpty @NotNull
	private String nome;
	@NotBlank @NotEmpty @NotNull
	private String perfil;
	
	public String getNome() {
		return nome;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public Usuario converter(UsuarioRepository usuarioRepository) {
		return new Usuario(nome, perfil);
	}
}
