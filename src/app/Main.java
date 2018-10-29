package app;

import java.io.*;

public class Main {
	
		private Supermercado supermer;
	
	public Main(){
		super();
		supermer = new Supermercado();
	}
	public void crearCliente() 
	{
		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			//Solicito informacion
			System.out.println("CREAR CLIENTE");
			System.out.println("---------------");
			System.out.print("Ingrese nombre:");
			String nombre = reader.readLine();
			System.out.print("Ingrese dni:");
			String dni = reader.readLine();
			System.out.print("Ingrese domicilio:");
			String domicilio = reader.readLine();
			System.out.print("Ingrese telefono:");
			int telefono = Integer.parseInt(reader.readLine());
			
			supermer.crearCliente(nombre, dni, telefono, domicilio);
				
			mostrarMenu();
		}
		catch(Exception e){}
		
	}
	public static void main(String[] args) {
	
		Main main = new Main();
		main.mostrarMenu();
     
	}
	public void mostrarMenu() 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 	
		//Imprimo menu de opciones
		System.out.println("MENU DE OPCIONES");
		System.out.println("-------------------------------------------------------");
		System.out.println("1.- Crear Cliente");
		System.out.println("9.- Salir");
		System.out.println("-------------------------------------------------------");
		System.out.print("Opcion:");
		try
		{
			char s = (char)reader.read();
			
		  	switch (s)
		  	{
		  		case '1' : 
		  			{
		  				this.crearCliente();
		  				break;
		  			}
			  
			  	case '9' : 
			  		{
			  			this.salir();
			  			break;
			  		}
		  	}
		}
		catch (Exception e)
		{
		}

	}
	public void salir() 
	{
		//supermer.actualizarBD();
		System.exit(0);
	}
}
