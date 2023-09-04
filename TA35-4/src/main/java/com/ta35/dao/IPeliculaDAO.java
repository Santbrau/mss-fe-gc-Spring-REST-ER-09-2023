package com.ta35.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta35.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer>{

}