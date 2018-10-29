package bean;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Clientes")
public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column (name = "nombre", nullable = false, length = 50)
	private String nombre;
	@Id 
	@Column (name = "dnicliente")
	private String dni;
	@Column (name = "telefono", nullable = false, length = 20)
	private int telefono;
	@Column (name = "domicilio", nullable = false, length = 80)
	private String domicilio;
	//private Vector<Cuenta>cuentas;
	
	public void setDatos(String dni, String domicilio, String nombre, int telefono) 
	{
		this.dni = dni;
		this.domicilio = domicilio;
		this.nombre = nombre;
		this.telefono = telefono;
		//cuentas = new Vector<Cuenta>();
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}


