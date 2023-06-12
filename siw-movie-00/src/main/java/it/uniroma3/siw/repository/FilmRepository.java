
package it.uniroma3.siw.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.model.Actore;
import it.uniroma3.siw.model.Film;

public interface FilmRepository extends CrudRepository<Film, String> {
    public boolean existByTitolo(String titolo);

    public List<Film> findByAnnoUscita(int annoUscita);

    public List<Actore> findAllActore();//Devuelve todos los actores de la pelicula
    
	public Film findById(long id);

    public Film findByNome( String nome); //Devuelve la pelicula buscada



	/*
    


*/
}
