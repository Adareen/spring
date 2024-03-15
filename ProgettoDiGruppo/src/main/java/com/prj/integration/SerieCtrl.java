package com.prj.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.prj.entities.Serie;
import com.prj.services.SerieService;

@RestController
public class SerieCtrl {
	
	@Autowired
	private SerieService service;
	


	@GetMapping("/api/serie")
	public List<Serie> getSerie(){
		return service.getSerie();
	}
	
	@GetMapping("/api/serie/titolo/{titolo}")
	public List<Serie> getSerieByTitolo(@PathVariable String titolo){
		return service.getSerie()
				.stream()
				.filter(s->s.getTitolo().contains(titolo))
				.toList();
	}
	
	@GetMapping("/api/serie/genere/{genere}")
	public List<Serie> getSerieByGenere(@PathVariable String genere){
		return service.getSerie()
				.stream()
				.filter(s->s.getGenere().contains(genere))
				.toList();
	}
	
	@GetMapping("/api/serie/valutazione/{valutazione}")
	public List<Serie> getSerieByValutazione(@PathVariable double valutazione){
		return service.getSerie()
				.stream()
				.filter(s->s.getValutazione()==valutazione)
				.toList();
	}
	
	
	
	

}
