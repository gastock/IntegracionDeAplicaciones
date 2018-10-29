package com.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import com.escuela.negocio.Escolaridad;
import com.escuela.negocio.Factura;
import com.escuela.negocio.Titular;

import com.escuela.negocio.Alumno;
import com.escuela.negocio.Cuota;
import com.escuela.negocio.Empleado;
import com.escuela.negocio.Titular;





public class System {
	
	
	public void crearAlumno(String nombre, Titular titular, String direccion, String mail, String telefono,
			Escolaridad escolarida) {
		Alumno newAlumno = new Alumno(nombre, titular, direccion, mail, telefono,
				escolarida);
		AlumnoDAO.save(newAlumno);
		
		
	}
	
	public void modificarAlumno(int legajo, int escolaridad, String direccion, String mail,String telefono, String telefonoContacto) {
		
	}
	
	public void bajaAlumno(int legajo) {
		
	}
	

	public void crearEmpleado(String cargo, String nombre, String direccion, String mail, String telefono, float salario) {
		
		Empleado newEmpleado = new Empleado(cargo, nombre, direccion, mail, telefono, salario);
		EmpleadoDAO.save(newEmpleado);
		
	}
	
	public void modificarEmpleado(int legajo, String cargo, String direccion, String mail, String telefono, float salario) {
		
		
		
	}
	
	public void bajaEmpleado(int legajo) {
		
	}
	
	public void crearTitular(String nombre, int dNI, String direccion, String mail, String telefono) {
		Titular newTitular = new Titular(nombre, dNI, direccion, mail, telefono);	
		TitularDAO.save(newTitular);
	
	}
	
	public void modificarTitular(int dNI, String direccion, String mail, String telefono) {
		
	}
	
	public void bajaTitular(int dNI) {
		
	}
	
	public void facturarAlumno(int legajo) {
		
	}
	
	public void pagarFactura(int numero) {
		Factura f = FacturaDAO.find(numero);
		f.setFechaPago(LocalDateTime.now());
		FacturaDAO.save(f);
	}
	
	public void asignarCuota(int legajo, int id) {
		Alumno a = AlumnoDAO.find(legajo);
		Cuota c = CuotaDAO.find(id);
		a.addCuota(c);
		AlumnoDAO.save(a);
	}
}
