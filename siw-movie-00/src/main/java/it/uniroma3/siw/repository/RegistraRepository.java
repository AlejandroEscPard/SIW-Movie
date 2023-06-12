package it.uniroma3.siw.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.model.Registra;

public interface RegistraRepository extends CrudRepository<Registra, String> {
    /*public Registra findById( String Nome, String cognome); //Devuelve el director con el nombr ey el cognombre especificados
    
    public List<Registra> findAllRegistra(); //Devuelve toodos los directores de la base de datos
    */
    public boolean exitsByNomeAndCognombre();
}