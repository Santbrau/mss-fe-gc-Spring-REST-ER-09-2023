package com.ta35.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ta35.model.Articulo;

public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {
}
