package com.ta35.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta35.dao.ISalaDAO;
import com.ta35.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService {

	@Autowired
	ISalaDAO iSalaDAO;

	@Override
	public List<Sala> listarSalas() {
		
		return iSalaDAO.findAll();
	}

	@Override
	public Sala buscarSalaPorCodigo(int codigo) {
		
		return iSalaDAO.findById(codigo).get();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(int codigo) {
		
		iSalaDAO.deleteById(codigo);
	}
}
