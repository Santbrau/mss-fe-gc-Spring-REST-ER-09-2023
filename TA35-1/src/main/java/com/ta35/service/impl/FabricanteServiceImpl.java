package com.ta35.service.impl;

import com.ta35.dao.FabricanteRepository;
import com.ta35.model.Fabricante;
import com.ta35.service.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FabricanteServiceImpl implements FabricanteService {

    @Autowired
    private FabricanteRepository fabricanteRepository;

    @Override
    public List<Fabricante> obtenerTodosLosFabricantes() {
        return fabricanteRepository.findAll();
    }

    @Override
    public Fabricante guardarFabricante(Fabricante fabricante) {
        return fabricanteRepository.save(fabricante);
    }

    @Override
    public Fabricante obtenerFabricantePorCodigo(int codigo) {
        return fabricanteRepository.findById(codigo).orElse(null);
    }

    @Override
    public Fabricante actualizarFabricante(int codigo, Fabricante fabricante) {
        Fabricante fabricanteExistente = fabricanteRepository.findById(codigo).orElse(null);
        if (fabricanteExistente != null) {
            fabricanteExistente.setNombre(fabricante.getNombre());
            return fabricanteRepository.save(fabricanteExistente);
        }
        return null;
    }

    @Override
    public void eliminarFabricante(int codigo) {
        fabricanteRepository.deleteById(codigo);
    }

    @Override
    public Fabricante obtenerFabricantePorId(int id) {
        return fabricanteRepository.findById(id).orElse(null);
    }

    @Override
    public Fabricante crearFabricante(Fabricante fabricante) {
        return fabricanteRepository.save(fabricante);
    }
    
    @Override
    public List<Fabricante> listarFabricantes() {
        return fabricanteRepository.findAll();
    }
}
