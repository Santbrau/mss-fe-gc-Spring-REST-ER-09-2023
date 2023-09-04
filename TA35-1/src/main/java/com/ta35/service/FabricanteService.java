package com.ta35.service;

import com.ta35.model.Fabricante;

import java.util.List;

public interface FabricanteService {

    List<Fabricante> obtenerTodosLosFabricantes();

    Fabricante guardarFabricante(Fabricante fabricante);

    Fabricante obtenerFabricantePorCodigo(int codigo);

    Fabricante actualizarFabricante(int codigo, Fabricante fabricante);

    void eliminarFabricante(int codigo);
    
    Fabricante obtenerFabricantePorId(int id);
    
    Fabricante crearFabricante(Fabricante fabricante);
    
    List<Fabricante> listarFabricantes();
    
}
