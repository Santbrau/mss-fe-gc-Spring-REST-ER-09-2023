package com.ta35.model;

import javax.persistence.*;

public class Departamento {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;

	private String nombre;
	private int presupuesto;
	
	 public Departamento() {
	    }

	    public Departamento(String nombre) {
	        this.nombre = nombre;
	    }
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
}
