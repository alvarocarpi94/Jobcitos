package negocio;

import java.io.File;

import integracion.ImpDAOUsuario;
import excepciones.InconsistenciaDeDatos;

public class SA {
	
	
	public void crearOferta(TransferOferta tOferta) throws InconsistenciaDeDatos {
		
		Oferta oferta = new Oferta(tOferta);
		oferta.registrar();
	}
	
	public void borrarOferta(TransferOferta tOferta) {
		Oferta oferta = new Oferta(tOferta);
		oferta.eliminar();
	}
	
	public void valorarTrabajador(TransferOferta tOferta, int valoracion){
		ImpDAOUsuario dUser=  ImpDAOUsuario.getInstanceOfImpDAOUsuario();
		Oferta oferta = new Oferta(tOferta);
		TransferUsuario tUser=dUser.buscarUsuario(tOferta.getTrabajadorContratado());
		oferta.valorarTrabajador(tUser, valoracion);
	}
	
	public void despedirTrabajador(TransferOferta tOferta){
		Oferta oferta = new Oferta(tOferta);
		oferta.eliminarTrabajador();//solo va a haber un trabajador asi que no hace falta pasar el trabajador
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
		Usuario user = new Usuario(tUser);
		user.editarPerfil(tUser);
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
	
	public void valorarOfertante(TransferOferta tOferta, int valoracion){
		ImpDAOUsuario dUser= ImpDAOUsuario.getInstanceOfImpDAOUsuario();
		Oferta oferta = new Oferta(tOferta);
		TransferUsuario tUser=dUser.buscarUsuario(tOferta.getOfertante());
		oferta.valorarOfertante(tUser,valoracion);
	}
	
	public void buscarOferta(TransferOferta tOferta,TransferUsuario tUser){
		String nombre = tOferta.getTitulo();
		Usuario user = new Usuario(tUser);
		user.buscarOferta(nombre);
	}
	
	public void darseBaja(TransferUsuario tUser){

		Usuario user = new Usuario(tUser);
		user.darseBaja();
	}
	
	public void crearCuenta(TransferUsuario tUser){
		Usuario user = new Usuario(tUser);
			user.crearCuenta();
	}
	
}
