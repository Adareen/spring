package com.progetto.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.progetto.services.ProdottoService;

@Controller

public class ProdottoController2 {

	@Autowired
	private ProdottoService service;
	
	@GetMapping("index")
	
	public String getProdotto(Model m) {
		
		m.addAttribute("elencoProdotti", service.getProdotti());
		return "index";
		
	}
	
	@GetMapping("/nuovoProdotto")
	
	public String getProdotto6() {
		
		
		return "nuovoProdotto";
		
	}
	
	@GetMapping("dettagli")

	public String getProdotto4() {
		
		return "dettagli";
		
	}
}
