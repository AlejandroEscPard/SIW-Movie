package it.uniroma3.siw.model;

import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String Nome; 
	

	private String Cognome; 
	
	@Column(nullable = false)
	private Date DataNascita;

	
	@Basic(optional=true)
	private Date DataMorte; //
	
	@Column(nullable=false)
	@OneToOne
	@JoinColumn(name = "Imagini")
	private Imagine img; 

	
	//Setters and Getters
	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	
	public String getId() {
		return this.getNome() + " " + this.getCognome();
	}
	


	public Date getDataNascita() {
		return DataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		DataNascita = dataNascita;
	}

	public Date getDataMorte() {
		return DataMorte;
	}

	public void setDataMorte(Date dataMorte) {
		DataMorte = dataMorte;
	}

	public Imagine getFoto() {
		return img;
	}

	public void setFoto(Imagine imggg) {
		img = imggg;
	}
	
	
	
}
