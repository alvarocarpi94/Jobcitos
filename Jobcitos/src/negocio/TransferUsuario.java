package negocio;

import java.util.ArrayList;

public class TransferUsuario {
	
	private String IdUsuario;
	private String contrasenia;
	private String nombre;
	private int mediaOfertante;
	private int mediaTrabajador;
	private ArrayList<Oferta> listaOfertas;
	
	public TransferUsuario(String Id, String nombre, String contrasenia){
		this.IdUsuario = Id;
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		listaOfertas = new ArrayList<Oferta>();
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getId() {
		return IdUsuario;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public Oferta getOferta(int i) {
		return listaOfertas.get(i);
	}
	
	public int getMediaOfertante() {
		return mediaOfertante;
	}
	
	public int getMediaTrabajador(){
		return mediaTrabajador;
	}
	
	public void setNombre(String cadena){
		nombre = cadena;
	}
	
	public void setId(String id) {
		IdUsuario = id;
	}
	
	public void setContrasenia(String contrasenia){
		this.contrasenia = contrasenia;
	}
	
	public boolean setOferta(Oferta oferta) {
		int i = 0;
		boolean ok = false;
		while(i< listaOfertas.size() && !ok) {
			if(listaOfertas.get(i).equals(null)) {
				listaOfertas.add(oferta);
				ok = true;
			}
			i++;
		} 
		return ok;
	}
	
	public void setMediaOfertante(int media) {
		mediaOfertante = media;
	}
	
	public void setMediaTrabajador(int media) {
		mediaTrabajador = media;
	}
	
}
