package com.progetto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progetto.entities.Prodotto;
import com.progetto.repository.ProdottoDAO;


@Service
public class ProdottoServiceIMPL implements ProdottoService {
	
	@Autowired
	ProdottoDAO dao;

	@Override
	public List<Prodotto> getProdotti() {
		
		return dao.findAll();
	}

	@Override
	public List<Prodotto> getProdottiByNome() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Prodotto updateProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Prodotto addProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	

}