package it.uniroma3.siw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.uniroma3.siw.model.Registra;
import it.uniroma3.siw.repository.RegistraRepository;

import org.springframework.ui.Model;
@Controller
public class RegistraController {
	
	@Autowired
	private RegistraRepository registraRepository;

	
	
	
	
}
