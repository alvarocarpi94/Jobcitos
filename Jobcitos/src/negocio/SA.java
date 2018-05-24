package negocio;

import java.io.File;

import integracion.ImpDAOUsuario;
import excepciones.InconsistenciaDeDatos;

public class SA {
	private File f;
	public void crearOferta(TransferOferta tOferta) throws InconsistenciaDeDatos {
		
		Oferta oferta = new Oferta(tOferta);
		oferta.registrar();
		
	}
	
	public void borrarOferta(TransferOferta tOferta) {
		Oferta oferta = new Oferta(tOferta);
		oferta.eliminar();
	}
	
	public void valorarTrabajador(int nota){
		
	}
	public void despedirTrabajador(TransferOferta tOferta){
		Oferta oferta = new Oferta(tOferta);
		//oferta.eliminarCandidato(tOferta.getTrabajadorContratado());
		
	}
	public void contratarTrabajador(TransferOferta tOferta,TransferUsuario tUser){
		Oferta oferta = new Oferta(tOferta);
		oferta.contratarTrabajador(tUser.getId());
	}
	public void editarOferta(TransferOferta tOferta) throws InconsistenciaDeDatos{
		Oferta oferta = new Oferta(tOferta);
		oferta.modificar(tOferta);
	}
	
	public void editarPerfil(TransferUsuario tUser){
		ImpDAOUsuario daoUSer = new ImpDAOUsuario(/*fileUser*/);
		if(daoUSer.buscarUsuario(tUser)!=null) {
			daoUSer.modificarUsuario(tUser,true);
		}
	}
	public void pagarOferta(TransferOferta tOferta){
		Oferta oferta = new Oferta(tOferta);
		oferta.pagarAlTrabajador();
	}
	
	public void aceptarOferta(String trab,TransferOferta tOferta){
		Oferta oferta = new Oferta(tOferta);
		oferta.agregarCandidato(trab);
	}
	
	public void retirarse(TransferOferta tOferta,TransferUsuario tUser){
		Oferta oferta = new Oferta(tOferta);
		oferta.eliminarCandidato(tUser.getNombre());
	}
	
	public void valorarOfertante(TransferOferta tOferta){
		
	}
	public void buscarOferta(TransferOferta tOferta,TransferUsuario tUser){
		String nombre = tOferta.getTitulo();
		Usuario user = new Usuario(tUser,f);
		user.buscarOferta(nombre);
	}
	public void darseBaja(TransferUsuario tUser){

		Usuario user = new Usuario(tUser,f);
		user.darseBaja();
	}
	public void crearCuenta(TransferUsuario tUser){
		Usuario user = new Usuario(tUser,f);
			user.crearCuenta();
	}
	
}
