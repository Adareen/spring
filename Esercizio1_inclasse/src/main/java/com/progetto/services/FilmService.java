package com.progetto.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.progetto.entities.Films;

@Service
public interface FilmService {
	
	Films addFilm(Films f);
	
	List<Films> getFilms();
	List<Films> getFilmsByRating(double rating);
	Films getFilmsByTitle(String titolo);
	Films getFilmsById(int id);
	List<Films> getFilmsByYear(int anno);
	
	Films updateFilm(Films f);
	void deleteFilm(Films f);
	void deleteFilmById(int id);
	
	

}
