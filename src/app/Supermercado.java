package app;

import java.time.LocalDate;

import bean.Cliente;
import bean.ListClientes;
//import bean.ListVentas;

    public class Supermercado {
    	private ListClientes clientes;
   


    public Supermercado(){
	    clientes = new ListClientes();

    }
    public void crearCliente(String nombre, String dni,int telefono,
			String domicilio)
	{
		Cliente c = buscarCliente(dni);
		if (c==null)
		{
			c = new Cliente();
			c.setDatos(dni, domicilio, nombre, telefono);
			clientes.addCliente(c);
		}
	}
    
	private Cliente buscarCliente(String dni)
	{
		return clientes.getClientePorId(dni);
	}
	
	
}




