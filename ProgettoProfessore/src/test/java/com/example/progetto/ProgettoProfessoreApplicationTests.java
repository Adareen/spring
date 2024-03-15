package com.example.progetto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.progetto.entities.SerieTV;
import com.example.progetto.services.SerieService;

@SpringBootTest
class ProgettoProfessoreApplicationTests {

	@Autowired
	private SerieService service;
	
	@Test
	void contextLoads() {
		
		SerieTV s=new SerieTV();
		s.setTitolo("prova");
		
		SerieTV aggiunta =service.addSerie(s);
		System.out.println(aggiunta);
		
		
	}
	@Test
	void delSerie() {
		
		System.out.println(service.getSerieById(5));
		service.deleteSerie(5);
		System.out.println(service.getSerieById(5));
		
		
		
	}

}
