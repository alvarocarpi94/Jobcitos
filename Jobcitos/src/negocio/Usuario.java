package negocio;

import integracion.DAOUsuario;
import integracion.ImpDAOUsuario;
import integracion.ImpDAOOferta;

import java.io.File;

public class Usuario {
	
//Atributos
	private DAOUsuario dUser;
	private TransferUsuario tUser;
	

	//metodos
	public Usuario(String email, String contrasenia, String nombre, String Apellido, Integer[] mediaOfertante, Integer[] mediaTrabajador, String lista){
		this.dUser=  ImpDAOUsuario.getInstanceOfImpDAOUsuario();
		this.tUser= new TransferUsuario(email, contrasenia, nombre, Apellido, mediaOfertante, mediaTrabajador, "null");
	}
	
	public TransferOferta buscarOferta(String nombre){
		TransferOferta tOferta=null;
		ImpDAOOferta dOferta = ImpDAOOferta.getInstanceOfImplDAOOferta();
		tOferta=dOferta.obtenerOferta(nombre);
		return tOferta;
	}
	public void darseBaja(){
		this.dUser.modificarUsuario(this.tUser, false);
	}
	
	public void crearCuenta(){
		dUser.guardarUsuario(this.tUser);
	}

	public void editarPerfil(TransferUsuario tUser){
		dUser.modificarUsuario(tUser, true);

	}
}
