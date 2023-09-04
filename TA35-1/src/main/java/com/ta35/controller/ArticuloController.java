package com.ta35.controller;


import com.ta35.model.Articulo;
import com.ta35.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articulos")
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    @GetMapping
    public List<Articulo> listarArticulos() {
        return articuloService.listarArticulos();
    }

    @PostMapping
    public Articulo crearArticulo(@RequestBody Articulo articulo) {
        return articuloService.crearArticulo(articulo);
    }

    @GetMapping("/{id}")
    public Articulo obtenerArticuloPorId(@PathVariable int id) {
        return articuloService.obtenerArticuloPorId(id);
    }

    @PutMapping("/{id}")
    public Articulo actualizarArticulo(@PathVariable int id, @RequestBody Articulo articulo) {
        return articuloService.actualizarArticulo(id, articulo);
    }

    @DeleteMapping("/{id}")
    public void eliminarArticulo(@PathVariable int id) {
        articuloService.eliminarArticulo(id);
    }
}
