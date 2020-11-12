package br.com.everis.estacionamento.controller.dto;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.everis.estacionamento.model.Ticket;
import br.com.everis.estacionamento.model.Ticketstatus;

public class TicketDto {
	private Long idTicket;
	private Ticketstatus ticketStatus;
	private LocalDateTime ticketdt_entrada;
	private LocalDateTime ticketdt_saida;
	private BigDecimal ticketValorTotal;
	private Time ticketTempoDecorrido;
	
	//constructor
	public TicketDto(Ticket ticket) {
		this.idTicket = ticket.getIdTicket();
		this.ticketStatus = ticket.getTicketStatus();
		this.ticketdt_entrada = ticket.getTicketdt_entrada();
		this.ticketdt_saida= ticket.getTicketdt_saida();
		this.ticketValorTotal = ticket.getTicketValorTotal();
		this.ticketTempoDecorrido = ticket.getTicketTempoDecorrido();
	}
	
	
	public Long getIdTicket() {
		return idTicket;
	}
	public Ticketstatus getTicketStatus() {
		return ticketStatus;
	}
	public LocalDateTime getTicketdt_entrada() {
		return ticketdt_entrada;
	}
	public LocalDateTime getTicketdt_saida() {
		return ticketdt_saida;
	}
	public BigDecimal getTicketValorTotal() {
		return ticketValorTotal;
	}
	public Time getTicketTempoDecorrido() {
		return ticketTempoDecorrido;
	}

	public static List<TicketDto> converter(List<Ticket> tickets) {
		return tickets.stream().map(TicketDto::new).collect(Collectors.toList());
	}
		
	
}
