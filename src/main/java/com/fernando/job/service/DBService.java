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

		Cadastro cad1 = new Cadastro(null, "Fernando", "Dev");
		Cadastro cad2 = new Cadastro(null, "Andre", "gestor");
		Cadastro cad3 = new Cadastro(null, "Dney", "vendedor");
		Cadastro cad4 = new Cadastro(null, "Jeim", "pedreiro");
		Cadastro cad5 = new Cadastro(null, "William", "estoquista");

		Pessoa p1 = new Pessoa(null, "Fernando", "123456", LocalDate.of(1994, 02, 19), "fernando@hotmail.com", "112233",
				"Superior comp", "Dev", "fullstack", cad1);
		Pessoa p2 = new Pessoa(null, "Andre", "1234567", LocalDate.of(1994, 02, 18), "andre@hotmail.com", "11223344", "ens medio",
				"gestor", "rh", cad2);
		Pessoa p3 = new Pessoa(null, "Dney", "12345678", LocalDate.of(1994, 02, 17), "dney@hotmail.com", "1122334455", "ens medio",
				"vendedor", "lojas", cad3);
		Pessoa p4 = new Pessoa(null, "Jeim", "123456789", LocalDate.of(1994, 02, 16), "dennys@hotmail.com", "1122334",
				"Superior comp", "pedreiro", "Mestre de obras", cad4);
		Pessoa p5 = new Pessoa(null, "William", "1234567891", LocalDate.of(1994, 02, 15), "fernando@hotmail.com", "11223345",
				"Superior comp", "estoquista", "lojas", cad5);

		cad1.getPessoas().addAll(Arrays.asList(p1, p2));
		cad2.getPessoas().addAll(Arrays.asList(p3, p4, p5));

		cadastroRepository.saveAll(Arrays.asList(cad1, cad2, cad3, cad4, cad5));
		pessoaRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
	}
}