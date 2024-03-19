package com.biglietteria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biglietteria.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
