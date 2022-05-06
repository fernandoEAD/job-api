package com.fernando.job.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.job.domain.Pessoa;
import com.fernando.job.repositories.PessoaRepository;
import com.fernando.job.service.exceptions.ObjectNotFoundException;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;

	@Autowired
	private CadastroService cadastroService;

	public Pessoa findById(Integer id) {
		Optional<Pessoa> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pessoa.class.getName()));
	}

	public List<Pessoa> findAll(Integer id_cad) {
		cadastroService.findById(id_cad);
		return repository.findAllByCadastro(id_cad);
	}

	public Pessoa update(Integer id, Pessoa obj) {
		Pessoa newObj = findById(id);
		updateData(newObj, obj);
		return repository.save(newObj);
	}

	private void updateData(Pessoa newObj, Pessoa obj) {
		newObj.setNome(obj.getNome());
		newObj.setCpf(obj.getCpf());
		newObj.setData(obj.getData());
		newObj.setEmail(obj.getEmail());
		newObj.setTelefone(obj.getTelefone());
		newObj.setEscolaridade(obj.getEscolaridade());
		newObj.setFuncao(obj.getFuncao());
		newObj.setCompetencia(obj.getCompetencia());
		
	}
}
