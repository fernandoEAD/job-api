package com.fernando.job.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fernando.job.domain.Cadastro;
import com.fernando.job.dtos.CadastroDTO;
import com.fernando.job.service.CadastroService;

@CrossOrigin("*")
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
	
	@GetMapping
	public ResponseEntity<List<CadastroDTO>> findAll() {
		List<Cadastro> list = service.findAll();
		List<CadastroDTO> listDTO = list.stream().map(obj -> new CadastroDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PostMapping
	public ResponseEntity<Cadastro> create(@Valid @RequestBody Cadastro obj) {
		obj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<CadastroDTO> update(@PathVariable Integer id, @RequestBody CadastroDTO objDto) {
		Cadastro newObj = service.update(id, objDto);
		return ResponseEntity.ok().body(new CadastroDTO(newObj));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}