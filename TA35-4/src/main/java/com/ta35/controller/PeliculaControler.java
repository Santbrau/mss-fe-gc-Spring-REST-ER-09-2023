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

import com.ta35.dto.Pelicula;
import com.ta35.service.PeliculaServiceImpl;

@RestController
public class PeliculaControler {

	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas() {
		
		return peliculaServiceImpl.listarPeliculas();
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Pelicula buscarPeliculaPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return peliculaServiceImpl.buscarPeliculaPorCodigo(codigo);
	}
	
	@PostMapping("/peliculas")
	public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
		
		return peliculaServiceImpl.guardarPelicula(pelicula);
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Pelicula actualizarPelicula(@PathVariable(name = "codigo") int codigo, @RequestBody Pelicula pelicula) {
		
		Pelicula peliculaSeleccionada = new Pelicula();
		Pelicula peliculaActualizada = new Pelicula();
		
		peliculaSeleccionada = peliculaServiceImpl.buscarPeliculaPorCodigo(codigo);
		
		peliculaSeleccionada.setNombre(pelicula.getNombre());
		peliculaSeleccionada.setCalificacionEdad(pelicula.getCalificacionEdad());
		
		peliculaActualizada = peliculaServiceImpl.actualizarPelicula(peliculaSeleccionada);
		
		return peliculaActualizada;
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPelicula(@PathVariable(name = "codigo") int codigo) {
		
		peliculaServiceImpl.eliminarPelicula(codigo);
	}
}
