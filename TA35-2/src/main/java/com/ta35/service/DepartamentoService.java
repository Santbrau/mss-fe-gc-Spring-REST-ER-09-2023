package com.ta35.service;

import com.ta35.model.Departamento;

import java.util.List;

public interface DepartamentoService {

    List<Departamento> obtenerTodosLosDepartamentos();

    Departamento guardarDepartamento(Departamento articulo);

    Departamento obtenerDepartamentoPorCodigo(int codigo);

    List<Departamento> listarDepartamentos();

    Departamento crearDepartamento(Departamento articulo);

    Departamento obtenerDepartamentoPorId(int id);

    Departamento actualizarDepartamento(int id, Departamento articulo);

    void eliminarDepartamento(int id);
}
