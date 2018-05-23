package negocio;

import java.util.ArrayList;

public class TransferUsuario {
	
	private String email;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private int mediaOfertante;
	private int mediaTrabajador;
	private ArrayList<String> listaOfertas;
	
	public TransferUsuario(String Id, String contrasenia, String nombre, String apellido, int mediaO,
			int mediaT, String listaOfertas){
		this.email = Id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasenia = contrasenia;
		this.listaOfertas = new ArrayList<String>();
		if(listaOfertas !=null){
			for(int i = 0; i < listaOfertas.length(); i++){
				this.listaOfertas.add(i, listaOfertas.split(";")[i]);
			}
		}
	}
	
	public TransferUsuario(String Id, String contrasenia, String nombre, String apellido, int mediaO,
			int mediaT, ArrayList<String> listaOfertas){
		this.email = Id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasenia = contrasenia;
		this.listaOfertas = new ArrayList<String>();
		if(listaOfertas !=null){
			this.listaOfertas = listaOfertas;
		}
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public String getId() {
		return email;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public String getOferta(int i) {
		return listaOfertas.get(i);
	}
	
	public ArrayList<String> getlistaOfertas() {
		return listaOfertas;
	}
	
	public int getMediaOfertante() {
		return mediaOfertante;
	}
	
	public int getMediaTrabajador(){
		return mediaTrabajador;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public void setId(String id) {
		email = id;
	}
	
	public void setContrasenia(String contrasenia){
		this.contrasenia = contrasenia;
	}
	
	public boolean setOferta(String oferta) {
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
	
	public void setlistaOfertas(ArrayList<String> lista) {
		for(int i = 0; i < lista.size(); i++){
			listaOfertas.set(i, lista.get(i));
		}
	}
	
	public void setMediaOfertante(int media) {
		mediaOfertante = media;
	}
	
	public void setMediaTrabajador(int media) {
		mediaTrabajador = media;
	}
	
}
