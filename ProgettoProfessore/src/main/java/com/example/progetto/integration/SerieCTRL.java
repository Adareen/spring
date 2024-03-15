package com.example.progetto.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.progetto.entities.SerieTV;
import com.example.progetto.services.SerieService;

@RestController
@RequestMapping("api") // finisci nel controller rest
public class SerieCTRL {

	@Autowired
	private SerieService service;

	@GetMapping("serie") // ritorna una lista di oggetti json
	public List<SerieTV> getAll() {
		return service.getSerie();
	}
	
	

	@PostMapping("serie") // spinge in db una serie tv in formato json -> hibernate traduce il json e lo spacchetta nelle info della tabella di arrivo
	public SerieTV postMethodName(@RequestBody SerieTV s) {

		return service.addSerie(s);

	}

}
