package it.uniroma3.siw.model;

import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
@Entity
@Table(name = "Film")
public class Film {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank
	private String Titolo; //PK
	
	@SuppressWarnings("deprecation")
	@NotNull
	private int AnnoUscita;
	
	@NotBlank
	@OneToMany
	@JoinColumn(name = "Imagine")
	private  List<Imagine> imagini;
	
	@NotBlank
	@OneToMany
	@JoinColumn(name = "Actore")
	private List<Actore> actore;
	
	@SuppressWarnings("deprecation")
	@NotBlank
	@OneToMany
	@JoinColumn(name = "Recensioni")
	private List<Recensioni> recensioni;
	
	@NotBlank
	@OneToOne
	@JoinColumn(name = "Registra")
	private Registra registra;
	
	

	
	//Setters Getters
	
	public String getTitolo() {
		return Titolo;
	}

	public void setTitolo(String titolo) {
		Titolo = titolo;
	}

	public int getAnnoUscita() {
		return AnnoUscita;
	}

	public void setAnnoUscita(int annoUscita) {
		AnnoUscita = annoUscita;
	}

	public List<Imagine> getImagini() {
		return imagini;
	}

	public void setImagini(List<Imagine> imagini) {
		this.imagini = imagini;
	}

	public List<Actore> getActore() {
		return actore;
	}

	public void setActore(List<Actore> autore) {
		this.actore = autore;
	}

	public Registra getRegistra() {
		return registra;
	}

	public void setRegistra(Registra registra) {
		this.registra = registra;
	}

	public List<Recensioni> getRecensioni() {
		return recensioni;
	}

	public void setRecensioni(List<Recensioni> recensioni) {
		this.recensioni = recensioni;
	}

	public Film orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
