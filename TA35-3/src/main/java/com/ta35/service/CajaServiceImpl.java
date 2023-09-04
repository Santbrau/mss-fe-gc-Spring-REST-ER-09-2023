package com.ta35.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta35.dao.ICajaDAO;
import com.ta35.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService {

	@Autowired
	ICajaDAO iCajaDAO;

	@Override
	public List<Caja> listarCajas() {
		
		return iCajaDAO.findAll();
	}

	@Override
	public Caja buscarCajaPorNumReferencia(String numReferencia) {
		
		return iCajaDAO.findById(numReferencia).get();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String numReferencia) {
		
		iCajaDAO.deleteById(numReferencia);
	}
}