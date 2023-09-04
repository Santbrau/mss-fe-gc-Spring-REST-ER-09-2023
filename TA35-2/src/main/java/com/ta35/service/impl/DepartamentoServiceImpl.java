package com.ta35.service.impl;

import com.ta35.dao.DepartamentoRepository;
import com.ta35.model.Departamento;
import com.ta35.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamento> obtenerTodosLosDepartamentos() {
        return departamentoRepository.findAll();
    }

    @Override
    public Departamento guardarDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public Departamento obtenerDepartamentoPorCodigo(int codigo) {
        return departamentoRepository.findById(codigo).orElse(null);
    }

    @Override
    public Departamento actualizarDepartamento(int codigo, Departamento departamento) {
        Departamento departamentoExistente = departamentoRepository.findById(codigo).orElse(null);
        if (departamentoExistente != null) {
            departamentoExistente.setNombre(departamento.getNombre());
            departamentoExistente.setPresupuesto(departamento.getPresupuesto());
            return departamentoRepository.save(departamentoExistente);
        }
        return null;
    }

    @Override
    public void eliminarDepartamento(int codigo) {
        departamentoRepository.deleteById(codigo);
    }

    @Override
    public List<Departamento> listarDepartamentos() {
        return departamentoRepository.findAll();
    }

    @Override
    public Departamento crearDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento); 
    }

    @Override
    public Departamento obtenerDepartamentoPorId(int id) {
        return departamentoRepository.findById(id).orElse(null); 
    }
}

