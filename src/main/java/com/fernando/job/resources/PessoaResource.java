package com.fernando.job.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fernando.job.domain.Pessoa;
import com.fernando.job.dtos.PessoaDTO;
import com.fernando.job.service.PessoaService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping(value = "{id}")
	public ResponseEntity<Pessoa> findById(@PathVariable Integer id) {
		Pessoa obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<PessoaDTO>> findAll() {
		List<Pessoa> list = service.findAll();
		List<PessoaDTO> listDTO = list.stream().map(obj -> new PessoaDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Pessoa> update(@PathVariable Integer id, @RequestBody Pessoa obj) {
		Pessoa newObj = service.update(id, obj);
		return ResponseEntity.ok().body(newObj);
	}
	
	@PutMapping(value = "/aproved/{id}")
	public ResponseEntity<Pessoa> updateIsAproved(@PathVariable Integer id, @RequestBody boolean isAproved) {
		Pessoa newObj = service.updateIsAproved(id, isAproved);
		return ResponseEntity.ok().body(newObj);
	}
	
	@PatchMapping(value = "/{id}")
	public ResponseEntity<Pessoa> updatePatch(@PathVariable Integer id, @RequestBody Pessoa obj) {
		Pessoa newObj = service.update(id, obj);
		return ResponseEntity.ok().body(newObj);
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> create(@RequestBody Pessoa obj) {
		Pessoa newObj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/pessoas/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
