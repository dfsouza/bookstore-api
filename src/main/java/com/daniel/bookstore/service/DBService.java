package com.daniel.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.bookstore.domain.Categoria;
import com.daniel.bookstore.domain.Livro;
import com.daniel.bookstore.repositories.CategoriaRepository;
import com.daniel.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");
		Categoria cat2 = new Categoria(null, "Biográfico", "Livro de Auto Biografia");
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Loren ipsum", cat1);
		Livro l2 = new Livro(null, "Mind Set", "Steven Jobs", "Mente Brilhante", cat2);
		Livro l3 = new Livro(null, "Programação Java para a WEB", "Luckow Melo", "Novatec", cat1);
		cat1.getLivros().addAll(Arrays.asList(l1, l3));
		cat2.getLivros().addAll(Arrays.asList(l2));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3));
	}
}
