package com.escuela.negocio;

import java.time.LocalDateTime;
import java.util.List;

public class Factura {
	private int numero;
	private String tipo;
	private LocalDateTime fechaEmision;
	private LocalDateTime fechaPago;
<<<<<<< Updated upstream
	private Boolean Pago;	
	private Alumno alumno;
	
	
	public Factura(int numero, String tipo, LocalDateTime fechaEmision, LocalDateTime fechaPago, Boolean pago) {
	private List<ItemFactura> items;
		this.numero = numero;
		this.tipo = tipo;
		this.fechaEmision = fechaEmision;
		this.fechaPago = null;
		this.Pago = false;
=======
		this.items = items;
>>>>>>> Stashed changes
	}

	public Boolean getPago() {
		return Pago;
	}

	public void setPago(Boolean pago) {
		this.Pago = pago;
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
