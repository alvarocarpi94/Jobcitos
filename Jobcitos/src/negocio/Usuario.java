package negocio;

import integracion.DAOUsuario;
import integracion.ImpDAOUsuario;
import integracion.ImplDAOOferta;

import java.io.File;
import java.util.ArrayList;

public class Usuario {
	
//Atributos
	private DAOUsuario dUser;
	private TransferUsuario tUser;
	

	//metodos
	public Usuario(TransferUsuario tuser, File f){
		this.dUser= new ImpDAOUsuario(f);
		this.tUser= tuser;
	}
	
	public TransferOferta buscarOferta(String nombre){
		TransferOferta tOferta=null;
		ImplDAOOferta dOferta = ImplDAOOferta.getInstanceOfImplDAOOferta();
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
