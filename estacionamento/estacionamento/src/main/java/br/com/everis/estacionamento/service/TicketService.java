package br.com.everis.estacionamento.service;

import java.util.List;

import br.com.everis.estacionamento.model.Ticket;

public interface TicketService {
	List<Ticket> findAll();
	Ticket findById(Long ticket);
	Ticket save(Ticket ticket);
}