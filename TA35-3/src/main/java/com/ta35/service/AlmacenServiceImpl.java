package com.ta35.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta35.dao.IAlmacenDAO;
import com.ta35.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService {

	@Autowired
	IAlmacenDAO iAlmacenDAO;

	@Override
	public List<Almacen> listarAlmacenes() {
		
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen buscarAlmacenPorCodigo(int codigo) {
		
		return iAlmacenDAO.findById(codigo).get();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int codigo) {
		
		iAlmacenDAO.deleteById(codigo);
	}
}
