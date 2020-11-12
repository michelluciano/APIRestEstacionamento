package br.com.everis.estacionamento.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.everis.estacionamento.model.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
	
	List<Veiculo> findByplacaveiculo(String placaVeiculo);
	Page<Veiculo> findByplacaveiculo(String placaVeiculo, Pageable paginacao);
	//Veiculo findByplaca(String placa);
	
	
	
	//List<Veiculo> findByCategoriavalorhora(String placaVeiculo);


}
