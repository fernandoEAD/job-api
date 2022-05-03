package com.fernando.job.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernando.job.domain.Cadastro;
import com.fernando.job.dtos.CadastroDTO;
import com.fernando.job.service.CadastroService;

@RestController
@RequestMapping(value = "/cadastros")
public class CadastroResource {
	
	@Autowired
	private CadastroService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Cadastro> findById(@PathVariable Integer id) {
		Cadastro obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	public ResponseEntity<List<CadastroDTO>> findAll() {
		List<Cadastro> list = service.findAll();
		List<CadastroDTO> listDTO = list.stream().map(obj -> new CadastroDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
}