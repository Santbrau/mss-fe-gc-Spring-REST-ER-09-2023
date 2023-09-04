package com.ta35.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ta35.dto.Almacen;
import com.ta35.service.AlmacenServiceImpl;

@RestController
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes() {
		
		return almacenServiceImpl.listarAlmacenes();
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacen buscarAlmacenPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return almacenServiceImpl.buscarAlmacenPorCodigo(codigo);
	}
	
	@PostMapping("/almacenes")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		
		return almacenServiceImpl.guardarAlmacen(almacen);
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacen actualizarAlmacen(@PathVariable(name = "codigo") int codigo, @RequestBody Almacen almacen) {
		
		Almacen almacenSeleccionado = new Almacen();
		Almacen almacenActualizado = new Almacen();
		
		almacenSeleccionado = almacenServiceImpl.buscarAlmacenPorCodigo(codigo);
		
		almacenSeleccionado.setLugar(almacen.getLugar());
		almacenSeleccionado.setCapacidad(almacen.getCapacidad());
		
		almacenActualizado = almacenServiceImpl.actualizarAlmacen(almacenSeleccionado);
		
		return almacenActualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacen(@PathVariable(name = "codigo") int codigo) {
		
		almacenServiceImpl.eliminarAlmacen(codigo);
	}
}