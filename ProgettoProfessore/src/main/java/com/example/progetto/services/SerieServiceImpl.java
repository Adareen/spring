package com.example.progetto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.progetto.entities.SerieTV;
import com.example.progetto.repos.SerieTVDAO;


@Service
public class SerieServiceImpl implements SerieService{

	@Autowired
	SerieTVDAO dao;

	// clicca su add unimplemented methods per far comparire tutti i metodi 
	
	
	@Override
	public List<SerieTV> getSerie() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public SerieTV getSerieById(int id) {
		if(dao.findById(id).isPresent())
			return dao.findById(id).get();
		else return null;
	}

	@Override
	public SerieTV addSerie(SerieTV s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SerieTV uddateSerie(SerieTV s) {
		// TODO Auto-generated method stub
		return dao.save(s);
	}

	@Override
	public void deleteSerie(SerieTV s) {
		// TODO Auto-generated method stub
		
		dao.delete(s);
		
	}

	@Override
	public void deleteSerie(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	@Override
	public List<SerieTV> getSerieByGenere() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
