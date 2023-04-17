package com.daniel.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.bookstore.domain.Livro;
import com.daniel.bookstore.repositories.LivroRepository;
import com.daniel.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;

	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Livro " + id + " não encontrado!"));
	}

	public List<Livro> findAll() {
		return repository.findAll();
	}
}
