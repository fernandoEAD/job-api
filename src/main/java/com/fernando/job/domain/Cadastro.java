package com.fernando.job.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Cadastro {
	
	private Integer id;
	private String name;
	private String job;
	
	private List<Pessoa> pessoas = new ArrayList<>();

	public Cadastro() {
		super();
	}

	public Cadastro(Integer id, String name, String job) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
