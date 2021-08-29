package com.spring.springer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.springer.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer>{

}
