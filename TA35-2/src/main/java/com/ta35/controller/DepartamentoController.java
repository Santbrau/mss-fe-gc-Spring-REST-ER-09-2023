package com.ta35.controller;

import com.ta35.model.Departamento;
import com.ta35.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping
    public List<Departamento> listarDepartamentos() {
        return departamentoService.obtenerTodosLosDepartamentos();
    }

    @PostMapping
    public Departamento crearDepartamento(@RequestBody Departamento departamento) {
        return departamentoService.guardarDepartamento(departamento);
    }

    @GetMapping("/{codigo}")
    public Departamento obtenerDepartamentoPorCodigo(@PathVariable int codigo) {
        return departamentoService.obtenerDepartamentoPorCodigo(codigo);
    }

    @PutMapping("/{codigo}")
    public Departamento actualizarDepartamento(@PathVariable int codigo, @RequestBody Departamento departamento) {
        return departamentoService.actualizarDepartamento(codigo, departamento);
    }

    @DeleteMapping("/{codigo}")
    public void eliminarDepartamento(@PathVariable int codigo) {
        departamentoService.eliminarDepartamento(codigo);
    }
}
