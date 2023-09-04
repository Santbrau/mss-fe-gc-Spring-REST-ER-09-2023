package com.ta35.controller;

import com.ta35.model.Fabricante;
import com.ta35.service.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fabricantes")
public class FabricanteController {

    @Autowired
    private FabricanteService fabricanteService;

    @GetMapping
    public List<Fabricante> listarFabricantes() {
        return fabricanteService.listarFabricantes();
    }

    @PostMapping
    public Fabricante crearFabricante(@RequestBody Fabricante fabricante) {
        return fabricanteService.crearFabricante(fabricante);
    }

    @GetMapping("/{id}")
    public Fabricante obtenerFabricantePorId(@PathVariable int id) {
        return fabricanteService.obtenerFabricantePorId(id);
    }

    @PutMapping("/{id}")
    public Fabricante actualizarFabricante(@PathVariable int id, @RequestBody Fabricante fabricante) {
        return fabricanteService.actualizarFabricante(id, fabricante);
    }

    @DeleteMapping("/{id}")
    public void eliminarFabricante(@PathVariable int id) {
        fabricanteService.eliminarFabricante(id);
    }
}