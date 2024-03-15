package com.progetto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progetto.entities.Films;
import com.progetto.repos.FilmDAO;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	FilmDAO dao;
	
	// questa parte comunica col database 
	// save, salva sul db
	// findall prende tutti i 
	
	
	@Override
	public Films addFilm(Films f) {
		// TODO Auto-generated method stub
		return dao.save(f);
	}

	@Override
	public List<Films> getFilms() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Films> getFilmsByRating(double rating) {
		// TODO Auto-generated method stub
		return null;
		}

	@Override
	public Films getFilmsByTitle(String titolo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Films getFilmsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Films> getFilmsByYear(int anno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Films updateFilm(Films f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFilm(Films f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFilmById(int id) {
		// TODO Auto-generated method stub

	}

}