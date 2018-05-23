package negocio;

import excepciones.InconsistenciaDeDatos;
import integracion.DAOOferta;
import integracion.DatosOferta;
import integracion.DatosUsuario;

public class SA {
	DAOOferta daoO;
	public SA(){
		//this.daoO = new DAOOferta();
	}
	
	public void crearOferta(String nom, String desc, String loc, String of, String trab, String cand, double prAc, boolean p) throws InconsistenciaDeDatos{
		
		TransferOferta transO = new TransferOferta(nom,desc,loc,of,null,null,prAc,false);
		try {
			this.daoO.insertarOferta(transO);
		}catch (InconsistenciaDeDatos error){
			//que tipo de error es ??
		}
	}
	
	public void borrarOferta(Oferta oferta) throws InconsistenciaDeDatos{
		String nom = oferta.getNombre();
		String of = oferta.getOfertante();
		TransferOferta t = new TransferOferta();
		t.setNombre(nom);
		t.setOfertante(of);
		try {
			this.daoO.eliminarOferta(t);
		} catch (InconsistenciaDeDatos e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void valorarTrabajador(int nota){
		
	}
	public void despedirTrabajador(Oferta oferta){
		String nom = oferta.getNombre();
		String of = oferta.getOfertante();
		String trabajador = oferta.getTrabajador();
		TransferOferta t = new TransferOferta();
		t.setNombre(nom);
		t.setOfertante(of);
		t.setTrabajadorContratado(trabajador);
		oferta.eliminarTrabajador();
		try {
			this.daoO.eliminarTrabajador(t);
		} catch (InconsistenciaDeDatos e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void contratarTrabajador(Oferta oferta,String idTrabajador){
		oferta.aniadirTrabajador(idTrabajador);
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
	
	public void aceptarOferta(String trab,Oferta oferta){
		
		oferta.aniadirCandidato(trab);
	}
	
	public void retirarse(Oferta oferta){
		oferta.eliminarTrabajador();
	}
	
	public void valorarOfertante(Oferta oferta){
		
	}
	
}
