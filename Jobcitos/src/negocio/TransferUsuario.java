package negocio;

import java.util.ArrayList;

public class TransferUsuario {
	
	private String email;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private Integer[] mediaOfertante; //mediao-n�votos
	private Integer[] mediaTrabajador;//mediaT-n�votos
	private ArrayList<String> listaOfertas;
	
	//Constructor Si se pasa un String por lista de Ofertas
	public TransferUsuario(String Id, String contrasenia, String nombre, String apellido, Integer[] mediaO,
			Integer[] mediaT, String listaOfertas){
		inicializar(Id, contrasenia, nombre, apellido, mediaO, mediaT);
		if(listaOfertas !=null){
			for(int i = 0; i < listaOfertas.length(); i++){
				this.listaOfertas.add(i, listaOfertas.split(";")[i]);
			}
		}
	}
	//Constructor Si se pasa un ArrayList para la lista de ofertas
	public TransferUsuario(String Id, String contrasenia, String nombre, String apellido, Integer[] mediaO,
			Integer[] mediaT, ArrayList<String> listaOfertas){
		inicializar(Id, contrasenia, nombre, apellido, mediaO, mediaT);
		if(listaOfertas !=null){
			for(int i = 0; i < listaOfertas.size(); i++){
				this.listaOfertas.add(listaOfertas.get(i));
			}
		}
	}
	//metodo privado que inicializa los atributos comunes a los dos constructores
	private void inicializar(String Id, String contrasenia, String nombre, String apellido, Integer[] mediaO,
			Integer[] mediaT){
		this.email = Id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasenia = contrasenia;
		this.mediaOfertante = new Integer[2];
		this.mediaTrabajador = new Integer[2];
		this.listaOfertas = new ArrayList<String>();
		if(mediaO != null){
			for(int i = 0; i < mediaO.length; i++){
				this.mediaOfertante[i] = mediaO[i];
			}
		}
		if(mediaT != null){
			for(int i = 0; i < mediaT.length; i++){
				this.mediaTrabajador[i] = mediaT[i];
			}
		}
	}
	//muestra el nombre
	public String getNombre(){
		return nombre;
	}
	//muestra el apellido
	public String getApellido(){
		return apellido;
	}
	//muestra el email
	public String getId() {
		return email;
	}
	//muestra la contrasenia
	public String getContrasenia() {
		return contrasenia;
	}
	//devuelve la oferta
	public String getOferta(int i) {
		return listaOfertas.get(i);
	}
	//devuelve la lista de Ofertas
	public ArrayList<String> getlistaOfertas() {
		return listaOfertas;
	}
	//muestra la media del ofertante
	public int getMediaOfertante() {
		return mediaOfertante[0];
	}
	//muestra la media del trabajador
	public int getMediaTrabajador(){
		return mediaTrabajador[0];
	}
	//cambia el nombre
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	//cambia el apellido
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	//cambia el correo
	public void setId(String id) {
		email = id;
	}
	//cambia la contrasenia
	public void setContrasenia(String contrasenia){
		this.contrasenia = contrasenia;
	}
	//Busca una oferta y la modifica
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
	//A�ade el id de una oferta a la lista
	public void setlistaOfertas(ArrayList<String> lista) {
		for(int i = 0; i < lista.size(); i++){
			listaOfertas.set(i, lista.get(i));
		}
	}
	//A�ade la media calculada y suma 1 al n� de votos
	public void setMediaOfertante(int media) {
		mediaOfertante[0] = media;
		mediaOfertante[1] += 1;
	}
	//A�ade la media calculada y suma 1 al n� de votos
	public void setMediaTrabajador(int media) {
		mediaTrabajador[0] = media;
		mediaTrabajador[1] += 1;
	}
	
}
