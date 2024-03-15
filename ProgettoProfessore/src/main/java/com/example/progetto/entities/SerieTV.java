package com.example.progetto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// pojo, tutte le proprietà sono private, tutte le proprietà hanno getters and setters, esiste il costruttore vuoto. 

@Entity
@Table(name = "serie_tv")
public class SerieTV {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // vuol dire, mysql occupati tu ogni volta che aggiungo qualcosa
														// al db -> usato in metodo post principalmente
	private int id;
	private String titolo;
	private String genere;
	private double valutazione;
	private String trama;

	// getters and setters per il toString non mettiamo
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public double getValutazione() {
		return valutazione;
	}

	public void setValutazione(double valutazione) {
		this.valutazione = valutazione;
	}

	public String getTrama() {
		return trama;
	}

	public void setTrama(String trama) {
		this.trama = trama;
	}

	@Override
	public String toString() {
		return "SerieTV [id=" + id + ", titolo=" + titolo + ", genere=" + genere + ", valutazione=" + valutazione
				+ ", trama=" + trama + "]";
	}

}
