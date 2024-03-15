package com.progetto.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.progetto.entities.Prodotto;
import com.progetto.services.ProdottoService;

@RestController
@RequestMapping("/api")
public class ProdottoController {
	
	@Autowired
	private ProdottoService service;
	
	@GetMapping("/index")
	public List<Prodotto> getAll(){
		return service.getProdotti();
	}
	@PostMapping("/nuovoProdotto.html")
	public Prodotto addProdotto(@RequestBody Prodotto p) {
		
		return service.addProdotto(p);
	}
}
