package com.biglietteria.services;

import java.util.List;


import com.biglietteria.entities.Utente;

public interface UtenteService {
	
	List<Utente> getAll();
	
	void deleteteUtente(Utente u);
	Utente updateUtente(Utente u);
	Utente addUtente(Utente u);
	Utente getUtenteById(int id);

}
