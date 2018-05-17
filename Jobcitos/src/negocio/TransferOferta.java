package oferta;

import util.MyStringUtils;

public class TransferOferta {

	protected String nombre;
	protected String descripcion;
	protected String localizacion;
	protected String ofertante;
	protected String trabajadorContratado;
	protected String candidatos;
	protected double precioAcordado;
	protected boolean pagado;
	
	
	public TransferOferta(String nom, String desc, String loc, String of, String trab, String cand, double prAc, boolean p) {
		this.nombre = nom;
		this.descripcion = desc;
		this.localizacion = loc;
		this.ofertante = of;
		this.trabajadorContratado = trab;
		this.candidatos = cand;
		this.precioAcordado = prAc;
		this.pagado = p;
	}
	
	public String getId(){
		return MyStringUtils.componerCadena(this.nombre, this.ofertante);
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getOfertante() {
		return this.ofertante;
	}
	
	public String getLocalizacion() {
		return this.localizacion;
	}
	
	public String getTrabajadorContratado() {
		return this.trabajadorContratado;
	}
	
	public String getCandidatos(){
		return this.candidatos;
	}
	
	public double getPrecioAcordado(){
		return this.precioAcordado;
	}
	
	public boolean getPagado() {
		return this.pagado;
	}
	
	public void setNombre(String nom){
		this.nombre = nom;
	}
	
	public void setDescripcion(String desc){
		this.nombre = desc;
	}
	
	public void setLocalizacion(String loc) {
		this.localizacion = loc;
	}
	
	public void setOfertante(String ofer) {
		this.ofertante = ofer;
	}
	
	public void setTrabajadorContratado(String trab) {
		this.trabajadorContratado = trab;
	}
	
	public void setCandidatos(String cand){
		this.candidatos = cand;
	}
	
	public void setPrecioAcordado(double prAc){
		if(!this.pagado)
			this.precioAcordado = prAc;
	}
	
	
	public void setPagado(boolean p) {
		this.pagado = p;
	}
	
}
