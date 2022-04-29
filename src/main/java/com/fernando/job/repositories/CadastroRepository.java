package com.fernando.job.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernando.job.domain.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

}
