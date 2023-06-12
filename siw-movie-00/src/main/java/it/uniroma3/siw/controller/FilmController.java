package it.uniroma3.siw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
			model.addAttribute("recensioni", film.getRecensioni());
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
	@GetMapping(value="/admin/films/formNewFilm.html")
	public String formNewFilm(Model model) {
		model.addAttribute("film", new Film());
		return "formNewFilm.html";
	}
	
	@PostMapping("/admin/films/newFilm.html")
	public String saveFilm(Film film) {
		filmService.saveFilm(film);
		return "redirect:/artist";
	}

	@GetMapping("/admin/artists/{nome}/{cognombre}")
	public String deleteFilm(String string) {
		
		Film film = filmRepository.findByNomeByNome(string);
		
		return "redirect:/artist";
	}
	
		
	@GetMapping("/admin/films/{titolo}")
	public String getFilmByNome(@PathVariable("nome") String nome, Model model) {
		model.addAttribute("film", filmService.getFilmByNome(nome));
		return "film.html;
	}


	@GetMapping("/admin/films/{AnnoUscita}")
	public String getFilmByAnnoUscita(@PathVariable("AnnoUscita") int anno, Model model){

		model.addAttribute("films", filmRepository.findByAnnoUscita(anno));
		return "foundedFilms.html";
	}
	
	
	@GetMapping(value="/admin/setRegistraToFilm/{registraId}/{filmId}")
	public String setRegistraToFilm@PathVariable("registraId") Long registraId, @PathVariable("filmId") Long filmId, Model model) {
		Registra registra = this.registraRepository.findById(registraId).get();
		Film film = this.filmRepository.findById(filmId).get();

		film.setRegistra(registra);
		this.registraRepository.save(film);
		
		model.addAttribute("film", film);
		return "admin/films/{Id}.html";
	}
	
	
}

