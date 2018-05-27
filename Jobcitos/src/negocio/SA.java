package negocio;

import java.io.File;
import java.util.List;

import integracion.DAOOferta;
import integracion.DAOUsuario;
import integracion.ImpDAOOferta;
import integracion.ImpDAOUsuario;

import excepciones.InconsistenciaDeDatos;
import java.util.List;


public class SA {

	
	
    public boolean crearOferta(String id, String nombreO, String desc, String lugar, String of,
                                String trab, List<String> cand, double precio, boolean pagado){
        Oferta oferta = new Oferta(id, nombreO, desc, lugar, of, trab, cand, precio, pagado);
        if(oferta != null){
            oferta.registrar();
            return true;
        }
        return false;
    }
	
	public void borrarOferta(TransferOferta tOferta) {
		//Oferta oferta = new Oferta(tOferta);
		//oferta.eliminar();
	}
	
	public void valorarTrabajador(TransferOferta tOferta, int valoracion){
		ImpDAOUsuario dUser=  ImpDAOUsuario.getInstanceOfImpDAOUsuario();
		//Oferta oferta = new Oferta(tOferta);
		//ImpDAOUsuario dUser= ImpDAOUsuario.getInstanceOfImpDAOUsuario();
		//oferta.valorarTrabajador(tUser, valoracion);
		//tUser.setMediaTrabajador(valoracion);
		//dUser.modificarUsuario(tUser, true);

	}
	
	public void despedirTrabajador(TransferOferta tOferta){
		//Oferta oferta = new Oferta(tOferta);
		//oferta.eliminarTrabajador();//solo va a haber un trabajador asi que no hace falta pasar el trabajador
	}
	
	public void contratarTrabajador(String id, String tit, String desc,String loc, String of, String trab, List<String> cand,
			double prAc, boolean p, String idTrabajador) {
		Oferta oferta = new Oferta( id, tit,desc, loc,  of,  trab,cand, prAc,p);
		oferta.contratarTrabajador(idTrabajador);

	}
	

	public void editarOferta(TransferOferta tOferta) throws InconsistenciaDeDatos{
		//Oferta oferta = new Oferta(tOferta);
		//oferta.modificar(tOferta);
	}
	public void editarPerfil(TransferUsuario tUser){
		//Usuario user = new Usuario(tUser);
		//user.editarPerfil(tUser);
	}
	
	public void pagarOferta(TransferOferta tOferta){
		//Oferta oferta = new Oferta(tOferta);
		//oferta.pagarAlTrabajador();
	}
	
	public void aceptarOferta(String trab,TransferOferta tOferta){
		//Oferta oferta = new Oferta(tOferta);
		//oferta.agregarCandidato(trab);
	}
	

	public void retirarse(TransferOferta tOferta,TransferUsuario tUser){
		//Oferta oferta = new Oferta(tOferta);
		//oferta.eliminarCandidato(tUser.getNombre());
	}
	
	public void valorarOfertante(TransferOferta tOferta, int valoracion){
		ImpDAOUsuario dUser= ImpDAOUsuario.getInstanceOfImpDAOUsuario();
		//Oferta oferta = new Oferta(tOferta);
		TransferUsuario tUser=dUser.buscarUsuario(tOferta.getOfertante());
		//oferta.valorarOfertante(tUser,valoracion);
		tUser.setMediaOfertante(valoracion);
		dUser.modificarUsuario(tUser, true);
	}
	

	public void buscarOferta(TransferOferta tOferta,TransferUsuario tUser){
		String nombre = tOferta.getTitulo();
		//Usuario user = new Usuario(tUser);
		//user.buscarOferta(nombre);
	}
	
	public void darseBaja(TransferUsuario tUser){


		//Usuario user = new Usuario(tUser);
		//user.darseBaja();

	}
	
	public boolean crearCuenta(String email, String contrasenia, String Nombre, String Apellido){
		if(!buscarUsuario(email, contrasenia)){    
			Integer[] mediaOfertante = new Integer[2];
            Integer[] mediaTrabajador = new Integer[2];
            for(int i = 0; i < 2; i++){
            	mediaOfertante[i] = 0;
                mediaTrabajador[i] = 0;
            }	
            Usuario user = new Usuario(email, contrasenia, Nombre, Apellido, mediaOfertante, mediaTrabajador, "null");
            user.crearCuenta();
            return true;
        }
        return false;
	}
	
        public boolean buscarUsuario(String email, String contrasenia){
            ImpDAOUsuario daoUsuario= ImpDAOUsuario.getInstanceOfImpDAOUsuario();
            TransferUsuario tUsuario = daoUsuario.buscarUsuario(email);
            if(tUsuario != null){
                if(tUsuario.getId().equals(email) && tUsuario.getContrasenia().equals(contrasenia)){
                    return true;
                }
            }
            return false;
        }
        
        public TransferUsuario buscarTUsuario(String email){
            ImpDAOUsuario daoUsuario= ImpDAOUsuario.getInstanceOfImpDAOUsuario();
            TransferUsuario tUsuario = daoUsuario.buscarUsuario(email);
           
            return tUsuario;
        }
}
