package com.progetto.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.progetto.entities.Provincia;

public interface ProvinciaDAO extends JpaRepository<Provincia, Integer> {
	
	// se voglio ottenere una lista di province data la regione implemento il mio metodo
	
	List<Provincia> findByRegione(String regione); // a patto che regione sia una proprietà della classe. -> derived query <-
//	
//	// query custom
//@Query(value="select * from province order by totale desc", nativeQuery=true)
//List<Provincia> trovaProvinceOrdinatePerPopolazione();
//List<String> getRegioni();
	

}
