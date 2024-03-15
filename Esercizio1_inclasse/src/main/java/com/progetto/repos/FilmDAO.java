package com.progetto.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progetto.entities.Films;

@Repository
public interface FilmDAO extends JpaRepository<Films, Integer> {

}
