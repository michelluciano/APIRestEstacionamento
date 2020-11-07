package br.com.everis.estacionamento.Utils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.everis.estacionamento.model.CatStatus;
import br.com.everis.estacionamento.model.Categoria;
import br.com.everis.estacionamento.model.FormaDePagamento;
import br.com.everis.estacionamento.model.Fpsatatus;
import br.com.everis.estacionamento.model.Ticket;
import br.com.everis.estacionamento.model.Ticketstatus;
import br.com.everis.estacionamento.model.Usuario;
import br.com.everis.estacionamento.model.Veiculo;
import br.com.everis.estacionamento.repository.CategoriaRepository;
import br.com.everis.estacionamento.repository.FormaPagamentoRepository;
import br.com.everis.estacionamento.repository.TicketRepository;
import br.com.everis.estacionamento.repository.UsuarioRepository;
import br.com.everis.estacionamento.repository.VeiculoRepository;

@Component
public class DummyDate {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	FormaPagamentoRepository fpagamentoRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	VeiculoRepository veiculoRepository;
	
	@Autowired
	TicketRepository ticketRepository;
	
	@PostConstruct
	public void saveCategoria() {
		 
		//popula categoria
		List<Categoria> categoriaList = new ArrayList<>();
		Categoria cat1 = new Categoria();
		cat1.setDescricao("Motocicleta");
		cat1.setCatStatus(CatStatus.ATIVA);
		cat1.setValorhora(new BigDecimal(2.0));
			
		//categoriaRepository.save(cat1);
		//System.out.println(cat1.getIdcategoria());
		
		Categoria cat2 = new Categoria();
		cat2.setDescricao("Utilitário");
		cat2.setCatStatus(CatStatus.ATIVA );
		cat2.setValorhora(new BigDecimal(5.0));
				
		Categoria cat3 = new Categoria();
		cat3.setDescricao("Camionete");
		cat3.setCatStatus(CatStatus.ATIVA );
		cat3.setValorhora(new BigDecimal(7.0));
		
		Categoria cat4 = new Categoria();
		cat4.setDescricao("Caminhão");
		cat4.setCatStatus(CatStatus.INATIVA );
		cat4.setValorhora(new BigDecimal(7.0));
		
		
		categoriaList.add(cat1);
		categoriaList.add(cat2);
		categoriaList.add(cat3);
		categoriaList.add(cat4);
		for(Categoria categoria: categoriaList) {
			Categoria categoriasaved = categoriaRepository.save(categoria);
			System.out.println("TABELA CATEGORIA ID "+categoriasaved.getIdcategoria());
		}

//popula formaPagamento************************************************
		List<FormaDePagamento> fpagamentoList = new ArrayList<>();
		FormaDePagamento fpag1 = new FormaDePagamento();
		fpag1.setFpdescricao("Dinheiro");
		fpag1.setStatus(Fpsatatus.ATIVA);

		FormaDePagamento fpag2 = new FormaDePagamento();
		fpag2.setFpdescricao("Cartão de Débito");
		fpag2.setStatus(Fpsatatus.ATIVA);

		FormaDePagamento fpag3 = new FormaDePagamento();
		fpag3.setFpdescricao("Cartão de Crédito");
		fpag3.setStatus(Fpsatatus.ATIVA);
		
		fpagamentoList.add(fpag1);
		fpagamentoList.add(fpag2);
		fpagamentoList.add(fpag3);
		
		for(FormaDePagamento fpagamento: fpagamentoList) {
			FormaDePagamento fpagsaved = fpagamentoRepository.save(fpagamento);
			System.out.println("TABELA FORMA DE PAGAMENTO - ID : "+fpagsaved.getIdformadepagamento());
		}
		
// POPULAR TABELA USUARIO*******************************************************************************
		
		List<Usuario> usuarioList = new ArrayList<>();
		Usuario usu1 = new Usuario();
		usu1.setUsuarioNome("Elektra Natchios");
		usu1.setUsuarioPerfil("Administrador");
		
		Usuario usu2 = new Usuario();
		usu2.setUsuarioNome("Francis Castle");
		usu2.setUsuarioPerfil("Caixa");
		
		usuarioList.add(usu1);
		usuarioList.add(usu2);
		
		for(Usuario usuario: usuarioList) {
			Usuario ususaved = usuarioRepository.save(usuario);
			System.out.println("TABELA USUARIO - ID "+ususaved.getIdusario());
		}
		
//POPULAR TABELA  VEICULO**************************************************
		List<Veiculo> veiculoList = new ArrayList<>();
		Veiculo vei1 = new Veiculo();
		vei1.setPlacaveiculo("IMP-8126");
		vei1.setMarcaveiculo("FIAT");
		vei1.setModeloveiculo("UNO");
		vei1.setCorveiculo("Branco");
		vei1.setCategoria(cat2);
		
		Veiculo vei2 = new Veiculo();
		vei2.setPlacaveiculo("PIM-4578");
		vei2.setMarcaveiculo("HONDA");
		vei2.setModeloveiculo("FIT");
		vei2.setCorveiculo("Prata");
		vei2.setCategoria(cat2);
		
		Veiculo vei3 = new Veiculo();
		vei3.setPlacaveiculo("KPK-6754");
		vei3.setMarcaveiculo("HONDA");
		vei3.setModeloveiculo("CG-125");
		vei3.setCorveiculo("AZUL");
		vei3.setCategoria(cat1);
		
		Veiculo vei4 = new Veiculo();
		vei4.setPlacaveiculo("KPK-6754");
		vei4.setMarcaveiculo("FORD");
		vei4.setModeloveiculo("RANGER");
		vei4.setCorveiculo("VERMELHA");
		vei4.setCategoria(cat3);
		
		veiculoList.add(vei1);
		veiculoList.add(vei2);
		veiculoList.add(vei3);
		veiculoList.add(vei4);
		
		for(Veiculo veiculo: veiculoList) {
			Veiculo veisaved = veiculoRepository.save(veiculo);
			System.out.println("TABELA VEICULO ID "+ veisaved.getIdveiculo());
		}
		
//POPULAR TABELA TICKET
		
		List<Ticket> ticketList = new ArrayList<>();
		Ticket tick1 = new Ticket();
		tick1.setTicketdt_entrada(LocalDateTime.now());
		tick1.setTicketdt_saida(null);
		tick1.setTicketStatus(Ticketstatus.EM_ABERTO);
		tick1.setTicketTempoDecorrido(null);
		tick1.setTicketValorTotal(new BigDecimal(0.0));
		tick1.setFormadepagamento(fpag1);
		tick1.setVeiculo(vei2);
		tick1.setUsuario(usu2);
		
		Ticket tick2 = new Ticket();
		tick2.setTicketdt_entrada(LocalDateTime.now());
		tick2.setTicketdt_saida(null);
		tick2.setTicketStatus(Ticketstatus.EM_ABERTO);
		tick2.setTicketTempoDecorrido(null);
		tick2.setTicketValorTotal(new BigDecimal(0.0));
		tick2.setFormadepagamento(fpag2);
		tick2.setVeiculo(vei1);
		tick2.setUsuario(usu1);
		
		Ticket tick3 = new Ticket();
		tick3.setTicketdt_entrada(LocalDateTime.now());
		tick3.setTicketdt_saida(null);
		tick3.setTicketStatus(Ticketstatus.PAGO);
		tick3.setTicketTempoDecorrido(null);
		tick3.setTicketValorTotal(new BigDecimal(0.0));
		tick3.setFormadepagamento(fpag3);
		tick3.setVeiculo(vei3);
		tick3.setUsuario(usu1);
		
		ticketList.add(tick1);
		ticketList.add(tick2);
		ticketList.add(tick3);
		
		for(Ticket ticket: ticketList) {
			Ticket ticksaved = ticketRepository.save(ticket);
			System.out.println("TABELA TICKET ID "+ ticksaved.getIdTicket());
		}
	}
	
}