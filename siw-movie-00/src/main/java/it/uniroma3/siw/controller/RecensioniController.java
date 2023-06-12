package it.uniroma3.siw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.uniroma3.siw.repository.ActoreRepository;
import it.uniroma3.siw.repository.FilmRepository;
import it.uniroma3.siw.repository.RecensioniRepository;
@RequestMapping("/reccensioni")
@Controller
public class RecensioniController {
	
	@Autowired
	private RecensioniRepository recensionirepository;
	
	@GetMapping("/art{nome}")
	public String getRecensioniById(String nome,Model model) {
		
		model.addAttribute("autore", this.recensionirepository.findByTitolo(nome));
		return "autore-nome";
		
	}


}
