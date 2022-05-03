package com.fernando.job.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.job.domain.Cadastro;
import com.fernando.job.dtos.CadastroDTO;
import com.fernando.job.repositories.CadastroRepository;
import com.fernando.job.service.exceptions.ObjectNotFoundException;

@Service
public class CadastroService {

	@Autowired
	private CadastroRepository repository;

	public Cadastro findById(Integer id) {
		Optional<Cadastro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + id + ", Tipo: " + Cadastro.class.getName()));
	}
	
	public List<Cadastro> findAll() {
		return repository.findAll();
	}
	
	public Cadastro create(Cadastro obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public Cadastro update(Integer id, CadastroDTO objDto) {
		Cadastro obj = findById(id);
		obj.setNome(objDto.getNome());
		obj.setJob(objDto.getJob());
		return repository.save(obj);
	}
}
