package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entities.Gioco;



// ho tutti i metodi per interagire coi dati
@Repository
public interface GiocoDAO extends JpaRepository<Gioco, Integer> {

}
