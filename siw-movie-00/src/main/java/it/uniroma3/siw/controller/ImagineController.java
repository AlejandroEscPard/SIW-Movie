package it.uniroma3.siw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import it.uniroma3.siw.model.Imagine;
import it.uniroma3.siw.repository.ImagineRepository;
@RequestMapping("/imagines")
@Controller
public class ImagineController {
	@Autowired
	private ImagineRepository imagineService;
	
	
	
}
