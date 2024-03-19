package com.biglietteria.services;

import java.util.List;

import com.biglietteria.entities.Prenotazione;
import com.biglietteria.entities.Utente;

public interface PrenotazioneService {
	
	List<Prenotazione> getAll();
	Prenotazione getPrenotazioneById(int id);
	void deletetePrenotazione(Prenotazione p);
	Prenotazione updatePrenotazione(Prenotazione p);
	Prenotazione addPrenotazione(Prenotazione p);
	

}
