package presentacion;


import integracion.DAOOferta;
import integracion.DAOUsuario;
import integracion.ImpDAOOferta;

import java.awt.event.ActionEvent;
import java.util.List;

import utils.MyStringUtils;
import negocio.SA;
import negocio.TransferOferta;
import negocio.TransferUsuario;
import negocio.Usuario;

public class Controlador {
	
	private SA servicioAplicacion;
    private interfazEditarOferta eOferta;
    private interfazEditarPerfil ePerfil;
    private interfazLogin login;
    private interfazOferta oferta;
    private interfazLogin perfil;
	private interfazPrincipal principal;
	private interfazRegistro registro;
    private interfazVerPerfil vPerfil;
    private String usuario;
    private String idOfer;
        
	public Controlador(interfazLogin v, SA sa){
            this.login = v;
            this.login.setController(this);
            this.servicioAplicacion = sa;
	}

	public void actionPerformed(ActionEvent evento){
           String comando = evento.getActionCommand();
            if(comando.equals("Iniciar Sesion")){
                login();
            }else if(comando.equals("Crear Cuenta")){
                this.registro = new interfazRegistro(this);
                this.registro.setVisible(true);
                this.login.setVisible(false);
            }else if(comando.equals("Cancelar")){
                this.login.setVisible(true);
                this.registro.setVisible(false);
            }else if(comando.equals("Aceptar")){
                registro();
            }else if(comando.equals("")){
                this.eOferta = new interfazEditarOferta(this);
                this.eOferta.setVisible(true);
                this.principal.setVisible(false);
            }else if(comando.equals("confirmar")){
              //  CrearOferta();
            }
            
	}	
	public void CrearOferta(){
		this.idOfer = usuario+eOferta.getName();
		this.servicioAplicacion.crearOferta( idOfer, eOferta.getName(), eOferta.getDescripcion(), eOferta.getLugar(), this.usuario,
	                                                    "", null,10.00, false);
		}
	
        public void login(){
            if(this.servicioAplicacion.buscarUsuario(login.getTextoUsuario(), login.getTextoContrasenia())){
                this.usuario = login.getTextoUsuario();
                this.principal = new interfazPrincipal(this);
                principal.setVisible(true);
                this.login.setVisible(false);
            }
        }
        
        public void registro(){
            if(this.servicioAplicacion.crearCuenta(registro.getEmail(), registro.getContrasenia(), registro.getNombre(), registro.getApellido())){
                this.usuario = registro.getEmail();
                this.principal = new interfazPrincipal(this);
                this.principal.setVisible(true);
                this.registro.setVisible(false);
  
            }
        }
	
	/*public void CrearOferta(){
        String codigo =this.usuario + eOferta.nombreOferta;
		this.servicioAplicacion.crearOferta( codigo, eOferta.nombreOferta, eOferta.descr, "madrid",this.usuario,
                                                    "", null, eOferta.precio, false);
       this.oferta = new interfazOferta(this);
       this.principal.setVisible(true);
       // this.eOferta.setVisible(false);
	}*/
	
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
		//this.servicioAplicacion.contratarTrabajador(new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, p), idTrabajador);
	}
	
	public void userActionEditarOferta(String idAntiguo, String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc, boolean p){
		//this.servicioAplicacion.editarOferta(idAntiguo, new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, p));
	}
	
	public void userButtonBuscarOferta(String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc, boolean p,
										String email, String contrasenia, String nombre, String apellido, Integer[] mediaOfertante, Integer[] mediaTrabajador,
										List<String> listaOfertas){
		TransferOferta tOferta = new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, p);
		TransferUsuario tUsuario = new TransferUsuario(email, contrasenia, nombre, apellido, mediaOfertante, mediaTrabajador, listaOfertas);
		this.servicioAplicacion.buscarOferta(tOferta, tUsuario);
	}
	
	public void userButtonPagarOferta(String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc){
		this.servicioAplicacion.pagarOferta(new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, true));
	}
	
	public void userActionEditarPerfil(String nombre, String apellidos, String correo, String contrasena, Integer[] mediaO, Integer[] mediaT, String listaOfertas){
		this.servicioAplicacion.editarPerfil(new TransferUsuario(correo, contrasena, nombre, apellidos, mediaO, mediaT, listaOfertas));
	}
	

	public void userButtonRetirarseOferta(String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc, boolean p,
			String email, String contrasenia, String nombre, String apellido, Integer[] mediaOfertante, Integer[] mediaTrabajador,
			List<String> listaOfertas){
		TransferOferta tOferta = new TransferOferta(MyStringUtils.crearIdCompuesto(of, tit), tit, desc, loc, of, trab, cand, prAc, p);
		TransferUsuario tUsuario = new TransferUsuario(email, contrasenia, nombre, apellido, mediaOfertante, mediaTrabajador, listaOfertas);
		this.servicioAplicacion.retirarse(tOferta, tUsuario);
	}

	public void userButtonDarseBaja(String email, String contrasenia, String nombre, String apellido, Integer[] mediaOfertante, Integer[] mediaTrabajador,
			List<String> listaOfertas){
		TransferUsuario tUsuario = new TransferUsuario(email, contrasenia, nombre, apellido, mediaOfertante, mediaTrabajador, listaOfertas);
		this.servicioAplicacion.darseBaja(tUsuario);
	} 
	
	public void verUsuario(){
		interfazPerfil perfil = new interfazPerfil(this);

	}

	public TransferOferta tOferta(){
		TransferOferta tofer= this.servicioAplicacion.buscarOferta(idOfer);
		return tofer;
	}
	
	public TransferUsuario tUsuario(){
		TransferUsuario tuser= this.servicioAplicacion.buscarTUsuario(this.usuario);
		return tuser;
	}
}
