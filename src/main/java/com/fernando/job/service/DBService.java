package com.fernando.job.service;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.job.domain.Cadastro;
import com.fernando.job.domain.Pessoa;
import com.fernando.job.repositories.CadastroRepository;
import com.fernando.job.repositories.PessoaRepository;

@Service
public class DBService {

	@Autowired
	private CadastroRepository cadastroRepository;
	@Autowired
	private PessoaRepository pessoaRepository;

	public void instanciaBaseDeDados() {

		Cadastro cad1 = new Cadastro(null, "Fernando", "DEV");

		Pessoa p1 = new Pessoa(null, "Fernando", "05283839303", LocalDate.of(1994, 02, 19), "fernando@hotmail.com",
				"85987151789", "ens.medio", "dev", "fullstack", cad1);

		cad1.getPessoas().addAll(Arrays.asList(p1));

		this.cadastroRepository.saveAll(Arrays.asList(cad1));
		this.pessoaRepository.saveAll(Arrays.asList(p1));
	}
}
