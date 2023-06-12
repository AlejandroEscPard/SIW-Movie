package it.uniroma3.siw.repository;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.model.Recensioni;

public interface RecensioniRepository extends CrudRepository<Recensioni, String>{
	public Recensioni findByTitolo(String titolo);

	public boolean exitsByTitolo();

}

