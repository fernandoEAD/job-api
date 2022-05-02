package com.fernando.job;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fernando.job.domain.Cadastro;
import com.fernando.job.domain.Pessoa;
import com.fernando.job.repositories.CadastroRepository;
import com.fernando.job.repositories.PessoaRepository;

@SpringBootApplication
public class JobApplication implements CommandLineRunner{

	@Autowired
	private CadastroRepository cadastroRepository;
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JobApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cadastro cad1 = new Cadastro(null, "Fernando", "DEV");
		
		Pessoa l1 = new Pessoa(null, "Fernando",
				"05283839303", LocalDate.of(1994, 02, 19), "fernando@hotmail.com",
				"85987151789", "ens.medio", "dev", "fullstack", cad1);
		
		cad1.getPessoas().addAll(Arrays.asList(l1));
		
		this.cadastroRepository.saveAll(Arrays.asList(cad1));
		this.pessoaRepository.saveAll(Arrays.asList(l1));
	}

	
}

//(null, "Fernando",
//		052838, 1994, "fernando@fer",
//		85978, "ens.medio", "dev",
//		"fullstack", cad1);