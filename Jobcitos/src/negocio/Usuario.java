package negocio;

import java.util.ArrayList;

public class Usuario {
	
//Atributos
String idUsuario;
String contrasenia;
ArrayList<Oferta>  ofertas;


//metodos
public Usuario(String id, String contra){
	this.idUsuario=id;
	this.contrasenia=contra;
	this.ofertas=new  ArrayList<Oferta>();
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

void crearCuenta(){}
void EnviarMensaje(String msm,String user1, String user2 ){
	
}

}
