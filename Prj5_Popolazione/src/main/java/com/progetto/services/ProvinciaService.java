package com.progetto.services;

import java.util.List;

import com.progetto.entities.Provincia;


public interface ProvinciaService{
	
	List<Provincia> getAll();
	Provincia getById(int id);
	
	List<Provincia> getProvByRegione(String nomeRegione);
	List<String> getRegioni();

}
