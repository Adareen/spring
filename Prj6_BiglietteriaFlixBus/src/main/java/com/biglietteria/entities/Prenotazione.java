package com.biglietteria.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prenotazioneF")
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id_prenotazione;
	private String statoPrenotazione;
	
	// questa mi serve a fare la connessione con le tabelle 
	
	@ManyToOne
	@JoinColumn(name="id_utente")
	private Utente utente;
	
	// serve anche per fare la connessione alle tabelle, list?
	
	@ManyToOne
	@JoinColumn(name="id_viaggio")

	private Viaggio viaggio;
	
	
	public String getStatoPrenotazione() {
		return statoPrenotazione;
	}
	public void setStatoPrenotazione(String statoPrenotazione) {
		this.statoPrenotazione = statoPrenotazione;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Viaggio getViaggio() {
		return viaggio;
	}
	public void setViaggio(Viaggio viaggio) {
		this.viaggio = viaggio;
	}
	
	public Prenotazione() {
		// TODO Auto-generated constructor stub
	}

}
