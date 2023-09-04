package com.ta35.service;

import com.ta35.model.Empleado;

import java.util.List;

public interface EmpleadoService {

    List<Empleado> listarEmpleados();

    Empleado crearEmpleado(Empleado articulo);

	Empleado actualizarEmpleado(String dni, Empleado empleado);

	Empleado guardarEmpleado(Empleado empleado);

	Empleado obtenerEmpleadoPorDNI(String dni);

	List<Empleado> obtenerTodosLosEmpleados();

	void eliminarEmpleado(String dni);
}
