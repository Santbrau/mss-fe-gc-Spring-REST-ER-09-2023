package com.ta35.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajas")
public class Caja {


	@Id
	@Column(name = "num_referencia", length = 4)
	private String numReferencia;
	
	@Column(name = "contenido")
	private String contenido;
	
	@Column(name = "valor")
	private int valor;
	
	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacen almacen;
	

	public Caja() {
		
	}

	public Caja(String numReferencia, String contenido, int valor, Almacen almacen) {
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	
	public String getNumReferencia() {
		return numReferencia;
	}

	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [numReferencia=" + numReferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}
}
