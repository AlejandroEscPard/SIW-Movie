package it.uniroma3.siw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.uniroma3.siw.model.Actore;
import it.uniroma3.siw.repository.ActoreRepository;
import it.uniroma3.siw.repository.FilmRepository;
@RequestMapping("/artist")
@Controller
public class ActoreController {
	
	@Autowired
	private ActoreRepository actoreRepository;
	


}
