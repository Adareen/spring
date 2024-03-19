package com.biglietteria.services;

import java.util.List;

import com.biglietteria.entities.Viaggio;


public interface ViaggioService {
	List<Viaggio> getAll();
	Viaggio getViaggioById(int id);
	void deleteteById(Viaggio v);
	Viaggio updateById(Viaggio v);
	Viaggio addViaggio(Viaggio v);
}
