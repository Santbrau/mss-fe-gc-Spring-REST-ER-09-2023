package com.ta35.service;

import java.util.List;

import com.ta35.dto.Almacen;

public interface IAlmacenService {

	public List<Almacen> listarAlmacenes();
	
	public Almacen buscarAlmacenPorCodigo(int codigo);

	public Almacen guardarAlmacen(Almacen almacen);

	public Almacen actualizarAlmacen(Almacen almacen);

	public void eliminarAlmacen(int codigo);
}