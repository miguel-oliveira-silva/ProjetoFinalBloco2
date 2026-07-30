package com.generation.farmacia.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo nome é obrigatório")
	@Size(min = 1, max = 255, message = "O atributo deve ter entre 1 e 255 caracteres.")
	@Column(length = 255)
	private String nome;
	
	@NotNull
	@Column(precision = 10, scale = 2)
	private BigDecimal preco;
	
	@NotBlank(message = "O atributo descrição é obrigatório!")
	@Size(min = 5, max = 255, message = "O atributo deve ter entre 5 e 255 caracteres.")
	@Column(length = 255)
	private String descricao;

	@NotBlank(message = "O atributo linkFoto é obrigatório")
	@Size(min = 10, max = 255, message = "O atributo deve ter entre 10 e 255 caracteres.")
	@Column(length = 255)
	private String linkFoto;
	
	@ManyToOne
	@JsonIgnoreProperties(value = "produtos", allowSetters = true)
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}
	
	
}