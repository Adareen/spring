package com.biglietteria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biglietteria.entities.Utente;
import com.biglietteria.repos.UtenteDAO;

@Service
public class UtenteServiceImpl implements UtenteService {

	@Autowired
	private UtenteDAO dao;
	@Override
	public List<Utente> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Utente getUtenteById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void deleteteUtente(Utente u) {
		// TODO Auto-generated method stub
		dao.delete(u);;
	}

	@Override
	public Utente updateUtente(Utente u) {
		// TODO Auto-generated method stub
		return dao.save(u);
	}

	@Override
	public Utente addUtente(Utente u) {
		// TODO Auto-generated method stub
		return dao.save(u);
	}

	

	

}
