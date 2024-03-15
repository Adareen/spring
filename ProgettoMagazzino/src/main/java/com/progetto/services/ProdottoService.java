package com.progetto.services;

import java.util.List;

import com.progetto.entities.Prodotto;

public interface ProdottoService {
	
	List<Prodotto> getProdotti();
	List<Prodotto> getProdottiByNome();
	
	
	Prodotto updateProdotto(Prodotto p);
	
	
	Prodotto addProdotto(Prodotto p);

}
