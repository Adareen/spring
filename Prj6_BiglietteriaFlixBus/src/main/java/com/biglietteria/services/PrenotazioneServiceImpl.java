package com.biglietteria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biglietteria.entities.Prenotazione;
import com.biglietteria.repos.PrenotazioneDAO;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService {

	@Autowired
	private PrenotazioneDAO dao;
	@Override
	public List<Prenotazione> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Prenotazione getPrenotazioneById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void deletetePrenotazione(Prenotazione p) {
		// TODO Auto-generated method stub
		 dao.delete(p);;
	}

	@Override
	public Prenotazione updatePrenotazione(Prenotazione p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}




}
