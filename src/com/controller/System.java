package com.controller;

import java.util.List;

<<<<<<< Updated upstream
import com.escuela.negocio.Escolaridad;
import com.escuela.negocio.Titular;
=======
import com.escuela.negocio.Alumno;
import com.escuela.negocio.Empleado;
import com.escuela.negocio.Titular;

import bean.Cliente;
import bean.server.ClienteServer;

>>>>>>> Stashed changes

public class System {
	
	
	public void crearAlumno(String nombre, int dniTitular, String escolaridad) {
		
		
		
	}
	
	public void modificarAlumno(int legajo, String direccion, String mail,String telefono, String telefonoContacto) {
		
	}
	
	public void bajaAlumno(int legajo) {
		
	}
	
<<<<<<< Updated upstream
	public void crearEmpleado(String cargo, String nombre, String direccion, String mail, String telefono, float salario) {
=======
	public void crearEmpleado(String nombre, int legajo, String direccion, String mail, String telefono, float salario) {
		
		Empleado newEmpleado = new Empleado(nombre, legajo, direccion, mail, telefono, salario);
>>>>>>> Stashed changes
		
	}
	
	public void modificarEmpleado(int legajo, String cargo, String direccion, String mail, String telefono, float salario) {
		
	}
	
	public void bajaEmpleado() {
		
	}
	
	public void crearTitular(String nombre, int dNI, String direccion, String mail, String telefono) {
		
		Titular newTitular = new Titular(nombre, dNI, direccion, mail, telefono);
		
	}
	
	public void modificarTitular() {
		
	}
	
	public void bajaTitular() {
		
	}
	
	public void facturarAlumno() {
		
	}
	
	public void pagarFactura() {
		
	}
	
	public void asignarCuota() {
		
	}
}
