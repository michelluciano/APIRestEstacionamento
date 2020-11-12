package br.com.everis.estacionamento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idusario;
	
	private String usuarioNome;
	private String usuarioPerfil;
	
	//construtor default
	public Usuario(){
		
	}
	
	// construtor para o controller
	public Usuario(String nome, String perfil) {
		this.usuarioNome = nome;
		this.usuarioPerfil = perfil;
	}
	
	// getter and setters
	public Long getIdusario() {
		return idusario;
	}
	
	public void setIdusario(Long idusario) {
		this.idusario = idusario;
	}
	public String getUsuarioNome() {
		return usuarioNome;
	}
	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}
	public String getUsuarioPerfil() {
		return usuarioPerfil;
	}
	public void setUsuarioPerfil(String usuarioPerfil) {
		this.usuarioPerfil = usuarioPerfil;
	}
}
