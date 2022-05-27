	package com.fernando.job.dtos;

import java.io.Serializable;

import com.fernando.job.domain.Pessoa;

public class PessoaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String cpf;
	private String funcao;
	private Boolean isAproved;
	private String escolaridade;

	public PessoaDTO() {
		super();

	}

	public PessoaDTO(Pessoa obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.cpf = obj.getCpf();
		this.funcao = obj.getFuncao();
		this.isAproved = obj.getIsAproved();
		this.escolaridade = obj.getEscolaridade();
	}

	
	
	public Boolean getIsAproved() {
		return isAproved;
	}

	public void setIsAproved(Boolean isAproved) {
		this.isAproved = isAproved;
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
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
}
