package com.ta35.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta35.dto.Almacen;

public interface IAlmacenDAO extends JpaRepository<Almacen, Integer> {

}
