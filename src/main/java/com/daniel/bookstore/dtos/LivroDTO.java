package com.daniel.bookstore.dtos;

import java.io.Serializable;

import com.daniel.bookstore.domain.Livro;

public class LivroDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String titulo;
	private String nome_autor;

	public LivroDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LivroDTO(Livro obj) {
		super();
		this.id = obj.getId();
		this.titulo = obj.getTitulo();
		this.nome_autor = obj.getNome_autor();
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the nome_autor
	 */
	public String getNome_autor() {
		return nome_autor;
	}

	/**
	 * @param nome_autor the nome_autor to set
	 */
	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

}
