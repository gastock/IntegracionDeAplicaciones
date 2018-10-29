package com.controller;

import java.util.List;

import com.escuela.negocio.Escolaridad;
import com.escuela.negocio.Titular;

import com.escuela.negocio.Alumno;
import com.escuela.negocio.Empleado;
import com.escuela.negocio.Titular;





public class System {
	
	
	public void crearAlumno(String nombre, int dniTitular, String escolaridad) {
		
		
		
	}
	
	public void modificarAlumno(int legajo, String direccion, String mail,String telefono, String telefonoContacto) {
		
	}
	
	public void bajaAlumno(int legajo) {
		
	}
	

	public void crearEmpleado(String cargo, String nombre, int legajo, String direccion, String mail, String telefono, float salario) {
		
		Empleado newEmpleado = new Empleado(cargo, nombre, legajo, direccion, mail, telefono, salario);

		
	}
	
	public void modificarEmpleado(int legajo, String cargo, String direccion, String mail, String telefono, float salario) {
		
	}
	
	public void bajaEmpleado(int legajo) {
		
	}
	
	public void crearTitular(String nombre, int dNI, String direccion, String mail, String telefono) {
		
		Titular newTitular = new Titular(nombre, dNI, direccion, mail, telefono);
		
	}
	
	public void modificarTitular(int dNI, String direccion, String mail, String telefono) {
		
	}
	
	public void bajaTitular(int dNI) {
		
	}
	
	public void facturarAlumno(int legajo) {
		
	}
	
	public void pagarFactura(int numero) {
		
	}
	
	public void asignarCuota(int legajo) {
		
	}
}
