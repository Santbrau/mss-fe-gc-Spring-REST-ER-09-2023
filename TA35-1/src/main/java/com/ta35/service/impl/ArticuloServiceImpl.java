package com.ta35.service.impl;

import com.ta35.dao.ArticuloRepository;
import com.ta35.model.Articulo;
import com.ta35.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public List<Articulo> obtenerTodosLosArticulos() {
        return articuloRepository.findAll();
    }

    @Override
    public Articulo guardarArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    @Override
    public Articulo obtenerArticuloPorCodigo(int codigo) {
        return articuloRepository.findById(codigo).orElse(null);
    }

    @Override
    public List<Articulo> listarArticulos() {
        return articuloRepository.findAll();
    }

    @Override
    public Articulo crearArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    @Override
    public Articulo obtenerArticuloPorId(int id) {
        return articuloRepository.findById(id).orElse(null);
    }

    @Override
    public Articulo actualizarArticulo(int id, Articulo articulo) {
        Articulo articuloExistente = articuloRepository.findById(id).orElse(null);
        if (articuloExistente != null) {
            articuloExistente.setNombre(articulo.getNombre());
            articuloExistente.setPrecio(articulo.getPrecio());
            return articuloRepository.save(articuloExistente);
        }
        return null;
    }

    @Override
    public void eliminarArticulo(int id) {
        articuloRepository.deleteById(id);
    }
}

