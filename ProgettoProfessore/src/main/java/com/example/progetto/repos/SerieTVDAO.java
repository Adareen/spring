package com.example.progetto.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.progetto.entities.SerieTV;

@Repository										// classe, chiave
public interface SerieTVDAO extends JpaRepository<SerieTV, Integer> {

}
