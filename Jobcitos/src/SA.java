package negocio;

import excepciones.InconsistenciaDeDatos;
import integracion.DAOOferta;
import integracion.DatosOferta;
import integracion.DatosUsuario;

public class SA {
	
	public void crearOferta(String nom, String desc, String loc, String of, double prAc) throws InconsistenciaDeDatos {
		Oferta oferta = new Oferta(nom, desc, loc, of, prAc);
		oferta.crearOferta();
		
	}
	
	public void borrarOferta(Oferta oferta) {
		oferta.borrarOferta();
	}
	
	public void valorarTrabajador(int nota){
		
	}
	public void despedirTrabajador(Oferta oferta){
		oferta.eliminarTrabajador();
		
	}
	public void contratarTrabajador(Oferta oferta,String idTrabajador){
		oferta.aniadirTrabajador(idTrabajador);
	}
	public void editarOferta(TransferOferta tOferta,Oferta oferta) throws InconsistenciaDeDatos{
		oferta.modificar(tOferta);
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
	
	public void aceptarOferta(String trab,Oferta oferta){
		oferta.aniadirCandidato(trab);
	}
	
	public void retirarse(Oferta oferta){
		oferta.eliminarTrabajador();
	}
	
	public void valorarOfertante(Oferta oferta){
		
	}
	
}
