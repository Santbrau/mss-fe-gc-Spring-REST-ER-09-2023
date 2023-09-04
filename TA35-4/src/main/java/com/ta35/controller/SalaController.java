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

import com.ta35.dto.Sala;
import com.ta35.service.SalaServiceImpl;

@RestController
public class SalaController {

	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas() {
		
		return salaServiceImpl.listarSalas();
	}
	
	@GetMapping("/salas/{codigo}")
	public Sala buscarSalaPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return salaServiceImpl.buscarSalaPorCodigo(codigo);
	}
	
	@PostMapping("/salas")
	public Sala guardarSala(@RequestBody Sala sala) {
		
		return salaServiceImpl.guardarSala(sala);
	}
	
	@PutMapping("/salas/{codigo}")
	public Sala actualizarSala(@PathVariable(name = "codigo") int codigo, @RequestBody Sala sala) {
		
		Sala salaSeleccionada = new Sala();
		Sala salaActualizada = new Sala();
		
		salaSeleccionada = salaServiceImpl.buscarSalaPorCodigo(codigo);
		
		salaSeleccionada.setNombre(sala.getNombre());
		salaSeleccionada.setPelicula(sala.getPelicula());
		
		salaActualizada = salaServiceImpl.actualizarSala(salaSeleccionada);
		
		return salaActualizada;
	}
	
	@DeleteMapping("/salas/{codigo}")
	public void eliminarSala(@PathVariable(name = "codigo") int codigo) {
		
		salaServiceImpl.eliminarSala(codigo);
	}
}
