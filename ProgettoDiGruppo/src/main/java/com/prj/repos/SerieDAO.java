package com.prj.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prj.entities.Serie;

@Repository
public interface SerieDAO extends JpaRepository<Serie, Integer> {

}
