package negocio;

import java.io.File;
import java.util.List;

import integracion.DAOOferta;
import integracion.DAOUsuario;
import integracion.ImpDAOOferta;
import integracion.ImpDAOUsuario;

public class SA {
	private File fUser;
		
	public SA(){
		this.fUser=new File("Usuarios.txt");
	}
	
	public void crearOferta(TransferOferta tOferta) {
		Oferta oferta = new Oferta(tOferta);
		oferta.registrar();
	}
	
	public void borrarOferta(TransferOferta tOferta) {
		Oferta oferta = new Oferta(tOferta);
		oferta.eliminar();
	}
	
	public void valorarTrabajador(TransferOferta tOferta, int valoracion){
		DAOUsuario dUser= new ImpDAOUsuario(fUser);
		TransferUsuario tUser=dUser.buscarUsuario(tOferta.getTrabajadorContratado());
		tUser.setMediaTrabajador(valoracion);
		dUser.modificarUsuario(tUser, true);
	}
	
	public void despedirTrabajador(TransferOferta tOferta){
		Oferta oferta = new Oferta(tOferta);
		oferta.despedirTrabajadorContratado();//solo va a haber un trabajador asi que no hace falta pasar el trabajador
	}
	
	public void contratarTrabajador(TransferOferta tOferta, String idTrabajador){
		Oferta oferta = new Oferta(tOferta);
		oferta.contratarTrabajador(idTrabajador);
	}
	
	public void editarOferta(String idAntiguo, TransferOferta tOferta){
		Oferta oferta = new Oferta(tOferta);
		oferta.modificar(idAntiguo, tOferta);
	}
	
	public void editarPerfil(TransferUsuario tUser){
		Usuario user = new Usuario(tUser,fUser);
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
	
	public void retirarse(TransferOferta tOferta, TransferUsuario tUser){
		Oferta oferta = new Oferta(tOferta);
		oferta.eliminarCandidato(tUser.getId());
	}
	
	public void valorarOfertante(TransferOferta tOferta, int valoracion){
		DAOUsuario dUser= new ImpDAOUsuario(fUser);
		TransferUsuario tUser=dUser.buscarUsuario(tOferta.getOfertante());
		tUser.setMediaOfertante(valoracion);
		dUser.modificarUsuario(tUser, true);
	}
	
	public List<TransferOferta> buscarOferta(String textoBusqueda){
		DAOOferta daoOferta = ImpDAOOferta.getInstanceOfImplDAOOferta();
		return daoOferta.buscarOfertas(textoBusqueda);
	}
	
	public void darseBaja(TransferUsuario tUser){
		Usuario user = new Usuario(tUser,fUser);
		user.darseBaja();
	}
	
	public void crearCuenta(TransferUsuario tUser){
		Usuario user = new Usuario(tUser,fUser);
			user.crearCuenta();
	}
	
}
