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

import com.ta35.dto.Caja;
import com.ta35.service.CajaServiceImpl;

@RestController
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServiceImpl;
	
	@GetMapping("/cajas")
	public List<Caja> listarCajas() {
		
		return cajaServiceImpl.listarCajas();
	}
	
	@GetMapping("/cajas/{numReferencia}")
	public Caja buscarCajaPorNumReferencia(@PathVariable(name = "numReferencia") String numReferencia) {
		
		return cajaServiceImpl.buscarCajaPorNumReferencia(numReferencia);
	}
	
	@PostMapping("/cajas")
	public Caja guardarCaja(@RequestBody Caja caja) {
		
		return cajaServiceImpl.guardarCaja(caja);
	}
	
	@PutMapping("/cajas/{numReferencia}")
	public Caja actualizarCaja(@PathVariable(name = "numReferencia") String numReferencia, @RequestBody Caja caja) {
		
		Caja cajaSeleccionada = new Caja();
		Caja cajaActualizada = new Caja();
		
		cajaSeleccionada = cajaServiceImpl.buscarCajaPorNumReferencia(numReferencia);
		
		cajaSeleccionada.setContenido(caja.getContenido());
		cajaSeleccionada.setValor(caja.getValor());
		cajaSeleccionada.setAlmacen(caja.getAlmacen());
		
		cajaActualizada = cajaServiceImpl.actualizarCaja(cajaSeleccionada);
		
		return cajaActualizada;
	}
	
	@DeleteMapping("/cajas/{numReferencia}")
	public void eliminarAlmacen(@PathVariable(name = "numReferencia") String numReferencia) {
		
		cajaServiceImpl.eliminarCaja(numReferencia);
	}
}