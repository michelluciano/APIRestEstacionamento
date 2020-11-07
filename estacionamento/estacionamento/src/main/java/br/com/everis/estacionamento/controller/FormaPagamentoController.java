package br.com.everis.estacionamento.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.everis.estacionamento.controller.dto.FormapagamentoDto;
import br.com.everis.estacionamento.controller.form.FormapagamentoForm;
import br.com.everis.estacionamento.model.FormaDePagamento;
import br.com.everis.estacionamento.repository.FormaPagamentoRepository;

@RestController
@RequestMapping("/formapagamento")
public class FormaPagamentoController {

		@Autowired
		private FormaPagamentoRepository formaPagamentoRespository;
		
		@GetMapping
		public List<FormapagamentoDto> lista(String descricao ){
			if (descricao == null) {
				List<FormaDePagamento> formaPagamento = formaPagamentoRespository.findAll();
				return FormapagamentoDto.converter(formaPagamento);
			} else {

				List<FormaDePagamento> formaPagamento = formaPagamentoRespository.findByfpdescricao(descricao);
				return FormapagamentoDto.converter(formaPagamento);
			}
			
		}
		
		@PostMapping
		public ResponseEntity<FormapagamentoDto> cadastrar(@RequestBody @Valid FormapagamentoForm form, UriComponentsBuilder uriBuilder) {
			FormaDePagamento fpagamento = form.converter(formaPagamentoRespository);
			formaPagamentoRespository.save(fpagamento);
			URI uri = uriBuilder.path("/formapagamento/{id}").buildAndExpand(fpagamento.getIdformadepagamento()).toUri();
			return ResponseEntity.created(uri).body(new FormapagamentoDto(fpagamento));
		}
}