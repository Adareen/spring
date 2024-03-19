package com.progetto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progetto.entities.Provincia;
import com.progetto.repos.ProvinciaDAO;


@Service // prima cosa importante 
public class ProvinciaServiceIMPL implements ProvinciaService {
	
	
	// collegamento al dao, seconda cosa importante
	@Autowired
	private ProvinciaDAO dao; 

	@Override
	public List<Provincia> getAll() {

		
		return dao.findAll();
	}

	@Override
	public Provincia getById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Provincia> getProvByRegione(String nomeRegione) {
		// TODO Auto-generated method stub
		return dao.findByRegione(nomeRegione); // nostro metodo custom che abbiamo messo nel dao
	}

	@Override
	public List<String> getRegioni() {
		// TODO Auto-generated method stub
		return dao.findAll().stream().map(p->p.getRegione()).distinct().sorted().toList();
	}

}
