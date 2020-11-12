package br.com.everis.estacionamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.everis.estacionamento.model.Ticket;
import br.com.everis.estacionamento.model.Ticketstatus;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{

	List<Ticket> findAllByticketStatus(Ticketstatus status);

}
