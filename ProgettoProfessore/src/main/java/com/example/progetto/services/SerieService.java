package com.example.progetto.services;

import java.util.List;

import com.example.progetto.entities.SerieTV;

public interface SerieService {

	
	List<SerieTV> getSerie();
	List<SerieTV> getSerieByGenere();
	SerieTV getSerieById(int id);
	SerieTV addSerie(SerieTV s);
	SerieTV uddateSerie(SerieTV s);
	
	void deleteSerie(SerieTV s);
	void deleteSerie(int id);
	
}
