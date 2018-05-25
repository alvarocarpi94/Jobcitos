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
	public Usuario(TransferUsuario tuser){
		this.dUser=  ImpDAOUsuario.getInstanceOfImpDAOUsuario();
		this.tUser= tuser;
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
