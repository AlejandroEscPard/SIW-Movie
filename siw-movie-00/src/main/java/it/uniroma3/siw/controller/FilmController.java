package it.uniroma3.siw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import it.uniroma3.siw.model.Actore;
import it.uniroma3.siw.model.Film;
import it.uniroma3.siw.model.Registra;
import it.uniroma3.siw.repository.ActoreRepository;
import it.uniroma3.siw.repository.FilmRepository;
import it.uniroma3.siw.repository.ImagineRepository;
import it.uniroma3.siw.repository.RecensioniRepository;
import it.uniroma3.siw.repository.RegistraRepository;



@Controller
public class FilmController {
	
	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private ActoreRepository actoreRepository;
	@Autowired
	private ImagineRepository imagineRepository;
	@Autowired
	private RecensioniRepository recensioniRepository;
	@Autowired
	private RegistraRepository registraRepository;
	
	//indexFilm.html
	@GetMapping(value="/admin/indexFilm")
	public String indexFilm() {
		return "indexFilm.html";
	}
	//indexArtist.html
	@GetMapping(value="/admin/indexArtist")
	public String indexArtist() {
		return "indexArtist.html";
	}
	//movies.html
	@GetMapping(value="/admin/films")
	public String getFilms(Model model) {
		model.addAttribute("films", filmRepository.findAll());
		return "films.html";
	}
	
	//film.html
	@GetMapping(value="/admin/films/{id}")
	public String getFilm(@PathVariable("id") long id, Model model) {

		Film film = filmRepository.findById(id).orElse(null);

		if (film ==null) {
			return "error.html";
		}
		else {
			model.addAttribute("film", film);
			model.addAttribute("director", film.getRegistra());
			model.addAttribute("actors", film.getActore());
			model.addAttribute("images", film.getImagini());
			model.addAttribute(attributeName:"recensioni", film.getRecensioni);
		}
		return "film.html";
	
	}

	//artists.html
	@GetMapping(value="/admin/artists")
	public String getAllArtists(Model model) {
		Iterable<Actore> actors = actoreRepository.findAll();
		Iterable<Registra> registri = registraRepository.findAll();
	
		model.addAttribute("actors", actors);
		model.addAttribute("registri", registri);
		return "artists.html";
	}
	

	
	
	
	
	





	
	
	//forrmNewFilm.html
	@GetMapping(value="/admin/formNewFilm.html")
	public String formNewFilm(Model model) {
		model.addAttribute("film", new Film());
		return "formNewFilm.html";
	}
	
	
	
	
	
	
	
	
	/*
	
	
	
	
	////////////////////////////////////////
	@PostMapping("/")
	public String saveFilm(Film film) {
		filmService.saveFilm(film);
		return "redirect:/artist";
	}
	
	@GetMapping("/artist/{nome}/{cognombre}/delete")
	public String deleteFilm(String string) {
		
		Film film = filmService.getFilmByNome(string);
		
		return "redirect:/artist";
	}
	
	
	
	
	@GetMapping("")
	public String getAllFilms( Model model) {
		model.addAttribute("films", filmService.getAllFilms());
		return "film-list";
	}
	
	
	@GetMapping("/films/{titolo}")
	public String getFilmByNome(@PathVariable("nome") String nome, Model model) {
		model.addAttribute("film", filmService.getFilmByNome(nome));
		return "film-detaglio";
	}
	
	@GetMapping("/films/{titolo}/artist")
	public String getAllActore( @PathVariable("titolo") String titolo, Model model) {
		model.addAttribute("actore", filmService.getAllActore());
		return "actore-list";
	}

	@GetMapping("/films/{titolo}/recensioni")
	public String getAllRecensioni( @PathVariable("titolo") String titolo, Model model) {
		model.addAttribute("recensioni", filmService.getAllRecensioni());
		return "recensioni-list";
	}

	*/
}
