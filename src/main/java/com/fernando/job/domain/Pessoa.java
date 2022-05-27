package com.fernando.job.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_pessoa")
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpf;
	private LocalDate data;
	private String email;
	private String telefone;
	private String escolaridade;
	private String funcao;
	private String competencia1;
	private String descricao1;
	private String prof1;
	private String competencia2;
	private String descricao2;
	private String prof2;
	private Boolean isAproved;
	//@OneToMany (mappedBy = "pessoa")
	//private List<Competencia> competencias = new ArrayList<>();


	public Pessoa() {
		super();
	}

	public Pessoa(Integer id, String nome, String cpf, LocalDate data, String email, String telefone, String escolaridade,
			String funcao, String competencia1, String descricao1, String prof1, String competencia2, String descricao2, String prof2, Boolean isAproved) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
		this.email = email;
		this.telefone = telefone;
		this.escolaridade = escolaridade;
		this.funcao = funcao;
		this.competencia1 = competencia1;
		this.descricao1 = descricao1;
		this.prof1 = prof1;
		this.competencia2 = competencia2;
		this.descricao2 = descricao2;
		this.prof2 = prof2;
		this.isAproved = null;
	}
	
	

	public Boolean getIsAproved() {
		return isAproved;
	}

	public void setIsAproved(boolean isAproved) {
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	

	//public List<Competencia> getCompetencias() {
	//	return this.competencias;
	//}

	public String getCompetencia1() {
		return competencia1;
	}

	public void setCompetencia1(String competencia1) {
		this.competencia1 = competencia1;
	}

	public String getDescricao1() {
		return descricao1;
	}

	public void setDescricao1(String descricao1) {
		this.descricao1 = descricao1;
	}

	public String getProf1() {
		return prof1;
	}

	public void setProf1(String prof1) {
		this.prof1 = prof1;
	}

	public String getCompetencia2() {
		return competencia2;
	}

	public void setCompetencia2(String competencia2) {
		this.competencia2 = competencia2;
	}

	public String getDescricao2() {
		return descricao2;
	}

	public void setDescricao2(String descricao2) {
		this.descricao2 = descricao2;
	}

	public String getProf2() {
		return prof2;
	}

	public void setProf2(String prof2) {
		this.prof2 = prof2;
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
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
