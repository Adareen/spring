package com.biglietteria.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biglietteria.entities.Utente;
import com.biglietteria.entities.Viaggio;
import com.biglietteria.services.PrenotazioneService;
import com.biglietteria.services.UtenteService;
import com.biglietteria.services.ViaggioService;

@RestController
@RequestMapping("api")
public class ModelREST {

	@Autowired
	private PrenotazioneService pService;
	
	@Autowired
	private UtenteService uService;
	
	@Autowired
	private ViaggioService vService;
	
	// prendo dati dal db 
	@GetMapping("utenti")
	public List<Utente> getUtenti() {
		return uService.getAll();
	}
	
	// carico dati in db con rest api
	@PostMapping("utenti")
	public Utente aggiungiUtente(@RequestBody Utente u) {
		return uService.addUtente(u);
	}
	
	@GetMapping("viaggi")
	public List<Viaggio> getAll(){
		return vService.getAll();
	}
	@PostMapping("viaggi")
	public Viaggio addViaggio(@RequestBody Viaggio v){
		return vService.addViaggio(v);
	}
	
	
	
}
