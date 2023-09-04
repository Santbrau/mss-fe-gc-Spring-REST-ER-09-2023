package com.ta35.service.impl;

import com.ta35.dao.EmpleadoRepository;
import com.ta35.model.Empleado;
import com.ta35.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> obtenerTodosLosEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado obtenerEmpleadoPorDNI(String dni) {
        return empleadoRepository.findById(dni).orElse(null);
    }

    @Override
    public Empleado actualizarEmpleado(String dni, Empleado empleado) {
        Empleado empleadoExistente = empleadoRepository.findById(dni).orElse(null);
        if (empleadoExistente != null) {
            empleadoExistente.setNombre(empleado.getNombre());
            empleadoExistente.setApellidos(empleado.getApellidos());
            empleadoExistente.setDepartamento(empleado.getDepartamento());
            return empleadoRepository.save(empleadoExistente);
        }
        return null;
    }

    @Override
    public void eliminarEmpleado(String dni) {
        empleadoRepository.deleteById(dni);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll(); 
    }

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado); 
    }
}

