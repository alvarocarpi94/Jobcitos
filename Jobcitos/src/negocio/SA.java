package negocio;

import excepciones.InconsistenciaDeDatos;
import integracion.DAOOferta;
import integracion.DatosOferta;
import integracion.DatosUsuario;

public class SA {
	
	public void crearOferta(TransferOferta tOferta) throws InconsistenciaDeDatos {
		
		Oferta oferta = new Oferta(tOferta.getNombre(), tOferta.getDescripcion(),tOferta.getLocalizacion(),tOferta.getOfertante(),tOferta.getPrecioAcordado());
		oferta.crearOferta();
		
	}
	
	public void borrarOferta(TransferOferta tOferta) {
		Oferta oferta = new Oferta(tOferta.getNombre(), tOferta.getDescripcion(),tOferta.getLocalizacion(),tOferta.getOfertante(),tOferta.getPrecioAcordado());
		oferta.borrarOferta();
	}
	
	public void valorarTrabajador(int nota){
		
	}
	public void despedirTrabajador(TransferOferta tOferta){
		Oferta oferta = new Oferta(tOferta.getNombre(), tOferta.getDescripcion(),tOferta.getLocalizacion(),tOferta.getOfertante(),tOferta.getPrecioAcordado());
		oferta.eliminarTrabajador();
		
	}
	public void contratarTrabajador(TransferOferta tOferta,TransferUsuario tUser){
		Oferta oferta = new Oferta(tOferta.getNombre(), tOferta.getDescripcion(),tOferta.getLocalizacion(),tOferta.getOfertante(),tOferta.getPrecioAcordado());
		String idTrabajador = tUser.getId();
		oferta.aniadirTrabajador(idTrabajador);
	}
	public void editarOferta(TransferOferta tOferta) throws InconsistenciaDeDatos{
		Oferta oferta = new Oferta(tOferta.getNombre(), tOferta.getDescripcion(),tOferta.getLocalizacion(),tOferta.getOfertante(),tOferta.getPrecioAcordado());
		oferta.modificar(tOferta);
	}
	
	public void editarPerfil(TransferUsuario tUser){
		DatosUsuario daoUSer = new DatosUsuario(/*fileUser*/);
		if(daoUSer.buscarUsuario(tUser.getId()).equals(tUser.getId())) {
			daoUSer.actualizarUsuario(tUser);
		}
	}
	public void pagarOferta(TransferOferta tOferta){
		Oferta oferta = new Oferta(tOferta.getNombre(), tOferta.getDescripcion(),tOferta.getLocalizacion(),tOferta.getOfertante(),tOferta.getPrecioAcordado());
		oferta.ofertaPagada();
	}
	
	public void aceptarOferta(String trab,TransferOferta tOferta){
		Oferta oferta = new Oferta(tOferta.getNombre(), tOferta.getDescripcion(),tOferta.getLocalizacion(),tOferta.getOfertante(),tOferta.getPrecioAcordado());
		oferta.aniadirCandidato(trab);
	}
	
	public void retirarse(TransferOferta tOferta){
		Oferta oferta = new Oferta(tOferta.getNombre(), tOferta.getDescripcion(),tOferta.getLocalizacion(),tOferta.getOfertante(),tOferta.getPrecioAcordado());
		oferta.eliminarTrabajador();
	}
	
	public void valorarOfertante(TransferOferta tOferta){
		
	}
	public void buscarOferta(TransferOferta tOferta,TransferUsuario tUser){
		String nombre = tOferta.getNombre();
		String nom_usu = tUser.getNombre();
		String clave = tUser.getContrasenia();
			
		Usuario user = new Usuario(nom_usu, clave);
		user.buscarOferta(nombre);
	}
	public void darseBaja(TransferUsuario tUser){
		String nom_usu = tUser.getNombre();
		String clave = tUser.getContrasenia();
			
		Usuario user = new Usuario(nom_usu, clave);
		user.darseBaja();
	}
	public void crearCuenta(TransferUsuario tUser){
		String nom_usu = tUser.getNombre();
		String clave = tUser.getContrasenia();
			
		Usuario user = new Usuario(nom_usu, clave);
			user.crearCuenta();
	}
	
}
