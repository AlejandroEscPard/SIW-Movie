package it.uniroma3.siw.model;


import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Imagine")
public class Imagine {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Nonnull
	byte[] url;


	public byte[] getImagine() {
		return getImagine();
	}

	public void setImagine(byte[] imagine) {
		this.url = imagine;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	
	
}
