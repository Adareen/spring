package com.biglietteria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biglietteria.entities.Viaggio;
import com.biglietteria.repos.ViaggioDAO;

@Service
public class ViaggioServiceImpl implements ViaggioService {

	@Autowired
	private ViaggioDAO dao;
	
	@Override
	public List<Viaggio> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Viaggio getViaggioById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void deleteteById(Viaggio v) {
		// TODO Auto-generated method stub
		dao.delete(v);;
	}

	@Override
	public Viaggio updateById(Viaggio v) {
		// TODO Auto-generated method stub
		return dao.save(v);
	}

	@Override
	public Viaggio addViaggio(Viaggio v) {
		// TODO Auto-generated method stub
		return dao.save(v);
	}

	


}
