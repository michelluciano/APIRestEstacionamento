package br.com.everis.estacionamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.everis.estacionamento.model.FormaDePagamento;

@Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaDePagamento, Long>{

	List<FormaDePagamento> findByfpdescricao(String descricao);

}

