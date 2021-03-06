package br.com.everis.estacionamento.model;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idTicket;
	
	@Enumerated(EnumType.STRING)
	private Ticketstatus ticketStatus;
	
	private LocalDateTime ticketdt_entrada;
	private LocalDateTime ticketdt_saida;
	private BigDecimal ticketValorTotal;
	private Time ticketTempoDecorrido;
	
	@JoinColumn(name = "fk_idveiculo")
	@ManyToOne
	private Veiculo veiculo;
	
	@JoinColumn(name = "fk_idformapagamento")
	@ManyToOne
	private FormaDePagamento formadepagamento;
	
	@JoinColumn(name = "fk_idusuario")
	@ManyToOne
	private Usuario usuario;

	//construtor default
	public Ticket() {
	}
	
	//constructo controller
	public Ticket(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	

	//set get 
	public Long getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(Long idTicket) {
		this.idTicket = idTicket;
	}

	public Ticketstatus getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(Ticketstatus ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public LocalDateTime getTicketdt_entrada() {
		return ticketdt_entrada;
	}

	public void setTicketdt_entrada(LocalDateTime ticketdt_entrada) {
		this.ticketdt_entrada = ticketdt_entrada;
	}

	public LocalDateTime getTicketdt_saida() {
		return ticketdt_saida;
	}

	public void setTicketdt_saida(LocalDateTime ticketdt_saida) {
		this.ticketdt_saida = ticketdt_saida;
	}

	public BigDecimal getTicketValorTotal() {
		return ticketValorTotal;
	}

	public void setTicketValorTotal(BigDecimal ticketValorTotal) {
		this.ticketValorTotal = ticketValorTotal;
	}

	public Time getTicketTempoDecorrido() {
		return ticketTempoDecorrido;
	}

	public void setTicketTempoDecorrido(Time ticketTempoDecorrido) {
		this.ticketTempoDecorrido = ticketTempoDecorrido;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public FormaDePagamento getFormadepagamento() {
		return formadepagamento;
	}

	public void setFormadepagamento(FormaDePagamento formadepagamento) {
		this.formadepagamento = formadepagamento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
