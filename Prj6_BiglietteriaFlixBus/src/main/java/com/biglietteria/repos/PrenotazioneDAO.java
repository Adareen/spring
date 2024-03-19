package com.biglietteria.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biglietteria.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
