package com.ta35.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ta35.model.Fabricante;

public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {
}