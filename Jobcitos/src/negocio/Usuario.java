package negocio;

import integracion.DAOUsuario;
import integracion.ImpDAOUsuario;

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

Oferta buscarOferta(String Nombre){
	boolean encontrado =false;
	Oferta oferta=null;
	int i=0;
	while(encontrado) { 
		if(ofertas.get(i).equals(Nombre)) {//.getNombre().equals(nombre);{
			encontrado =true;
			oferta = ofertas.get(i); 
		}
		i++;
	}
	return oferta;
}
void darseBaja(){
	
	
}

void crearCuenta(){
	dUser.guardarUsuario(this.tUser);
}

void EnviarMensaje(String msm,String user1, String user2 ){
	
}

}
