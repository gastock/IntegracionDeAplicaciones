
package bean.dao;

import java.util.List;
import hbt.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.Cliente;
import java.util.List;

public class HibernateClienteDAO {
	private static HibernateClienteDAO instancia = null;
	private static SessionFactory sf = null;

	public static HibernateClienteDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new HibernateClienteDAO();
		} 
		return instancia;
	}
	
	public void grabarClientes(List<Cliente> clientes){
		Session session = sf.openSession();
		session.beginTransaction();
		for(Cliente cliente:clientes)
			session.merge(cliente);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	
	public List<Cliente> leerClientes(){
		Session session = sf.openSession();
		@SuppressWarnings("unchecked")
		List<Cliente> list = session.createQuery("from Cliente").list();
		session.close();
		return list;
	}

	public void grabarCliente(Cliente cli) 
	{
		Session session = sf.openSession(); // session factory
		session.beginTransaction();
		session.merge(cli); // bajamos los cambios es decir actualiza de la base de datos
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

}
