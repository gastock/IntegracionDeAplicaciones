package com.escuela.negocio;

import java.util.List;

public class Alumno {
	private String nombre;
	private int legajo;
	private Titular titular;
	private String direccion;
	private String mail;
	private String telefono;
	private Escolaridad escolaridad;
	private List<Adicional> adicionales;
	
	public Alumno(String nombre, int legajo, Titular titular, Escolaridad escolaridad, List<Adicional> adicionales) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.titular = titular;
		this.escolaridad = escolaridad;
		this.adicionales = adicionales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public Escolaridad getEscolaridad() {
		return escolaridad;
	}

	public void setEscolaridad(Escolaridad escolaridad) {
		this.escolaridad = escolaridad;
	}

	public List<Adicional> getAdicionales() {
		return adicionales;
	}

	public void setAdicionales(List<Adicional> adicionales) {
		this.adicionales = adicionales;
	}
	
	
	
}
