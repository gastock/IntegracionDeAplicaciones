package com.escuela.negocio;

import java.time.LocalDateTime;

public class Factura {
	private int numero;
	private String tipo;
	private LocalDateTime fechaEmision;
	private LocalDateTime fechaPago;
		
	public Factura(int numero, String tipo, LocalDateTime fechaEmision, LocalDateTime fechaPago) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.fechaEmision = fechaEmision;
		this.fechaPago = fechaPago;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public LocalDateTime getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(LocalDateTime fechaPago) {
		this.fechaPago = fechaPago;
	}
	
	
}
