package com.progetto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progetto.entities.Movimento;

public interface MovimentoDAO extends JpaRepository<Movimento, Integer> {

}
