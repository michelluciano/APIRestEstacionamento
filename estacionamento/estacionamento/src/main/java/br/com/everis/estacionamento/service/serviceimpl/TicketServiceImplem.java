package br.com.everis.estacionamento.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.everis.estacionamento.model.Ticket;
import br.com.everis.estacionamento.repository.TicketRepository;
import br.com.everis.estacionamento.service.TicketService;

@Service
public class TicketServiceImplem implements TicketService {
	@Autowired
	TicketRepository ticketRepository;

	@Override
	public List<Ticket> findAll() {
		return ticketRepository.findAll();
	}

	@Override
	public Ticket findById(Long idticket) {
		return ticketRepository.findById(idticket).get();
	}

	@Override
	public Ticket save(Ticket ticket) {
		return ticketRepository.save(ticket);
	}


}
