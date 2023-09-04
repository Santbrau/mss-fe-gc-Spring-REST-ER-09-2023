package com.ta35.service;

import java.util.List;

import com.ta35.dto.Pelicula;

public interface IPeliculaService {

	public List<Pelicula> listarPeliculas();

	public Pelicula buscarPeliculaPorCodigo(int codigo);

	public Pelicula guardarPelicula(Pelicula pelicula);

	public Pelicula actualizarPelicula(Pelicula pelicula);

	public void eliminarPelicula(int codigo);
}
