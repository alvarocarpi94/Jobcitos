package negocio;

import java.io.File;
import java.io.IOException;

import excepciones.InconsistenciaDeDatos;
import integracion.DatosOferta;
import integracion.DatosUsuario;

public class SA {
	private File fileOfertas;
	private File fileUser; 
	public SA(){
	}
	
	public void crearOferta(){
		
	}
	
	public void borrarOferta(Oferta oferta){
		
	}
	
	public void valorarTrabajador(int nota){
		
	}
	public void despedirTrabajador(Oferta oferta){
		
	}
	public void contratarTrabajador(Oferta oferta){
		//oferta.añadirTrabajador(idTrabajador);
	}
	public void editarOferta(TransferOferta tOferta) throws InconsistenciaDeDatos, IOException{
		DatosOferta daoOfer = new DatosOferta(fileOfertas);
		daoOfer.cargarOfertas();
		if(daoOfer.obtenerOferta(tOferta.getId()).equals(tOferta.getId())) {
			daoOfer.reemplazarOferta(tOferta.getId(), tOferta);
		}
	}
	
	public void editarPerfil(TransferUsuario tUser){
		DatosUsuario daoUSer = new DatosUsuario(/*fileUser*/);
		if(daoUSer.buscarUsuario(tUser.getId()).equals(tUser.getId())) {
			daoUSer.actualizarUsuario(tUser);
		}
		
	}
	public void pagarOferta(Oferta oferta){
		oferta.ofertaPagada();
	}
	
	public void aceptarOferta(TransferOferta tOferta, TransferUsuario tUser){
		tOferta.setCandidatos(tUser.getId());//cadidatosLista
	}
	
	public void retirarse(Oferta oferta){
		oferta.eliminarTrabajador();
	}
	
	public void valorarOfertante(Oferta oferta){
		
	}

}
