package presentacion;

import java.util.List;

import util.MyStringUtils;
import negocio.SA;
import negocio.TransferOferta;
import negocio.TransferUsuario;
import negocio.Usuario;

public class Controlador {
	
	private SA servicioAplicacion;
	
	public Controlador(){
		this.servicioAplicacion = new SA();
	}
	
	public void userButtonCrearOferta(String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc, boolean p) {
		this.servicioAplicacion.crearOferta(new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, p));
	}
	
	public void userButtonBorrarOferta(String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc, boolean p) {
		this.servicioAplicacion.borrarOferta(new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, p));
	}
	
	public void userActionValorarTrabajador(String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc, boolean p, int val) {
		this.servicioAplicacion.valorarTrabajador(new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, p), val);
	}
	
	public void userActionValorarOfertante(String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc, boolean p, int val) {
		this.servicioAplicacion.valorarOfertante(new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, p), val);
	}
	
	public void userButtonDespedirTrabajador(String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc, boolean p) {
		this.servicioAplicacion.despedirTrabajador(new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, p));
	}
	
	public void userButtonContratarTrabajador(String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc, boolean p, String idTrabajador) {
		this.servicioAplicacion.contratarTrabajador(new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, p), idTrabajador);
	}
	
	public void userActionEditarOferta(String idAntiguo, String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc, boolean p){
		this.servicioAplicacion.editarOferta(idAntiguo, new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, p));
	}
	
	public void userButtonBuscarOferta(String textoBusqueda){
		this.servicioAplicacion.buscarOferta(textoBusqueda);
	}
	
	public void userButtonPagarOferta(String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc){
		this.servicioAplicacion.pagarOferta(new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, true));
	}
	
	public void userActionEditarPerfil(String nombre, String apellidos, String correo, String contrasena, Integer[] mediaO, Integer[] mediaT, String listaOfertas){
		this.servicioAplicacion.editarPerfil(new TransferUsuario(correo, contrasena, nombre, apellidos, mediaO, mediaT, listaOfertas));
	}
	
	public void userButtonRetirarseOferta(TransferOferta tOferta, TransferUsuario tUser){
		this.servicioAplicacion.retirarse(tOferta, tUser);
	}

	public void userButtonDarseBaja(TransferUsuario tUser){
		this.servicioAplicacion.darseBaja(tUser);
	} 
	
	public void userButtonCrearCuenta(String nombre, String apellidos, String correo, String contrasena){
		TransferUsuario tu;
		Integer[] valoracionesIniciales = {0, 0};
		
		tu = new TransferUsuario(correo, contrasena, nombre, apellidos, valoracionesIniciales, valoracionesIniciales, "");
		this.servicioAplicacion.crearCuenta(tu);
	}
}
