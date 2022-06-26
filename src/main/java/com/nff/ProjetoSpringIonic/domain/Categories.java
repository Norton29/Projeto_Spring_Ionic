package com.nff.ProjetoSpringIonic.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Categories {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	
	
	@ManyToMany(mappedBy = "categorias")
	private List<Product> produtos = new ArrayList<>();
	
	
	public Categories() {
		super();
	}

	public Categories(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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

	@JsonIgnore
	public List<Product> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Product> produtos) {
		this.produtos = produtos;
	}
	
	@Override
	public String toString() {
		return "Categories [id=" + id + ", nome=" + nome + ", produtos=" + produtos + "]";
	}
	
	
}
