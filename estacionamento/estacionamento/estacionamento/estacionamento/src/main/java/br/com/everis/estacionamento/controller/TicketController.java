package br.com.everis.estacionamento.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.everis.estacionamento.controller.dto.TicketDto;
import br.com.everis.estacionamento.controller.form.TicketForm;
import br.com.everis.estacionamento.model.Ticket;
import br.com.everis.estacionamento.model.Ticketstatus;
import br.com.everis.estacionamento.repository.TicketRepository;
import br.com.everis.estacionamento.repository.VeiculoRepository;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@GetMapping
	public List<TicketDto> lista (Ticketstatus status){
		if (status == null) {
			List<Ticket> ticket = ticketRepository.findAll();
			return TicketDto.converter(ticket);
		}else {
			List<Ticket> ticket = ticketRepository.findAllByticketStatus(status);
			return TicketDto.converter(ticket);
		}
	}
	
//	@PostMapping
//	public ResponseEntity<TicketDto> cadastrar(@RequestBody @Valid TicketForm form, UriComponentsBuilder uriBuilder) {
//		Ticket ticket = form.converter(veiculoRepository);
//		ticketRepository.save(ticket);
//		URI uri = uriBuilder.path("/ticket/{id}").buildAndExpand(ticket.getIdTicket()).toUri(); 
//		return ResponseEntity.created(uri).body(new TicketDto(ticket));
//		
//	}
}
