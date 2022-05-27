package com.fernando.job.service;

import java.time.LocalDate;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.fernando.job.domain.Competencia;
import com.fernando.job.domain.Pessoa;
//import com.fernando.job.domain.Proeficiencia;
//import com.fernando.job.repositories.CompetenciaRepository;
import com.fernando.job.repositories.PessoaRepository;
//import com.fernando.job.repositories.ProeficienciaRepository;

@Service
public class DBService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	//@Autowired
	//private ProeficienciaRepository proeficienciaRepository;

	public void instanciaBaseDeDados() {
		
		
		//Proeficiencia n1 = new Proeficiencia(null, "Básico");
		//Proeficiencia n2 = new Proeficiencia(null, "Intermediário");
		//Proeficiencia n3 = new Proeficiencia(null, "Avançado");
		
		Pessoa p1 = new Pessoa(null, "Fernando", "123456", LocalDate.of(1994, 02, 19), "fernando@hotmail.com", "112233",
				"Superior completo", "Dev", "Back end", "Spring boot", "Alta", "Front end", "Angular", "basico", null);
		
		Pessoa p2 = new Pessoa(null, "Andre", "1234567", LocalDate.of(1994, 02, 18), "andre@hotmail.com", "112233", "Analfabeto",
				"gestor", "Psicologo", "Mentir", "medio", "dançarino", "poli dance", "basico", null);
		
		Pessoa p3 = new Pessoa(null, "Dney", "12345678", LocalDate.of(1994, 02, 17), "dney@hotmail.com", "1122334455", "Mestrado",
				"vendedor", "Mentir", "com a boca", "avançado", "Front end", "Angular", "avançado", null);
		
		Pessoa p4 = new Pessoa(null, "Jeim", "123456789", LocalDate.of(1994, 02, 16), "dennys@hotmail.com", "1122334",
				"Superior completo", "pedreiro", "Mestre de obra", "Cimento", "Alta", "tapador de buraco", "tapo com o dedo", "avançado", null);
		
		Pessoa p5 = new Pessoa(null, "William", "1234567891", LocalDate.of(1994, 02, 15), "fernando@hotmail.com", "11223345",
				"Superior completo", "estoquista", "Suporte", "Proativo", "medio", "Inglês", "escrita", "avançado", null);
		
		Pessoa p6 = new Pessoa(null, "Elisio", "5551188888", LocalDate.of(1990, 02, 11), "elisio@hotmail.com", "11223345",
				"Médio incompleto", "Dançarino", "Suporte", "Angular", "medio", "Inglês", "escrita", "avançado", null);
		
		Pessoa p7 = new Pessoa(null, "Armando", "1234567891", LocalDate.of(1994, 02, 15), "armando@hotmail.com", "11223345",
				"Ignorado", "Nadador", "Suporte", "Ingles", "medio", "Inglês", "escrita", "avançado", null);
		
		Pessoa p8 = new Pessoa(null, "Ronaldo", "1234567891", LocalDate.of(1994, 02, 15), "ronaldo@hotmail.com", "11223345",
				"Analfabeto", "Escalador", "Administrador", "Italiano", "medio", "Inglês", "escrita", "avançado", null);
		
		Pessoa p9 = new Pessoa(null, "Dantas", "1234567891", LocalDate.of(1994, 02, 15), "dantas@hotmail.com", "11223345",
				"Ignorado", "Esqueitista", "Gestor", "Suporte", "medio", "Inglês", "escrita", "avançado", null);
		
		Pessoa p10 = new Pessoa(null, "Alex", "1234567891", LocalDate.of(1994, 02, 15), "alex@hotmail.com", "11223345",
				"Analfabeto", "Matador", "Cabiamento", "Java", "medio", "Inglês", "escrita", "avançado", null);
		
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));
		
		//proeficienciaRepository.saveAll(Arrays.asList(n1, n2, n3));
		
		/*Competencia comp1 = new Competencia(null, "backend", "...", Proeficiencia.ALTO, p1);
		Competencia comp2 = new Competencia(null, "frontend", "...", Proeficiencia.MEDIO, p2);
		Competencia comp3 = new Competencia(null, "dba", "...", Proeficiencia.BAIXO, p3);
		
		
		competenciaRepository.saveAllAndFlush(Arrays.asList(comp1, comp2, comp3));*/
		
	}
}