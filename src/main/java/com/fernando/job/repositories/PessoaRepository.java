package com.fernando.job.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fernando.job.domain.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

	@Query("SELECT obj FROM Pessoa obj WHERE obj.cadastro.id = :id_cad ORDER BY nome")
	List<Pessoa> findAllByCadastro(@Param(value = "id_cad") Integer id_cad);
}
