package com.biglietteria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biglietteria.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
