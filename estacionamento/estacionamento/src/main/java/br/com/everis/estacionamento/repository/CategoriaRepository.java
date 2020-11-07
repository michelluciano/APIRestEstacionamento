package br.com.everis.estacionamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.everis.estacionamento.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	List<Categoria> findBydescricao(String descricaoCategoria);

	Categoria findByDescricao(String descricao);

}
