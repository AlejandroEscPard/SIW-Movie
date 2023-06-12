package it.uniroma3.siw.model;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Recensioni")
public class Recensioni {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	private String Titolo; 
	
	@Min(1)
	@Max(5)
	private int Valutazione; // [1-5]
	@SuppressWarnings("deprecation")
	@NotNull
	private long Descripcione;
	
	
	public Recensioni(int valutazione, long descripcione) {
		super();
		Valutazione = valutazione;
		Descripcione = descripcione;
	}
	
	//Setters and Getters
	public String getTitolo() {
		return Titolo;
	}
	public void setTitolo(String titolo) {
		Titolo = titolo;
	}
	public int getValutazione() {
		return Valutazione;
	}
	public void setValutazione(int valutazione) {
		Valutazione = valutazione;
	}
	public long getDescripcione() {
		return Descripcione;
	}
	public void setDescripcione(long descripcione) {
		Descripcione = descripcione;
	}
	
	
}
