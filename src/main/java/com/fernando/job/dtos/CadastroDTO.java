package com.fernando.job.dtos;

import java.io.Serializable;

import com.fernando.job.domain.Cadastro;

public class CadastroDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String job;
	public CadastroDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CadastroDTO(Cadastro obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.job = obj.getJob();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
}
