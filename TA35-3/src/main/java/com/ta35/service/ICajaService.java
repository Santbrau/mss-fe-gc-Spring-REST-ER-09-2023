package com.ta35.service;

import java.util.List;

import com.ta35.dto.Caja;

public interface ICajaService {

	public List<Caja> listarCajas();

	public Caja buscarCajaPorNumReferencia(String numReferencia);

	public Caja guardarCaja(Caja caja);

	public Caja actualizarCaja(Caja caja);

	public void eliminarCaja(String numReferencia);
}
