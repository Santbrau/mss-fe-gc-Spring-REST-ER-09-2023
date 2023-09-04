package com.ta35.controller;

import com.ta35.model.Empleado;
import com.ta35.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> listarEmpleados() {
        return empleadoService.obtenerTodosLosEmpleados();
    }

    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.guardarEmpleado(empleado);
    }

    @GetMapping("/{dni}")
    public Empleado obtenerEmpleadoPorDNI(@PathVariable String dni) {
        return empleadoService.obtenerEmpleadoPorDNI(dni);
    }

    @PutMapping("/{dni}")
    public Empleado actualizarEmpleado(@PathVariable String dni, @RequestBody Empleado empleado) {
        return empleadoService.actualizarEmpleado(dni, empleado);
    }

    @DeleteMapping("/{dni}")
    public void eliminarEmpleado(@PathVariable String dni) {
        empleadoService.eliminarEmpleado(dni);
    }
}