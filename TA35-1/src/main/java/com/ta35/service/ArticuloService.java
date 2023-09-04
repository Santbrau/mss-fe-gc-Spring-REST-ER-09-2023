package com.ta35.service;

import com.ta35.model.Articulo;

import java.util.List;

public interface ArticuloService {

    List<Articulo> obtenerTodosLosArticulos();

    Articulo guardarArticulo(Articulo articulo);

    Articulo obtenerArticuloPorCodigo(int codigo);

    List<Articulo> listarArticulos();

    Articulo crearArticulo(Articulo articulo);

    Articulo obtenerArticuloPorId(int id);

    Articulo actualizarArticulo(int id, Articulo articulo);

    void eliminarArticulo(int id);
}
