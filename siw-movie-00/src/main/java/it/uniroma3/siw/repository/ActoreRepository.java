package it.uniroma3.siw.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.model.Actore;


public interface ActoreRepository extends CrudRepository<Actore, String> {
    
	public Actore existsByNomeAndCognombre(String nome, String cognombre);
	
}
