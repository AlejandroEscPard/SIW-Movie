package it.uniroma3.siw.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.model.Imagine;

public interface ImagineRepository extends CrudRepository<Imagine, Long> {
    
	public boolean existsByByImagine(byte[] img);
}